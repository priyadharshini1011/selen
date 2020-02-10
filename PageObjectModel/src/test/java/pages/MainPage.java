package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import salesforce.BaseClass;
import utility.Resuability;

public class MainPage extends BaseClass{
	@FindBy(xpath ="//div[@id='userNav-arrow']")
	WebElement loginName;
	@FindBy(xpath ="//a[contains(text(),'Logout')]")
	WebElement logout;
	public MainPage(){
		PageFactory.initElements(driver, this);
	}
	Resuability reuse = new Resuability();
	public void verifytitleMain(String mainpage) {

		reuse.validateTitle(mainpage, "Mainpage");
		}
	public void loginNameClick() throws InterruptedException {
		Thread.sleep(7000);
		//loginName.click();
		reuse.click1(loginName, "username Clicked");
	}
	public void logout() throws InterruptedException {
		reuse.click1(logout, "logout Clicked");
		Thread.sleep(5000);
	}
}
