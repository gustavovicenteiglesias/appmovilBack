package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the HORARIO database table.
 * 
 */
@Entity
@Table(name="HORARIO")
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idHORARIO;

	private String diaDeLaSemana;

	private String horaFin;

	private String horaInicio;

	//bi-directional many-to-one association to Comision
	@ManyToOne
	@JoinColumn(name="COMISION_idCOMISION")
	private Comision comision;

	//bi-directional many-to-one association to Sesion
	@OneToMany(mappedBy="horario")
	private List<Sesion> sesions;

	public Horario() {
	}

	public int getIdHORARIO() {
		return this.idHORARIO;
	}

	public void setIdHORARIO(int idHORARIO) {
		this.idHORARIO = idHORARIO;
	}

	public String getDiaDeLaSemana() {
		return this.diaDeLaSemana;
	}

	public void setDiaDeLaSemana(String diaDeLaSemana) {
		this.diaDeLaSemana = diaDeLaSemana;
	}

	public String getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
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
		sesion.setHorario(this);

		return sesion;
	}

	public Sesion removeSesion(Sesion sesion) {
		getSesions().remove(sesion);
		sesion.setHorario(null);

		return sesion;
	}

}