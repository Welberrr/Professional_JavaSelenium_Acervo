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
public class CamposTesteAutor {
	private WebDriver driver;
	private WebDriverWait wait;
	
	WebElement botaoMenu, botaoAutorMenu, botaoEditarAutor, botaoCheckEdit, botaoVoltarEdit, botaoVoltarCad, botaoCheckDel, botaoDeletar, botaoMenuFinal, botaoInicio, campoSenha, campoUsuario, campoNomeAutorCad, campoSiglaAutorCad, campoNomeAutorCons, campoSiglaAutorCons, campoNomeEdit, campoSiglaEdit;

	public CamposTesteAutor(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
	
	
	public void localizarCamposCadastro(){
	    campoNomeAutorCad = driver.findElement(By.xpath("//*[@id=\"nome\"]"));
	    campoSiglaAutorCad =  driver.findElement(By.xpath("//*[@id=\"sigla\"]"));
	}
	
	public void localizarCamposConsulta(){
		campoNomeAutorCons = driver.findElement(By.xpath("//*[@id=\"autor\"]"));
		campoSiglaAutorCons = driver.findElement(By.xpath("//*[@id=\"sigla\"]"));
	}
	
	public void localizarCamposEdicao(){
		campoNomeEdit = driver.findElement(By.xpath("//b[text()='Edição de Autor']/ancestor::form//input[@id='nome']"));
		campoSiglaEdit = driver.findElement(By.xpath("//b[text()='Edição de Autor']/ancestor::form//input[@id='sigla']"));
	}
	
	public void localizarBotaoEdicao(){
		botaoEditarAutor = driver.findElement(By.xpath("//*[@id=\"pn_id_66-table\"]/tbody/tr/td[4]/div[1]"));
	}
	
	public void localizarBotaoCheckEdit(){
		botaoCheckEdit = driver.findElement(By.xpath("//*[@id=\"pn_id_66-table\"]/tbody/tr/td[1]/p-tablecheckbox/div/div[2]"));
	}
	
	public void localizarBotaoAutor(){
		botaoAutorMenu = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[2]/ul/li[1]/a"));
	}
	
	public void localizarBotaoVoltarEdit(){
		botaoVoltarEdit = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[2]/span[2]/button"));
	}
	
	public void localizarBotaoVoltarCad(){
		botaoVoltarCad = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[2]/span[2]/button"));
	}
	
	public void localizarBotoesDel(){
		botaoCheckDel = driver.findElement(By.xpath("//*[@id=\"pn_id_585-table\"]/tbody/tr/td[1]/p-tablecheckbox/div/div[2]"));
		botaoDeletar =  driver.findElement(By.xpath("//*[@id=\"pn_id_585-table\"]/tbody/tr/td[4]/div[2]"));
	}
	
	public void localizarBotaoMenuFinal() {
		botaoMenuFinal = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]"));
	}
	
	public void localizarBotaoInicio() {
		botaoInicio = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[1]/ul/li/a/span[1]"));
	}
	
	public WebElement botaoEspera(String xpath) {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
}
