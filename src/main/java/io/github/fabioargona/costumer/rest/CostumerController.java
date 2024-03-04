package io.github.fabioargona.costumer.rest;

import io.github.fabioargona.costumer.model.entity.Costumer;
import io.github.fabioargona.costumer.model.repository.CostumerRepository;
import jakarta.validation.Valid;
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
    public Costumer save(@RequestBody @Valid Costumer costumer){
        return repository.save(costumer);
    }

    @GetMapping("{id}")
    public Costumer findOneId(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteId(@PathVariable Integer id){
        repository
                .findById(id)
                .map(costumer -> {
                    repository.delete(costumer);
                    return Void.TYPE;
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCostumerId(@PathVariable Integer id, @RequestBody Costumer updateCostumer){
        repository
                .findById(id)
                .map(costumer -> {
                    costumer.setName(updateCostumer.getName());
                    costumer.setCpf(updateCostumer.getCpf());
                    return repository.save(updateCostumer);
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
