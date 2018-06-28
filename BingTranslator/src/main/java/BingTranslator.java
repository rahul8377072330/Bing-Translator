import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class BingTranslator {
	WebDriver wd ;
	JavascriptExecutor js;
	
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajkeshri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 wd = new ChromeDriver();  
		  js= (JavascriptExecutor)wd; 
	}
	
	public void testOpenBingTranslator() {
		 wd.get("https://www.bing.com/translator"); 
	}
    public  void chooseInputLanguage() {
		Select inputLanguage=new Select(wd.findElement(By.xpath("//*[@id=\"t_sl\"]")));
		inputLanguage.selectByVisibleText("English");
	}
    public void chooseOutputLanguage() {
		Select inputLanguage=new Select(wd.findElement(By.xpath("//*[@id=\"t_tl\"]")));
		inputLanguage.selectByVisibleText("Hindi");
	}
    public void enterTextToTranslate() {
    	wd.findElement(By.id("t_sv")).sendKeys("hello how are you?");
    	
    }
 public void onclicktext() {BingTranslator BT=new BingTranslator();
	 WebElement text = wd.findElement(By.xpath("/html/body/ul/li[2]/a"));
	 js.executeScript("arguments[0].click();",text);
	 BT.chooseInputLanguage();
	 BT.chooseOutputLanguage();
	 BT.enterTextToTranslate();
	 BT.getTranslatedText();
 }
    public void checkMenuItemTranslator() {
    	WebElement trans = wd.findElement(By.xpath("/html/body/ul/li[1]/a"));
    	 js.executeScript("arguments[0].click();",trans);
    	wd.navigate().back();
    }
    public void checkMenuItemConversation() {
    	WebElement conver = wd.findElement(By.xpath("/html/body/ul/li[3]/a"));
    	js.executeScript("arguments[0].click();",conver);
    	wd.navigate().back();
    }
    public void checkMenuItemApps() {
    	WebElement app = wd.findElement(By.xpath("/html/body/ul/li[4]/a"));
    	js.executeScript("arguments[0].click();",app);
    	wd.navigate().back();
    }
    public void getTranslatedText() {
   	 WebElement text=wd.findElement(By.xpath("//*[@id=\"t_tv\"]"));
   	 //System.out.println(text.getText());
   }
    public void checkMenuItemForBusiness() {
    	WebElement buss = wd.findElement(By.xpath("/html/body/ul/li[5]/a"));
    	js.executeScript("arguments[0].click();",buss);
    	wd.navigate().back();
    }
    public void checkMenuItemHelp() {
    	WebElement help = wd.findElement(By.xpath("/html/body/ul/li[6]/a"));
    	js.executeScript("arguments[0].click();",help);
    	wd.navigate().back();
    }
}