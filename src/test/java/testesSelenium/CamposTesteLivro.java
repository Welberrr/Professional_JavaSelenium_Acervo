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
	
	WebElement botaoMenuLivro, botaoLivros, campoTitulo, campoIniciais, campoAssunto, campoISBN, campoAno, campoEdicao, campoVolume, campoCodigoColecao, campoEditora, campoClassificacaoGeral, botaoGravar, botaoMenuFinal, botaoInicioFinal, campoConsultaLivro, botaoEditLivro, botaoVincularAutor, campoAutorVinculo, botaoAutor, botaoGravarVinculo, botaoExclusao, botaoConfirmarExclusao, botaoAlterarEdit, botaoEdit2;
	
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
	
	public void localizarBotaoGravar() {
		botaoGravar = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[5]/span[1]/button"));
	}
	
	public void localizarBotaoMenuFinal() {
		botaoMenuFinal = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]"));
	}
	
	public void localizarBotaoInicioFinal() {
		botaoInicioFinal = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[1]/ul/li/a"));
	}
	
	public WebElement botaoEspera(String xpath) {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	
	public void localizarCampoConsulta() {
		campoConsultaLivro = driver.findElement(By.xpath("//*[@id=\"titulo\"]"));
	}
	
	public void localizarBotaoEdit() {
		botaoEditLivro = driver.findElement(By.xpath("//*[@id=\"pn_id_509-table\"]/tbody/tr/td[9]/div[1]"));
	}
	
	public void localizarBotaoVincularAutor() {
		botaoVincularAutor = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div[2]/div/p-toolbar/div/div[2]/button"));
	}
	
	public void localizarCampoAutorVinculo() {
		campoAutorVinculo = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/p-dialog/div/div/div[3]/div/div/p-autocomplete/div/input"));
	}
	
	public void localizarBotaoAutor() {
		botaoAutor = driver.findElement(By.xpath("//*[@id=\"pn_id_542_content\"]/div/div/div[1]/input"));
	}
	
	public void localizarBotaoGravarVinculo() {
		botaoGravarVinculo = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/p-dialog/div/div/div[4]/p-button[1]/button"));
	}
	
	public void localizarBotaoExclusao() {
		botaoExclusao = driver.findElement(By.xpath("//*[@id=\"pn_id_866-table\"]/tbody/tr/td[9]/div[2]"));
	}
	
	public void localizarBotaoConfirmarExlusao() {
		botaoConfirmarExclusao = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/p-confirmdialog/div/div/div[3]/button[2]"));
	}
	
	public void localizarBotaoEdit2() {
		botaoEdit2 = driver.findElement(By.xpath("//table[contains(@id,'-table')]//tr[1]/td[9]/div[1]"));
	}
	
	public void localizarBotaoAlterarEdit() {
		botaoAlterarEdit = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div[1]/div[5]/span[1]/button"));
	}
}
