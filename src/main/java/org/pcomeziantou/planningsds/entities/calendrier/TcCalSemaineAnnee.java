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
@Table(name="TC_CAL_SEMAINE_ANNEE")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TcCalSemaineAnnee implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="NO_SEMAINE")
	private Long noSemaine;
	
	@ManyToOne
	@JoinColumn(name="CD_ANNEE")
	private TcCalAnnee annee;
	
}