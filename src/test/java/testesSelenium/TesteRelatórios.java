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
	    Thread.sleep(1000);

	    elemento.localizarCampoClassSintetico();
	    elemento.getCampoClassSintetico().sendKeys("Teste", Keys.ENTER);
	    Thread.sleep(1000);
		
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
	
	public void gerarEtiquetas() throws InterruptedException {
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
		
		
		elemento.localizarBotaoEtiquetas();
		elemento.getBotaoGerarEtiquetas().click();
		Thread.sleep(1000);
		
		elemento.localizarCampoClassEtiquetas();
		elemento.getCampoClassEtiqueta().sendKeys("Teste", Keys.ENTER);
		Thread.sleep(1000);
		
		elemento.localizarCampoAutorEtiquetas();
		elemento.getCampoAutorEtiqueta().sendKeys("Teste", Keys.ENTER);
		Thread.sleep(1000);
		
		//elemento.localizarOrdenacaoEtiqueta();
		//elemento.getBotaoOrdenacaoEtiqueta().click();
		//elemento.getBotaoAutorOrdenacao().click();
		//Thread.sleep(1000);
		
		elemento.localizarCampoVolumeEtiqueta();
		elemento.getCampoVolumeEtiqueta().sendKeys("Teste", Keys.ENTER);
		Thread.sleep(1000);
		
		elemento.localizarCampoTituloEtiqueta();
		elemento.getCampoTituloEtiqueta().sendKeys("Teste", Keys.ENTER);
		Thread.sleep(1000);
		
		elemento.localizarCampoAssuntoEtiqueta();
		elemento.getCampoAssuntoEtiqueta().sendKeys("Teste", Keys.ENTER);
		Thread.sleep(1000);
		
		elemento.localizarBotaoPesquisarEtiquetas();
		elemento.getBotaoPesquisarEtiquetas().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoGerarEtiquetasDownload();
		elemento.getBotaoGerarEtiquetasDownload().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicioFinal();
		elemento.getBotaoInicioFinal().click();
		Thread.sleep(1000);
	}
}
