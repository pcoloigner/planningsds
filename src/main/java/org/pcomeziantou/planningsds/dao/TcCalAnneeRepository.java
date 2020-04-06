package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.calendrier.TcCalAnnee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TcCalAnneeRepository extends JpaRepository<TcCalAnnee, String>{

}
