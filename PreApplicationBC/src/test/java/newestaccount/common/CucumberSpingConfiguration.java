package newestaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import newestaccount.PreApplicationBcApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PreApplicationBcApplication.class })
public class CucumberSpingConfiguration {}
