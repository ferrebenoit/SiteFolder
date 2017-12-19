package org.sitefolder.client;

import org.sitefolder.Address;
import org.sitefolder.rest.repositories.AddressPagedResources;
import org.sitefolder.rest.repositories.AddressRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppTests {

	@Autowired
	private AddressRestRepository addressRestRepository;

	public AppTests() {}
	
	public void runTest() {
		
		AddressPagedResources addressPagedResources = addressRestRepository.getList();
		System.out.println("after get list");
		for (Address address : addressPagedResources.getContent()) {
			System.out.println("ID      = " + address.getId());
    		System.out.println("Name    = " + address.getCity());
    		System.out.println("Actions = " + address.getStreet());
		}
		
		
	}
	
}
