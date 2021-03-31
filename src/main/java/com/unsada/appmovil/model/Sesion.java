package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SESION database table.
 * 
 */
@Entity
@Table(name="SESION")
@NamedQuery(name="Sesion.findAll", query="SELECT s FROM Sesion s")
public class Sesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSesion;

	private byte activa;

	private int capacidadActual;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to RegistroDeAsistencia
	@OneToMany(mappedBy="sesion")
	private List<RegistroDeAsistencia> registroDeAsistencias;

	//bi-directional many-to-one association to Aula
	@ManyToOne
	@JoinColumn(name="AULA_idAula")
	private Aula aula;

	//bi-directional many-to-one association to Encargado
	@ManyToOne
	@JoinColumn(name="ENCARGADO_idENCARGADO")
	private Encargado encargado;

	//bi-directional many-to-one association to Horario
	@ManyToOne
	@JoinColumn(name="HORARIO_idHORARIO")
	private Horario horario;

	public Sesion() {
	}

	public int getIdSesion() {
		return this.idSesion;
	}

	public void setIdSesion(int idSesion) {
		this.idSesion = idSesion;
	}

	public byte getActiva() {
		return this.activa;
	}

	public void setActiva(byte activa) {
		this.activa = activa;
	}

	public int getCapacidadActual() {
		return this.capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<RegistroDeAsistencia> getRegistroDeAsistencias() {
		return this.registroDeAsistencias;
	}

	public void setRegistroDeAsistencias(List<RegistroDeAsistencia> registroDeAsistencias) {
		this.registroDeAsistencias = registroDeAsistencias;
	}

	public RegistroDeAsistencia addRegistroDeAsistencia(RegistroDeAsistencia registroDeAsistencia) {
		getRegistroDeAsistencias().add(registroDeAsistencia);
		registroDeAsistencia.setSesion(this);

		return registroDeAsistencia;
	}

	public RegistroDeAsistencia removeRegistroDeAsistencia(RegistroDeAsistencia registroDeAsistencia) {
		getRegistroDeAsistencias().remove(registroDeAsistencia);
		registroDeAsistencia.setSesion(null);

		return registroDeAsistencia;
	}

	public Aula getAula() {
		return this.aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Encargado getEncargado() {
		return this.encargado;
	}

	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}

	public Horario getHorario() {
		return this.horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

}