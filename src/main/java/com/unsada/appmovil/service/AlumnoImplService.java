package com.unsada.appmovil.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.unsada.appmovil.dao.AkumnoDao;
import com.unsada.appmovil.model.Alumno;

public class AlumnoImplService implements AlumnoApi {
	@Autowired
	AkumnoDao alumnoDao ;

	@Override
	public <S extends Alumno> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Alumno> findById(Integer id) {
		// TODO Auto-generated method stub
		return alumnoDao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Alumno> findAll() {
		// TODO Auto-generated method stub
		return alumnoDao.findAll();
	}

	@Override
	public Iterable<Alumno> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return alumnoDao.findAllById(ids);
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
	public void delete(Alumno entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Alumno> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
