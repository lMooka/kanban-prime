package br.com.mooka.framework.crudapi;

public interface ICrudService<M, K> {
    Iterable<M> findAll();
    M findById(K id);
    M save(M model);
    boolean delete(M model);
}
