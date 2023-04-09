package com.proyecto.poryectoMarketing.Service;

import com.proyecto.poryectoMarketing.Model.Productos;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public Productos guardar( Productos productos);
    public Optional <Productos> get(Integer id);
    public Productos update(Productos productos);
    public void delete(Integer id);
    public List<Productos> findAll();
}
