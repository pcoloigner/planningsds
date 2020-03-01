package org.pcomeziantou.planningsds.entities.calendrier;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="TC_CAL_MOIS_ANNEE")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TcCalMoisAnnee implements Serializable{
    
	private static final long serialVersionUID = -7488702417034364477L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name="CD_ANNEE")
	private TcCalAnnee annee;
	
	@OneToOne
	@JoinColumn(name="noMois")
	private TcMoisAnnee mois;
	
	private Long nb_jours;

//    public List<TcCalSemaineAnnee> semaines = new ArrayList<TcCalSemaineAnnee> ();
//
//
//    public List<TcCalJourAnnee> joursAnnee = new ArrayList<TcCalJourAnnee> ();
}
