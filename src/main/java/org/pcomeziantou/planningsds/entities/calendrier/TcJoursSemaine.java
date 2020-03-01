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
public class TcJoursSemaine implements Serializable {
	
	private static final long serialVersionUID = -2217645918888406430L;

	@Id
	private Long no;
	private String libelle;
	private String libelleBis;
	
}
