import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBing {
	BingTranslator tat = new BingTranslator();
	
	@BeforeTest
	public void InitializeBrowser() {
		tat.initializeBrowser();
	}
	
	@Test(priority = 0)
	public void TestOpenBingTranslator() {
		tat.testOpenBingTranslator();
		Assert.assertTrue(tat.wd.getCurrentUrl().contains("translator"));
	}
	@Test(priority = 1)
	 public void CheckMenuItemTranslator() {
	    	tat.checkMenuItemTranslator();
			tat.checkMenuItemConversation();
	        tat.checkMenuItemApps();
	        tat.checkMenuItemForBusiness();
	        tat.checkMenuItemHelp();
	        Assert.assertTrue(tat.wd.getCurrentUrl().contains("translator"));
	        //tat.onclicktext();
	        
	    }
	@Test(priority = 2)
	public void ChooseInputLanguage() {
		tat.chooseInputLanguage();
		Assert.assertTrue(tat.wd.getCurrentUrl().contains("translator"));
	}
	@Test(priority = 3)
	public void ChooseOutputLanguage() {
		tat.chooseOutputLanguage();
		Assert.assertTrue(tat.wd.getCurrentUrl().contains("translator"));
	}
	@Test(priority = 4)
	 public void EnterTextToTranslate() {
	    	tat.enterTextToTranslate();
	    	Assert.assertTrue(tat.wd.getCurrentUrl().contains("translator"));
	    }
	
	@Test(priority = 5)
	 public void GetTranslatedText(){
	    	tat.getTranslatedText();
	    	Assert.assertTrue(tat.wd.getCurrentUrl().contains("translator"));
	    }
}
