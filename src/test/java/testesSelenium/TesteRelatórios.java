package testesSelenium;

import org.openqa.selenium.WebDriver;

import br.jus.stf.acervo.model.dto.AutorDto;
import br.jus.stf.acervo.model.dto.ClassificacaoLivroDto;
import br.jus.stf.acervo.model.dto.LivroDto;

public class TesteRelatorios {

	private CamposTesteRelatorios elemento;
	private WebDriver driver;
	
	
	public TesteRelatorios(WebDriver driver) {
		this.driver = driver;
		this.elemento = new CamposTesteRelatorios(driver);
    }
	
	
	//LivroDto livro, AutorDto autor, ClassificacaoLivroDto classificacao
	public void cadastrarRelatorioLivro() throws InterruptedException {
		elemento.botaoMenuInicio = elemento.botaoEspera("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]");
		elemento.getBotaoMenuInicio().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoRelatorios();
		elemento.getBotaoRelatorios().click();
		Thread.sleep(1000);
		
		
		elemento.localizarBotaoEngGab();
		elemento.getBotaoGab().click();
		Thread.sleep(1000);
		
		elemento.localizarBotaoAlterarGab();
		elemento.getBotaoAlterarGab().click();
		Thread.sleep(1000);
		
		
		elemento.localizarCampoTitulo();
		elemento.getTitulo().sendKeys("Teste Relatorio"); //livro.getTitulo()
		Thread.sleep(1000);
		
		//elemento.localizarCampoClassificacao();
		//elemento.getClassificacao().sendKeys("Teste"); //classificacao.getDescricao()
		//Thread.sleep(1000);
		
		elemento.localizarCampoAutor();
		elemento.getAutor().sendKeys("C.S Lewis");  //autor.getNome()
		Thread.sleep(1000);
		
		elemento.localizarCampoAnoEdicao();
		elemento.getAnoEdicao().sendKeys("2025");  //String.valueOf(livro.getAnoEdicao())
		Thread.sleep(1000);
		
		elemento.localizarCampoEdicao();
		elemento.getAnoEdicao().sendKeys("1000"); //livro.getNumeroEdicao()
		Thread.sleep(1000);
		
		elemento.localizarCampoVolume();
		elemento.getVolume().sendKeys("1000"); //String.valueOf(livro.getNumeroVolume())
		Thread.sleep(1000);
		
		elemento.localizarBotaoPesquisar();
		elemento.getBotaoPesquisar().click();
		Thread.sleep(3000);
		
		
		elemento.localizarBotaoXLSX();
		elemento.getBotaoXLSX().click();
		Thread.sleep(1000);
	}
}
