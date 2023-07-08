package com.aduana.uth.data.service;

import com.aduana.uth.data.entity.Aduana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AduanaRepository extends JpaRepository<Aduana, Long>, JpaSpecificationExecutor<Aduana> {

}
