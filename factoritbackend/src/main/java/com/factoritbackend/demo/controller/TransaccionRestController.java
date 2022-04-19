package com.factoritbackend.demo.controller;

import com.factoritbackend.demo.entity.Transaccion;
import com.factoritbackend.demo.service.ITransaccionService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jonye
 */
@RestController
@RequestMapping("/factorittransaccion")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
public class TransaccionRestController {
    @Autowired
    private ITransaccionService traService;
    
    @GetMapping()
    public List<Object> list() {
        return null;
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<Transaccion> post(@RequestBody Transaccion transaccion) {
        return new ResponseEntity(this.traService.agregarTransaccion(transaccion), HttpStatus.CREATED);
    }
    
    
}
