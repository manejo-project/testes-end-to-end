/// OK
package UnidadeReferencia;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class regiao {

	@Before
	public void openNav() {
		//Abre o navegador padrao
		open("http://localhost:8080/login.html");
		sleep(500);
	}

	@Test
	public void testRegiao() {
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
		$(By.xpath("/html/body/div[3]/aside/div/section/ul/li[3]/ul/li[4]/a")).click();//Click Região
		sleep(1000);
		
		//CRUD Região
		
		//Teste de Adicionar Novo Instrutor = OK
		$(By.xpath("/html/body/div[3]/div[2]/section[2]/form/div/div/div[1]/button")).click();
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_filter\"]")).setValue("Macrotest");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]/div[3]/ul/li[8]")).click(); 
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt147_filter\"]")).setValue("Teste");
		sleep(1000);
		$(By.xpath("/html/body/div[3]/div[2]/section[2]/form/div/div/div[3]/div/div[8]/div/div/div[3]/ul/li")).click();
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//ClicaSalvar
		sleep(1000);
		//END
				
		//Teste de Alteração = OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste");//Pesquisa pelo nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt148\"]")).click();//ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste2");//Troca o e-mail do usuario
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//ClicaSalvar
		sleep(1000);
		//END	
			
		//Teste de Exclusão = OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste");//Pesquisa pelo nome
		sleep(1000);
		$(By.xpath("/html/body/div[3]/div[2]/section[2]/form/div/div/div[3]/div[1]/table/tbody/tr/td[6]/button[2]")).click();//ClicaParExcluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt155\"]")).click();//ClicaParaConfirmar
		sleep(1000);
		//END
		
	}

}
