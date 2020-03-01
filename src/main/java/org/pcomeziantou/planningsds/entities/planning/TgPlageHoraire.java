package org.pcomeziantou.planningsds.entities.planning;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_PLAGE_HORAIRE")
public class TgPlageHoraire {

	//Exemple  "20h00-22h00"
	@Id
	private String cdPlageHoraire;

	private Integer heureDebut;
	private Integer minutesDebut;
	
	private Integer heureFin;
	private Integer minutesFin;

    private String libellePlageHoraire;
    
}
