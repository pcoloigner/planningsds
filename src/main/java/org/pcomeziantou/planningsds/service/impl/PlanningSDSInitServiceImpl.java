package org.pcomeziantou.planningsds.service.impl;

import java.util.stream.Stream;

import org.pcomeziantou.planningsds.dao.TgCommuneRepository;
import org.pcomeziantou.planningsds.entities.acteurs.TgCommune;
import org.pcomeziantou.planningsds.service.IPlanningSDSInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanningSDSInitServiceImpl implements IPlanningSDSInitService{

	@Autowired
	private TgCommuneRepository communeRepository;
	
	@Override
	public void initTgCommune() {
//		Stream.of("94550/Chevilly-Larue", "94222/Fresnes").forEach(chaine -> {
//			TgCommune commune = new TgCommune();
//			commune.setCodePostal(chaine.sp);
//		});	
		TgCommune commune = new TgCommune();
		commune.setCodePostal("94550");
		commune.setLibelle("CHEVILLY-LARUE");
		communeRepository.save(commune);
						
		commune = new TgCommune();
		commune.setCodePostal("94230");
		commune.setLibelle("L'HAY-LES-ROSES");
		communeRepository.save(commune);
	}

	@Override
	public void initTcFonction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTcJoursSemaine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTcMoisAnnee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTcStatutDemande() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTcTypeCreneau() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTcTypeZoneEquipement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTgClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTgEquipement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTgMembre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTgPersonne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTgSection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTgZoneEquipement() {
		// TODO Auto-generated method stub
		
	}

}
