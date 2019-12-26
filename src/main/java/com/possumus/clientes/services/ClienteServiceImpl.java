package com.possumus.clientes.services;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.possumus.clientes.dao.IClienteDao;
import com.possumus.clientes.models.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
