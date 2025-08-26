package testesSelenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.jus.stf.acervo.model.dto.AutorDto;
import br.jus.stf.acervo.model.dto.ClassificacaoLivroDto;
import br.jus.stf.acervo.model.dto.EditoraDto;
import br.jus.stf.acervo.model.dto.LivroDto;

public class TestesMain {

	@Test
	public void IniciarTeste() throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
        TesteAutor autor = new TesteAutor(driver);
        TesteEditora editora = new TesteEditora(driver);
        TesteLivro livro = new TesteLivro(driver);
        TesteClassificacaoGeral classificacao = new TesteClassificacaoGeral(driver);
        TesteClassificacaoGabinete classificacaoGabinete = new TesteClassificacaoGabinete(driver);
        TesteAcervo acervo = new TesteAcervo(driver);
        TesteRelatorios relatorios = new TesteRelatorios(driver);
        
        driver.get("http://localhost:4200/");
        

        //autor.cadastroAutor();
        //AutorDto autorDto = autor.editarAutor();
        
        //editora.cadastrarEditora();
        //EditoraDto editoraDto = editora.editarEditora();
       
        //classificacao.cadastroClassificacao();
        //ClassificacaoLivroDto classificacaoDto = classificacao.editarClassificacao();
        
        //classificacaoGabinete.cadastrarClassificacaoGabinete();
        //classificacaoGabinete.editarClassificacaoGabinete();
        
       
        //livro.CadastrarLivro(editoraDto, autorDto, classificacaoDto);
        //livro.VincularLivro(autorDto);
        //LivroDto livroDto = livro.EditarLivro(editoraDto);
        
        //acervo.cadastrarAcervo(livroDto, autorDto, classificacaoDto);
        //acervo.editarAcervo(livroDto, autorDto, classificacaoDto);
        
        relatorios.gerarRelatorioLivro(); //livroDto, autorDto, classificacaoDto
        relatorios.gerarRelatorioSintetico(); //classificacaoDto
        relatorios.gerarEtiquetas(); //livroDto, autorDto, classificacaoDto
        
        //acervo.excluirAcervo(livroDto, autorDto, classificacaoDto);
        //livro.ExcluirLivro();
        //editora.excluirEditora();
        //autor.exclusaoAutor();
        //classificacaoGabinete.excluirClassificacaoGabinite();
        //classificacao.exclusaoClassificacao();
	}
}
