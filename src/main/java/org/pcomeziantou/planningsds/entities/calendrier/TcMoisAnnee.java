package org.pcomeziantou.planningsds.entities.calendrier;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TcMoisAnnee implements Serializable {
	
	private static final long serialVersionUID = -3486535206428578313L;

	@Id
	private String noMois;
	
	private String libelle;

}
