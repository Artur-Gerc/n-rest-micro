package ru.micro.bffmimcro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.micro.entity.model.Order;
import ru.micro.entity.model.User;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserAndOrder {
    private User user;
    private List<Order> order;
}
