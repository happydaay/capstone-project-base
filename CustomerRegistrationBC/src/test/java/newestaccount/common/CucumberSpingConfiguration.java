package newestaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import newestaccount.CustomerRegistrationBcApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerRegistrationBcApplication.class })
public class CucumberSpingConfiguration {}
