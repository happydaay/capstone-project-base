package newestaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import newestaccount.AccountOpenBcApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { AccountOpenBcApplication.class })
public class CucumberSpingConfiguration {}
