package org.pcomeziantou.planningsds.entities.acteurs;

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
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_ZONE_EQUIPEMENT")
public class TgZoneEquipement {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    private String libelle;
    
    private String description;
    
	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private TgEquipement equipementSportif;
    

}
