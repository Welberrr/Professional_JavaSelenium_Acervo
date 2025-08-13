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
	
    WebElement botaoMenuInicio, botaoAcervo, botaoEngGabinete, botaoGabinete, botaoAlterar, botaoNovoAcervo, botaoSeleLivro, campoLivroTitulo, campoLivroAutor, campoLivroAno, botaoSelectLivro, botaoSelecionarLivro, campoEmprestado, campoNota, campoObservacao, campoClassGab, botaoGravar, botaoMenuFinal, botaoInicio, botaoPesquisar, botaoEdicao, botaoAlterarEdit, botaoExclusao, campoTituloCons, campoAutorCons, botaoPesquisarCons;
	
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
		botaoGabinete = driver.findElement(By.xpath("//*[@id=\"pn_id_3_9\"]"));
	}
	
	public void localizarBotaoAlterar() {
		botaoAlterar = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[2]/div/p-dialog/div/div/div[3]/app-configuracao/form/div/div/button"));
	}
	
	public void localizarBotaoNovoAcervo() {
		botaoNovoAcervo = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/form/div/div/p-toolbar[1]/div/div[2]/button"));
	}
	
	public void localizarBotaoSeleLivro() {
		botaoSeleLivro = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[1]/div[8]/button"));
	}
	
	public void localizarCampoLivroTitulo() {
		campoLivroTitulo = driver.findElement(By.xpath("//*[@id=\"titulo\"]"));
	}
	
	public void localizarCampoLivroAutor() {
		campoLivroAutor = driver.findElement(By.xpath("//*[@id=\"autor\"]"));
	}
	
	public void localizarCampoLivroAno() {
		campoLivroAno = driver.findElement(By.xpath("//*[@id=\"ano\"]"));
	}
	
	public void localizarBotaoSelectLivro() {
		botaoSelectLivro = driver.findElement(By.xpath("//*[@id=\"pn_id_17-table\"]/tbody/tr/td[1]/p-tableradiobutton/div/div[2]"));
	}
	
	public void localizarBotaoSelecionarLivro() {
		botaoSelecionarLivro = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/p-dialog/div/div/div[3]/app-selecaolivro/div/div/div/span[1]/button"));
	}
	
	public void localizarBotaoPesquisar() {
		botaoPesquisar = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/p-dialog/div/div/div[3]/app-selecaolivro/div/div/form/div/p-toolbar/div/div[4]/p-button/button/span[1]"));
	}
	
	public void localizarCampoEmprestado() {
		campoEmprestado = driver.findElement(By.xpath("//*[@id=\"emprestimo\"]"));
	}
	
	public void localizarCampoNota(){
		campoNota = driver.findElement(By.xpath("//*[@id=\"nota\"]"));
	}
	
	public void localizarCampoObservacao() {
		campoObservacao = driver.findElement(By.xpath("//*[@id=\"observacao\"]"));
	}
	
	public void localizarCampoClassGab() {
		campoClassGab = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[2]/div[2]/div/p-autocomplete/div/input"));
	}
	
	public void localizarBotaoGravar() {
		botaoGravar = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[3]/span[1]/button"));
	}
	
	public void localizarBotaoMenuFinal() {
		botaoMenuFinal = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-topbar/div[1]/button[1]"));
	}
	
	public void localizarBotaoInicio() {
		botaoInicio = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/app-menu/ul/li[1]/ul/li/a"));
	}
	
	public void localizarBotaoEdicao() {
		botaoEdicao = driver.findElement(By.xpath("//*[@id=\"pn_id_29-table\"]/tbody/tr/td[6]/div[1]"));
	}
	
	public void localizarBotaoAlterarEdit() {
		botaoAlterarEdit = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/div/form/div/div[3]/span[1]/button"));
	}
	
	public void localizarBotaoExclusao() {
		botaoExclusao = driver.findElement(By.xpath("//*[@id=\"pn_id_7-table\"]/tbody/tr/td[6]/div[2]"));
	}
	
	
	public void localizarCampoTituloCons() {
		campoTituloCons = driver.findElement(By.xpath("//*[@id=\"titulo\"]"));
	}
	
	public void localizarCampoAutorCons() {
		campoAutorCons = driver.findElement(By.xpath("//*[@id=\"autor\"]"));
	}
	
	public void localizarBotaoPesquisarCons() {
		botaoPesquisarCons = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/div/ng-component/div/form/div/div/p-toolbar[2]/div/div[2]/p-button[1]/button"));
	}
}