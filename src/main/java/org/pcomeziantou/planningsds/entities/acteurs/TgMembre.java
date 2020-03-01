package org.pcomeziantou.planningsds.entities.acteurs;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.pcomeziantou.planningsds.entities.reference.TcFonction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_MEMBRE")
public class TgMembre {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") //, insertable=false, updatable=false)
	private Long id;

	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private AOrganisation aOrganisation;

	@ManyToOne
	@JoinColumn(name="idPersonne") //, insertable=false, updatable=false)
	private TgPersonne tgPersonne;
	
	@ManyToOne
	@JoinColumn(name="cdFonction") //, insertable=false, updatable=false)
	private TcFonction fonction;

	private Date date_debut ;

	private Date date_fin;


}
