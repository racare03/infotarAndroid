package tests;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MovimientosPage;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class TestMovimientos {
	
	DesiredCapabilities cap = new DesiredCapabilities();
	AndroidDriver<MobileElement> driver;
	
	LoginPage login;
	HomePage home;
	MovimientosPage movimientos;

	@BeforeSuite
	public void BeforeSuite() {
		cap.setCapability("deviceName", "Huawei Pruebas");
		cap.setCapability("udid", "6PQ0217401010045");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");

		cap.setCapability("appPackage", "com.redsys.infotar.inte");
		cap.setCapability("appActivity", "com.redsys.infotarmb.ui.auth.AuthActivity");
	}


	@BeforeMethod
	public void beforeMethod() {
			
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		login = new LoginPage(driver);
	}


	@Test
	public void testMovimientos() {
		login.iniciarSesion("s6169rc", "Almoca30");
		home = new HomePage(driver);
		home.irMovimientos();
		movimientos = new MovimientosPage(driver);
		movimientos.selectGrupo();
		movimientos.selectEmpresa();
		movimientos.scrollFecha();
		movimientos.selectFecha();
		movimientos.fechaInicio();
		movimientos.cerrarTeclado(935, 1715);
		movimientos.aceptar();
		movimientos.fechaFin();
		movimientos.cerrarTeclado(935, 1715);
		movimientos.aceptar();
		movimientos.guardar();
		movimientos.clicarInforme();
		Assert.assertEquals("GARCIA JUAN BANDERA", movimientos.getMovimientos());
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
