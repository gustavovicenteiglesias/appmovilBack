package com.unsada.appmovil.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.unsada.appmovil.dao.ComisionDao;
import com.unsada.appmovil.model.Comision;

public class ComisionImplService implements ComisionApi {
	@Autowired
	ComisionDao comisionDao;
	@Override
	public <S extends Comision> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Comision> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Comision> findById(Integer id) {
		// TODO Auto-generated method stub
		return comisionDao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Comision> findAll() {
		// TODO Auto-generated method stub
		return comisionDao.findAll();
	}

	@Override
	public Iterable<Comision> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return comisionDao.findAllById(ids);
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
	public void delete(Comision entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Comision> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
