package io.github.fabioargona.costumer.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(nullable = false, length = 150)
    private String description;
    @ManyToOne
    @JoinColumn(name= "id_costumer")
    private Costumer costumer;
    @Column
    private BigDecimal valor;
}
