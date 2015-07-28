package prop;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
@ComponentScan
public class SampleWebApplication  {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(SampleWebApplication.class)
				.run(args);
	}
}
