package com.unsada.appmovil.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.unsada.appmovil.dao.EncargadoDao;
import com.unsada.appmovil.model.Encargado;

public class EncargadoImplService implements EncargadoApi {
	@Autowired
	EncargadoDao encargadoDao;
	@Override
	public <S extends Encargado> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Encargado> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Encargado> findById(Integer id) {
		// TODO Auto-generated method stub
		return encargadoDao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Encargado> findAll() {
		// TODO Auto-generated method stub
		return encargadoDao.findAll();
	}

	@Override
	public Iterable<Encargado> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return encargadoDao.findAllById(ids);
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
	public void delete(Encargado entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Encargado> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
