package hcl.training.LoanService;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoanServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LoanServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("sss","xxx").forEach(System.out:: println);
		
	}
	
	@Bean
	public CommandLineRunner get() {
		return ((String... args) -> {
			Arrays.asList(args).forEach(System.out:: println);
			Arrays.asList(args).forEach(System.out:: println);
				
			});
		
		
	} 

}



