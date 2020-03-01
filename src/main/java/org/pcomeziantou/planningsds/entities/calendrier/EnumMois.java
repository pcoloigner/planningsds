package org.pcomeziantou.planningsds.entities.calendrier;

public enum EnumMois {
	JANVIER("janvier"), FEVRIER("février"), MARS("mars"), AVRIL("avril"), MAI("mai"), JUIN("juin"),
	JUILLET("juillet"), AOUT("août"), SEPTEMBRE("septembre"), OCTOBRE("octobre"), NOVEMBRE("novembre"), DECEMBRE("décembre");
	
	String no;
	String libelle; 
	
	EnumMois(String m){
		this.libelle = m;
	}
	
	String getLibelle(EnumMois m) {
		return libelle;
	}

}
