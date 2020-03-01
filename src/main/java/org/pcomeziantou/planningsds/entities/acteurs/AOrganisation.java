package org.pcomeziantou.planningsds.entities.acteurs;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public abstract class AOrganisation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

    private String nom;

    private String sigle;

	@ManyToOne  //En fait OneToOne ...
	@JoinColumn(name="codePostal")
    private TgCommune commune;


}
