package com.proyecto.poryectoMarketing.Controllers;

import com.proyecto.poryectoMarketing.Model.Productos;
import com.proyecto.poryectoMarketing.Model.Usuario;
import com.proyecto.poryectoMarketing.Service.ProductoService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

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

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        Productos productos = new Productos();
        Optional<Productos> optionalProductos = productoService.get(id);
        productos = optionalProductos.get();
        LOGGER.info("producto buscado: {}", productos);
        model.addAttribute("producto", productos);
        return "productos/edit";
    }

    @PostMapping("/update")
    public String update(Productos productos){
        productoService.update(productos);
        return "redirect:/productos";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, Model model){
        productoService.delete(id);
        return "redirect:/productos";
    }
}
