package org.sitefolder.repository;

import org.sitefolder.Address;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface AddressRepository extends JpaRepository<Address, Long> {

}
