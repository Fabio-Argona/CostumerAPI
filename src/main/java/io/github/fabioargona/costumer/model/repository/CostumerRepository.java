package io.github.fabioargona.costumer.model.repository;

import io.github.fabioargona.costumer.model.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<Costumer, Integer> {
}
