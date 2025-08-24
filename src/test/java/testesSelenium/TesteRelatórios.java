package testesSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TesteRelatorios {

	private CamposTesteRelatorios elemento;
	private WebDriver driver;
	
	
	public TesteRelatorios(WebDriver driver) {
		this.driver = driver;
		this.elemento = new CamposTesteRelatorios(driver);
    }
	
	
	//LivroDto livro, AutorDto autor, ClassificacaoLivroDto classificacao
	public void gerarRelatorioLivro() throws InterruptedException {
		elemento.botaoMenuInicio = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenuInicio().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoRelatorios();
		elemento.getBotaoRelatorios().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoEngGab();
		elemento.getBotaoEngGab().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoGab();
		elemento.getBotaoGab().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoAlterarGab();
		elemento.getBotaoAlterarGab().click();
		Thread.sleep(1000);
		
		
		elemento.localizarCampoTitulo();
		elemento.getTitulo().sendKeys("Teste Relatorio"); //livro.getTitulo()
		Thread.sleep(1000);
		
		elemento.localizarCampoClassificacao();
		elemento.getClassificacao().sendKeys("Teste"); //classificacao.getDescricao()
		Thread.sleep(1000);
		
		elemento.localizarCampoAutor();
		elemento.getAutor().sendKeys("C.S Lewis");  //autor.getNome()
		Thread.sleep(1000);
		
		elemento.localizarCampoAnoEdicao();
		elemento.getAnoEdicao().sendKeys("2025");  //String.valueOf(livro.getAnoEdicao())
		Thread.sleep(1000);
		
		elemento.localizarCampoEdicao();
		elemento.getEdicao().sendKeys("1000"); //livro.getNumeroEdicao()
		Thread.sleep(1000);
		
		elemento.localizarCampoVolume();
		elemento.getVolume().sendKeys("1000"); //String.valueOf(livro.getNumeroVolume())
		Thread.sleep(1000);
		
		elemento.localizarBotaoPesquisar();
		elemento.getBotaoPesquisar().click();
		Thread.sleep(2000);
		
		elemento.localizarBotaoXLSX();
		elemento.getBotaoXLSX().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicioFinal();
		elemento.getBotaoInicioFinal().click();
		Thread.sleep(1000);
	}
	
	public void gerarRelatorioSintetico() throws InterruptedException {
		// 1️⃣ Navegação pelos menus
		elemento.getBotaoMenuInicio().click();
		Thread.sleep(1000);

		elemento.localizarBotaoRelatorios();
		elemento.getBotaoRelatorios().click();
		Thread.sleep(1000);

		elemento.localizarBotaoEngGab();
		elemento.getBotaoEngGab().click();
		Thread.sleep(1000);

		elemento.localizarBotaoGab();
		elemento.getBotaoGab().click();
		Thread.sleep(1000);

		elemento.localizarBotaoAlterarGab();
		elemento.getBotaoAlterarGab().click();
		Thread.sleep(1000);

		// 1️⃣ Clica na aba "Relatório Sintético"
		elemento.localizarBotaoRelatorioSintetico();
		elemento.getBotaoRelatorioSintetico().click();
		Thread.sleep(1000); // mantém a sua estratégia de sleep

		// 2️⃣ Localiza o input dinamicamente
		WebElement campo = null;
		int tentativas = 0;
		while (tentativas < 10) {
		    try {
		        campo = driver.findElement(By.id("classificacao"));
		        if (campo.isDisplayed() && campo.getSize().getHeight() > 0 && campo.getSize().getWidth() > 0) {
		            break;
		        }
		    } catch (Exception e) {
		        // ignora
		    }
		    Thread.sleep(500);
		    tentativas++;
		}

		if (campo == null) {
		    throw new RuntimeException("Campo 'classificacao' não encontrado ou não interagível!");
		}

		// 3️⃣ Rola para o campo ficar visível
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", campo);
		Thread.sleep(200);

		// 4️⃣ Digita "teste" e dispara os eventos Angular
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
		    "arguments[0].value = 'teste';" +
		    "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
		    "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
		    campo
		);

		// 5️⃣ Pressiona Enter para pesquisar
		Actions actions = new Actions(driver);
		actions.moveToElement(campo).click().sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		
		

		// 5️⃣ Clica no botão XLSX do relatório sintetico
		elemento.localizarBotaoXLSXSintetico();
		elemento.getBotaoXLSXSintetico().click();
		Thread.sleep(1000);

		// 6️⃣ Fecha menus e retorna para a tela inicial
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		Thread.sleep(1000);

		elemento.localizarBotaoInicioFinal();
		elemento.getBotaoInicioFinal().click();
		Thread.sleep(1000);

	}
	
	public void gerarEtiquetas() {
		
	}
}
