package org.pcomeziantou.planningsds.entities.acteurs;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TgCommune {

	@Id
	private String codePostal;

    private String libelle;


}
