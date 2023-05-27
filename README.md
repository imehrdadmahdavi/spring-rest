# **Spring REST API Demo**

This repository contains a simple Spring Boot application that demonstrates the features of Spring REST. It utilizes an in-memory H2 database to store information about dogs and exposes RESTful endpoints to interact with the data.

## **Tech Stack**

- Spring Boot
- Spring REST
- H2 Database
- Maven
- Java

## **System Requirements**

- JDK 17 or later
- Maven 3.0+

## **Setup and Installation**

1. Clone the repository or download the source code.
2. Open your terminal or command prompt and navigate to the root directory of the project.
3. Run the following command to build the project and install dependencies:
    
    ```
    ./mvnw clean install
    ```
    
4. After a successful build, navigate to the **`target`** directory, where you will find the executable JAR file.

## **How to Run the Application**

1. You can run the application directly from the command line using the following command:
    
    ```
    java -jar target/bootstrap-0.0.1-SNAPSHOT.jar
    ```
    
2. The application will start running at **[http://localhost:8080](http://localhost:8080/)**.

## **Usage**

Use a REST client or the **`curl`** command to interact with the RESTful APIs provided by the application.

- To get a list of all dogs, send a GET request to the endpoint **`/dogs`**. Example:
    
    ```
    curl http://localhost:8080/dogs
    ```
    
- To get a list of all dog breeds, send a GET request to the endpoint **`/dogs/breed`**. Example:
    
    ```
    curl http://localhost:8080/dogs/breed
    ```
    
- To get the breed of a dog by its ID, replace **`{id}`** with the ID of the dog in the endpoint **`/{id}/breed`**. Example:
    
    ```
    curl http://localhost:8080/1/breed
    ```
    
- To get a list of all dog names, send a GET request to the endpoint **`/dogs/name`**. Example:
    ```
    curl http://localhost:8080/dogs/name
    ```
- To connect to H2 database dashboard. Open your web browser and go to `http://localhost:8080/h2`. This is the default H2 database console URL for a Spring Boot application.
 In the H2 login page, make sure the following settings are configured:
  - **JDBC URL:** `jdbc:h2:mem:dogdata`
  - **Username:** `sa`
  - **Password:** (Leave it empty or use the default value)
  - Click on the "Connect" button to access the H2 database console.
    

## **Directory Structure**

- **`src/main/java/sh/mehrdad/springrest`**: This directory contains the main Java code for the project. It consists of the following components:
    - **`controller`**: This package contains the **`DogController`** class, which exposes the RESTful API endpoints.
    - **`service`**: This package contains the **`DogService`** class, which handles business logic for processing requests and interacting with the repository.
    - **`repository`**: This package contains the **`DogRepository`** interface, which provides methods for querying the database.
    - **`entity`**: This package contains the **`Dog`** entity class, representing the data stored in the database.
    - **`exception`**: This package contains the **`DogNotFoundException`** class, an exception thrown when a dog with a specified ID cannot be found.
- **`src/main/resources`**: This directory contains application configuration file and database schemas.
- **`src/test`**: This directory contains tests for the application.
- **`target`**: This directory contains the output of the build process.
- **`pom.xml`**: This is the Project Object Model (POM) file in Maven, which defines the project and its configuration details used by Maven to build the project.

## **Architectural Diagram**

```
DogController ----> DogService ----> DogRepository ----> Dog Table in H2 Database
      |
      v
DogNotFoundException
```