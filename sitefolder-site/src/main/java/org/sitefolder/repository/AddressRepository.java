package org.sitefolder.repository;

import java.util.List;

import org.sitefolder.Address;
import org.sitefolder.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface AddressRepository extends JpaRepository<Address, Long> {

}
