package com.factoritbackend.demo.dao;

import com.factoritbackend.demo.entity.Transaccion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jonye
 */
public interface ITransaccionDao extends CrudRepository<Transaccion, Integer>{
    
}
