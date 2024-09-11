package com.example.productcatalogservice.repository;

import com.example.productcatalogservice.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoriaEntity, Long> {
}
