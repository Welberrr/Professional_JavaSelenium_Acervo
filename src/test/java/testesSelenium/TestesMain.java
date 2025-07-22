package testesSelenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestesMain {

	@Test
	public void IniciarTeste() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        TesteAutor autor = new TesteAutor(driver);
        TesteEditora editora = new TesteEditora(driver);
        TesteLivro livro = new TesteLivro(driver);
        driver.get("http://localhost:4200/");
        
        
       //autor.cadastroAutor();
       //autor.editarAutor();
       //autor.exclusaoAutor();
        
       //editora.cadastrarEditora();
       //editora.editarEditora();
       //editora.excluirEditora();
       
       livro.CadastrarLivro();
       livro.VincularLivro();
       livro.EditarLivro();
       livro.ExcluirLivro();
	}
}
