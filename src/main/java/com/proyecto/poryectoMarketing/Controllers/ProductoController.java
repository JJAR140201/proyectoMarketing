package com.proyecto.poryectoMarketing.Controllers;

import com.proyecto.poryectoMarketing.Model.Productos;
import com.proyecto.poryectoMarketing.Model.Usuario;
import com.proyecto.poryectoMarketing.Service.ProductoService;
import org.slf4j.ILoggerFactory;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.logging.Logger;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(String.valueOf(ProductoController.class));
    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String show() {
        return "productos/show";
    }

    @GetMapping("/create")
    public  String create() { return  "productos/create";}

    @PostMapping("/save")
    public String save(Productos productos) {
        LOGGER.info("Este es el objeto de vista {}");
        Usuario u = new Usuario();
        productos.setUsuario(u);
        productoService.guardar(productos);
        return "redirect:/productos";}
}
