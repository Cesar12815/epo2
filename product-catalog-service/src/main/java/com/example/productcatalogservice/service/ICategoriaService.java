package com.example.productcatalogservice.service;

import com.example.productcatalogservice.entity.CategoriaEntity;

public interface ICategoriaService {

    CategoriaEntity buscarPorId(Long id);
}
