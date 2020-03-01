package org.pcomeziantou.planningsds.entities.acteurs;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_SDS")
public class TgSDS extends AOrganisation {
	
	private String lsdfdf;
//    public List<TgClub> clubs = new ArrayList<TgClub> ();

//    public List<TgEquipement> equipements = new ArrayList<TgEquipement> ();

}
