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
public class CamposTesteRelatorios {

	private WebDriver driver;
	private WebDriverWait wait;
	
	WebElement botaoMenuInicio, BotaoRelatorios, botaoEngGab, botaoGab, botaoAlterarGab, titulo, classificacao, autor, anoEdicao, volume, edicao, botaoXLSX, botaoRelatorioSintetico, campoClassSintetico, botaoXLSXSintetico, botaoGerarEtiquetas, campoClassEtiqueta, campoAutorEtiqueta, botaoOrdenacaoEtiqueta, botaoAutorOrdenacao, campoVolumeEtiqueta, campoTituloEtiqueta, campoAssuntoEtiqueta, botaoPesquisar,  botaoPesquisarEtiquetas, botaoGerarEtiquetasDownload, botaoMenuFinal, botaoInicioFinal;
	
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
		botaoPesquisar = driver.findElement(By.xpath("//*[@data-testid='PesquisarRelatorios']"));
	}
	
	public void localizarBotaoXLSX() {
		botaoXLSX = driver.findElement(By.xpath("//*[@data-testid='XLSRelatorios']"));
	}
	
	
	public void localizarBotaoRelatorioSintetico() {
	    botaoRelatorioSintetico = driver.findElement(By.xpath("//*[@data-testid='RelatorioSintetico']"));
	}

	public void localizarCampoClassSintetico() {
	    campoClassSintetico = driver.findElement(By.xpath("//div[@aria-hidden='false']//*[@data-testid='InputClassSintetico']"));
	}

	public void localizarBotaoXLSXSintetico() {
	    botaoXLSXSintetico = driver.findElement(By.xpath("//*[@data-testid='XLSSintetico']"));
	}

	public void localizarBotaoEtiquetas() {
	    botaoGerarEtiquetas = driver.findElement(By.xpath("//*[@data-testid='Etiquetas']"));
	}

	public void localizarCampoClassEtiquetas() {
	    campoClassEtiqueta = driver.findElement(By.xpath("//div[@aria-hidden='false']//*[@data-testid='InputClassEtiquetas']"));
	}

	public void localizarCampoAutorEtiquetas() {
	    campoAutorEtiqueta = driver.findElement(By.xpath("//div[@aria-hidden='false']//*[@data-testid='InputAutorEtiquetas']"));
	}

	public void localizarOrdenacaoEtiqueta() {
	    botaoOrdenacaoEtiqueta = driver.findElement(By.xpath("//*[@id=\"ordenacao\"]/div"));
	    botaoAutorOrdenacao = driver.findElement(By.xpath("//*[@id=\"ordenacao_2\"]"));
	}

	public void localizarCampoVolumeEtiqueta() {
	    campoVolumeEtiqueta = driver.findElement(By.xpath("//div[@aria-hidden='false']//*[@data-testid='InputVolumeEtiquetas']"));
	}

	public void localizarCampoTituloEtiqueta() {
	    campoTituloEtiqueta = driver.findElement(By.xpath("//div[@aria-hidden='false']//*[@data-testid='InputTituloEtiquetas']"));
	}

	public void localizarCampoAssuntoEtiqueta() {
	    campoAssuntoEtiqueta = driver.findElement(By.xpath("//div[@aria-hidden='false']//*[@data-testid='InputAssuntoEtiquetas']"));
	}

	public void localizarBotaoPesquisarEtiquetas() {
	    botaoPesquisarEtiquetas = driver.findElement(By.xpath("//*[@data-testid='PesquisarEtiquetas']"));
	}

	public void localizarBotaoGerarEtiquetasDownload() {
	    botaoGerarEtiquetasDownload = driver.findElement(By.xpath("//div[@aria-hidden='false']//*[@data-testid='BotaoDownloadEtiquetas']"));
	}
	
	public void localizarBotaoMenuFinal() {
		botaoMenuFinal = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]"));
	}
	
	public void localizarBotaoInicioFinal() {
		botaoInicioFinal = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[1]/ul/li/a"));
	}
}