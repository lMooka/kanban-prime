package br.com.mooka.kanbanprime.api.kanban;

import br.com.mooka.kanbanprime.service.ICrudService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public abstract class CrudController<M, S extends ICrudService<M, K>, K> {

    protected final S service;

    public CrudController(S service) {
        this.service = service;
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/{id}")
    public M getCardById(@PathVariable K id) {
        return service.findById(id);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping
    public Iterable<M> getAll() {
        return service.findAll();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping
    public M save(@RequestBody M model) {
        return service.save(model);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping
    public void delete(@RequestBody M model) {
        service.delete(model);
    }
}
