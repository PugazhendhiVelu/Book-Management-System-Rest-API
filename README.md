# Book-Management-System-Rest-API
This repository contains the source code for a Book Management System, a RESTful API built using Java Spring Boot, Spring Data JPA, and MySQL. The API provides a comprehensive set of web services to manage a collection of books, supporting full CRUD (Create, Read, Update, Delete) operations

API Endpoints
1. Save a Book
Method: POST
URL: http://localhost:8003/
Request Body Example:
json
Copy code
{
    "bookName": "C-Programming",
    "author": "Dennis Ritchie",
    "isbn": "987456321",
    "price": 299.9
}
Description: Adds a new book to the collection.
2. Get All Books
Method: GET
URL: http://localhost:8003/books
Description: Retrieves a list of all books in the collection.
3. Get Book by ID
Method: GET
URL: http://localhost:8003/book/{id}
Example: http://localhost:8003/book/1
Description: Retrieves a specific book by its ID.
4. Get Book by Name
Method: GET
URL: http://localhost:8003/books/name/{bookName}
Example: http://localhost:8003/books/name/Java
Description: Retrieves books that match the specified name.
5. Get Book by Author
Method: GET
URL: http://localhost:8003/books/author/{author}
Example: http://localhost:8003/books/author/James Gosling
Description: Retrieves books written by the specified author.
6. Get Book by ISBN
Method: GET
URL: http://localhost:8003/book/isbn/{isbn}
Example: http://localhost:8003/book/isbn/8795463210
Description: Retrieves a book by its ISBN.
7. Edit Book by ID
Method: PUT
URL: http://localhost:8003/book/{id}
Example: http://localhost:8003/book/1
Request Body Example:
json
Copy code
{
    "price": 259.9
}
Description: Updates the details of a specific book by its ID.
8. Delete Book by ID
Method: DELETE
URL: http://localhost:8003/book/{id}
Example: http://localhost:8003/book/1
Description: Deletes a specific book from the collection by its ID.
