package testesSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CamposTesteLivro {

	private WebDriver driver;
	private WebDriverWait wait;
	
	WebElement botaoMenuLivro, botaoLivros, campoTitulo, campoIniciais, campoAssunto, campoISBN, campoAno, campoEdicao, campoVolume, campoCodigoColecao, campoEditora, campoClassificacaoGeral ;
	
	public CamposTesteLivro(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
	
	
	
	public void localizarBotaoLivros() {
		botaoLivros = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[2]/ul/li[5]/a/span[1]"));
	}
	
	public void localizarCamposCadastroLivro() {
		campoTitulo = driver.findElement(By.xpath("//*[@id=\"titulo\"]"));
		campoIniciais = driver.findElement(By.xpath("//*[@id=\"sigla\"]"));
		campoAssunto = driver.findElement(By.xpath("//*[@id=\"assunto\"]"));
		campoISBN = driver.findElement(By.xpath("//*[@id=\"isbn\"]"));
		campoAno = driver.findElement(By.xpath("//*[@id=\"ano\"]"));
		campoEdicao = driver.findElement(By.xpath("//*[@id=\"edicao\"]"));
		campoVolume = driver.findElement(By.xpath("//*[@id=\"volume\"]"));
		campoCodigoColecao = driver.findElement(By.xpath("//*[@id=\"codigoGrupoLivro\"]"));
		campoEditora = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[4]/div[1]/p-autocomplete/div/input"));
		campoClassificacaoGeral = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[4]/div[2]/p-autocomplete/div/input"));
	}
	
	public WebElement botaoEspera(String xpath) {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
}