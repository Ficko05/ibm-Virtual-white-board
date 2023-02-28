# ibm-Virtual-white-board

### Filip Filipovic

### Role: Backend

#### How to run:

The database is run in a docker container. To run the container run this command 

> docker compose up -d

Although I would have loved to dockerized the spring application and make it easier to run, I did not have time to learn to do so. So you need an IDE that supports Spring and Java to run the allocation.

I used Liquibase to migrate all the SQL tables, and soon as you run the project it should populate the database with all the necessary tables and data.

#### Language:

I choose to create the application in Java spring boot since I have a deeper understanding and knowledge of the Spring framework.
Altho spring shines in distributed systems architecture, it is still a viable choice for monolithic applications.

#### ER-Diagram:

Here is the ER diagram I made for Virtual white board, there were many iterations, and I'm not totally satisfied.

As seen in the diagram there is a table called login which I added at the end and didn't have time to incorporate into the project.
 

![Alt text](./documentation/ER-digagram.jpg "Optional title")
