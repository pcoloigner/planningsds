package org.pcomeziantou.planningsds.dao;

import org.pcomeziantou.planningsds.entities.reference.TcTypeCreneau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TcTypeCreneauRepository extends JpaRepository<TcTypeCreneau, Long>{

}
