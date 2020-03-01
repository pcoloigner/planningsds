package org.pcomeziantou.planningsds.entities.reference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TC_TYPE_ZONE_EQUIPEMENT")
public class TcTypeZoneEquipement {

	@Id
	private String cdType;

	private String lbLibelleType;
}
   
