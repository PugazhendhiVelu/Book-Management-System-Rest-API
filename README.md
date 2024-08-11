# Book-Management-System-Rest-API
This repository contains the source code for a Book Management System, a RESTful API built using Java Spring Boot, Spring Data JPA, and MySQL. The API provides a comprehensive set of web services to manage a collection of books, supporting full CRUD (Create, Read, Update, Delete) operations

## MySQL Configuration

Ensure you have MySQL installed and running. Update the following properties in your `application.properties` file to configure the connection to your MySQL database:

```properties
# MySQL database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore      //Here it is if you want to change the database name
spring.datasource.username=root
spring.datasource.password=pugazh //use your password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

## Testing the API

You can test the Book Management System API using tools like [Postman](https://www.postman.com/) or [Insomnia](https://insomnia.rest/). These tools allow you to easily send HTTP requests to the API and inspect the responses.

## API Endpoints

### 1. **Save a Book**
   - **Method:** `POST`
   - **URL:** `http://localhost:8003/`
   - **Request Body Example:**
     ```json
     {
         "bookName": "C-Programming",
         "author": "Dennis Ritchie",
         "isbn": "987456321",
         "price": 299.9
     }
     ```
   - **Description:** Adds a new book to the collection.

### 2. **Get All Books**
   - **Method:** `GET`
   - **URL:** `http://localhost:8003/books`
   - **Description:** Retrieves a list of all books in the collection.

### 3. **Get Book by ID**
   - **Method:** `GET`
   - **URL:** `http://localhost:8003/book/{id}`
   - **Example:** `http://localhost:8003/book/1`
   - **Description:** Retrieves a specific book by its ID.

### 4. **Get Book by Name**
   - **Method:** `GET`
   - **URL:** `http://localhost:8003/books/name/{bookName}`
   - **Example:** `http://localhost:8003/books/name/Java`
   - **Description:** Retrieves books that match the specified name.

### 5. **Get Book by Author**
   - **Method:** `GET`
   - **URL:** `http://localhost:8003/books/author/{author}`
   - **Example:** `http://localhost:8003/books/author/James Gosling`
   - **Description:** Retrieves books written by the specified author.

### 6. **Get Book by ISBN**
   - **Method:** `GET`
   - **URL:** `http://localhost:8003/book/isbn/{isbn}`
   - **Example:** `http://localhost:8003/book/isbn/8795463210`
   - **Description:** Retrieves a book by its ISBN.

### 7. **Edit Book by ID**
   - **Method:** `PUT`
   - **URL:** `http://localhost:8003/book/{id}`
   - **Example:** `http://localhost:8003/book/1`
   - **Request Body Example:**
     ```json
     {
         "price": 259.9
     }
     ```
   - **Description:** Updates the details of a specific book by its ID.

### 8. **Delete Book by ID**
   - **Method:** `DELETE`
   - **URL:** `http://localhost:8003/book/{id}`
   - **Example:** `http://localhost:8003/book/1`
   - **Description:** Deletes a specific book from the collection by its ID.
