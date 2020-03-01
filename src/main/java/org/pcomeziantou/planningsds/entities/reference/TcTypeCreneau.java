package org.pcomeziantou.planningsds.entities.reference;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Créneau habituel, Match, Fonction d'une personne dans une organisation
 * 
 * A voir si on l'emploi au niveau du créneau, ou d'une réservation (une demande) ??
 * 
 * @author phili
 *
 */
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TcTypeCreneau implements Serializable {

    @Id
    public String cdTypeCreneau;

    public String libelle;

}
