package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.demande.TgDemande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TgDemandeRepository extends JpaRepository<TgDemande, Long>{

}
