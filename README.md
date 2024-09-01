**Lendo APIs Application**

**Overview**
The Lendo APIs Application is a Spring Boot-based project designed to provide a set of RESTful APIs. It includes JWT token generation for secure API access and other functionalities. This project uses modern Spring Boot features and best practices for building robust and scalable applications.

**Features**

**JWT Token Generation:**
Securely generates JWT tokens for user authentication and authorization.

**Spring Boot Integration:**
Leverages Spring Boot's features for easy configuration and deployment.

**Secure Token Storage:**
Utilizes environment variables for managing sensitive configuration values.

**Prerequisites**
Before running the application, ensure you have the following installed:

Java 17 (or higher)
Maven (for building the project)
Spring Boot (the project is built using Spring Boot)

**Configuration**

**JWT Token Configuration**

The application uses a JWT token for authentication. The token is generated using a secret key and is signed with the HS256 algorithm.

**Secret Key**
The secret key used for signing JWT tokens is stored in the SECRET_KEY constant. Ensure that this key is kept secure and not exposed publicly.

**API Access Token**
An API access token can be configured using the following VM argument in your IDE or server configuration:

-Dapi.access.token=API_ACCESS_TOKEN

Replace API_ACCESS_TOKEN with your actual token value.

**Running the Application**

**Build the project using Maven:**
mvn clean install


**Run the application:**
mvn spring-boot:run

**Contact:**
For any questions or support, please contact ammarmghazali@gmail.com


