package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.acteurs.TgPersonne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TgPersonneRepository extends JpaRepository<TgPersonne, Long>{

}
