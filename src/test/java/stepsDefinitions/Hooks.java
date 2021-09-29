package stepsDefinitions;

import static utils.Util.*;
import static utils.Util.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.CompraPage;
import pageObjects.LoginPage;

public class Hooks {
	
	@Before
	public void setUp() {
		acessarSistema();
		Na(LoginPage.class).acessarLogin("lvieira216611@gmail.com", "12345678");
	}
	
	@After
	public void tearDown() {
		
		//capturaTela(scenario);
		driver.quit();
	}

}
