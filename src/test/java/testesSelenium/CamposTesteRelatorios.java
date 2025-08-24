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
public class CamposTesteRelatorios {

	private WebDriver driver;
	private WebDriverWait wait;
	
	WebElement botaoMenuInicio, BotaoRelatorios, botaoEngGab, botaoGab, botaoAlterarGab, titulo, classificacao, autor, anoEdicao, volume, edicao, botaoPesquisar, botaoXLSX, botaoRelatorioSintetico, campoClassSintetico, botaoXLSXSintetico, botaoMenuFinal, botaoInicioFinal;
	
	public CamposTesteRelatorios(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public WebElement botaoEspera(String xpath) {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	
	
	public void localizarBotaoMenuInicio() {
		botaoMenuInicio = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]"));
	}
	
	public void localizarBotaoRelatorios() {
		BotaoRelatorios = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[3]/ul/li[2]/a"));
	}
	

	public void localizarBotaoEngGab() {
		botaoEngGab = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/div/button"));
	}
	
	public void localizarBotaoGab() {
		botaoGab = driver.findElement(By.xpath("//*[@id=\"pn_id_3_9\"]/span[1]"));
	}
	
	public void localizarBotaoAlterarGab() {
		botaoAlterarGab = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[2]/div/p-dialog/div/div/div[3]/app-configuracao/form/div/div/button/span"));
	}
	
	public void localizarCampoClassificacao() {
		classificacao = driver.findElement(By.xpath("//*[@id=\"classificacao\"]"));
	}
	
	public void localizarCampoTitulo() {
		titulo = driver.findElement(By.xpath("//*[@id=\"titulo\"]"));
	}
	
	public void localizarCampoAutor() {
		autor = driver.findElement(By.xpath("//*[@id=\"autor\"]"));
	}
	
	public void localizarCampoAnoEdicao() {
		anoEdicao = driver.findElement(By.xpath("//*[@id=\"anoEdicao\"]"));
	}
	
	public void localizarCampoEdicao() {
		edicao = driver.findElement(By.xpath("//*[@id=\"numeroEdicao\"]"));
	}
	
	public void localizarCampoVolume() {
		volume = driver.findElement(By.xpath("//*[@id=\"volume\"]"));
	}
	
	public void localizarBotaoPesquisar() {
		botaoPesquisar = driver.findElement(By.xpath("//*[@id=\"pn_id_7_content\"]/form/p-toolbar/div/div[2]/div/p-button[1]/button"));
	}
	
	public void localizarBotaoXLSX() {
		botaoXLSX = driver.findElement(By.xpath("//*[@id=\"pn_id_7_content\"]/form/p-toolbar/div/div[2]/div/button/span[2]"));
	}
	
	
	public void localizarBotaoRelatorioSintetico() {
		botaoRelatorioSintetico = driver.findElement(By.xpath("//*[@id=\"pn_id_29_header_action\"]"));
	}
	
	public void localizarCampoClassSintetico() {
	    campoClassSintetico = driver.findElement(By.xpath("//*[@id=\"classificacao\"]"));
	}
	
	public void localizarBotaoXLSXSintetico() {
		botaoXLSXSintetico = driver.findElement(By.xpath("//*[@id=\"pn_id_29_content\"]/form/p-toolbar/div/div[2]/button"));
	}
	
	public void localizarBotaoMenuFinal() {
		botaoMenuFinal = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]"));
	}
	
	public void localizarBotaoInicioFinal() {
		botaoInicioFinal = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[1]/ul/li/a"));
	}
}
