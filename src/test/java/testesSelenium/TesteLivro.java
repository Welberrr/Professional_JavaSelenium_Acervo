package testesSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.jus.stf.acervo.model.dto.AutorDto;
import br.jus.stf.acervo.model.dto.ClassificacaoLivroDto;
import br.jus.stf.acervo.model.dto.EditoraDto;
import br.jus.stf.acervo.model.dto.LivroDto;

public class TesteLivro {
	
	private CamposTesteLivro elemento;
	private WebDriverWait wait;
	
	LivroDto livro = new LivroDto(
		    "As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", // titulo
		    "A.C.N", // Iniciais
		    "Fantasia, aventura em mundo mágico", // assunto
		    "9788578270698", // ISBN
		    2009L, // anoEdicao
		    "1", // numeroEdicao
		    "I", // volume (volume romano ou número)
		    1001L // codigoGrupoLivro
		);
	
	
	public TesteLivro(WebDriver driver) {
		this.elemento = new CamposTesteLivro(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
	
	
	public void CadastrarLivro(EditoraDto editoraDto, AutorDto autorDto, ClassificacaoLivroDto classificacaoDto)throws InterruptedException {
		elemento.botaoMenuLivro = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenuLivro().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoLivros();
		elemento.getBotaoLivros().click();
		
		WebElement botaoNovoLivro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/div/p-toolbar/div/div[2]/button[1]")));
	    botaoNovoLivro.click();	
	    
	    Thread.sleep(1000);
	    
	    
	    elemento.localizarCamposCadastroLivro();
	    
	    elemento.getCampoTitulo().sendKeys(livro.getTitulo());
	    elemento.getCampoIniciais().sendKeys(livro.getSiglaAutores());
	    elemento.getCampoAssunto().sendKeys(livro.getAssunto());
	    elemento.getCampoISBN().sendKeys(livro.getIsbn());
	    elemento.getCampoAno().sendKeys(String.valueOf(livro.getAnoEdicao()));
	    elemento.getCampoEdicao().sendKeys(livro.getNumeroEdicao());
	    elemento.getCampoVolume().sendKeys(livro.getNumeroEdicao());
	    elemento.getCampoCodigoColecao().sendKeys(String.valueOf(livro.getCodigoGrupoLivro()));
	    elemento.getCampoEditora().sendKeys(editoraDto.getNome());
	    elemento.getCampoClassificacaoGeral().sendKeys(classificacaoDto.getDescricao(), Keys.ENTER);
	    
	    
	    elemento.localizarBotaoGravar();
	    elemento.getBotaoGravar().click();
	    
	    Thread.sleep(1000);
	    
	    
	    elemento.localizarBotaoMenuFinal();
	    elemento.getBotaoMenuFinal().click();
	    
	    Thread.sleep(1000);
	    
	    elemento.localizarBotaoInicioFinal();
	    elemento.getBotaoInicioFinal().click();
	}
	
	public void VincularLivro(AutorDto autorDto)throws InterruptedException {
		elemento.botaoMenuLivro = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenuLivro().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoLivros();
		elemento.getBotaoLivros().click();
		
		Thread.sleep(1000);
		
		
		elemento.localizarCampoConsulta();
		elemento.getCampoConsultaLivro().sendKeys(livro.getTitulo(), Keys.ENTER);
		
		Thread.sleep(5000);
		
		elemento.localizarBotaoEdit();
		elemento.getBotaoEditLivro().click();
		
		
		elemento.localizarBotaoVincularAutor();
		elemento.getBotaoVincularAutor().click();
		
		elemento.localizarCampoAutorVinculo();
		elemento.getCampoAutorVinculo().sendKeys(autorDto.getNome());
		
		Thread.sleep(1000);
		
		elemento.getCampoAutorVinculo().sendKeys(Keys.ENTER);
		
		elemento.localizarBotaoAutor();
		elemento.getBotaoAutor().click();
		Thread.sleep(1000);

		elemento.localizarBotaoGravarVinculo();
		elemento.getBotaoGravarVinculo().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoMenuFinal();
	    elemento.getBotaoMenuFinal().click();
	    
	    Thread.sleep(1000);
	    
	    elemento.localizarBotaoInicioFinal();
	    elemento.getBotaoInicioFinal().click();
	}
	
	public void EditarLivro(EditoraDto editoraDto)throws InterruptedException {
		elemento.botaoMenuLivro = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenuLivro().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoLivros();
		elemento.getBotaoLivros().click();
		
		Thread.sleep(1000);
		
		
		elemento.localizarCampoConsulta();
		elemento.getCampoConsultaLivro().sendKeys(livro.getTitulo(), Keys.ENTER);
		
		Thread.sleep(5000);
		
		elemento.localizarBotaoEdit2();
		elemento.getBotaoEdit2().click();
		
		Thread.sleep(1000);
		
		livro.setTitulo("As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa EDITADO");
		livro.setSiglaAutores("A.C.N EDIT");
		livro.setAssunto("Fantasia");
		livro.setIsbn("9788578270698");
		livro.setAnoEdicao(2010L);
		livro.setVolume("J");
		livro.setCodigoGrupoLivro(1002L);
		
		elemento.localizarCamposCadastroLivro();
		elemento.getCampoTitulo().clear();
		elemento.getCampoTitulo().sendKeys(livro.getTitulo());
		elemento.getCampoIniciais().clear();
	    elemento.getCampoIniciais().sendKeys(livro.getSiglaAutores());
	    elemento.getCampoAssunto().clear();
	    elemento.getCampoAssunto().sendKeys(livro.getAssunto());
	    elemento.getCampoISBN().clear();
	    elemento.getCampoISBN().sendKeys(livro.getIsbn());
	    elemento.getCampoAno().clear();
	    elemento.getCampoAno().sendKeys(String.valueOf(livro.getAnoEdicao()));
	    elemento.getCampoEdicao().clear();
	    elemento.getCampoEdicao().sendKeys(livro.getNumeroEdicao());
	    elemento.getCampoVolume().clear();
	    elemento.getCampoVolume().sendKeys(livro.getNumeroEdicao());
	    elemento.getCampoCodigoColecao().clear();
	    elemento.getCampoCodigoColecao().sendKeys(String.valueOf(livro.getCodigoGrupoLivro()));
	    Thread.sleep(1000);
	    elemento.getCampoEditora().clear();
	    elemento.getCampoEditora().sendKeys(editoraDto.getNome(), Keys.ENTER);
	    //Thread.sleep(1000);
	    //elemento.getCampoClassificacaoGeral().clear();
	    //elemento.getCampoClassificacaoGeral().sendKeys("TESTES", Keys.ENTER);
	    
	    Thread.sleep(1000);
	    
	    elemento.localizarBotaoAlterarEdit();
	    elemento.getBotaoAlterarEdit().click();
	    
	    Thread.sleep(1000);
	    
	    
		elemento.localizarBotaoMenuFinal();
	    elemento.getBotaoMenuFinal().click();
	    
	    Thread.sleep(1000);
	    
	    elemento.localizarBotaoInicioFinal();
	    elemento.getBotaoInicioFinal().click();
	}
	
	public void ExcluirLivro()throws InterruptedException {
		elemento.botaoMenuLivro = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenuLivro().click();
		
		Thread.sleep(1000);
		
		elemento.localizarBotaoLivros();
		elemento.getBotaoLivros().click();
		
		Thread.sleep(1000);
		
		
		elemento.localizarCampoConsulta();
		elemento.getCampoConsultaLivro().sendKeys(livro.getTitulo(), Keys.ENTER);
		
		Thread.sleep(4000);
		
		
		
		elemento.localizarBotaoExclusao();
		elemento.botaoExclusao.click();
		
		Thread.sleep(4000);
		
		elemento.localizarBotaoConfirmarExlusao();
		elemento.getBotaoConfirmarExclusao().click();
		
		
		elemento.localizarBotaoMenuFinal();
	    elemento.getBotaoMenuFinal().click();
	    
	    Thread.sleep(1000);
	    
	    elemento.localizarBotaoInicioFinal();
	    elemento.getBotaoInicioFinal().click();
	}
}
