package br.com.mooka.kanbanprime.service;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public abstract class CrudServiceImpl<R extends CrudRepository<M, K>, M extends IEntityId<K>, K> implements ICrudService<M, K> {
    protected final R repository;

    public CrudServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<M> findAll() {
        return repository.findAll();
    }

    @Override
    public M findById(K id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public M save(M model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(M model) {
        Optional<M> optionalModel = repository.findById(model.getEntityId());
        repository.delete(model);
        return optionalModel.isPresent();
    }
}
