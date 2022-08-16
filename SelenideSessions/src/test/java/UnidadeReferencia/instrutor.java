//OK
package UnidadeReferencia;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class instrutor {

	@Before
	public void openNav() {
		//Abre o navegador padrao
		open("http://localhost:8080/login.html");
		sleep(500);
	}

	@Test
	public void testInstrutor() {
		//Login no manejo.app usuario "anna"
		$(By.name("username")).setValue("anna");
		sleep(100);
		$(By.name("password")).setValue("6592");
		sleep(100);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(100);
		
		//Unidade de Referência = OK
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/a")).click();//Click Unidade de Referência
		sleep(1000);
		// Instrutor
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/ul/li[2]/a")).click();//Click Instrutor
		sleep(1000);
		
		//CRUD Instrutor
		
		//Teste de Adicionar Novo Instrutor = OK
		$(By.xpath("/html/body/div[3]/div[2]/section[2]/form/div/div/div[1]/button")).click();
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Luciana Silva");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]")).setValue("lucianasilva@gmail.com");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt146_filter\"]")).setValue("Londrina"); //PesquisaLondrina
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt146\"]/div[3]/ul/li[13]")).click(); //SelecionarLondrina
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//ClicaSalvar
		sleep(1000);
		//END
				
		//Teste de Alteração = OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Luciana");//Pesquisa pelo nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt148\"]")).click();//ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]")).setValue("lucianasilva2@gmail.com");//Troca o e-mail do usuario
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//ClicaSalvar
		sleep(1000);
		//END	
			
		//Teste de Exclusão = OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Luciana Silva");//Pesquisa pelo nome
		sleep(1000);
		$(By.xpath("/html/body/div[3]/div[2]/section[2]/form/div/div/div[3]/div[1]/table/tbody/tr/td[6]/button[2]")).click();//ClicaParExcluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt155\"]")).click();//ClicaParaConfirmar
		sleep(1000);
		//END
//		
	}

}
