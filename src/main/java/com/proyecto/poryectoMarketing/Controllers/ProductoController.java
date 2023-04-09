package com.proyecto.poryectoMarketing.Controllers;

import com.proyecto.poryectoMarketing.Model.Productos;
import com.proyecto.poryectoMarketing.Model.Usuario;
import com.proyecto.poryectoMarketing.Service.ProductoService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("productos",productoService.findAll() );
        return "productos/show";
    }

    @GetMapping("/create")
    public  String create() { return  "productos/create";}

    @PostMapping("/save")
    public String save(Productos productos) {
        LOGGER.info("Este es el objeto de vista {}");
        Usuario u = new Usuario(1, "", "", "", "","","","","");
        productos.setUsuario(u);
        productoService.guardar(productos);
        return "redirect:/productos";}
}
