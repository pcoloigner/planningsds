package org.pcomeziantou.planningsds.entities.acteurs;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TG_SECTION")
public class TgSection extends AOrganisation {

	private String nom_section;

	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private TgClub club;

}
