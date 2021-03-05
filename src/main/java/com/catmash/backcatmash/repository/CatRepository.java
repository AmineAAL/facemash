package com.catmash.backcatmash.repository;

import com.catmash.backcatmash.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, String> {
}
