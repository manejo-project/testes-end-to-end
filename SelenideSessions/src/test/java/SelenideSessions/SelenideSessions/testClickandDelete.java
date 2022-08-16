package SelenideSessions.SelenideSessions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class testClickandDelete {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}

	@Test
	public void test_LogOut() {
		//Login no manejo.app por Anna
		$(By.name("username")).setValue("anna");
		sleep(100);
		$(By.name("password")).setValue("6592");
		sleep(100);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(100);
		
		//Unidade de Referência = OK
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/a")).click();//Click Unidade de Referência
		sleep(1000);
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/ul/li[1]/a")).click();//Click Gerenciamento das URs
		sleep(1000);
		
//		//Teste de Pesquisa na Gerenciamento das URs = OK
//		$(By.name("j_idt128:mainTable:j_idt135:filter")).setValue("Fazenda 3");
//		sleep(1000);
//		//END
//	
		//Teste de Adicionar Nova Unidade = OK
		$(By.xpath("//*[@id=\"j_idt128:j_idt130\"]")).click();
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Fazenda 6");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]")).setValue("Localização 6");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt146_filter\"]")).setValue("Produtor 5"); //SelecionarProdutor5
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt146\"]/div[3]/ul/li[2]")).click(); //SelecionarProdutor5
		sleep(1000);
		$(By.id("j_idt150_filter")).setValue("Londrina");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt150\"]/div[3]/ul/li[193]")).click();//SelecionarLondrina
		sleep(1000);
		$(By.id("supervisorList_filter")).setValue("John Doe");
		sleep(1000);
		$(By.xpath("//*[@id=\"supervisorList\"]/div[3]/ul/li")).click();//SelecionarInstrutor
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//ClicaSalvar
		sleep(1000);
		//END
		
		//Teste de Alteração = OK
		$(By.name("j_idt128:mainTable:j_idt135:filter")).setValue("Fazenda 6");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt152\"]")).click();//ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt146_filter\"]")).setValue("Produtor 2"); //SelecionarProdutor5
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt146\"]/div[3]/ul/li[4]")).click(); //SelecionarProdutor5
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();//ClicaSalvar
		sleep(1000);
		//END	
		
		//Teste de Exclusão = OK
		$(By.name("j_idt128:mainTable:j_idt135:filter")).setValue("Fazenda 6");
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt156\"]")).click();//ClicaParExcluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt159\"]")).click();//ClicaParaConfirmar
		sleep(1000);
		//END		
		
		
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/ul/li[2]/a")).click();//Click Instrutor
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/ul/li[3]/a")).click();//Click Produtor
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/ul/li[4]/a")).click();//Click Regiao
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[3]/ul/li[5]/a")).click();//Click MacroRegiao
//		sleep(1000);
//		
//		
//		//Safra = OK
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[4]/a")).click();//Click Safra
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[4]/ul/li[1]/a")).click();//Click Gerenciamento de Safras
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[4]/ul/li[2]/a")).click();//Click Safra
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[4]/ul/li[3]/a")).click();//Click Cultivar
//		sleep(1000);
//		
//		//MIP = OK
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[5]/a")).click();//Click MIP
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[5]/ul/li[1]/a")).click();//Click Pragas 	
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[5]/ul/li[2]/a")).click();//Click Doenças das Pragas
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[5]/ul/li[3]/a")).click();//Click Inimigos Naturais
//		sleep(1000);
//		
//		//MID = OK
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[6]/a")).click();//Click MID
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[6]/ul/li[1]/a")).click();//Click Entidades
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[6]/ul/li[2]/a")).click();//Click Profissionais
//		sleep(1000);
//		
//		//Pulverização = OK
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[7]/a")).click();//Click Pulverização
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[7]/ul/li[1]/a")).click();//Click Alvos/Funções
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[7]/ul/li[2]/a")).click();//Click Produtos
//		sleep(1000);
//		
//
//		//Usuários = OK
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[8]/a")).click();//Click Usuarios
//		sleep(1000);
//		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[8]/ul/li/a")).click();//Click Gerenciamento de Usuários
//		sleep(1000);
//		$("h1").shouldHave(text("Gerenciamento de Usuários do Sistema"));
		
		
		
		
		//LogOFF
		$(By.xpath("/html/body/div[3]/header/nav/div[1]/ul/li[2]/a/i[2]")).click();
		sleep(1000);
		//$("h1").shouldHave(text("Gerenciamento de Instrutor"));
	}
		
	
}
