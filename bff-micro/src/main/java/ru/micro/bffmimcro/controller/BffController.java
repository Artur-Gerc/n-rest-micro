package ru.micro.bffmimcro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ru.micro.bffmimcro.model.UserAndOrder;
import ru.micro.bffmimcro.webclient.UserAndOrderWebclient;

@RestController
@RequestMapping("/api/site-bff/")
public class BffController {

    private final UserAndOrderWebclient webclient;

    public BffController(UserAndOrderWebclient webclient) {
        this.webclient = webclient;
    }

    @GetMapping("/{userId}")
    public Mono<UserAndOrder> getUserAndOrder(@PathVariable("userId") Long userId) {
        return Mono.zip(
                webclient.getUser(userId),
                webclient.getOrder(userId),
                UserAndOrder::new);
    }
}
