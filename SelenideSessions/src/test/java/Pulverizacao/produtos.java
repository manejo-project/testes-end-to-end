package Pulverizacao;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class produtos {

	@Before
	public void openNav() {
		open("http://localhost:8080/login.html");
		sleep(1000);
	}

	@Test
	public void testProdutos() {
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
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[7]/ul/li[2]/a")).click();// Click Produtos
		sleep(1000);

		// CRUD Gerenciamento de Produtos 

		// Teste de Adicionar Novos Produtos  = OK
		$(By.xpath("//*[@id=\"j_idt128:j_idt130\"]")).click();// CLick botao Novos Produtos 
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt140\"]")).setValue("Teste");// Escreve nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_label\"]")).click();// Seleciona uma classe de uso
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_filter\"]")).setValue("Acaricida");// Escreve o nome da classe de uso
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143_1\"]")).click();// Click no item
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt148_label\"]")).click();// Seleciona uma unidade de medida
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt148_filter\"]")).setValue("KG");// Pesquisa uma unidade de medida
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt148_4\"]")).click();// Click no item
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt153\"]")).setValue("5555");//Numero de Registro
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt156\"]")).setValue("UTFPR");//Nome da Empresa Registrante
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt159_label\"]")).click();// Seleciona uma Classe Toxicológica
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt159_filter\"]")).setValue("IV");// Pesquisa uma Classe Toxicológica
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt159_4\"]")).click();// Click no item
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt164\"]")).setValue("2,4-D");// Ingrediente Ativo (IA)
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt167\"]")).setValue("840");// Concentração IA
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();// Click Salvar
		sleep(1000);
		// END

		// Teste de Alteração =
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste");// Pesquisa Teste
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt158\"]")).click();// ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt153\"]")).setValue("6898");// Altera nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt130\"]")).click();// Click Salvar
		sleep(1000);
		// END

		// Teste de Exclusão = OK
		$(By.xpath("//*[@id=\"j_idt128:mainTable:j_idt135:filter\"]")).setValue("Teste");// Pesquisa o nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt162\"]")).click();// Clica para excluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt128:mainTable:0:j_idt165\"]")).click(); // Seleciona Opção
		sleep(1000);
		//END
	}

}
