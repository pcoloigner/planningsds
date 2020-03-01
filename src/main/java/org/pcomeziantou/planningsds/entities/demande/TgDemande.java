package org.pcomeziantou.planningsds.entities.demande;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.pcomeziantou.planningsds.entities.acteurs.AOrganisation;
import org.pcomeziantou.planningsds.entities.acteurs.TgMembre;
import org.pcomeziantou.planningsds.entities.planning.IReservable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * Une demande est faite par une personne pour le compte d'une section/club.
 * Elle est faite à une date donnée.
 * 
 * La "vie" de la demande est enregistrée dans TgDemandeHisto
 * 
 * 
 * @author phili
 *
 */
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_DEMANDE")
public class TgDemande {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
    public String libelle;

    public Date dateDemande;

	@OneToMany(mappedBy="demande")
    public List<TgDemandeHisto> demandesHisto = new ArrayList<> ();
	
	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
    public AOrganisation aOrganisation;

	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
    public TgMembre membre;

//	@OneToMany(mappedBy="id")
//    public List<IReservable> reservables = new ArrayList<IReservable> ();

}


