package com.proyecto.poryectoMarketing.Repository;

import com.proyecto.poryectoMarketing.Model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer> {
}
