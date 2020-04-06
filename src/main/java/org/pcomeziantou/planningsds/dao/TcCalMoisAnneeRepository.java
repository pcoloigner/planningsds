package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.calendrier.TcCalMoisAnnee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TcCalMoisAnneeRepository extends JpaRepository<TcCalMoisAnnee, Long>{

}
