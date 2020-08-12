package com.infosys.api.shipment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

public class Application extends SpringBootServletInitializer {
	
   /* @Autowired
    Environment environment;
    @Value("${spring.application.name}")
    private String applicationName;*/
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
   /*
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            String port = environment.getProperty("local.server.port");

            System.out.println();
            System.out.println("Server started - http://localhost:" + port + "/health");
        };
    }*/
	
  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
/*
    @Bean
    public io.opentracing.Tracer initTracer() {
        Configuration.SamplerConfiguration samplerConfig = new Configuration.SamplerConfiguration()
                .withType("const")
                .withParam(1);
        Configuration.ReporterConfiguration reporterConfig = Configuration.ReporterConfiguration.fromEnv()
                .withLogSpans(true);

        return Configuration.fromEnv(this.applicationName)
                .withSampler(samplerConfig)
                .withReporter(reporterConfig).getTracer();
    }
    */
}
