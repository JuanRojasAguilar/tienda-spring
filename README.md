# Store management app in SpringBoot + NextJs

This project is part of a suite of study projects. Made on Spring-boot and NextJs using connection to a PostgreSQL Database.

# Backend

The backend consists in 5 different tables.

1. Category
2. Customer
3. Product
4. Product sale
5. Sale

## aplication.properties

>This is a copy of the environment variables in a dev environment

spring.application.name=frontend
spring.datasource.url=jdbc:postgresql://localhost:5432/juanro
spring.datasource.username=postgres
spring.datasource.password=campus2023
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create

# Frontend

Run the project with

`npm rum dev`

It will run at port 3000 (if available).
spring.application.name=frontend
spring.datasource.url=jdbc:postgresql://localhost:5432/juanro
spring.datasource.username=postgres
spring.datasource.password=campus2023
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create


