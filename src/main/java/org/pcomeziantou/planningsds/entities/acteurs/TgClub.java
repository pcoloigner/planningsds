package org.pcomeziantou.planningsds.entities.acteurs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
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
@Table(name="TG_CLUB")
public class TgClub extends AOrganisation {

	private String nom;  //Attention: doublon avec lbNom
	
	@ManyToOne
	@JoinColumn(name="id", insertable=false, updatable=false)
	private TgSDS sds;
	
	@OneToMany(mappedBy="club")
	private List<TgSection> sections = new ArrayList<TgSection> ();


}