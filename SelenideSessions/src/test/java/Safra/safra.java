//OK
package Safra;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class safra {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}

	@Test
	public void testSafra() {
		// Login no manejo.app por Anna
		$(By.name("username")).setValue("anna");
		sleep(100);
		$(By.name("password")).setValue("6592");
		sleep(100);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(100);

		// Entidades = OK
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[4]/a")).click();// Click MIP
		sleep(1000);
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[4]/ul/li[2]/a")).click();// Click Produtos
		sleep(1000);

		// CRUD Gerenciamento de Safras 
		
		// Teste de Adicionar Novo Safra= OK
		$(By.xpath("//*[@id=\"j_idt128:j_idt130\"]")).click();// CLick botao Nova Safra
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste");// Escreve nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt145_panel\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")).click();//Seleciona data
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt149_panel\"]/div/div[2]/table/tbody/tr[5]/td[3]/a")).click();//Seleciona data
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();// Salva
		sleep(1000);

		// Teste de Alteração =OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste");// Pesquisa Teste
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt148\"]")).click();// ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste2");//Seleciona data
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();// Click Salvar
		sleep(1000);
		// END

		// Teste de Exclusão = OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste2");// Pesquisa o nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt152\"]")).click();// Clica para excluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt155\"]")).click(); // Seleciona Opção
		sleep(1000);
		// END

	}

}
