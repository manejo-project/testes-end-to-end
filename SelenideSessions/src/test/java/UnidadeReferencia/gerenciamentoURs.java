//OK
package UnidadeReferencia;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class gerenciamentoURs {

	@Before
	public void openNav() {
		//Abre o navegador padrao
		open("http://localhost:8080/login.html");
		sleep(500);
	}

	@Test
	public void testGerenciamentoURs() {
		
		//Login no manejo.app usuario "anna"
		$(By.name("username")).setValue("anna");
		sleep(100);
		$(By.name("password")).setValue("6592");
		sleep(100);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(100);
		
		//Unidade de Referência = OK
		//Click Unidade de Referência
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/a")).click();
		sleep(1000);
		// Gerenciamento das URs
		//Click Gerenciamento das URs
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/ul/li[1]/a")).click();
		sleep(1000);
		
		//CRUD Gerenciamento das URs
		
		//Teste de Adicionar Nova Unidade = OK
		//Clique no botão para adicionar nova unidade
		$(By.xpath("//*[@id=\"j_idt128:j_idt130\"]")).click();
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Fazenda 6");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]")).setValue("Localização 6");
		sleep(1000);
		//Pesquisa Produtor5
		$(By.xpath("//*[@id=\"j_idt146_filter\"]")).setValue("Produtor 5"); 
		sleep(1000);
		//Seleciona Produtor5
		$(By.xpath("//*[@id=\"j_idt146\"]/div[3]/ul/li[2]")).click(); 
		sleep(1000);
		//Pesquisa Londrina
		$(By.id("j_idt150_filter")).setValue("Londrina");
		sleep(1000);
		//SelecionarLondrina
		$(By.xpath("//*[@id=\"j_idt150\"]/div[3]/ul/li[193]")).click();
		sleep(1000);
		$(By.id("supervisorList_filter")).setValue("John Doe");
		sleep(1000);
		//Seleciona Instrutor
		$(By.xpath("//*[@id=\"supervisorList\"]/div[3]/ul/li")).click();
		sleep(1000);
		//Clica em Salvar
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();
		sleep(1000);
		//END
				
		//Teste de Alteração = OK
		$(By.name("j_idt128:mainTable:j_idt135:filter")).setValue("Fazenda 6");
		sleep(1000);
		//Clica para alterar
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt152\"]")).click();
		sleep(1000);
		//Pesquisa Produtor 2
		$(By.xpath("//*[@id=\"j_idt146_filter\"]")).setValue("Produtor 2"); 
		sleep(1000);
		//Seleciona Produtor2
		$(By.xpath("//*[@id=\"j_idt146\"]/div[3]/ul/li[4]")).click(); 
		sleep(1000);
		//Clica em Salvar
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();
		sleep(1000);
		//END	
				
		//Teste de Exclusão = OK
		$(By.name("j_idt128:mainTable:j_idt135:filter")).setValue("Fazenda 6");
		sleep(1000);
		//Clica em excluir
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt156\"]")).click();
		sleep(1000);
		//Clica para confirmar
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt159\"]")).click();
		sleep(1000);
		//END
		
	}

}
