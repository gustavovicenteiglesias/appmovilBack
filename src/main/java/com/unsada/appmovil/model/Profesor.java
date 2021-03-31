package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PROFESOR database table.
 * 
 */
@Entity
@Table(name="PROFESOR")
@NamedQuery(name="Profesor.findAll", query="SELECT p FROM Profesor p")
public class Profesor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idProfesor;

	private String apellido;

	private String legajo;

	private String mail;

	private String matricula;

	private String nombre;

	private String telefono;

	//bi-directional many-to-many association to RegistroDeAsistencia
	@ManyToMany(mappedBy="profesors")
	private List<RegistroDeAsistencia> registroDeAsistencias;

	//bi-directional many-to-many association to Clase
	@ManyToMany
	@JoinTable(
		name="PROFESOR_has_CLASE"
		, joinColumns={
			@JoinColumn(name="PROFESOR_idProfesor")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CLASE_idClase")
			}
		)
	private List<Clase> clases;

	public Profesor() {
	}

	public int getIdProfesor() {
		return this.idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLegajo() {
		return this.legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<RegistroDeAsistencia> getRegistroDeAsistencias() {
		return this.registroDeAsistencias;
	}

	public void setRegistroDeAsistencias(List<RegistroDeAsistencia> registroDeAsistencias) {
		this.registroDeAsistencias = registroDeAsistencias;
	}

	public List<Clase> getClases() {
		return this.clases;
	}

	public void setClases(List<Clase> clases) {
		this.clases = clases;
	}

}