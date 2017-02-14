package jinq;

import jinq.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by jiaweizhang on 2/14/2017.
 */

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(AccountRepository repository) {
		return (args) -> {
			log.info("sample data loaded by flyway");

			log.info("findByLastName()");
			repository.findByLastName("Zebra").forEach(c -> log.info(c.toString()));

			log.info("findAll()");
			repository.findAll().forEach(c -> log.info(c.toString()));

			log.info("findAccountsWithShortFirstNames()");
			repository.findAccountsWithShortFirstName().forEach(c -> log.info(c.toString()));
		};
	}

}
