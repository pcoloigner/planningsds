package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.planning.TgCreneauHoraireAttribue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TgCreneauHoraireAttribueRepository extends JpaRepository<TgCreneauHoraireAttribue, Long>{

}
