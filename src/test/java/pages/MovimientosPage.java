package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import static java.time.Duration.ofMillis;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class MovimientosPage {
	
	AndroidDriver<MobileElement> driver;
	
	public MovimientosPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By grupo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
	By nombreGrupo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
	By empresa = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
	By nombreEmpresa = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
	By fechas = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]");
	By fechaInicio = By.id("com.redsys.infotar.inte:id/tv_start_date");
	By lapiz = By.id("com.redsys.infotar.inte:id/mtrl_picker_header_toggle");
	By editFecha = By.className("android.widget.EditText");
	By aceptar = By.id("com.redsys.infotar.inte:id/confirm_button");
	By guardar = By.id("com.redsys.infotar.inte:id/save_date_button");
	By fechaFin = By.id("com.redsys.infotar.inte:id/tv_end_date");
	By informe = By.id("com.redsys.infotar.inte:id/btn_2");
	By movimientoDetalle = By.id("com.redsys.infotar.inte:id/tv_card_holder");
	
	
	public void selectGrupo() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(grupo));
		driver.findElement(grupo).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(nombreGrupo));
		driver.findElement(nombreGrupo).click();
	}
	
	public void selectEmpresa() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(empresa));
		driver.findElement(empresa).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(nombreEmpresa));
		driver.findElement(nombreEmpresa).click();
		
	}
	
	public void scrollFecha() {
		String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Fecha de operación\").instance(0))";
		driver.findElementByAndroidUIAutomator(scrollElement).click();
		
	}
	
	public void selectFecha() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(fechas));
		driver.findElement(fechas).click();
		
	}
	
	public void fechaInicio() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(fechaInicio));
		driver.findElement(fechaInicio).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(lapiz));
		driver.findElement(lapiz).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(editFecha));
		driver.findElement(editFecha).clear();
		driver.findElement(editFecha).sendKeys("24/08/20");
	}
	
	public void cerrarTeclado(int x, int y) {
		   new TouchAction(driver).tap(point(x,y)).waitAction(waitOptions(ofMillis(250))).perform();
	}
	
	public void aceptar() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(aceptar));
		driver.findElement(aceptar).click();
	}
	
	public void fechaFin() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(fechaFin));
		driver.findElement(fechaFin).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(lapiz));
		driver.findElement(lapiz).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(editFecha));
		driver.findElement(editFecha).clear();
		driver.findElement(editFecha).sendKeys("29/08/20");
	}
	
	
	public void guardar() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(guardar));
		driver.findElement(guardar).click();
	}
	
	public void clicarInforme() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(informe));
		driver.findElement(informe).click();
	}
	
	public String getMovimientos() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.textToBe(movimientoDetalle,"GARCIA JUAN BANDERA"));
		return driver.findElement(movimientoDetalle).getText();
		
	}
	
	
}

