package com.adso.api_persona.repository;

import com.adso.api_persona.entities.AprendizEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AprendizRepository extends JpaRepository<AprendizEntity, Long> {
}
