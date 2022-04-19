package com.factoritbackend.demo.service;

import com.factoritbackend.demo.dao.IUsuarioDao;
import com.factoritbackend.demo.entity.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jonye
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService {
    
    @Autowired
    private IUsuarioDao userDao;

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) userDao.findAll();
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return userDao.findById(id);
    }
    
}
