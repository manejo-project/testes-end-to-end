//OK
package MIP;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class inimigos_naturais {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}

	@Test
	public void testInimigoNaturais() {
		// Login no manejo.app por Anna
		$(By.name("username")).setValue("anna");
		sleep(100);
		$(By.name("password")).setValue("6592");
		sleep(100);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(100);

		// Entidades = OK
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[5]/a")).click();// Click MIP
		sleep(1000);
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[5]/ul/li[3]/a")).click();// Click Inimigos Naturais de Pragas 
		sleep(1000);

		// CRUD Gerenciamento de Inimigos Naturais de Pragas 

		// Teste de Adicionar NovaInimigos Naturais de Pragas = OK
		$(By.xpath("//*[@id=\"j_idt128:j_idt130\"]")).click();// CLick botao Nova Doenças das Praga
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste");// Escreve o nome da praga
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();// Click Salvar
		sleep(1000);
		// END

		// Teste de Alteração =
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste");// Pesquisa Teste
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt144\"]")).click();// ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste2");// Altera nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();// Click Salvar
		sleep(1000);
		// END

		// Teste de Exclusão = OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste2");// Pesquisa o nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt148\"]")).click();// Clica para excluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt151\"]")).click(); // Seleciona Opção
		sleep(1000);
		// END
	}

}
