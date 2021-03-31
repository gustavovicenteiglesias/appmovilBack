package com.unsada.appmovil.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.unsada.appmovil.dao.InvitadoDao;
import com.unsada.appmovil.model.Invitado;

public class InvitadoImplService implements InvitadoApi {
	@Autowired
	InvitadoDao invitadoDao;
	@Override
	public <S extends Invitado> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Invitado> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Invitado> findById(Integer id) {
		// TODO Auto-generated method stub
		return invitadoDao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Invitado> findAll() {
		// TODO Auto-generated method stub
		return invitadoDao.findAll();
	}

	@Override
	public Iterable<Invitado> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return invitadoDao.findAllById(ids);
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
	public void delete(Invitado entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Invitado> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
