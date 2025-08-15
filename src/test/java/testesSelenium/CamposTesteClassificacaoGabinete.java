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
public class CamposTesteClassificacaoGabinete {
	private WebDriver driver;
	private WebDriverWait wait;
	
	WebElement botaoMenu, botaoClassGabinete, botaoEngren, botaoGabinete, botaoAlterarGab, botaoNovaClass, campoDescricao, botaoGravar, botaoMenuFinal, botaoInicio, campoConsulta, botaoEdit, campoEdicao, botaoAlterarEdit, botaoExclusao;
	
	
	public CamposTesteClassificacaoGabinete(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	
	public WebElement botaoEspera(String xpath) {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	public void localizarBotaoMenu() {
		botaoMenu = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]"));
	}
	
	public void localizarBotaoClassGabinete() {
		botaoClassGabinete = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[2]/ul/li[2]/a"));
	}
	
	public void localizarEngren() {
		botaoEngren = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/div/button"));
	}
	
	public void LocalizarGabinete() {
		botaoGabinete = driver.findElement(By.xpath("//*[@id=\"pn_id_3_9\"]/span[1]"));
	}
	
	public void localizarBotaoAlterarGab() {
		botaoAlterarGab = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[2]/div/p-dialog/div/div/div[3]/app-configuracao/form/div/div/button"));
	}
	
	public void localizarBotaoNovaClass() {
		botaoNovaClass = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/div/p-toolbar/div/div[2]/button[2]"));
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
	
	public void localizarCampoConsulta() {
		campoConsulta = driver.findElement(By.xpath("//*[@id=\"descricao\"]"));
	}
	
	public void localizarBotaoEdit() {
		botaoEdit = driver.findElement(By.xpath("//*[@id=\"pn_id_399-table\"]/tbody/tr/td[4]/div[1]"));
	}
	
	public void localizarCampoEdicao() {
		campoEdicao = driver.findElement(By.xpath("//*[@id=\"descricao\"]"));
	}
	
	public void localizarBotaoAlterarEdit() {
		botaoAlterarEdit = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[2]/span[1]/button"));
	}
	
	public void localizarBotaoExclusao() {
		botaoExclusao = driver.findElement(By.xpath("//*[@id=\"pn_id_935-table\"]/tbody/tr/td[4]/div[2]"));
	}
}
