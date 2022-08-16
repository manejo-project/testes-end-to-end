//OK

package Safra;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class cultivar {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}

	@Test
	public void testCultivar() {
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
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[4]/ul/li[3]/a")).click();// Click Produtos
		sleep(1000);
		

		// CRUD Gerenciamento de Cultivares  

		// Teste de Adicionar Novo Cultivar = OK
		$(By.xpath("//*[@id=\"j_idt127:j_idt129\"]")).click();// CLick botao Novos Cultivar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt139\"]")).setValue("Teste");// Escreve nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt129\"]")).click();// Salva
		sleep(1000);

		// Teste de Alteração =OK
		$(By.xpath("//*[@id=\"j_idt127:mainTable:j_idt134:filter\"]")).setValue("Teste");// Pesquisa Teste
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt127:mainTable:0:j_idt143\"]")).click();// ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt139\"]")).setValue("Teste3");// Altera nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt129\"]")).click();// Click Salvar
		sleep(1000);
		// END
		
		// Teste de Exclusão = OK
		$(By.xpath("//*[@id=\"j_idt127:mainTable:j_idt134:filter\"]")).setValue("Teste3");// Pesquisa o nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt127:mainTable:0:j_idt147\"]")).click();// Clica para excluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt127:mainTable:0:j_idt150\"]")).click(); // Seleciona Opção
		sleep(1000);
		//END
		
	}

}
