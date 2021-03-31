package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ALUMNO database table.
 * 
 */
@Entity
@Table(name="ALUMNO")
@NamedQuery(name="Alumno.findAll", query="SELECT a FROM Alumno a")
public class Alumno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int legajo;

	private String apellido;

	private String dni;

	private String nombre;

	//bi-directional many-to-one association to RegistroDeAsistencia
	@ManyToOne
	@JoinColumn(name="REGISTRO_DE_ASISTENCIA_idREGISTRO_DE_ASISTENCIA")
	private RegistroDeAsistencia registroDeAsistencia;

	//bi-directional many-to-many association to Comision
	@ManyToMany(mappedBy="alumnos")
	private List<Comision> comisions;

	public Alumno() {
	}

	public int getLegajo() {
		return this.legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public RegistroDeAsistencia getRegistroDeAsistencia() {
		return this.registroDeAsistencia;
	}

	public void setRegistroDeAsistencia(RegistroDeAsistencia registroDeAsistencia) {
		this.registroDeAsistencia = registroDeAsistencia;
	}

	public List<Comision> getComisions() {
		return this.comisions;
	}

	public void setComisions(List<Comision> comisions) {
		this.comisions = comisions;
	}

}