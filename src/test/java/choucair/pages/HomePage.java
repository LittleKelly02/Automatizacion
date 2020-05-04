package choucair.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {

	
	ChoucairHomePage home;
	
	@Step("Este paso verifica el cambio de página")
	public void PaginaEmpleos()
	{
		home.PaginaEmpleos();
	}
	
	@Step("Este selecciona el botón ¿Qué es ser Chocair?")
	public void RedireccionAboutUs()
	{
		home.RedireccionAboutUs();
	}
	
	@Step("Este selecciona el botón Convocatorias")
	public void RedireccionConvocatorias()
	{
		home.RedireccionConvocatorias();
	}
	
	@Step("Este selecciona el botón Prepararse para aplicar")
	public void RedireccionPrepararse()
	{
		home.RedireccionPreparase();
	}
	
	@Step("Este campo hace busqueda por palabras Claves")
	public void BusquedaPalabrasClaves()
	{
		home.BusquedaPalabrasClaves();
	}
	
	@Step("Este campo hace busqueda por ubicacion")
	public void BusquedaUbicacion()
	{
		home.BusquedaUbicacion();
	}
	
	@Step("Este selecciona el boton Modelo de Calidad")
	public void RedireccionModeloCalidad()
	{
		home.RedireccionModeloCalidad();
	}
	
	@Step("Este selecciona el boton Diferencia entre calidad de software y pruebas")
	public void RedireccionDiferenciaCalidad()
	{
		home.RedireccionDiferenciaCalidad();
	}
	
	@Step("Este selecciona el boton Papel de los ingenieros ")
	public void RedireccioPapelIng()
	{
		home.RedireccioPapelIng();
	}
	
	@Step("Este selecciona el boton El software en la economia")
	public void RedireccionSoftwareEconomia()
	{
		home.RedireccionSoftwareEconomia();
	}
	
	@Step("Este selecciona el boton Errores en el software ")
	public void RedireccionErrores()
	{
		home.RedireccionErrores();
	}
	
	@Step("Este selecciona el boton Errores en el software ")
	public void RedireccionCalidadSoft()
	{
		home.RedireccionCalidadSoft();
	}
	
	@Step("Este selecciona el boton Errores en el software ")
	public void RedireccionServicioCliente()
	{
		home.RedireccionServicioCliente();
	}
	
	@Step("Este selecciona el boton Errores en el software ")
	public void RedireccionUp()
	{
		home.RedireccionUp();
	}
}
