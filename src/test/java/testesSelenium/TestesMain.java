package testesSelenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import br.jus.stf.acervo.model.dto.AutorDto;
import br.jus.stf.acervo.model.dto.ClassificacaoLivroDto;
import br.jus.stf.acervo.model.dto.EditoraDto;

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
        
        driver.get("http://localhost:4200/");
        
        acervo.cadastrarAcervo();
        
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
        //livro.EditarLivro(editoraDto);
       
        //livro.ExcluirLivro();
        //editora.excluirEditora();
        //autor.exclusaoAutor();
        //classificacaoGabinete.excluirClassificacaoGabinite();
        //classificacao.exclusaoClassificacao();
	}
}
