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

		//No site do github, pesquisa a string GiulioBernardi na barra de pesquisa
		WebElement pesquisaGithub = driver.findElement(By.name("q"));
		pesquisaGithub.sendKeys("GiulioBernardi", Keys.ENTER);

		//Clica para entrar no read.me do meu perfil
		WebElement botaoPerfilRead = driver.findElement(By.linkText("GiulioBernardi/GiulioBernardi"));
		botaoPerfilRead.click();

		//pesquisa no navegador pela url passada no parâmetro
		driver.get("https://github.com/GiulioBernardi?tab=repositories");
		WebElement repositorioQa = driver.findElement(By.linkText("cp2-qa-selenium"));
		repositorioQa.click();

	}
}
