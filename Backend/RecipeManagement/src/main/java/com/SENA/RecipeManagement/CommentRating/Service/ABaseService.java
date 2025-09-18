package com.SENA.RecipeManagement.CommentRating.Service;

import com.SENA.RecipeManagement.CommentRating.Entity.ABaseEntity;
import com.SENA.RecipeManagement.CommentRating.IRepository.IBaseRepository;
import com.SENA.RecipeManagement.CommentRating.IService.IBaseService;

import java.util.List;
import java.util.Optional;

public abstract class ABaseService<T extends ABaseEntity, DReq, DRes> implements IBaseService<T, DReq, DRes> {

    protected IBaseRepository<T> repository;

    public ABaseService(IBaseRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> all() throws Exception {
        return repository.findAll();
    }

    @Override
    public List<T> findByStateTrue() throws Exception {
        return repository.findByStatusTrue();
    }

    @Override
    public Optional<T> findById(String id) throws Exception {
        return repository.findById(id);
    }

    @Override
    public T save(T entity) throws Exception {
        return repository.save(entity);
    }

    @Override
    public void update(String id, T entity) throws Exception {
        Optional<T> optionalEntity = repository.findById(id);
        if (optionalEntity.isPresent()) {
            T existingEntity = optionalEntity.get();
            // Aquí puedes agregar lógica para actualizar campos específicos
            repository.save(existingEntity);
        } else {
            throw new Exception("Entity not found with id: " + id);
        }
    }

    @Override
    public void delete(String id) throws Exception {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new Exception("Entity not found with id: " + id);
        }
    }
}
