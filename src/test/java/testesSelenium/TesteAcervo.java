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
public class CamposTesteAcervo {

	private WebDriver driver;
	private WebDriverWait wait;
	
    WebElement botaoMenuInicio, botaoAcervo, botaoEngGabinete, botaoGabinete, botaoAlterar;
	
	public CamposTesteAcervo(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
	
	public WebElement botaoEspera(String xpath) {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	public void localizarBotaoMenuInicio() {
		botaoMenuInicio = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]"));
    }
	
	public void localizarBotaoAcervo() {
		botaoAcervo = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[3]/ul/li[1]/a"));
	}
	
	public void localizarBotaoEngGabinete() {
		botaoEngGabinete = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/div/button"));
	}
	
	public void localizarBotaoGabinete() {
		botaoGabinete = driver.findElement(By.xpath("//*[@id=\"pn_id_3_0\"]"));
	}
	
	public void localizarBotaoAlterar() {
		botaoAlterar = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[2]/div/p-dialog/div/div/div[3]/app-configuracao/form/div/div/button"));
	}
}
