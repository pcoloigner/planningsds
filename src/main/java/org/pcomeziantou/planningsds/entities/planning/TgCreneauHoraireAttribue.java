package org.pcomeziantou.planningsds.entities.planning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.pcomeziantou.planningsds.entities.acteurs.AOrganisation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * Créneau horaire attribué à une section/club
 * 
 * @author phili
 *
 */

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_CRENEAU_HORAIRE_ATTRIBUE")
public class TgCreneauHoraireAttribue {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private TgCreneauHoraire creneauHoraire;
	
	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private AOrganisation organisation;
	
	private String libelle;
	
	
}
