package io.github.fabioargona.costumer.rest;

import io.github.fabioargona.costumer.model.entity.Costumer;
import io.github.fabioargona.costumer.model.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/costumers")
public class CostumerController {

    private final CostumerRepository repository;

    @Autowired
    public CostumerController(CostumerRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Costumer save(@RequestBody Costumer costumer){
        return repository.save(costumer);
    }

}
