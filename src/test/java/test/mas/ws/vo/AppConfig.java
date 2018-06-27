package test.mas.ws.vo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	test.mas.ws.service.v1_0.MediathequeServiceImpl getServiceV1() {
		test.mas.ws.service.v1_0.MediathequeServiceImpl resultat = new test.mas.ws.service.v1_0.MediathequeServiceImpl();
		resultat.setNext(getServiceV2());
		return resultat;
	}
	
	@Bean
	test.mas.ws.service.v2_0.MediathequeServiceImpl getServiceV2() {
		test.mas.ws.service.v2_0.MediathequeServiceImpl resultat = new test.mas.ws.service.v2_0.MediathequeServiceImpl();
		resultat.setNext(getServiceV3());
		return resultat;
	}
	
	@Bean
	test.mas.ws.service.v3_0.MediathequeServiceImpl getServiceV3() {
		test.mas.ws.service.v3_0.MediathequeServiceImpl resultat = new test.mas.ws.service.v3_0.MediathequeServiceImpl();
		resultat.setNext(getServiceV4());
		return resultat;
	}
	
	@Bean
	test.mas.ws.service.v4_0.MediathequeServiceImpl getServiceV4() {
		return new test.mas.ws.service.v4_0.MediathequeServiceImpl();
	}

}
