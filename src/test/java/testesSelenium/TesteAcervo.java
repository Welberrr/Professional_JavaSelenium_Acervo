package testesSelenium;

import org.openqa.selenium.WebDriver;

public class TesteAcervo {
	
	private CamposTesteAcervo elemento;
	
	public TesteAcervo(WebDriver driver) {
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
		elemento.getCampoLivroTitulo().sendKeys("teste");
		Thread.sleep(1000);
		
		elemento.localizarCampoLivroAutor();
		elemento.getCampoLivroAutor().sendKeys("teste");
		Thread.sleep(1000);
		
		elemento.localizarCampoLivroAno();
		elemento.getCampoLivroAno().sendKeys("teste");
		Thread.sleep(1000);
		
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
	
	public void editarAcervo() {
		
	}
	
	public void excluirAcervo() {
		
	}
}
