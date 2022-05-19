package automacao;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automacao {
	public static void main(String[] args) {
		//Configura a utilização do webdriver
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\chromedriver.exe");

		//Instancia do objeto WebDriver
		WebDriver driver = new ChromeDriver();

		//Pesquisa a URL no parâmetro na barra de busca do navegador
		driver.get("https://github.com/");

	}
}
