package SelenideSessions.SelenideSessions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class manejoTest {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(500);
	}

	@Test 
	public void test_Login() {
		$(By.name("username")).setValue("anna");
		sleep(1000);
		$(By.name("password")).setValue("6592");
		sleep(1000);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(1000);
		$("h1").shouldHave(text("Painel de Controle"));
	}
	
	@Test
	public void test_LogOff() {
		$(By.xpath("/html/body/div[3]/header/nav/div[1]/ul/li[2]/a/i[2]")).click();
		sleep(1000);
		$("span").shouldHave(text("Sessão encerrada!"));
	}
	
	/*@Test
	public void test_Click() {
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/a/span[2]")).click();
		sleep(2000);
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/ul/li[1]/a")).click();
		sleep(2000);
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/ul/li[2]/a")).click();
		sleep(2000);
		$("h1").shouldHave(text("Painel de Controle"));
	}*/
	

	

	
	
}
