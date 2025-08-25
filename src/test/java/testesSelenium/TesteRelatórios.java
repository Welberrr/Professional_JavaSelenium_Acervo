package testesSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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


	    elemento.localizarBotaoRelatorioSintetico();
	    elemento.getBotaoRelatorioSintetico().click();

	   
	    
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    try {
	        // Aguarda até que o painel "Relatório Sintético" esteja ativo
	        wait.until(ExpectedConditions.attributeContains(
	            By.xpath("//span[text()='Relatório Sintético']/ancestor::li"),
	            "class",
	            "p-highlight"
	        ));

	        // Localiza o campo SOMENTE no painel visível
	        WebElement campo = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.xpath(
	                "//div[@id='pn_id_29_content' and @aria-hidden='false']//input[@id='classificacao']"
	            ))
	        );

	        // Define valor via JavaScript para evitar problemas de foco
	        ((JavascriptExecutor) driver).executeScript("arguments[0].value='teste';", campo);

	        // Envia ENTER após preencher
	        campo.sendKeys(Keys.ENTER);

	        Thread.sleep(1000);

	    } catch (ElementNotInteractableException | StaleElementReferenceException e) {
	        // Re-localiza novamente caso o elemento seja recriado
	        WebElement campo = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.xpath(
	                "//div[@id='pn_id_29_content' and @aria-hidden='false']//input[@id='classificacao']"
	            ))
	        );
	        ((JavascriptExecutor) driver).executeScript("arguments[0].value='teste';", campo);
	        campo.sendKeys(Keys.ENTER);
	    }



	    
	    
		
		elemento.localizarBotaoXLSXSintetico();
		elemento.getBotaoXLSXSintetico().click();
		Thread.sleep(1000);
		
		
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
