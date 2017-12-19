package org.sitefolder.repository;

import java.util.List;

import org.sitefolder.Site;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface SiteRepository extends JpaRepository<Site, Long> {

	List<Site> findByNameStartsWithIgnoreCase(String lastName);

}
