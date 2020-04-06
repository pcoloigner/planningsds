package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.reference.TcStatutDemande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TcStatutDemandeRepository extends JpaRepository<TcStatutDemande, String>{

}
