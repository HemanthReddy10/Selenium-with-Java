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











   








