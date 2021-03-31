package com.unsada.appmovil.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.unsada.appmovil.dao.ProfesorDao;
import com.unsada.appmovil.model.Profesor;

public class ProfesorImplService implements ProfesorApi {
	@Autowired
	ProfesorDao profesorDao;
	@Override
	public <S extends Profesor> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Profesor> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Profesor> findById(Integer id) {
		// TODO Auto-generated method stub
		return profesorDao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Profesor> findAll() {
		// TODO Auto-generated method stub
		return profesorDao.findAll();
	}

	@Override
	public Iterable<Profesor> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return profesorDao.findAllById(ids);
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
	public void delete(Profesor entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Profesor> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
