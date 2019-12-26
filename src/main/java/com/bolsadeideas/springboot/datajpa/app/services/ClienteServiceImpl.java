package com.bolsadeideas.springboot.datajpa.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.datajpa.app.dao.IClienteDao;
import com.bolsadeideas.springboot.datajpa.app.models.Cliente;

@Service
public class ClienteServiceImpl  implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	@Transactional
	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	
	@Transactional
	@Override
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	public Cliente findOne(Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

}
