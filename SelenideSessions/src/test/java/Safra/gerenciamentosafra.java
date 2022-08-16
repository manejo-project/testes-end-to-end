package Safra;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class gerenciamentosafra {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}


	@Test
	public void test() {
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
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[4]/ul/li[1]/a")).click();// Click Produtos
		sleep(1000);
		

		// CRUD Gerenciamento de URs Participantes da Safra  

		// Teste de Adicionar Novas Participantes da Safra  = OK
		$(By.xpath("//*[@id=\"j_idt127:j_idt129\"]")).click();// CLick botao Novas Participantes da Safra 
		sleep(1000);
		
		//Passo 1/7: Selecionar Safra
		$(By.xpath("//*[@id=\"j_idt140_filter\"]")).setValue("2022");// Pesquisa 2022
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]/div[3]/ul/li[3]")).click();// Seleciona Opcao
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt136_next\"]")).click();// Clica no botao proximo
		sleep(1000);
		
		//Passo 2/7: Selecionar Unidade de Referência
		$(By.xpath("//*[@id=\"fieldList:j_idt145:filter\"]")).setValue("Fazenda 1");// Pesquisa por UR
		sleep(1000);
		$(By.xpath("//*[@id=\"fieldList_data\"]/tr/td[1]/div/div[2]")).click();// Seleciona Opcao
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt136_next\"]")).click();// Clica no botao proximo
		sleep(1000);
		
		//Passo 3/7: Dados da Cultivar
		$(By.xpath("//*[@id=\"j_idt156_input\"]")).setValue("TMG 7260 IPRO");// Pesquisa NOme
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt156_panel\"]/ul/li")).click();// Seleciona Opcao
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt158\"]/div[2]")).click();// Clica no botao proximo
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt136_next\"]")).click();// Clica no botao proximo
		sleep(1000);
		
		//Passo 4/7: Dados da Área(Problemas para usuario, analisar)
		$(By.xpath("//*[@id=\"j_idt165_input\"]")).sendKeys(Keys.chord(Keys.CONTROL,"0,00",Keys.BACK_SPACE));//Apaga digitado
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt165_input\"]")).setValue("1");// Defini Área da Unidade (ha)
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt168_input\"]")).sendKeys(Keys.chord(Keys.CONTROL,"0,00",Keys.BACK_SPACE));//Apaga digitado
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt168_input\"]")).setValue("2");// Defini Área Total Cultivada (ha)
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt171_input\"]")).sendKeys(Keys.chord(Keys.CONTROL,"0,00",Keys.BACK_SPACE));//Apaga digitado
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt171_input\"]")).setValue("10,00");// Defini No. Plantas/Metro
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt174_input\"]")).sendKeys(Keys.chord(Keys.CONTROL,"0,000000",Keys.BACK_SPACE));//Apaga digitado
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt174_input\"]")).setValue("-28");// Defini Latitude (usar formato *** DECIMAL ***)(-28 e -22)
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt177_input\"]")).sendKeys(Keys.chord(Keys.CONTROL,"0,000000",Keys.BACK_SPACE));//Apaga digitado
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt177_input\"]")).setValue("-55");// Defini Longitude (usar formato *** DECIMAL ***)(-55 e -49)
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt136_next\"]")).click();// Clica no botao proximo
		sleep(1000);
		
		//Passo 5/7: Manejos e Coletor de Esporos
		$(By.xpath("//*[@id=\"j_idt182_filter\"]")).setValue("MIP");// Pesquisa 2022
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt182\"]/div[3]/ul/li[1]")).click();// Seleciona Opcao
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt136_next\"]")).click();// Clica no botao proximo
		sleep(1000);
		
		//Passo 5/7: Manejos e Coletor de Esporos
		$(By.xpath("//*[@id=\"j_idt182_filter\"]")).setValue("MIP");// Pesquisa MIP
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt182\"]/div[3]/ul/li[1]")).click();// Seleciona Opcao
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt136_next\"]")).click();// Clica no botao proximo
		sleep(1000);
		
		//Passo Passo 6/7: Datas
		// Seleciona Data da Semeadura
		$(By.xpath("/html/body/div[3]/div[2]/section[2]/form/div/div/div[3]/div[1]/div/div[2]/div/div/div/div[1]/table/tbody/tr[2]/td/span/div/div/table/tbody/tr[3]/td[6]/a")).click();
		sleep(1000);
		// Seleciona Data da Emergência
		$(By.xpath("/html/body/div[3]/div[2]/section[2]/form/div/div/div[3]/div[1]/div/div[2]/div/div/div/div[2]/table/tbody/tr[2]/td/span/div/div/table/tbody/tr[5]/td[3]/a")).click();
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt136_next\"]")).click();// Clica no botao proximo
		sleep(1000);
		
		//Passo 7/7: Revisar dados
		$(By.xpath("//*[@id=\"j_idt136_next\"]")).click();// Clica no botao proximo
		sleep(1000);
		
		//Salvar
		$(By.xpath("//*[@id=\"saveButton\"]")).click();// Clica no botao proximo
		sleep(1000);
		
//		// Teste de Alteração =OK
//		$(By.xpath("//*[@id=\"j_idt127:mainTable:j_idt134:filter\"]")).setValue("Teste");// Pesquisa Teste
//		sleep(1000);
//		$(By.xpath("//*[@id=\"j_idt127:mainTable:0:j_idt143\"]")).click();// ClicaParaAlterar
//		sleep(1000);
//		$(By.xpath("//*[@id=\"j_idt139\"]")).setValue("Teste3");// Altera nome
//		sleep(1000);
//		$(By.xpath("//*[@id=\"j_idt129\"]")).click();// Click Salvar
//		sleep(1000);
//		// END
//		
//		// Teste de Exclusão = OK
//		$(By.xpath("//*[@id=\"j_idt127:mainTable:j_idt134:filter\"]")).setValue("Teste3");// Pesquisa o nome
//		sleep(1000);
//		$(By.xpath("//*[@id=\"j_idt127:mainTable:0:j_idt147\"]")).click();// Clica para excluir
//		sleep(1000);
//		$(By.xpath("//*[@id=\"j_idt127:mainTable:0:j_idt150\"]")).click(); // Seleciona Opção
//		sleep(1000);
//		//END
	}

}
