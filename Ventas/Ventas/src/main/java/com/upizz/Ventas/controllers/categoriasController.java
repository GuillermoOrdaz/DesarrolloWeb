package com.upizz.Ventas.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorias")
public class categoriasController {
    @GetMapping
    public String listarCategorias(){
        return "Listado de todas las categorias - GET";
    }

    @GetMapping("/{id}")
    public String listarCategoria(@PathVariable int id){
        return "Obtener una categoria por id - GET";
    }

    @PostMapping
    public String agregarCategoria(@RequestBody String categoria){
        return "Agregar una categoria - POST";
    }

    @PutMapping("/{id}")
    public String actualizarCategoria(@PathVariable int id, @RequestBody String categoria){
        return "Actualizar categoria por id - PUT:" + categoria + "con id" + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id){
        return "Eliminar una categoria - DELETE" + id;
    }
}
