package org.pcomeziantou.planningsds.entities.demande;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.pcomeziantou.planningsds.entities.reference.TcStatutDemande;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_DEMANDE_HISTO")
public class TgDemandeHisto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_demande_histo")
	private Long idDemandeHisto;

	private Date dateDebut;

	private Date dateFin;

	@ManyToOne
	@JoinColumn(name="cdStatut")
	private TcStatutDemande tcStatutDemande;

	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private TgDemande demande;
	
}
