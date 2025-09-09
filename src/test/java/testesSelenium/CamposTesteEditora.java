package testesSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CamposTesteEditora {
	private WebDriver driver;
	private WebDriverWait wait;
	
	WebElement botaoMenuEditora, botaoEditora, botaoNovaEditora, botaoVoltar, botaoInicio, campoNovaEditora, campoConsulta, campoEdit;
	public List<WebElement> botaoEdit, botaoDelete;
	
	public CamposTesteEditora(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(400));
    }
	
	public void localizarBotaoEditora() {
		botaoEditora = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[2]/ul/li[4]/a/span[1]"));
	}
	
	public void localizarBotaoNovaEditora() {
		botaoNovaEditora = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/div/p-toolbar/div/div[2]/button[2]"));
	}
	
	public void localizarCampoNovaEditora() {
		campoNovaEditora = driver.findElement(By.xpath("//*[@id=\"nome\"]"));
	}
	
	public void localizarBotaoVoltar() {
		botaoVoltar = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[2]/span[2]/button"));
	}
	
	public WebElement botaoEspera(String xpath) {
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	public void localizarBotaoInicio() {
		botaoInicio = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[1]/ul/li/a/span[1]"));
	}
	
	public void localizarBotaoEdit() {
		botaoEdit = driver.findElements(By.xpath("//*[@data-testid='EditarEditora']"));
	}
	
	public void localizarBotaoExclusao() {
		botaoDelete = driver.findElements(By.xpath("//*[@data-testid='ExcluirEditora']"));
	}
	
	public void localizarCampoConsulta() {
		campoConsulta = driver.findElement(By.xpath("//*[@id=\"editora\"]"));
	}
	
	public void localizarCampoEdit() {
		campoEdit = driver.findElement(By.xpath("//*[@id=\"nome\"]"));
	}
}
