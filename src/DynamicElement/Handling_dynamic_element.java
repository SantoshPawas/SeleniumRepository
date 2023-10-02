package DynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_dynamic_element 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/mobiles/~cs-3yqpc7537j/pr?sid=tyy%2C4io&collection-tab-name=Samsung+S21+FE&param=0982&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJpbmNsIG9mIG9mZmVycyJdLCJ2YWx1ZVR5cGUiOiJNVUxUSV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIlNhbXN1bmcgUzIxIEZFIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiTU9CR0JOQkRaSjVRM1JYSyIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX19fX0%3D&fm=neo%2Fmerchandising&iid=M_fb32e38f-c408-45b4-9578-e2b8048d1981_4.6JL4CP46FWFG&ppt=None&ppn=None&ssid=0hr8r0ojtc0000001691981429635&otracker=hp_omu_Top%2BOffers_1_4.dealCard.OMU_6JL4CP46FWFG_3&otracker1=hp_omu_PINNED_neo%2Fmerchandising_Top%2BOffers_NA_dealCard_cc_1_NA_view-all_3&cid=6JL4CP46FWFG");
		String dynamic=driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[2]")).getText();
		System.out.println(dynamic);
		
	}

}
