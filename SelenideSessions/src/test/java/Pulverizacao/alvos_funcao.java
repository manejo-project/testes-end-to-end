//OK
package Pulverizacao;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class alvos_funcao {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}

	@Test
	public void testAlvoFuncoes() {
		// Login no manejo.app por Anna
		$(By.name("username")).setValue("anna");
		sleep(100);
		$(By.name("password")).setValue("6592");
		sleep(100);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(100);

		// Entidades = OK
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[7]/a")).click();// Click MIP
		sleep(1000);
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[7]/ul/li[1]/a")).click();// Click Inimigos Naturais de Pragas
		sleep(1000);

		// CRUD Gerenciamento de Alvo Principal ou Função 

		// Teste de Adicionar Nova Alvo Principal ou Função  = OK
		$(By.xpath("//*[@id=\"j_idt128:j_idt130\"]")).click();// CLick botao Nova Alvo Principal ou Função 
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste");// Escreve o nome 
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]/div[3]")).click();// Seleciona Item
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_filter\"]")).setValue("Acaricida");// Escreve o nome da praga
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_1\"]")).click();// Click No Item Silenciado
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();// Click Salvar
		sleep(1000);
		// END

		// Teste de Alteração =
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste");// Pesquisa Teste
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt146\"]")).click();// ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste2");// Altera nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();// Click Salvar
		sleep(1000);
		// END

		// Teste de Exclusão = OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste2");// Pesquisa o nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt150\"]")).click();// Clica para excluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt153\"]")).click(); // Seleciona Opção
		sleep(1000);
		// END
	}

}
