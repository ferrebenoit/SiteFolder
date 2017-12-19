package org.sitefolder.rest.repositories;

import org.sitefolder.utils.rest.SpringDataRestRepositoryOperations;

public class AddressRestRepository extends SpringDataRestRepositoryOperations<AddressPagedResources> {
	
	public AddressRestRepository(boolean secure, String host, int port) {
		super(AddressPagedResources.class, secure, host, port, "addresses");
	}
}
