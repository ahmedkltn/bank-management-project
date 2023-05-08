# Bank Management System

This Java project is a simple bank management system with a graphical user interface (GUI). The application consists of 7 different frames:

- **Login frame**: Allows the user to log in using their username and password, which are stored in a MySQL database.
- **Home page frame**: Displays different buttons that allow the user to navigate to other frames, including adding a client, consulting a client, inserting money, removing money, and deleting a client from the database.
- **Add client frame**: Allows the user to add a new client to the database, with fields for their ID, CIN, name, surname, email, phone number, and balance.
- **Consult client frame**: Allows the user to search for a client in the database by their CIN, and displays their information if found.
- **View the client frame**: Displays a table with the client informations.
- **Insert money frame**: Allows the user to insert money into a client's account by specifying  the amount to be added.
- **Remove money frame**: Allows the user to remove money from a client's account by specifying the amount to be removed.
- **Delete client frame**: Allows the user to delete a client from the database by specifying their CIN.

The application is connected to a MySQL database named "bank", which contains two tables:

- **admin**: Contains the usernames and passwords of authorized users who can log in to the system.
- **client**: Contains the client information, including their ID, CIN, name, surname, email, phone number, and balance.

## Getting started

To use this application, you'll need to have Java and MySQL installed on your computer. You can then follow these steps:

1. Clone this repository to your local machine.
2. Import the MySQL database by running the "database/bank.sql" file included in the repository.
3. Modify the "user" and "password" constants in the "mySQLConnection.java" file to match your MySQL username and password.
4. Compile and run the project using your preferred Java development environment.
