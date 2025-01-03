# Selenium-with-Java
### Automation Testing:
Performing the testing with the help of tools is called "Automation Testing"
### Selenium: 
Web based automation tool/library
selenium is a collection of multiple components (IDE,Web driver,Grid)
### Types of applications:  
1.Web Applications 2. Desktop 3. Mobile
### Advantages:
1.open source 2.supports multiple browsers 3.supports multiple languages 4. Integrate third party tools to selenium
### Disadvantages:
1.cannot support window based applications (overcome by using thirdparty tools like Robot API)
2.Reporting not supported (overcome by using TestNG,Extent Reports)
3.Cannot support excel files (overcome by using Apache POI)

### Selenium WebDriver:
1. one of the component in selenium
2. WebDriver is a java interface
3. it is an API  
webDriver (I) ---RemoteWebDriver(C)---> chromeDriver, FireFoxDriver, EdgeDriver etc.,

### Locators
Locators are addresses that identify a web element uniquely with in the page  
Locators: id,name,Linktext,PartialLinkText,className,TagName  
Customized locators: CSS Selectors,XPath(Absolute Path, Relative XPath)  

--LinkText(using entire text of link)  
--PartialLinkText( using some part of the link text to match multiple link texts)  
--TagName & Class Name ( validation for group of web elements like counting web links or images in the web page)  
--findElement()---return single web element
--findElements()---return multiple web elements   

Scenario 1: locator matching with single web element   
findElement(loc)-->single web element of type WebElement  
findElements(loc)--> single web element of type List<WebElement>  

Scenario 2: locator matching with multi web elements   
findElement(loc)-->single web element of type WebElement  (returns first element)  
findElements(loc)--> multi web elements of type List<WebElement>   

Scenario 3 : locator is not matching with any element/s   
findElement(loc)-->No such element exception  
findElements(loc)--> will not throw any exception .Returns 0  

CSS Selectors:   
--------------  
tag id---> tag#id    
tag class---> tag.className      
tag attribute---> tag[attribute=value]   
tag class attribute ---> tag.className[attribute=value]   

XPath:  
--------
XPath is an address of the element  
DOM : Document object Model  
1.Absolute XPath(full Xpath)  
ex: /html/body/header/div/div/div[2]/div/input  
2.Relative Xpath(partial xpath)  
ex: //*[@id="search"]/input  
Syntax: //tagname[@attribute='value']  
//*[@attribute='value']  


Why do we prefer Relative XPath?   
---
Because hierarchy of the Absolute XPath keeps on changing as developers keeps on changing the things like location of the image as the time progresses  

Difference between Abs and Rel?  
---
1.Absolute xpath starts with / -->represents root node   
  relative xpath starts with //   
2. Abs Xpath donot use attributes  
   rel Xpath wotks with attributes   
3. Absolute xpath traverse through each node till it finds the element   
   Rel Xpath directly jump and find the element by using attribute 
   
Relative XPath - Ways of selecting 
---
Xpath with single attribute: BY.Xpath("//input[@placeholder='Search']")  
Xpath with multiple attribute: BY.Xpath("//input[@placeholder='Search'][@placeholder='Search']")  
Xpath with 'and' 'or' operators: BY.Xpath("//input[@placeholder='Search' and @name='search']")  
Xpath with inner text: BY.Xpath("//a[text()='Desktops'])  
Xpath with 'contains': By.Xpath("//input[contains(@placeholder,'Sea')]"
Xpath with 'starts-with': By.Xpath("//input[starts-with(@placeholder,'Sea')]"   
Chained Xpath : //div[@id='logo']/a/img  

Difference between css and xpath?
-
css: one directional access from top to bottom  
xpath: 2 directional access from top to bottom and bottom to top  

Xpath axes:
--
Hierarchy:  Ancestor-->Parent-->Self-->child-->Descendant     
Example:   
Locating Parent:   
  //input[@id='txtusername']/parent::form     
  //input[@id='txtusername']/parent::*    
  //input[@id='txtusername']/..     
Locating Child :   
 //div[@id='divUsername']/child::input    
Locating Ancestor:  
 //input[@id='txtUsername']/ancestor::form   
Locating Descendent:  
 //form[@id='frmLogin']/descendent::input  
Locating Siblings:  
 //input[@id='txtUsername']/following::input[2]  
 //input[@id='txtUsername']/preceding::input[2]    

 
 WebDriver Methods:   
 --
 
 1.get methods  
 2.conditional methods  
 3. Browser methods  
 4. navigational methods  
 5.wait methods   

 1.get methods: we can access these methods through web driver instance
 ---
 get(url): opens url on the browser
 getTitle():returns title of the page  
 getCurrentURL(): returns url of the page  
 getPageSource(): returns source code of the page  
 getWindowHandle(): returns ID of the single browser window  
 getWindowHandles(): returns ID of the multiple browser windows  
 
2.Conditional methods: access these commands through webElements  
--
returns boolean values  
isDisplayed()  
isEnabled()  
isSelected()  

3.Browser Methods:  
--
 close(): close one window wherever driver is focussed 
 quit(): close all windows  
 How to close selective windows? based on window id's and page title , we decide what to close   

4.Wait commands:
--
Thread.Sleep():  Thread,sleep() is not a wait command   
adv:  1.easy to use  
disadv:  1. if the time is not sufficient we will get the error  
2. wastage of time , so performance issues  
3. multiple times we need to write  

Synchronization problem during automation???  
1.implicit wait  :   
Ex- driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  (5 seconds is maximum timeout)   
it will take care of all sync problems ,single command is applicable for all the commands where there is any issue  
No performance issues since it will not wait 5 seconds if the page is already loaded in 2 seconds   
Still its hardcoded   

2.explicit wait/fluent wait  :    
Declare & use   
Ex: WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));  
WebElement txtusername=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));  
txtusername.sendKeys("Admin");  
Advantages:  
Conditional method ,so it will work more effectively  
it will wait for condition to be true, then consider the time   

Exceptions:  
1.NoSuchElementException--element is not present in the page (sync problem)  
2.ElementNotFoundException--locater is incorrect  

 4.Navigational commands:
 --
 navigate.to()  
 navigate.back()  
 navigate.forward()  
 navigate.refresh()  

 driver.get()--accepts string format    
 driver.navigate().to()-- accepts string and url object   
 driver.get("https://demo.nopcommerce.com/"); 
 Type 1: driver.navigate().to("https://demo.nopcommerce.com/");  
 Type 2: URL myurl=new URL("https://demo.nopcommerce.com/");   
driver.navigate().to(myurl);  

Check boxes:
---
  ``` 
       List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for(WebElement cb:checkboxes) {
       	cb.click();
       }
  ```
Alerts:
---
1. JS Alert
2. JS Confirm
3. JS Prompt
4. Authenticated Popups

We can't inspect these alerts, since alerts are not web elements  

JS Alert:
```
driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
Thread.sleep(5000);
// switch to alert
Alert myalert=driver.switchTo().alert();
System.out.println(myalert.getText());
myalert.accept();
```
JS Confirm:
```
driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
Alert myalert=driver.switchTo().alert();
myalert.dismiss();
```
JS Prompt:
```
driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
Thread.sleep(5000);
Alert myalert=driver.switchTo().alert();
myalert.sendKeys("Welcome");
myalert.accept();
```
Handling alerts without using switchTo():  
By Using Explicit wait  
```
WebDriver driver=new ChromeDriver();
WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
Thread.sleep(5000);
Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
System.out.println(myalert.getText());
myalert.accept();
```

Handling Authenticated Popup:   
--
URL : https://the-internet.herokuapp.com/basic_auth    
Passing username and password along with url:    
Syntax:  http://username:password@the-internet.herokuapp.com/basic_auth   
Example: http://admin:admin@the-internet.herokuapp.com/basic_auth
```
WebDriver driver=new ChromeDriver();
//driver.get("https://the-internet.herokuapp.com/basic_auth");
driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
```
Frames/iframes:
---
driver.switchTo().frame(x) x=id,name,webElement   








   








 
 
         
         

















   






Live Testing links: 
--
1. https://demo.opencart.com/en-gb?route=common/home  
2. https://demo.nopcommerce.com/  
3. https://opensource-demo.orangehrmlive.com/web/index.php/auth/login  
4. https://the-internet.herokuapp.com/
5. https://testautomationpractice.blogspot.com/
6. https://ui.vision/demo/webtest/frames/
7. 






