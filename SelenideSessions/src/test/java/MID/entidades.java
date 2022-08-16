//ok

package MID;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class entidades {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}

	@Test
	public void testEntidades() {
		//Login no manejo.app por Anna
		$(By.name("username")).setValue("anna");
		sleep(100);
		$(By.name("password")).setValue("6592");
		sleep(100);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(100);

		// Entidades = OK
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[6]/a")).click();//Click MID
		sleep(1000);
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[6]/ul/li[1]/a")).click();//Click Entidades
		sleep(1000);


		//CRUD Gerenciamento de Entidades para Leitura de Lâminas

		//Teste de Adicionar Nova Entidade = OK
		$(By.xpath("//*[@id=\"j_idt128:j_idt130\"]")).click();//CLick botao nova unidade
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Emater Cornélio Procópio");//Escreve o nome da Nova Entidade
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]/div[3]")).click();//Click para pesquisar Cidade
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_filter\"]")).setValue("Cornélio Procópio"); //Pesquisa Cornélio Procópio
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_86\"]")).click(); //Selecionar Cornélio Procópio
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//Click Salvar 
		sleep(1000);
		//END

		//Teste de Alteração = OK
		$(By.name("j_idt128:mainTable:j_idt135:filter")).setValue("Cornélio Procópio");//Pesquisa Cornélio Procópio
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt146\"]")).click();//ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Emater Cornélio Procópio 2");//Edita o nome da Entidade
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//Click Salvar 
		sleep(1000);
		//END	

		//Teste de Exclusão = OK
		$(By.name("j_idt128:mainTable:j_idt135:filter")).setValue("Cornélio Procópio");//Pesquisa Cornélio Procópio
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt150\"]")).click();//ClicaParExcluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt153\"]")).click();//ClicaParaConfirmar
		sleep(1000);
		//END
	}

}
