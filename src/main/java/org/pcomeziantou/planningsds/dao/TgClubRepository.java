package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.acteurs.TgClub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TgClubRepository extends JpaRepository<TgClub, Long>{

}
