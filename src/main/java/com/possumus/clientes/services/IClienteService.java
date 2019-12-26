package com.possumus.clientes.services;
import com.possumus.clientes.models.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.util.List;

public interface IClienteService {

	//findall sin paginacion
	//public List<Cliente> findAll();

	public Page<Cliente> findAll(Pageable pageable);
	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);

}
