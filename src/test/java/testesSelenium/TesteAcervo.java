package testesSelenium;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteAcervo {
	
	private CamposTesteAcervo elemento;
	private WebDriver driver;
	
	public TesteAcervo(WebDriver driver) {
		this.driver = driver;
		this.elemento = new CamposTesteAcervo(driver);
    }
	
	public void cadastrarAcervo() throws InterruptedException {
		elemento.botaoMenuInicio = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenuInicio().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoAcervo();
		elemento.getBotaoAcervo().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoEngGabinete();
		elemento.getBotaoEngGabinete().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoGabinete();
		elemento.getBotaoGabinete().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoAlterar();
		elemento.getBotaoAlterar().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoNovoAcervo();
		elemento.getBotaoNovoAcervo().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoSeleLivro();
		elemento.getBotaoSeleLivro().click();
		Thread.sleep(1000);
		
		elemento.localizarCampoLivroTitulo();
		elemento.getCampoLivroTitulo().sendKeys("AS CRONICAS DE NARNIA");
		Thread.sleep(1000);
		
		elemento.localizarCampoLivroAutor();
		elemento.getCampoLivroAutor().sendKeys("C.S Lewis");
		Thread.sleep(1000);
		
		elemento.localizarCampoLivroAno();
		elemento.getCampoLivroAno().sendKeys("2009");
		Thread.sleep(1000);
		
		elemento.localizarBotaoPesquisar();
		elemento.getBotaoPesquisar().click();
		Thread.sleep(4000);
		
		elemento.localizarBotaoSelectLivro();
		elemento.getBotaoSelectLivro().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoSelecionarLivro();
		elemento.getBotaoSelecionarLivro().click();
		Thread.sleep(1000);
		
		elemento.localizarCampoEmprestado();
		elemento.getCampoEmprestado().sendKeys("teste");
		Thread.sleep(1000);
		
		elemento.localizarCampoNota();
		elemento.getCampoNota().sendKeys("5");
		Thread.sleep(1000);
		
		elemento.localizarCampoClassGab();
		elemento.getCampoClassGab().sendKeys("teste");
		Thread.sleep(1000);
		elemento.getCampoClassGab().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		elemento.localizarCampoObservacao();
		elemento.getCampoObservacao().sendKeys("teste");
		Thread.sleep(1000);
		
		elemento.localizarBotaoGravar();
		elemento.getBotaoGravar().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicio();
		elemento.getBotaoInicio().click();
	}
	
	public void editarAcervo() throws InterruptedException {
		elemento.botaoMenuInicio = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenuInicio().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoAcervo();
		elemento.getBotaoAcervo().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoEngGabinete();
		elemento.getBotaoEngGabinete().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoGabinete();
		elemento.getBotaoGabinete().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoAlterar();
		elemento.getBotaoAlterar().click();
		Thread.sleep(1000);
		
		
		elemento.localizarCampoTituloCons();
		elemento.getCampoTituloCons().sendKeys("As cronicas de Narnia");
		Thread.sleep(1000);
		
		elemento.localizarCampoAutorCons();
		elemento.getCampoAutorCons().sendKeys("C.s Lewis");
		Thread.sleep(1000);
		
		elemento.localizarBotaoPesquisarCons();
		elemento.getBotaoPesquisarCons().click();
		Thread.sleep(3000);
		
		
		elemento.localizarBotaoEdicao();
		elemento.getBotaoEdicao().click();
		Thread.sleep(1000);
		
		elemento.localizarCampoEmprestado();
		elemento.getCampoEmprestado().clear();
		elemento.getCampoEmprestado().sendKeys("Teste Editado");
		Thread.sleep(1000);
		
		elemento.localizarCampoNota();
		elemento.getCampoNota().clear();
		elemento.getCampoNota().sendKeys("10");
		Thread.sleep(1000);
		
		elemento.localizarCampoObservacao();
		elemento.getCampoObservacao().clear();
		elemento.getCampoObservacao().sendKeys("Teste Editado");
		Thread.sleep(1000);
		
		elemento.localizarBotaoAlterarEdit();
		elemento.getBotaoAlterarEdit().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicio();
		elemento.getBotaoInicio().click();
	}
	
	public void excluirAcervo() throws InterruptedException {
		elemento.botaoMenuInicio = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenuInicio().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoAcervo();
		elemento.getBotaoAcervo().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoEngGabinete();
		elemento.getBotaoEngGabinete().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoGabinete();
		elemento.getBotaoGabinete().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoAlterar();
		elemento.getBotaoAlterar().click();
		Thread.sleep(1000);
		
		
		elemento.localizarCampoTituloCons();
		elemento.getCampoTituloCons().sendKeys("as cronicas de narnia");
		Thread.sleep(1000);
		
		elemento.localizarCampoAutorCons();
		elemento.getCampoAutorCons().sendKeys("c.s lewis");
		Thread.sleep(1000);
		
		elemento.localizarBotaoPesquisarCons();
		elemento.getBotaoPesquisarCons().click();
		Thread.sleep(3000);
		
		
		elemento.localizarBotaoExclusao();
		elemento.getBotaoExclusao().click();
		Thread.sleep(1000);
		
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());

		while (true) {
		    try {
		        driver.switchTo().alert();
		        Thread.sleep(500);
		    } catch (NoAlertPresentException e) {
		        break;
		    }
		}
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicio();
		elemento.getBotaoInicio().click();
	}
}
