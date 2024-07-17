Spring Boot Simple API Exercise

Description:
This project implements a RESTful API using Spring Boot to manage a collection of books.
The API supports CRUD operations: Create, Read, Update, and Delete.

Project Setup
Port: Running on http://localhost:8080/books
JDBC URL =jdbc:h2:file:C:/Users/Niveditha A S/test/testdb
User Name: sa
Password: password

API Endpoints

Get all Books
URL: GET /books
Description: Retrieves a list of all books stored in the database.
Example: http://localhost:8080/books

Get a Book by ID
URL: GET /books/{id}
Description: Retrieves a specific book by its unique identifier.
Example: http://localhost:8080/books/1

Post - Create a new Book
URL: http://localhost:8080/books
Description: Adds a new book to the database.

Example Request Body: json
{
  "title": "	The Girl In Room 504",
  "author":	"Chethan Bhagat",
  "isbn": "1234456"
}

PUT - Update a Book
URL: http://localhost:8080/books/1
Description: Updates an existing book's details.


Delete a Book
URL: http://localhost:8080/books/1
Description: Deletes a book from the database.


Check the response
If Book Id is not found :- It will return 404 Not Found Custom Exception(Resource Not Found) with message "Book not found with id : {bookId}" and status code 404.
If Book Id is found :- It will return 200 OK with the response.
