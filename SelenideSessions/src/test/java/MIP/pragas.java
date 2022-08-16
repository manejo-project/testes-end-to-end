//

package MIP;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class pragas {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}

	@Test
	public void testPragras() {
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
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[5]/ul/li[1]/a")).click();// Click Pragas
		sleep(1000);

		// CRUD Gerenciamento de Insetos Pragas

		// Teste de Adicionar Nova Praga = OK
		$(By.xpath("//*[@id=\"j_idt128:j_idt130\"]")).click();// CLick botao nova Praga
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste");// Escreve o nome da praga
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]")).setValue("TesteC");// Escreve o nome cientifico
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt146_filter\"]")).setValue("Adulto");// Pesquisa Adulto
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt146\"]/div[3]/ul/li[5]")).click(); // Seleciona Opção
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();// Click Salvar
		sleep(1000);
		// END

		//Teste de Alteração = 
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste");//Pesquisa Teste
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt148\"]")).click();//ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste2");//Edita o nome da Entidade
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//Click Salvar 
		sleep(1000);
		//END	
		
		
		//Teste de Exclusão = OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste2");//Escreve o nome da praga
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt152\"]")).click();//Clica para excluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt155\"]")).click(); // Seleciona Opção
		sleep(1000);
		//END

	}

}
