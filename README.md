# ** REST-APIAUTOMATION-PROJECT**


## Overview
Welcome to the API Automation Framework, a comprehensive solution for automating the testing of web applications. This framework is designed to simplify the process of creating, organizing, and executing UI tests, allowing you to focus on testing your application's functionality with ease and efficiency.

## Automation Architecture Diagram


<kbd>
<img src="https://github.com/binita537/REST-APIAUTOMATION-PROJECT/assets/75611677/8952b277-fda4-4652-8979-9675977c3bf4" alt="your-image-description" style="border: 1px solid black;">
</kbd>






## Key Features
* **Structured Configuration:** Uses pom.xml, application.properties, and config.properties for centralized management of dependencies, application settings, and framework configurations.
* **POJO (Plain Old Java Object):**  These objects are typically used for serializing and deserializing data, especially when interacting with APIs. They help maintain data integrity and readability by mapping JSON data to Java objects and vice versa.
*** Maintainable Test Structure:** Implements the Page Object Model (POM) design pattern, ensuring that UI changes only necessitate changes in one place.
* **Reusable Utilities:** Offers utility classes such as CommonActions and CommonUtilities for widely used functions, ensuring DRY (Don't Repeat Yourself) code.
* **Behavior-Driven Development (BDD):** Integrates Cucumber for writing tests in natural language, fostering collaboration between developers, QA, and non-technical stakeholders.
* **Integrated Logging and Reporting:** Captures logs for debugging and creates comprehensive test execution reports.
*  **Spring core:** It's a future plan to implement the Spring core concept in this Framework

## Technologies Used
* **Build Tool:** Maven (configuration in pom.xml)
* **Request and Response Payloads:** Builder design pattern for creating Request and Response.
* **Builder Design pattern:** Builder Design Pattern for Request and Response Objects.
* **Test Framework:** TestNG or JUnit
* **BDD Integration:** Cucumber
* **Configuration Management:** Custom ConfigUtility class to handle configurations from application.properties and config.properties.
* **Logging:**  Log4j
* **Reporting:** ExtentReports 

## Prerequisites
* Java JDK installed (Specify the version, e.g., JDK 8 or higher).
* Maven installed for dependency management.
* A suitable IDE (like IntelliJ IDEA or Eclipse) with Cucumber plugins installed for BDD feature file execution.
* Browser driver executables (e.g., ChromeDriver for Chrome) set up and available in the system PATH.


## Installation
1. Clone the Repository:
`git clone https://github.com/your-repo-link/REST-APIAUTOMATION-PROJECT.git`
3. Navigate to the Project Directory:
 `cd REST-APIAUTOMATION-PROJECT`
4. Install Dependencies:
  All the project dependencies are listed in the pom.xml file. Maven will automatically handle them.
   `mvn clean install`
5. Configure Framework:
    Update application.properties and config.properties with appropriate configurations like base URL, browser choice, etc.
    Execute Tests:
    `mvn test`
6. View Reports:
   After test execution, access the generated reports from the target directory or any specified report directory.

## Folder Structure
[Project structure create by using this link https://start.spring.io/ ]
* **src/main/java:** Contains Java source code, including Request and Response Objects, Builder design patterns, and utilities.
* **src/main/resources:** Contains the feature files and application.properties
* **src/test/java:** Contains Test Runner.
* **test-output:** Contains generated reports and Logs.


## Key Components

### 1. `pom.xml`, `application.properties`, and `config.properties`
- Configuration settings are managed through these files.
- The `config.properties` file contains the application-specific configuration.
- The `application.properties` file holds general application settings.
- The `pom.xml` file manages dependencies and build configurations.

### 2. Config Utility Class
- The `ConfigUtility` class is used to read and manage configuration settings from the properties files.

### 3.POJO (Plain Old Java Object)
POJOs are used to represent structured data in a Java-centric way. These objects are typically used for serializing and deserializing data, especially when interacting with APIs. They help maintain data integrity and readability by mapping JSON data to Java objects and vice versa.

### 4. Builder Design Pattern for Request and Response Object
- The Builder Design Pattern is employed to construct flexible and customizable API requests. It allows you to create request objects with specific parameters, such as HTTP method, headers, and request body, in a fluent and readable way.
- The Builder Design Pattern is used for constructing API response objects. These response objects encapsulate details like HTTP status codes, headers, and response body data. The pattern simplifies the creation of response objects with different attributes.

### 5. Common Action and Utilities
- The project includes `CommonAction` and `CommonUtilities` classes that provide reusable methods for interacting with web elements and performing common actions.

### 6. Cucumber Feature Files and Step Definitions
- Cucumber feature files are used to define test scenarios using Gherkin syntax, which is human-readable.
- Step definitions map Gherkin's steps to automation code and utilize the Page Object Model (POM) for interaction with web elements.

### 7. Hooks
- Hooks (e.g., `Before` and `After` hooks) handle setup and teardown tasks for test scenarios.
- Setup tasks may include initializing the web driver or navigating to a specific page.
- Teardown tasks may include closing the browser or logging test results.

### 8. Runner (TestNG or JUnit)
- Tests are executed using test runners like TestNG or JUnit, depending on your preference.
- Parallel test execution can be configured for faster test execution.

### 9. Logging
- Logging is implemented to capture important events, actions, and errors during test execution.
- Logs are essential for debugging and troubleshooting.

### 10. Report
- The project includes reporting mechanisms to generate detailed test reports.
- Tools like ExtentReports or Allure can be used to create comprehensive test reports.

## Usage

## Contribution

## License

## Contact Information
If you have any questions, or suggestions, or need assistance with this project, feel free to reach out:

- **Your Name**
  - Email: binitaoffical02@gmail.com 
  - GitHub: https://github.com/binita537/
  - LinkedIn: https://www.linkedin.com/in/binita-rathour-683ba0200/

## Authors
- **Binita Rathour Jagram**
