package org.pcomeziantou.planningsds.entities.acteurs;

import java.util.ArrayList;
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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_EQUIPEMENT")
public class TgEquipement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name="codePostal")
	public TgCommune commune;

	private String boIntercommunal;

	private String libelleEquipement;

	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private TgSDS sdsGerant;
	
	@OneToMany(mappedBy="equipementSportif")
	private List<TgZoneEquipement> zonesEquipement;


}