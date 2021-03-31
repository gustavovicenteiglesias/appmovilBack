package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the COMISION database table.
 * 
 */
@Entity
@Table(name="COMISION")
@NamedQuery(name="Comision.findAll", query="SELECT c FROM Comision c")
public class Comision implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCOMISION;

	private String cantidadDeAlumnos;

	private String institucion;

	//bi-directional many-to-one association to Aula
	@OneToMany(mappedBy="comision")
	private List<Aula> aulas;

	//bi-directional many-to-one association to Clase
	@ManyToOne
	@JoinColumn(name="CLASE_idClase")
	private Clase clase;

	//bi-directional many-to-many association to Alumno
	@ManyToMany
	@JoinTable(
		name="COMISION_has_ALUMNO"
		, joinColumns={
			@JoinColumn(name="COMISION_idCOMISION")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ALUMNO_legajo")
			}
		)
	private List<Alumno> alumnos;

	//bi-directional many-to-one association to Horario
	@OneToMany(mappedBy="comision")
	private List<Horario> horarios;

	public Comision() {
	}

	public int getIdCOMISION() {
		return this.idCOMISION;
	}

	public void setIdCOMISION(int idCOMISION) {
		this.idCOMISION = idCOMISION;
	}

	public String getCantidadDeAlumnos() {
		return this.cantidadDeAlumnos;
	}

	public void setCantidadDeAlumnos(String cantidadDeAlumnos) {
		this.cantidadDeAlumnos = cantidadDeAlumnos;
	}

	public String getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public List<Aula> getAulas() {
		return this.aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

	public Aula addAula(Aula aula) {
		getAulas().add(aula);
		aula.setComision(this);

		return aula;
	}

	public Aula removeAula(Aula aula) {
		getAulas().remove(aula);
		aula.setComision(null);

		return aula;
	}

	public Clase getClase() {
		return this.clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}

	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public List<Horario> getHorarios() {
		return this.horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public Horario addHorario(Horario horario) {
		getHorarios().add(horario);
		horario.setComision(this);

		return horario;
	}

	public Horario removeHorario(Horario horario) {
		getHorarios().remove(horario);
		horario.setComision(null);

		return horario;
	}

}