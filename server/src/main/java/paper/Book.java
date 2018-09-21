package paper;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book {
	@Test
	public void ASS1() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		String firstName="Susmitha";
		String lastName="Gandham";
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
	    //add the employee details.....
		Thread.sleep(5000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys(lastName);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys(firstName);
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
	    //Thread.sleep(2000);
	     //verify the employee name just entered .....in the personal details page...
	     Thread.sleep(5000);
		//driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='btnEditPers']")).click();
		//Thread.sleep(2000);
		String fN=driver.findElement(By.xpath("//*[@id='txtEmpFirstName']")).getAttribute("value");
		String lN=driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).getAttribute("value");
		System.out.println("firstName :"+ fN);
		System.out.println("lastName : "+ lN);
		if(fN.equals(firstName)&&(lN.equals(lastName))){
			System.out.println("Employee successfully added : TestCase Passed");
		}
		else
		{
			System.out.println("Add Employee failed : testcase failed");
		}
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[3]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.close();	
		

	}

}
