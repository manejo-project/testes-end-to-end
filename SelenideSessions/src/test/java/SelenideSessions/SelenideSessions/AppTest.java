package SelenideSessions.SelenideSessions;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class AppTest{
	
	@BeforeTest
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(500);
	}
	
	@Test
	public void testLogin () {
		$(By.name("username")).setValue("anna");
		sleep(1000);
		$(By.name("password")).setValue("6592");
		sleep(1000);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		$("h1").shouldHave(text("Painel de Controle"));
		sleep(1000);
	}
	
}