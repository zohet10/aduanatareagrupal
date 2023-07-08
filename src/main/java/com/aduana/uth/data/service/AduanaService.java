package com.aduana.uth.data.service;

import com.aduana.uth.data.entity.Aduana;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class AduanaService {

    private final AduanaRepository repository;

    public AduanaService(AduanaRepository repository) {
        this.repository = repository;
    }

    public Optional<Aduana> get(Long id) {
        return repository.findById(id);
    }

    public Aduana update(Aduana entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Aduana> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Aduana> list(Pageable pageable, Specification<Aduana> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
