package org.pcomeziantou.planningsds;

import org.pcomeziantou.planningsds.service.IPlanningSDSInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlanningsdsApplication implements CommandLineRunner {

	@Autowired
	private IPlanningSDSInitService planningInitService;
	
	public static void main(String[] args) {
		SpringApplication.run(PlanningsdsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		planningInitService.initTgCommune();
	}
}
