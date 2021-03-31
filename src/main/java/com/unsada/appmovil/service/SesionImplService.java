package com.unsada.appmovil.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.unsada.appmovil.dao.SesionDao;
import com.unsada.appmovil.model.Sesion;



public class SesionImplService implements SesionApi {
	@Autowired
	SesionDao sesiondao;

	@Override
	public <S extends Sesion> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sesion> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Sesion> findById(Integer id) {
		// TODO Auto-generated method stub
		return sesiondao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Sesion> findAll() {
		// TODO Auto-generated method stub
		return sesiondao.findAll();
	}

	@Override
	public Iterable<Sesion> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return sesiondao.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Sesion entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Sesion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
}
