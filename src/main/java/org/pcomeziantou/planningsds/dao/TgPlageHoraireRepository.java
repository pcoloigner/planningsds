package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.planning.TgPlageHoraire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TgPlageHoraireRepository extends JpaRepository<TgPlageHoraire, String>{

}
