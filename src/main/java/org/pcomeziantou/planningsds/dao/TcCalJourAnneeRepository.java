package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.calendrier.TcCalJourAnnee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TcCalJourAnneeRepository extends JpaRepository<TcCalJourAnnee, Long>{

}
