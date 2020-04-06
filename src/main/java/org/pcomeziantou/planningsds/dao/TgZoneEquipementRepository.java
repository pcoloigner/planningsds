package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.acteurs.TgZoneEquipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TgZoneEquipementRepository extends JpaRepository<TgZoneEquipement, Long>{

}
