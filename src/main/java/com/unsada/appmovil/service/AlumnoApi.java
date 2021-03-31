package com.unsada.appmovil.service;

import org.springframework.data.repository.CrudRepository;

import com.unsada.appmovil.model.Alumno;

public interface AlumnoApi extends CrudRepository<Alumno, Integer> {

}
