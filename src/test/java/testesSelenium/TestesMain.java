package testesSelenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.jus.stf.acervo.model.dto.AutorDto;
import br.jus.stf.acervo.model.dto.EditoraDto;

public class TestesMain {

	@Test
	public void IniciarTeste() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        TesteAutor autor = new TesteAutor(driver);
        TesteEditora editora = new TesteEditora(driver);
        TesteLivro livro = new TesteLivro(driver);
        TesteClassificacaoGeral classificacao = new TesteClassificacaoGeral(driver);
        driver.get("http://localhost:4200/");
        
        
       //autor.cadastroAutor();
       //AutorDto autorDto = autor.editarAutor();
       
        
       //editora.cadastrarEditora();
       //EditoraDto editoraDto = editora.editarEditora();
       
       classificacao.cadastroClassificacao();
       classificacao.editarClassificacao();
       
       //livro.CadastrarLivro(editoraDto, autorDto);
       //livro.VincularLivro(autorDto);
       //livro.EditarLivro(editoraDto);
       
       //livro.ExcluirLivro();
       //editora.excluirEditora();
       //autor.exclusaoAutor();
       classificacao.exclusaoClassificacao();
	}
}
