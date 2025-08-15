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
public class CamposTesteClassificacaoGeral {
	private WebDriver driver;
	private WebDriverWait wait;
	
	WebElement botaoMenu, botaoClassificacaoGeral, botaoNovaClassificacao, campoDescricao, botaoGravar, botaoMenuFinal, botaoInicio, campoConsulta, botaoPesquisar, botaoEdit, campoDescEdit, botaoAlterar, botaoExclusao;
	
	
	public CamposTesteClassificacaoGeral(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
	
	public void localizarBotaoClassificacaoGeral() {
		botaoClassificacaoGeral = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[2]/ul/li[3]/a/span[1]"));
	}
	
	public void localizarBotaoNovaClassificacao() {
		botaoNovaClassificacao = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/div/p-toolbar/div/div[2]/button[2]"));
	}
	
	public void localizarCampoDescricao() {
		campoDescricao = driver.findElement(By.xpath("//*[@id=\"descricao\"]"));
	}
	
	public void localizarBotaoGravar() {
		botaoGravar = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[2]/span[1]/button"));
	}
	
	public void localizarBotaoMenuFinal() {
		botaoMenuFinal = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]"));
	}
	
	public void localizarBotaoInicio() {
		botaoInicio = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[1]/ul/li/a"));
	}
	
	public WebElement botaoEspera(String xpath) {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	public void localizarCampoConsulta() {
		campoConsulta = driver.findElement(By.xpath("//*[@id=\"classificacao\"]"));
	}
	
	public void localizarBotaoPesquisar() {
		botaoPesquisar = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/div/form/p-toolbar/div/div[2]/button[1]"));
	}
	
	public void localizarBotaoEdit() {
		botaoEdit = driver.findElement(By.xpath("//*[@id=\"pn_id_312-table\"]/tbody/tr/td[4]/div[1]"));
	}
	
	public void localizarCampoDescEdit() {
		campoDescEdit = driver.findElement(By.xpath("//*[@id=\"descricao\"]"));
	}
	
	public void localizarBotaoAlterar() {
		botaoAlterar = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[2]/span[1]/button"));
	}
	
	public void localizarBotaoExclusao() {
		botaoExclusao = driver.findElement(By.xpath("//*[@id=\"pn_id_990-table\"]/tbody/tr/td[4]/div[2]"));
	}
}
