CREATE TABLE Author (
    author_id INT PRIMARY KEY,
    name VARCHAR(100));

CREATE TABLE Book (
    book_id INT PRIMARY KEY,
    title VARCHAR(200),
    author_id INT,
    FOREIGN KEY (author_id) REFERENCES Author(author_id));

CREATE TABLE Member (
    member_id INT PRIMARY KEY,
    name VARCHAR(100));

CREATE TABLE Borrow (
    borrow_id INT PRIMARY KEY,
    member_id INT,
    book_id INT,
    borrow_date DATE,
    FOREIGN KEY (member_id) REFERENCES Member(member_id),
    FOREIGN KEY (book_id) REFERENCES Book(book_id));