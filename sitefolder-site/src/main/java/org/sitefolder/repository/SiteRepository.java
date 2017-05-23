package org.sitefolder.repository;

import java.util.List;

import org.sitefolder.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface SiteRepository extends JpaRepository<Site, Long> {

	List<Site> findByNameStartsWithIgnoreCase(String lastName);

}
