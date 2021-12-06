package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	
	AndroidDriver<MobileElement> driver;
	
	By movimientos = By.id("com.redsys.infotar.inte:id/btn_transactions");
	
	public HomePage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	
	public void irMovimientos() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(movimientos));
		driver.findElement(movimientos).click();
	}

}
