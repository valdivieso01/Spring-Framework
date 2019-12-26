package com.possumus.clientes.services;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD:src/main/java/com/possumus/clientes/services/ClienteServiceImpl.java
import com.possumus.clientes.dao.IClienteDao;
import com.possumus.clientes.models.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
=======

import com.bolsadeideas.springboot.datajpa.app.dao.IClienteDao;
import com.bolsadeideas.springboot.datajpa.app.models.Cliente;
>>>>>>> 2d2ce34cc1bbe7e7ea095c544cbb7f19255627d0:src/main/java/com/bolsadeideas/springboot/datajpa/app/services/ClienteServiceImpl.java

@Service
public class ClienteServiceImpl  implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	//Transactional
	//@Override
	//public List<Cliente> findAll() {
	//	return (List<Cliente>) clienteDao.findAll();
	//}

	@Transactional
	@Override
	public Page<Cliente> findAll(Pageable pageable) {
		return clienteDao.findAll(pageable);
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
