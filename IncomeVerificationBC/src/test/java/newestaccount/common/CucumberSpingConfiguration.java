package newestaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import newestaccount.IncomeVerificationBcApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { IncomeVerificationBcApplication.class })
public class CucumberSpingConfiguration {}
