package com.unsada.appmovil.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.unsada.appmovil.dao.ClaseDao;
import com.unsada.appmovil.model.Clase;

public class ClaseImplService implements ClaseApi {
	@Autowired
	ClaseDao clasedao;
	@Override
	public <S extends Clase> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Clase> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Clase> findById(Integer id) {
		// TODO Auto-generated method stub
		return clasedao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Clase> findAll() {
		// TODO Auto-generated method stub
		return clasedao.findAll();
	}

	@Override
	public Iterable<Clase> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
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
	public void delete(Clase entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Clase> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
