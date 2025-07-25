package testesSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import br.jus.stf.acervo.model.dto.EditoraDto;

public class TesteEditora {
	private CamposTesteEditora elemento;
	
	
	public TesteEditora(WebDriver driver) {
		this.elemento = new CamposTesteEditora(driver); 
    }
	
	EditoraDto editora = (new EditoraDto("EDITORA TESTE"));
	
	public void cadastrarEditora() throws InterruptedException{
		elemento.botaoMenuEditora = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
        elemento.getBotaoMenuEditora().click();
        
        Thread.sleep(1000);
		
		elemento.localizarBotaoEditora();
		elemento.getBotaoEditora().click();
		
		Thread.sleep(2000);
		
		elemento.localizarBotaoNovaEditora();
		elemento.getBotaoNovaEditora().click();
		
		Thread.sleep(1000);
		
		elemento.localizarCampoNovaEditora();
		elemento.getCampoNovaEditora().sendKeys(editora.getNome(), Keys.ENTER);
		
		elemento.localizarBotaoVoltar();
		elemento.getBotaoVoltar().click();
		
		elemento.getBotaoMenuEditora().click();
		
		Thread.sleep(1000);
	     
	    elemento.localizarBotaoInicio();
	    elemento.getBotaoInicio().click();
	}
	
	public EditoraDto editarEditora() throws InterruptedException {
		elemento.botaoMenuEditora = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
        elemento.getBotaoMenuEditora().click();
        
        Thread.sleep(1000);
        
		elemento.localizarBotaoEditora();
		elemento.getBotaoEditora().click();
        
        elemento.localizarCampoConsulta();
        elemento.getCampoConsulta().sendKeys(editora.getNome());
        Thread.sleep(1000);
        elemento.getCampoConsulta().sendKeys(Keys.ENTER);
        
        
        Thread.sleep(1000);
        elemento.localizarBotaoEdit();
        elemento.getBotaoEdit().click();
        
        editora.setNome("EDITORA EDITADA");
        
        Thread.sleep(1000);
        elemento.localizarCampoEdit();
        elemento.getCampoEdit().clear();
        elemento.getCampoEdit().sendKeys(editora.getNome(), Keys.ENTER);
        
        
        elemento.getBotaoMenuEditora().click();
		
		Thread.sleep(1000);
	     
	    elemento.localizarBotaoInicio();
	    elemento.getBotaoInicio().click();
	    
	    return editora;
	}
	
	public void excluirEditora() throws InterruptedException{
		elemento.botaoMenuEditora = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
        elemento.getBotaoMenuEditora().click();
        
        Thread.sleep(1000);
        
		elemento.localizarBotaoEditora();
		elemento.getBotaoEditora().click();
        
        Thread.sleep(1000);
        
        elemento.localizarCampoConsulta();
        elemento.getCampoConsulta().sendKeys(editora.getNome());
        Thread.sleep(1000);
        elemento.getCampoConsulta().sendKeys(Keys.ENTER);
        
        
        Thread.sleep(1000);
        elemento.localizarBotaoExclusao();
        elemento.getBotaoDelete().click();
        
        
        elemento.getBotaoMenuEditora().click();
		
		Thread.sleep(1000);
	     
	    elemento.localizarBotaoInicio();
	    elemento.getBotaoInicio().click();
	}
}
