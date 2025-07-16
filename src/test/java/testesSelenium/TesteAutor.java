package testesSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.jus.stf.acervo.model.dto.AutorDto;

public class TesteAutor{
	
	private CamposTesteAutor elemento;
	private WebDriverWait wait;

	public TesteAutor(WebDriver driver) {
		this.elemento = new CamposTesteAutor(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60)); 
    }
	
	
    AutorDto autor = (new AutorDto("C.S Lewis", "CLSW"));
	
	public void cadastroAutor() throws InterruptedException{
		elemento.botaoMenu = elemento.botaoEspera("//html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
        elemento.getBotaoMenu().click();
        Thread.sleep(1000);
        
	    elemento.localizarBotaoAutor();
	    elemento.botaoAutorMenu.click();
	    
	    WebElement botaoNovoAutor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Novo Autor']/parent::button")));
	    botaoNovoAutor.click();
	   	    
	    elemento.localizarCamposCadastro();
	    elemento.getCampoNomeAutorCad().sendKeys(autor.getNome());
	    
	    elemento.getCampoSiglaAutorCad().sendKeys(autor.getSigla(), Keys.ENTER);
	    
	    Thread.sleep(1000);
	    
	    elemento.localizarBotaoVoltarCad();
	    elemento.getBotaoVoltarCad().click();
	    
	    Thread.sleep(1000);
	    
	    
	    elemento.localizarBotaoMenuFinal();
	    elemento.getBotaoMenuFinal().click();
	    
	    Thread.sleep(1000);
	    
	    elemento.localizarBotaoInicio();
	    elemento.getBotaoInicio().click();
	}
	
	public void editarAutor() throws InterruptedException{
		elemento.botaoMenu = elemento.botaoEspera("//html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
        elemento.getBotaoMenu().click();   
		
	    elemento.localizarBotaoAutor();
	    elemento.botaoAutorMenu.click();
	    
		
		elemento.localizarCamposConsulta();
		elemento.getCampoNomeAutorCons().sendKeys(autor.getNome());
		elemento.getCampoSiglaAutorCons().sendKeys(autor.getSigla());
	     
	 	Thread.sleep(2000);

	     WebElement botaoPesquisar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/div/form/p-toolbar/div/div[2]/button[1]")));
	     botaoPesquisar.click();
	     
	    Thread.sleep(1000);
	    
		
		autor.setNome("EDITADO LEWIS");
	    autor.setSigla("EDITCLSW");
	    
		elemento.localizarBotaoCheckEdit();
		elemento.botaoCheckEdit.click();
		
		elemento.localizarBotaoEdicao();
		elemento.botaoEditarAutor.click();
		
		Thread.sleep(1000);
		
		elemento.localizarCamposEdicao();
		elemento.campoNomeEdit.clear();
		elemento.campoNomeEdit.sendKeys(autor.getNome());
		
		elemento.campoSiglaEdit.clear();
		elemento.campoSiglaEdit.sendKeys(autor.getSigla(), Keys.ENTER);
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoVoltarEdit();
		elemento.getBotaoVoltarEdit().click();
		
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoMenuFinal();
	    elemento.getBotaoMenuFinal().click();
	    
	    Thread.sleep(1000);
	    
	    elemento.localizarBotaoInicio();
	    elemento.getBotaoInicio().click();
	}
	
	public void exclusaoAutor()throws InterruptedException{
		elemento.botaoMenu = elemento.botaoEspera("//html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
        elemento.getBotaoMenu().click();   
		
	    elemento.localizarBotaoAutor();
	    elemento.botaoAutorMenu.click();
		
		
	    elemento.localizarCamposConsulta();
		elemento.getCampoNomeAutorCons().sendKeys(autor.getNome());
		elemento.getCampoSiglaAutorCons().sendKeys(autor.getSigla());
	     
	 	Thread.sleep(2000);

	     WebElement botaoPesquisar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/div/form/p-toolbar/div/div[2]/button[1]")));
	     botaoPesquisar.click();
	     
	    Thread.sleep(1000);
		
		
	     elemento.localizarBotoesDel();
	     elemento.getBotaoCheckDel().click();
	     Thread.sleep(1000);
	     elemento.getBotaoDeletar().click();
	     
	     
	     Thread.sleep(1000);
			
	     elemento.localizarBotaoMenuFinal();
	     elemento.getBotaoMenuFinal().click();
		    
	     Thread.sleep(1000);
		    
		 elemento.localizarBotaoInicio();
		 elemento.getBotaoInicio().click();
	}
}