package com.juliootero.cursomc.resources;
import com.juliootero.cursomc.domain.Categoria;
import com.juliootero.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
class CategoriaResource {

    @Autowired
    private CategoriaService service;


    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        Categoria obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
}