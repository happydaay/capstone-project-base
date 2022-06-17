package newestaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import newestaccount.NotifyBcApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotifyBcApplication.class })
public class CucumberSpingConfiguration {}
