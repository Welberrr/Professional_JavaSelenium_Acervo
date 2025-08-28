package testesSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.jus.stf.acervo.model.dto.AutorDto;
import br.jus.stf.acervo.model.dto.ClassificacaoLivroDto;
import br.jus.stf.acervo.model.dto.ClassificacaoSetorDto;
import br.jus.stf.acervo.model.dto.LivroDto;

public class TesteRelatorios {

	private CamposTesteRelatorios elemento;
	private WebDriver driver;
	
	
	public TesteRelatorios(WebDriver driver) {
		this.driver = driver;
		this.elemento = new CamposTesteRelatorios(driver);
    }
	
	
	
	public void gerarRelatorioLivro(LivroDto livro, AutorDto autor, ClassificacaoLivroDto classificacao) throws InterruptedException {
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
		elemento.getTitulo().sendKeys(livro.getTitulo());
		Thread.sleep(1000);
		
		elemento.localizarCampoClassificacao();
		elemento.getClassificacao().sendKeys(classificacao.getDescricao()); 
		Thread.sleep(1000);
		
		elemento.localizarCampoAutor();
		elemento.getAutor().sendKeys(autor.getNome());
		Thread.sleep(1000);
		
		elemento.localizarCampoAnoEdicao();
		elemento.getAnoEdicao().sendKeys(String.valueOf(livro.getAnoEdicao()));
		Thread.sleep(1000);
		
		elemento.localizarCampoEdicao();
		elemento.getEdicao().sendKeys(livro.getNumeroEdicao());
		Thread.sleep(1000);
		
		//elemento.localizarCampoVolume();
		//elemento.getVolume().sendKeys(String.valueOf(livro.getNumeroVolume()));
		//Thread.sleep(1000);
		
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
	
	public void gerarRelatorioSintetico(ClassificacaoSetorDto classificacaoGab) throws InterruptedException {
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
	    elemento.getCampoClassSintetico().sendKeys(classificacaoGab.getDescricao(), Keys.ENTER);
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
	
	public void gerarEtiquetas(LivroDto livro, AutorDto autor, ClassificacaoLivroDto classificacao) throws InterruptedException {
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
		elemento.getCampoClassEtiqueta().sendKeys(classificacao.getDescricao(), Keys.ENTER);
		Thread.sleep(1000);
		
		elemento.localizarCampoAutorEtiquetas();
		elemento.getCampoAutorEtiqueta().sendKeys(autor.getNome(), Keys.ENTER);
		Thread.sleep(1000);
		
		//elemento.localizarOrdenacaoEtiqueta();
		//elemento.getBotaoOrdenacaoEtiqueta().click();
		//elemento.getBotaoAutorOrdenacao().click();
		//Thread.sleep(1000);
		
		elemento.localizarCampoVolumeEtiqueta();
		elemento.getCampoVolumeEtiqueta().sendKeys(livro.getVolume(), Keys.ENTER);
		Thread.sleep(1000);
		
		elemento.localizarCampoTituloEtiqueta();
		elemento.getCampoTituloEtiqueta().sendKeys(livro.getTitulo(), Keys.ENTER);
		Thread.sleep(1000);
		
		elemento.localizarCampoAssuntoEtiqueta();
		elemento.getCampoAssuntoEtiqueta().sendKeys(livro.getAssunto(), Keys.ENTER);
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
