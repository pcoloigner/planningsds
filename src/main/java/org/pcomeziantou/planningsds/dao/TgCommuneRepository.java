package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.acteurs.TgCommune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TgCommuneRepository extends JpaRepository<TgCommune, Long>{

}
