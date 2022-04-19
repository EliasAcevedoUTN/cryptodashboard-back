package com.factoritbackend.demo.service;

import com.factoritbackend.demo.entity.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author jonye
 */
public interface IUsuarioService {
    
    public List<Usuario> findAll();
    
    public Optional<Usuario> findById(Integer id);

}
