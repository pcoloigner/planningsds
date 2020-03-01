package org.pcomeziantou.planningsds.entities.reference;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Fonction d'une personne dans une organisation
 * 
 * @author phili
 *
 */
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TcFonction implements Serializable {

    @Id
    public String cdFonction;

    public String libelleFonction;

    public String boClub;

    public String boSds;

}
