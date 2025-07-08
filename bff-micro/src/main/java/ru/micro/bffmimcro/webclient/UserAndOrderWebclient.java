package ru.micro.bffmimcro.webclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import ru.micro.entity.model.Order;
import ru.micro.entity.model.User;

import java.util.List;

@Component
public class UserAndOrderWebclient {

    private final WebClient userWebClient;
    private final WebClient orderWebClient;

    public UserAndOrderWebclient(@Value("${userMicro.url}") String USER_URL, @Value("${orderMicro.url}") String ORDER_URL) {
        this.userWebClient = WebClient.create(USER_URL);
        this.orderWebClient = WebClient.create(ORDER_URL);
    }

    public Mono<User> getUser(Long userId) {
        return userWebClient
                .get()
                .uri(String.valueOf(userId))
                .retrieve()
                .bodyToMono(User.class);
    }

    public Mono<List<Order>> getOrder(Long userId) {
        return orderWebClient
                .get()
                .uri(String.valueOf(userId))
                .retrieve()
                .bodyToFlux(Order.class)
                .collectList();
    }
}
