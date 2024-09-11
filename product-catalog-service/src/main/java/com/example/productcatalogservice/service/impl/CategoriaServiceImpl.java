package com.example.productcatalogservice.service.impl;

import com.example.productcatalogservice.entity.CategoriaEntity;
import com.example.productcatalogservice.repository.CategoryRepository;
import com.example.productcatalogservice.service.ICategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
   private CategoryRepository categoriaRepository;

    @Override
    public CategoriaEntity buscarPorId(Long id) {
        return this.categoriaRepository.findById(id).get();
    }
}
