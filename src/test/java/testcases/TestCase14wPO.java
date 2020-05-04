package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import choucair.pages.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class TestCase14wPO {

	@Managed
	WebDriver driver;
	
	@Steps
	HomePage Home;
	
	@Test
	public void BusquedaUbicacion()
	{
		driver.get("https://www.choucairtesting.com/");
		Home.BusquedaUbicacion();		
	}
}
