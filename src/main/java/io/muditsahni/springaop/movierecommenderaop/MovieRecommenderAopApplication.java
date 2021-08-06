package io.muditsahni.springaop.movierecommenderaop;

import io.muditsahni.springaop.movierecommenderaop.business.FilteringTechniqueOne;
import io.muditsahni.springaop.movierecommenderaop.business.FilteringTechniqueTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private FilteringTechniqueOne filterOne;
	@Autowired
	private FilteringTechniqueTwo filterTwo;

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommenderAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("{}", filterOne.contentBasedFiltering());
		logger.info("{}", filterTwo.collaborativeFiltering());
	}

}
