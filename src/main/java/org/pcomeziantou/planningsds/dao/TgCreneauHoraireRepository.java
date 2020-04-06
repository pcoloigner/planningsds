package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.planning.TgCreneauHoraire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TgCreneauHoraireRepository extends JpaRepository<TgCreneauHoraire, Long>{

}
