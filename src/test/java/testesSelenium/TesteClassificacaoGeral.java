package testesSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.jus.stf.acervo.model.dto.ClassificacaoLivroDto;

public class TesteClassificacaoGeral {
	
	private CamposTesteClassificacaoGeral elemento;
	private WebDriverWait wait;
	
	
	public TesteClassificacaoGeral(WebDriver driver) {
		this.elemento = new CamposTesteClassificacaoGeral(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

	ClassificacaoLivroDto classificacao = new ClassificacaoLivroDto ("Teste Selenium");

	public void cadastroClassificacao() throws InterruptedException {
		elemento.botaoMenu = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenu().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoClassificacaoGeral();
		elemento.getBotaoClassificacaoGeral().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoNovaClassificacao();
		elemento.getBotaoNovaClassificacao().click();
		
		Thread.sleep(1000);
		
		elemento.localizarCampoDescricao();
		elemento.getCampoDescricao().sendKeys(classificacao.getDescricao());
		
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
	
	public ClassificacaoLivroDto editarClassificacao() throws InterruptedException {
		elemento.botaoMenu = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenu().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoClassificacaoGeral();
		elemento.getBotaoClassificacaoGeral().click();
		
		Thread.sleep(1000);
		
		
		elemento.localizarCampoConsulta();
		elemento.getCampoConsulta().sendKeys(classificacao.getDescricao());
		
		elemento.localizarBotaoPesquisar();
		elemento.getBotaoPesquisar().click();
		
		Thread.sleep(1000);
		
		classificacao.setDescricao("Teste Selenium Edit");
		
		elemento.localizarBotaoEdit();
		elemento.getBotaoEdit().click();

		Thread.sleep(1000);
		
		
		elemento.localizarCampoDescEdit();
		elemento.getCampoDescEdit().clear();
		
		Thread.sleep(1000);
		
		elemento.getCampoDescEdit().sendKeys(classificacao.getDescricao());
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoAlterar();
		elemento.getBotaoAlterar().click();
		
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicio();
		elemento.getBotaoInicio().click();
		
		return classificacao;
	}
	
	public void exclusaoClassificacao() throws InterruptedException {
		elemento.botaoMenu = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenu().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoClassificacaoGeral();
		elemento.getBotaoClassificacaoGeral().click();
		
		Thread.sleep(1000);
		
		
		elemento.localizarCampoConsulta();
		elemento.getCampoConsulta().sendKeys(classificacao.getDescricao());
		
		elemento.localizarBotaoPesquisar();
		elemento.getBotaoPesquisar().click();
		
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoExclusao();
		elemento.getBotaoExclusao().click();
		
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoMenuFinal();
		elemento.getBotaoMenuFinal().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoInicio();
		elemento.getBotaoInicio().click();
	}
}
