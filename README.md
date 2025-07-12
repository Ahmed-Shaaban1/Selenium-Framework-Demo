#  Selenium Java Automation Framework

This repository contains an end-to-end test automation framework using **Java**, **Selenium WebDriver**, and **TestNG**, following the **Page Object Model (POM)**. The framework is built for scalability, readability, and easy maintenance.

---

##  Features

- ✅ **Page Object Model (POM)** design pattern  
- ✅ **Data-Driven Testing (DDT)** using JSON  
- ✅ **Allure Reporting** for rich, interactive test reports  
- ✅ **Java Logging (Logger)** for tracking test execution  
- ✅ **Faker Library** to generate dynamic fake data  
- ✅ **Custom Utilities** for scrolling, waits, and actions
  
---

## 📁 Project Structure

```
selenium-java-automation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── customMethods/
│   │       │   ├── DoActions.java
│   │       │   ├── Scrolling.java
│   │       │   └── Waits.java
│   │       │
│   │       └── pages/
│   │           ├── PageBase.java
│   │           ├── LoginPage.java
│   │           ├── ProductsPage.java
│   │           ├── BagItemPage.java
│   │           ├── CartPage.java
│   │           ├── CheckoutPage.java
│   │           ├── OrderOverviewPage.java
│   │           └── ThankYouPage.java
│   │
│   └── test/
│       └── java/
│           ├── data/
│           │   └── data.json
│           │
│           ├── dataProvider/
│           │   └── JsonDataProvider.java
│           │
│           ├── utilities/
│           │   └── Helper.java
│           │
│           └── tests/
│               ├── TestBase.java
│               ├── LoginTest.java
│               ├── AddItemToCartTest.java
│               ├── ClickItemTest.java
│               ├── OpenCartTest.java
│               ├── CheckOutTest.java
│               ├── FillCheckoutInformationTest.java
│               └── OrderOverviewFinishTest.java
│
├── pom.xml
├── testng.xml
├── screenshots/
├── allure-results/
└── test-output/


```
##  How to Download & Set Up the Project

You can either **clone** or **download** the project from GitHub:

### 🔹 Clone the repository:
```bash
git clone https://github.com/Ahmed-Shaaban1/SeleniumFramework-Demo.git
```

### 🔹 Or download as a ZIP:
- Go to the project repository page on GitHub
- Click **“Code” > “Download ZIP”**
- Extract the ZIP and open the folder in your IDE (e.g., IntelliJ or Eclipse)

### 🔹 setup the project:
- Open your IDE and **import as a Maven project**
- Wait for Maven to **resolve dependencies** from `pom.xml`
- Ensure you have:
  - Java JDK 11+ (e.g., 17 or 21)
  - Maven installed
  - Chrome browser (or update code to use another browser)
 
##  How to Run the Tests

### ▶ Run All Tests
```bash
mvn clean test
```
### ▶ Run with `testng.xml`
```xml
<suite name="SauceDemo Suite">
    <test name="Functional Tests">
        <classes>
			<class name="tests.LoginTest" />
			<class name="tests.ClickItemTest" />
			<class name="tests.AddItemToCartTest" />
			<class name="tests.OpenCartTest" />
			<class name="tests.CheckOutTest" />
			<class name="tests.FillCheckoutInformationTest" />
			<class name="tests.OrderOverviewFinishTest" />
        </classes>
    </test>
</suite>
```

Then run:
```bash
mvn clean test -DsuiteXmlFile=testng.xml
```
##  Allure Report Setup

### Run tests and generate the report:
```bash
mvn clean test
allure generate allure-results --clean -o allure-report
allure open allure-report

```

##  Scenarios Covered in This Framework

| Scenario ID | Test Description |
|-------------|------------------|
| **TC001**   | Login with valid credentials |
| **TC002**   | Click on an item and view its details |
| **TC003**   | Add an item to the cart from the products page |
| **TC004**   | Open the cart and verify added item |
| **TC005**   | Fill checkout form with valid data |
| **TC006**   | Complete checkout and verify order overview |
| **TC007**   | Finish the order and verify thank you message |





---

🧑‍💻 Author
Ahmed Sherif
Automation QA Engineer 
