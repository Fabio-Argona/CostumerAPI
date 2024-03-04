package io.github.fabioargona.costumer.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(nullable = false, length = 150)
    @NotEmpty(message = "{mandatory.name.field}")
    private String name;

    @Column(nullable = false, length = 11)
    @NotNull(message = "{mandatory.cpf.field}")
    @CPF(message = "{mandatory.cpf.invalid}")
    private String cpf;

    @Column(name = "date_register", updatable = false)
    private LocalDate dateRegister;

    @PrePersist
    public void
    prePersist(){
        setDateRegister(LocalDate.now());
    }
}
