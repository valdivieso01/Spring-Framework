//package com.bolsadeideas.springboot.datajpa.app.dao;

//import java.util.List;
//import java.util.Optional;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

//import org.springframework.stereotype.Repository;

//import com.bolsadeideas.springboot.datajpa.app.models.entity.Cliente;

//@Repository("ClienteDaoJPA")
//public class ClienteDaoImplOld implements IClienteDao {
	
	//@PersistenceContext
	//private EntityManager em;
	
	//@SuppressWarnings("unchecked")
	//@Override
	//public List<Cliente> findAll() {
	//	return em.createQuery("from Cliente").getResultList();
	//}

	//@Override
	//public Cliente findById(Long id) {
	//	return em.find(Cliente.class, id);
	//}
	
	//@Override
	//public void save(Cliente cliente) {
	//	if ( cliente.getId() != null && cliente.getId() > 0) {
	//		em.merge(cliente);
	//	} else {
	//		em.persist(cliente);
	//	}
	//}

	//@Override
	//public void delete(Long id) {
	//	em.remove(findOne(id));		
	//}
//}
