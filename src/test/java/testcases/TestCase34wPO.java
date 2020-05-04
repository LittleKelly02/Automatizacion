package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import choucair.pages.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class TestCase34wPO {

	@Managed
	WebDriver driver;
	Boolean aboutMe;
	WebDriverWait wait;
	
	@Steps
	HomePage Home;
	
	@Test
	public void RedireccionUp()
	{
		driver.get("https://www.choucairtesting.com/");
		Home.RedireccionUp();		

	}
}
