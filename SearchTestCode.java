import org.openqa.selenium.*;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
public class Search_Page extends PageObject{
 
           private static WebElement element = null;
private static List<WebElement> results = null;
 
    public static WebElement txtSearchControl(){
 
         element = driver.findElement(By.css(“div.search-field > input“));
 
         return element;
 
         }
 
    public static WebElement btnSearchButton(){
 
         element = driver.findElement(By.css(“input#search.search-submit“));
 
         return element;
 
         }
 
    public static WebElement btnClearSearch(){
 
         element = driver.findElement(By.css(“a#global-search-new”));
 
         return element;
 
         }
public static WebElement btnSearchOptions(){
 
         element = driver.findElement(By.css(“div#search-options“));
 
         return element;
 
         }
    public static List<WebElement> btnSearchResults(){
 
         results = driver.findElements(By.css(“ol#results-list“));
 
         return results;
 
         }

public void goSearchPage(String page){

    driver.get(page)
  }

public void SearchFor(String Keyword){

    txtSearchControl.sendkeys(Keyword);
    btnSearchButton.click()
          
    }

public bool SearchResult(String Result){

bool found;

found  = driver.findElement(By.xpath(“//*[@class='no-access']/a[contains(text(),’” + Result + “ ’)]“));
if (found != null){
  return true; }
else{
  return false;
    }  
  }
public bool noResultsFound(){

element = driver.findElement(By.xpath(“//*[@id="no-results-message"]/h2/[contains(text(),’we couldn’t find what you are looking for’)]”));
if (element != null){
  return true; }
else{
  return false;
    }  

  }
}
