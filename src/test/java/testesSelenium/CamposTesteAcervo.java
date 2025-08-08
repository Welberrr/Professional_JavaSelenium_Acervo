package testesSelenium;

public class CamposTesteAcervo {

	package testesSelenium;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import lombok.Getter;
	import lombok.Setter;


	@Getter
	@Setter
	public class CamposTesteAcervo {

		private WebDriver driver;
		private WebDriverWait wait;
		
		public CamposTesteAcervo(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	        
	        
	        WebElement teste;
	    }
	}

}
