// OK
package Usuarios;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class gerenciamento_de_usuarios {

	@Before
	public void openNav() {
		//Abre o navegador padrao
		open("http://localhost:8080/login.html");
		sleep(500);
	}

	@Test
	public void test_gerenciamentoURs() {
		//Login no manejo.app usuario "anna"
		$(By.name("username")).setValue("anna");
		sleep(100);
		$(By.name("password")).setValue("6592");
		sleep(100);
		$(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[7]/div[2]/form/button")).click();
		sleep(100);
		
		//Usuarios = 
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[8]/a")).click();//Click Usuarios
		sleep(1000);
		// Instrutor
		$(By.xpath("//*[@id=\"sidebar\"]/div/section/ul/li[8]/ul/li/a")).click();//Click Gerenciamento de Usuários
		sleep(1000);
		
		//CRUD Gerenciamento de Usuários do Sistema
		
		//Teste de Adicionar Novo Usuario = OK
		$(By.xpath("//*[@id=\"j_idt127:j_idt129\"]")).click();//Cadastrar novo usuario
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt139\"]")).setValue("Luciana Silva"); //Inseri Nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt142\"]")).setValue("lucianasilva@gmail.com");//Insere email
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt145_label\"]")).click();// Abre pra selecionar opções
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt145_filter\"]")).setValue("Cornélio Procópio"); //Pesquisa Cornélio Procópio")
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt145_5\"]")).click(); //Selecionar Cornélio
		sleep(1000);
		$(By.xpath("//*[@id=\"city_label\"]")).click();// Abre pra selecionar opções
		sleep(1000);
		$(By.xpath("//*[@id=\"city_filter\"]")).setValue("Rancho Alegre");//Pesquisa Rancho Alegre
		sleep(1000);
		$(By.xpath("/html/body/div[11]/div[2]/ul/li[23]")).click();//Seleciona Rancho Alegre
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt154\"]")).setValue("luciana");//Define usuario
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt157\"]")).setValue("5555");//Define senha
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt160\"]")).setValue("5555");//Confirma senha
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt167_filter\"]")).setValue("Acesso Estadual");// Pesquisa Acesso Estadual
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt167\"]/div[3]/ul/li[1]")).click();//Seleciona Opção
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt129\"]")).click();//Seleciona Salvar
		sleep(1000);
		//END
				
		//Teste de Alteração = OK
		$(By.xpath("//*[@id=\"j_idt127:mainTable:j_idt134:filter\"]")).setValue("Luciana");//Pesquisa pelo nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt127:mainTable:0:j_idt153\"]")).click();//ClicaParaAlterar
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt143\"]")).setValue("lucianasilva2@gmail.com");//Troca o e-mail do usuario
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt158\"]")).setValue("3333");//Define senha
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt161\"]")).setValue("3333");//Confirma senha
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt129\"]")).click();//Clica Alterar
		sleep(1000);
		//END	
			
		//Teste de Exclusão = OK
		$(By.xpath("//*[@id=\"j_idt127:mainTable:j_idt134:filter\"]")).setValue("Luciana Silva");//Pesquisa pelo nome
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt127:mainTable:0:j_idt157\"]")).click();//ClicaParExcluir
		sleep(1000);
		$(By.xpath("//*[@id=\"j_idt127:mainTable:0:j_idt160\"]")).click();//ClicaParaConfirmar
		sleep(1000);
		//END
//		
	} 

}
