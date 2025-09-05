# Flipkart Automation Project (Selenium + TestNG + Maven)
## Overview

This project automates core user journeys of an e-commerce website using Selenium WebDriver, TestNG, and Page Object Model (POM).
Key scenarios covered:

Search for a product
Add product to cart
Remove product from cart
Verify home page title
Verify login page navigation
The framework is scalable, modular, and follows best practices for test automation.

## Project Structure
EcommerceAutomation/
│
├── pom.xml                    # Maven dependencies
├── testng.xml                 # Test suite configuration
│
├── src
│   ├── main
│   │   └── java
│   │       └── utils/
│   │           ├── ConfigReader.java
│   │           ├── DriverFactory.java
│   │           └── TestDataUtil.java
│   │
│   └── test
│       ├── java
│       │   ├── base/
│       │   │   └── BaseTest.java
│       │   ├── pages/
│       │   │   ├── HomePage.java
│       │   │   ├── SearchResultsPage.java
│       │   │   ├── ProductPage.java
│       │   │   └── CartPage.java
│       │   └── tests/
│       │       ├── HomePageTitleTest.java
│       │       ├── SearchProductTest.java
│       │       ├── SearchAddToCartTest.java
│       │       ├── RemoveFromCartTest.java
│       │       └── LoginNavigationTest.java
│       └── resources/
│           ├── config.properties
│           └── testdata.xlsx

## Tools & Technologies

Java 22
Selenium WebDriver
TestNG
Maven (dependency management)
WebDriverManager (automatic driver handling)
Apache POI (for data-driven testing)
PageFactory (POM implementation)

## How to Run
Clone the repository:
git clone https://github.com/your-username/ecommerce-automation.git
Navigate to the project directory:
cd ecommerce-automation
Install dependencies:
mvn clean install
Execute tests:
mvn test
Or run specific suite:
mvn clean test -DsuiteXmlFile=testng.xml

## Configuration
Update src/test/resources/config.properties with:

browser=chrome
baseUrl=https://www.flipkart.com
implicitWait=10



