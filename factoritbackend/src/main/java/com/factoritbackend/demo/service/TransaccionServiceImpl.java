package com.factoritbackend.demo.service;

import com.factoritbackend.demo.dao.ITransaccionDao;
import com.factoritbackend.demo.entity.Transaccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jonye
 */
@Service
public class TransaccionServiceImpl implements ITransaccionService {

    @Autowired
    private ITransaccionDao transaccioDao;
    
    @Override
    public List<Transaccion> findAll() {
        return (List<Transaccion>) transaccioDao.findAll();
    }

    @Override
    public Transaccion agregarTransaccion(Transaccion transaccion) {
        return transaccioDao.save(transaccion);
    }
    
}
