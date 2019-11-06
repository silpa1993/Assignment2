package A2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users/mssil/OneDrive/Documents/silpa/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String S1="http://www.facebook.com" ;
		driver.navigate().to(S1);;
		if(driver.getCurrentUrl().equals(S1))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.print("Fail");
		}
		
		String S2="Create an account";
		System.out.println(driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']/span")).getText());
		
		if (driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']/span")).getText().equals(S2))
		{
						System.out.println("Label correct");
		}
		else
		{
			System.out.println("Incorrect label");
		}
		//form fill
		driver.findElement(By.name("firstname")).sendKeys("silpa");
		
		driver.findElement(By.name("lastname")).sendKeys("MS");
		driver.findElement(By.name("reg_email__")).sendKeys("silpa1993ms@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("silpa1993ms@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password@100");
		
		//select from dropdown
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByValue("30");
		Select month=new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("12");
		Select year=new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1993");
				
		//select from radio buttons
		WebElement radio1=driver.findElement(By.id("u_0_6"));
		radio1.click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
	}

}
