package com.deep.aoppractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deep.aoppractice.buisness.BuisnessService1;

@SpringBootApplication
public class AopPracticeApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(getClass());
	private BuisnessService1 buisnessService1;

	public AopPracticeApplication(BuisnessService1 buisnessService1) {
		this.buisnessService1 = buisnessService1;
	}

	public static void main(String[] args) {
		SpringApplication.run(AopPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Value returned is " + buisnessService1.calculateMax());

	}

}
