package com.possumus.clientes.dao;

import org.springframework.data.repository.CrudRepository;

import com.possumus.clientes.models.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

    // Esto se definiria si no se heredara de crudrepository
	//public List<Cliente> findAll();
	//public void save(Cliente cliente);
	//public Cliente findOne(Long id);
	//public void delete(Long id);
	
}
