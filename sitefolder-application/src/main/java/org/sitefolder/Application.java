package org.sitefolder;

import org.sitefolder.repository.AddressRepository;
import org.sitefolder.repository.SiteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"org.sitefolder"})
@EnableJpaRepositories(basePackages = {"org.sitefolder.repository"})
@SpringBootApplication
//@Import(RepositoryRestMvcConfiguration.class)
//@Import(IDConfiguration.class)
@EnableAutoConfiguration
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		System.out.println("Let's inspect the beans provided by Spring Boot: test");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}

//	@Bean
//	public CommandLineRunner loadSite(Website website) {
//		return (args) -> {
//			
//			//for(Page p: website.getPages())
//				//System.out.println(p.getName());
//		};
//		
//	}
	
	@Bean
	public CommandLineRunner loadData(SiteRepository repository, AddressRepository addressRepository) {
		return (args) -> {
			Site site;
			Address address;
			
			site = new Site("Site1");
			address = new Address();
			address.setCity("Beauvais");
			address.setNumber(55);
			address.setStreet("Bulles");
			address.setZipCode(60130);
			
			
			site.setAddress(address);
			
			addressRepository.save(address);
			repository.save(site);
			repository.save(new Site("Site2"));
			repository.save(new Site("Site3"));
			repository.save(new Site("Site4"));
			repository.save(new Site("Site5"));
			
			// fetch all customers
						log.info("Sites found with findAll():");
						log.info("-------------------------------");
						for (Site site1 : repository.findAll()) {
							log.info(site1.toString());
						}
						log.info("");
		};

			
		
	}
}
