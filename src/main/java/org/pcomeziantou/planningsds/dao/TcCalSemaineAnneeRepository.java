package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.calendrier.TcCalSemaineAnnee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TcCalSemaineAnneeRepository extends JpaRepository<TcCalSemaineAnnee, Long>{

}
