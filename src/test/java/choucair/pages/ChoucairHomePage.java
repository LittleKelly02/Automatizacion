package choucair.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class ChoucairHomePage extends PageObject{
	

	
	public void PaginaEmpleos()
	{
		$(By.id("menu-item-550")).click();
		
	}
	
	public void RedireccionAboutUs()
	{
		PaginaEmpleos();
		$(By.className("elementor-image-box-wrapper")).click();
	}
	
	public void RedireccionConvocatorias()
	{
		PaginaEmpleos();
		$(By.className("elementor-image-box-content")).click();
	}
	
	public void RedireccionPreparase()
	{
		PaginaEmpleos();
		$(By.className("elementor-image-box-wrapper")).click();
	}
	
	public void BusquedaPalabrasClaves()
	{
		PaginaEmpleos();
		$(By.id("search_keywords")).typeAndEnter("Analista");
	}
	
	public void BusquedaUbicacion()
	{
		PaginaEmpleos();
		$(By.id("search_location")).typeAndEnter("Peru");
	}
	
	public void RedireccionModeloCalidad()
	{
		PaginaEmpleos();
		$(By.id("cookie-law-info-bar")).click();
		$(By.linkText("Modelo de calidad de software")).click();
	}
	
	public void RedireccionDiferenciaCalidad()
	{
		PaginaEmpleos();
		$(By.id("cookie-law-info-bar")).click();
		$(By.linkText("Diferencia entre calidad de software y pruebas")).click();
	}
	
	public void RedireccioPapelIng()
	{
		PaginaEmpleos();
		$(By.id("cookie-law-info-bar")).click();
		$(By.linkText("Papel de los ingenieros")).click();
	}
	
	public void RedireccionSoftwareEconomia()
	{
		PaginaEmpleos();
		$(By.id("cookie-law-info-bar")).click();
		$(By.linkText("El software en la economía actual")).click();
	}
	
	public void RedireccionErrores()
	{
		PaginaEmpleos();
		$(By.id("cookie-law-info-bar")).click();
		$(By.linkText("Los errores del software")).click();
	}
	
	public void RedireccionCalidadSoft()
	{
		PaginaEmpleos();
		$(By.id("cookie-law-info-bar")).click();
		$(By.linkText("Calidad de software")).click();
	}
	
	public void RedireccionServicioCliente()
	{
		PaginaEmpleos();
		$(By.id("cookie-law-info-bar")).click();
		$(By.linkText("serviciocliente@choucairtesting.com")).click();
	}
	
	public void RedireccionUp()
	{
		PaginaEmpleos();
		$(By.id("cookie-law-info-bar")).click();
		$(By.id("search_keywords")).typeAndTab("  ");
		$(By.className("go-top")).click();
	}
}
