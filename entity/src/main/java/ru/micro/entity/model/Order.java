package ru.micro.entity.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(precision = 19,scale = 2)
    private BigDecimal sum;

    @Column(length = 3)
    private String currency;

    @Column(nullable = false)
    private String products;
}
