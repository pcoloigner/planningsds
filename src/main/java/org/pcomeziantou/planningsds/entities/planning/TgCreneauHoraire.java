package org.pcomeziantou.planningsds.entities.planning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.pcomeziantou.planningsds.entities.acteurs.TgZoneEquipement;
import org.pcomeziantou.planningsds.entities.calendrier.TcJoursSemaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Brique de base pour tout planning, quelque soit le point de vue: 
 *  
 * quel jour de semaine, quelle plage horaire,  quelle salle ?
 * 
 * ajouter l'organisation qui occupe le créneau ? 
 * Oui, car un créneau seul n'a pas beaucoup de sens
 * 
 * ajouter le type : créneau habituel / match /stage ?
 * 
 * 
 * Est-elle "Réservable" ? ou cela va concerner TgCreneauHoraireSection ? 
 * 
 * 
 * faut-il ajouter TOUS les aspects ?
 * --> s'agit-il de demandes ? de quelles versions des demandes ?
 * --> s'agit-il des créneaux REELS ? 
 *  
 * 
 * 
 * @author phili
 *
 */
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_CRENEAU_HORAIRE")
public class TgCreneauHoraire /* implements IReservable */ {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="no")
	private TcJoursSemaine jourSemaine;

	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private TgZoneEquipement zoneEquipement;

	@ManyToOne
	@JoinColumn(name="cdPlageHoraire")
	private TgPlageHoraire creneau;

	private String libelle;
	
//    public void Operation() {
//    }

}
