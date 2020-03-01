package org.pcomeziantou.planningsds.entities.calendrier;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="TC_CAL_ANNEE")
public class TcCalAnnee implements Serializable {
	
	private static final long serialVersionUID = 8653916401611500530L;

	@Id
	@Column(name="CD_ANNEE")
    private String cd_annee;

    private String bo_bissextile;

//    @OneToMany(mappedBy="annee")
//    private Collection<TcCalMoisAnnee> mois; // = new ArrayList<TcCalMoisAnnee> ();
//
//    public List<TcCalSemaineAnnee> semaines = new ArrayList<TcCalSemaineAnnee> ();
//
//    public List<TcCalJourAnnee> jours = new ArrayList<TcCalJourAnnee> ();

    String getBo_bissextile() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.bo_bissextile;
    }

}
