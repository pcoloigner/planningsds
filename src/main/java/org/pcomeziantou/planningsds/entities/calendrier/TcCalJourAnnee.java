package org.pcomeziantou.planningsds.entities.calendrier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="TC_CAL_JOUR_ANNEE")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TcCalJourAnnee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4992364375216268614L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name="NO_JOUR_ANNEE")
	private Long noJourAnnee;

	@Column(name="NO_JOUR_MOIS")
	private Long noJourMois;

	@ManyToOne
	@JoinColumn(name="JOUR_SEMAINE")
	private TcJoursSemaine jourSemaine;

	@ManyToOne
	@JoinColumn(name="CD_ANNEE")
	private TcCalAnnee annee;

	public String BoWeekend() {
		return "";
	}

	public String BoVacances() {
		return "";
	}

	public String BoJourFerie() {
		return "";
	}

}
