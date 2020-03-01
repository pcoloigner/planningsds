/**
 * 
 */
package org.pcomeziantou.planningsds.entities.calendrier;

import javax.persistence.Entity;

/**
 * @author phili
 *
 */
public enum EnumJoursSemaine {
	LUNDI,
	MARDI,
	MERCREDI,
	JEUDI,
	VENDREDI,
	SAMEDI,
	DIMANCHE;

	String getLibelle(EnumJoursSemaine jour) {
		return "";
	}
}
