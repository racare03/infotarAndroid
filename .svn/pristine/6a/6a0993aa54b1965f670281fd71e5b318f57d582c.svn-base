package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	
	AndroidDriver<MobileElement> driver;
	
	
	//By user = By.id("com.redsys.infotar.inte:id/textinput_placeholder");
	By user = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	By pass = By.id("com.redsys.infotar.inte:id/input_password");
	By continuar = By.id("com.redsys.infotar.inte:id/login_button");
	
	public LoginPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void iniciarSesion(String usuario, String contraseña) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(user));
		driver.findElement(user).click();
		driver.findElement(user).sendKeys(usuario);
		driver.findElement(pass).sendKeys(contraseña);
		driver.findElement(continuar).click();
		
	}
}
