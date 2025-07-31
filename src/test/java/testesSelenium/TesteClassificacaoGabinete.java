package testesSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteClassificacaoGabinete {
	
	CamposTesteClassificacaoGabinete elemento;
	private WebDriverWait wait;
	
	
	public TesteClassificacaoGabinete(WebDriver driver) {
		this.elemento = new CamposTesteClassificacaoGabinete(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
	
	
	public void cadastrarClassificacaoGabinete() throws InterruptedException {
		elemento.botaoMenu = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenu().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoClassGabinete();
		elemento.getBotaoClassGabinete();
		Thread.sleep(1000);
		
		elemento.localizarEngren();
		elemento.getBotaoEngren().click();
		Thread.sleep(1000);
		
		elemento.LocalizarGabinete();
		elemento.getBotaoGabinete().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoAlterarGab();
		elemento.getBotaoAlterarGab().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoNovaClass();
		elemento.getBotaoNovaClass().click();
		Thread.sleep(1000);
		
		elemento.localizarCampoDescricao();
		elemento.getCampoDescricao().sendKeys("?");
		Thread.sleep(1000);
		
		elemento.localizarBotaoGravar();
		elemento.getBotaoGravar().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicio();
		elemento.getBotaoInicio().click();
		Thread.sleep(1000);
	}
	
	public void editarClassificacaoGabinete() throws InterruptedException {
		elemento.botaoMenu = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenu().click();
		Thread.sleep(1000);
		
		
		
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicio();
		elemento.getBotaoInicio().click();
		Thread.sleep(1000);
	}
	
	public void excluirClassificacaoGabinite() throws InterruptedException {
		elemento.botaoMenu = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenu().click();
		Thread.sleep(1000);
	
		
		
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicio();
		elemento.getBotaoInicio().click();
		Thread.sleep(1000);
	}
}
