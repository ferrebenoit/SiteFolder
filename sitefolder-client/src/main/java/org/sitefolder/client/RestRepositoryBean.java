package org.sitefolder.client;

import javax.validation.constraints.NotNull;

import org.sitefolder.rest.repositories.AddressRestRepository;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConfigurationProperties(locations = "classpath:mail.properties", ignoreUnknownFields = false, prefix = "mail")
@ConfigurationProperties(prefix = "rest")
public class RestRepositoryBean {

	
	@NotNull
	private String host = "localhost";
	private int port = 8090;
	private boolean securedConnexion = false;
	
	public RestRepositoryBean() {}

	@Bean
	public AddressRestRepository applicationRepository() {
		return new AddressRestRepository(securedConnexion, host, port);
	}
	
	public boolean isSecuredConnexion() {
		return securedConnexion;
	}

	public void setSecuredConnexion(boolean securedConnexion) {
		this.securedConnexion = securedConnexion;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
}