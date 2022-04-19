package com.factoritbackend.demo.dao;

import com.factoritbackend.demo.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jonye
 */
public interface IUsuarioDao extends CrudRepository<Usuario, Integer> {
    
}
