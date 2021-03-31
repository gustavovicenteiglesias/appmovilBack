package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CLASE database table.
 * 
 */
@Entity
@Table(name="CLASE")
@NamedQuery(name="Clase.findAll", query="SELECT c FROM Clase c")
public class Clase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idClase;

	private String carrera;

	private String materia;

	//bi-directional many-to-one association to Comision
	@OneToMany(mappedBy="clase")
	private List<Comision> comisions;

	//bi-directional many-to-many association to Profesor
	@ManyToMany(mappedBy="clases")
	private List<Profesor> profesors;

	public Clase() {
	}

	public int getIdClase() {
		return this.idClase;
	}

	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}

	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getMateria() {
		return this.materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public List<Comision> getComisions() {
		return this.comisions;
	}

	public void setComisions(List<Comision> comisions) {
		this.comisions = comisions;
	}

	public Comision addComision(Comision comision) {
		getComisions().add(comision);
		comision.setClase(this);

		return comision;
	}

	public Comision removeComision(Comision comision) {
		getComisions().remove(comision);
		comision.setClase(null);

		return comision;
	}

	public List<Profesor> getProfesors() {
		return this.profesors;
	}

	public void setProfesors(List<Profesor> profesors) {
		this.profesors = profesors;
	}

}