package testcases;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import choucair.pages.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class TestCase17wPO {
	@Managed
	WebDriver driver;
	WebDriverWait wait;
	WebElement aboutMe;
	
	@Steps
	HomePage Home;
	
	@Test
	public void RedireccioPapelIng() 
	{
		driver.get("https://www.choucairtesting.com/");
		Home.RedireccioPapelIng();
		wait = new WebDriverWait(driver,2);

		Set<String> hanldes = driver.getWindowHandles();
		//String currentHandle = driver.getWindowHandle();
		
		for (String hanlde : hanldes) {
			driver.switchTo().window(hanlde);
		}
		
		aboutMe= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo-icon-container")));  
	}
}
