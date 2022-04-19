package com.factoritbackend.demo.service;

import com.factoritbackend.demo.entity.Transaccion;
import java.util.List;

/**
 *
 * @author jonye
 */
public interface ITransaccionService {
    
    public List<Transaccion> findAll();
    
    public Transaccion agregarTransaccion(Transaccion transaccion);
    
}
