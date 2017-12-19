package org.sitefolder.rest.repositories;

import java.util.ArrayList;

import org.sitefolder.Address;
import org.springframework.hateoas.PagedResources;

public class AddressPagedResources extends PagedResources<Address> {

	public AddressPagedResources() {
		super(new ArrayList<Address>(), null);
	}
}
