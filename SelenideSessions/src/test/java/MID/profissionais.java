// Ok
package MID;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class profissionais {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}

	@Test
	public void testProfissionais() {
		//Login no manejo.app por Anna
		$(By.name("username")).setValue("anna");
		sleep(100);
		$(By.name("password")).setValue("6592");
		sleep(100);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(100);
		
		// Entidades =
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[6]/a")).click();//Click MID
		sleep(1000);
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[6]/ul/li[2]/a")).click();//Click Profissionais
		sleep(1000);
		
		
		//CRUD Gerenciamento de Profissionais para Leitura de Lâminas 
		
		//Teste de Adicionar Nova Entidade = OK
		$(By.xpath("//*[@id=\"j_idt128:j_idt130\"]")).click();//CLick botao novo profissional
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Luciana Silva");//Escreve o nome do profissional
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]/div[3]")).click();//Click para pesquisaa Entidade
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_filter\"]")).setValue("Peabiru"); //Pesquisa Peabiru
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_1\"]")).click(); //Selecionar Peabiru
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//Click Salvar 
		sleep(1000);
		//END
						
		//Teste de Alteração = OK
		$(By.name("j_idt128:mainTable:j_idt135:filter")).setValue("Luciana Silva");//Pesquisa Luciana Silva
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt148\"]")).click();//ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Luciana Silva dos Santos");//Edita o nome do Professional
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//Click Salvar 
		sleep(1000);
		//END	
						
		//Teste de Exclusão = OK
		$(By.name("j_idt128:mainTable:j_idt135:filter")).setValue("Luciana Silva");//Pesquisa Luciana Silva
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt152\"]")).click();//ClicaParExcluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt155\"]")).click();//ClicaParaConfirmar
		sleep(1000);
		//END
	}

}
