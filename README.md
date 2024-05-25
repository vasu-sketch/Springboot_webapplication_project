# Springboot_webapplication_project
# ProductSpringweb

## Description

ProductSpringweb is a Spring Boot web application that provides a RESTful API for managing products. The application uses Spring Data JPA to interact with a PostgreSQL database.

## Features

- Add a new product
- Retrieve all products

## Technologies Used

- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher
- PostgreSQL

## Setup

### Database Setup

1. Install PostgreSQL and create a database named `Exam`.
2. Update the database configuration in `src/main/resources/application.properties`:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/Exam
    spring.datasource.username=postgres
    spring.datasource.password=123456
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

### Project Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/ProductSpringweb.git
    cd ProductSpringweb
    ```

2. Build the project using Maven:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    mvn spring-boot:run
    ```

The application should now be running on `http://localhost:8080`.

## API Endpoints

### Add a New Product

- **URL:** `/product`
- **Method:** `POST`
- **Content-Type:** `application/json`
- **Request Body:**

    ```json
    {
        "name": "Product Name",
        "type": "Product Type",
        "warranty": 12,
        "place": "Place"
    }
    ```

- **Response:** `200 OK` if the product is added successfully.

### Retrieve All Products

- **URL:** `/products`
- **Method:** `GET`
- **Response:**

    ```json
    [
        {
            "id": 1,
            "name": "Product Name",
            "type": "Product Type",
            "warranty": 12,
            "place": "Place"
        },
        ...
    ]
    ```

## Example Usage

### Add a Product using Postman

1. Open Postman.
2. Create a new `POST` request.
3. Set the URL to `http://localhost:8080/product`.
4. Set the request body to `raw` and select `JSON`.
5. Add the following JSON to the request body:

    ```json
    {
        "name": "Laptop",
        "type": "Electronics",
        "warranty": 24,
        "place": "Office"
    }
    ```

6. Click `Send`.

### Retrieve All Products using Postman

1. Open Postman.
2. Create a new `GET` request.
3. Set the URL to `http://localhost:8080/products`.
4. Click `Send`.

## Project Structure



