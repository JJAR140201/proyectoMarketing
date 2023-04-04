package com.proyecto.poryectoMarketing.Service.Impl;

import com.proyecto.poryectoMarketing.Model.Productos;
import com.proyecto.poryectoMarketing.Repository.ProductoRepository;
import com.proyecto.poryectoMarketing.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Productos guardar(Productos productos) {
        return productoRepository.save(productos);
    }

    @Override
    public Optional<Productos> get(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public Productos update(Productos productos) {
        return productoRepository.save(productos);
    }

    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }
}
