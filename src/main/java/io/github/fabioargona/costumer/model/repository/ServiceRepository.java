package io.github.fabioargona.costumer.model.repository;

import io.github.fabioargona.costumer.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository <Service, Integer>{
}
