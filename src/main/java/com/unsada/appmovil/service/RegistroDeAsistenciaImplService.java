package com.unsada.appmovil.service;

import java.util.Map;
import java.util.Optional;

import org.hibernate.boot.spi.SessionFactoryOptions;
import org.hibernate.cache.CacheException;

import org.hibernate.cache.cfg.spi.DomainDataRegionBuildingContext;
import org.hibernate.cache.cfg.spi.DomainDataRegionConfig;
import org.hibernate.cache.spi.DomainDataRegion;
import org.hibernate.cache.spi.QueryResultsRegion;
import org.hibernate.cache.spi.TimestampsRegion;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.springframework.beans.factory.annotation.Autowired;

import com.unsada.appmovil.dao.RegistroDeAsistenciaDao;
import com.unsada.appmovil.model.RegistroDeAsistencia;

public class RegistroDeAsistenciaImplService implements RegistroDeAsistenciaApi {
	@Autowired
	RegistroDeAsistenciaDao RegistroDeAsistenciaDao;
	@Override
	public <S extends RegistroDeAsistencia> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RegistroDeAsistencia> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<RegistroDeAsistencia> findById(Integer id) {
		// TODO Auto-generated method stub
		return RegistroDeAsistenciaDao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<RegistroDeAsistencia> findAll() {
		// TODO Auto-generated method stub
		return RegistroDeAsistenciaDao.findAll();
	}

	@Override
	public Iterable<RegistroDeAsistencia> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return RegistroDeAsistenciaDao.findAllById(ids);
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
	public void delete(RegistroDeAsistencia entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends RegistroDeAsistencia> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}


}
