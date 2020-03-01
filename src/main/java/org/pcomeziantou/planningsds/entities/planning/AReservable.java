package org.pcomeziantou.planningsds.entities.planning;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * 
 * EN COURS DE REFLEXION
 * 
 * @author phili
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public abstract class AReservable implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

    private String nom;

    private String sigle;


}
