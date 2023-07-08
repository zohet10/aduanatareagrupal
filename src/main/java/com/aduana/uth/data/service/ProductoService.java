package com.aduana.uth.data.service;

import com.aduana.uth.data.entity.Producto;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public Optional<Producto> get(Long id) {
        return repository.findById(id);
    }

    public Producto update(Producto entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Producto> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Producto> list(Pageable pageable, Specification<Producto> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
