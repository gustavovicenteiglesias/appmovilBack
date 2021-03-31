package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the REGISTRO_DE_ASISTENCIA database table.
 * 
 */
@Entity
@Table(name="REGISTRO_DE_ASISTENCIA")
@NamedQuery(name="RegistroDeAsistencia.findAll", query="SELECT r FROM RegistroDeAsistencia r")
public class RegistroDeAsistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idREGISTRO_DE_ASISTENCIA;

	//bi-directional many-to-one association to Alumno
	@OneToMany(mappedBy="registroDeAsistencia")
	private List<Alumno> alumnos;

	//bi-directional many-to-one association to Invitado
	@OneToMany(mappedBy="registroDeAsistencia")
	private List<Invitado> invitados;

	//bi-directional many-to-many association to Profesor
	@ManyToMany
	@JoinTable(
		name="PROFESOR_REGISTRA_ASISTENCIA"
		, joinColumns={
			@JoinColumn(name="REGISTRO_DE_ASISTENCIA_idREGISTRO_DE_ASISTENCIA")
			}
		, inverseJoinColumns={
			@JoinColumn(name="PROFESOR_idProfesor")
			}
		)
	private List<Profesor> profesors;

	//bi-directional many-to-one association to Sesion
	@ManyToOne
	@JoinColumn(name="SESION_idSesion")
	private Sesion sesion;

	public RegistroDeAsistencia() {
	}

	public int getIdREGISTRO_DE_ASISTENCIA() {
		return this.idREGISTRO_DE_ASISTENCIA;
	}

	public void setIdREGISTRO_DE_ASISTENCIA(int idREGISTRO_DE_ASISTENCIA) {
		this.idREGISTRO_DE_ASISTENCIA = idREGISTRO_DE_ASISTENCIA;
	}

	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Alumno addAlumno(Alumno alumno) {
		getAlumnos().add(alumno);
		alumno.setRegistroDeAsistencia(this);

		return alumno;
	}

	public Alumno removeAlumno(Alumno alumno) {
		getAlumnos().remove(alumno);
		alumno.setRegistroDeAsistencia(null);

		return alumno;
	}

	public List<Invitado> getInvitados() {
		return this.invitados;
	}

	public void setInvitados(List<Invitado> invitados) {
		this.invitados = invitados;
	}

	public Invitado addInvitado(Invitado invitado) {
		getInvitados().add(invitado);
		invitado.setRegistroDeAsistencia(this);

		return invitado;
	}

	public Invitado removeInvitado(Invitado invitado) {
		getInvitados().remove(invitado);
		invitado.setRegistroDeAsistencia(null);

		return invitado;
	}

	public List<Profesor> getProfesors() {
		return this.profesors;
	}

	public void setProfesors(List<Profesor> profesors) {
		this.profesors = profesors;
	}

	public Sesion getSesion() {
		return this.sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

}