package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AULA database table.
 * 
 */
@Entity
@Table(name="AULA")
@NamedQuery(name="Aula.findAll", query="SELECT a FROM Aula a")
public class Aula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAula;

	private String capacidad;

	private String direccion;

	private String edificio;

	private String nombre;

	//bi-directional many-to-one association to Comision
	@ManyToOne
	@JoinColumn(name="COMISION_idCOMISION")
	private Comision comision;

	//bi-directional many-to-one association to Sesion
	@OneToMany(mappedBy="aula")
	private List<Sesion> sesions;

	public Aula() {
	}

	public int getIdAula() {
		return this.idAula;
	}

	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}

	public String getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEdificio() {
		return this.edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Comision getComision() {
		return this.comision;
	}

	public void setComision(Comision comision) {
		this.comision = comision;
	}

	public List<Sesion> getSesions() {
		return this.sesions;
	}

	public void setSesions(List<Sesion> sesions) {
		this.sesions = sesions;
	}

	public Sesion addSesion(Sesion sesion) {
		getSesions().add(sesion);
		sesion.setAula(this);

		return sesion;
	}

	public Sesion removeSesion(Sesion sesion) {
		getSesions().remove(sesion);
		sesion.setAula(null);

		return sesion;
	}

}