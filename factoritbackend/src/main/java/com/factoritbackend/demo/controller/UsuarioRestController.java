package com.factoritbackend.demo.controller;

import com.factoritbackend.demo.entity.Usuario;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import com.factoritbackend.demo.service.IUsuarioService;

/**
 *
 * @author elias acevedo
 */
@RestController
@RequestMapping("/factorit")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
public class UsuarioRestController {
    
    @Autowired
    private IUsuarioService userService;
    
    @GetMapping("/usuarios")
    public List<Usuario> list() {
        System.out.println("lista de usuarios: " + userService.findAll());
        return userService.findAll();
    }
    
    @GetMapping("/usuarios/{id}")
    public Object get(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }
    
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Object input) {
        return null;
    }
    
}
