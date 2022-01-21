# Simple Login App

A simple login app built using Spring Framework (Java) and Bootstrap.

Spring (v2.6.2) Dependencies:
* Spring Web
* Thymeleaf
* Spring Security
* Spring Data JPA
* MySQL Driver
* Lombok

Database:
* MySQL 8.0.23

### Getting Started
* Clone/Download this repository and open it in any IDE (IntelliJ recommended).
* Setup an empty database in MySQL with the following parameters (specified in `application.properties`):
  * Database Name: logindb
  * Username: root
  * password: qwer1234
  * port: 3306

OR
* Edit the following parameters `application.properties` located in `src/main/resources` according
your database configuration:
  * `spring.datasource.url`
  * `spring.datasource.username`
  * `spring.datasource.password`


* Database tables will be created upon application first run by Spring Data JPA
* SQL statements to execute:
```
INSERT INTO `user` (`user_name`, `name`, `password`, `is_enabled`) VALUES ('alice', 'Alice A.', '$2a$10$isFmNWrRuOhBidzIQwVzeuFnBIY180vEkkRa/rw3jYjqQQOH7H5wC', TRUE);
INSERT INTO `user` (`user_name`, `name`, `password`, `is_enabled`) VALUES ('bob', 'Bob B.', '$2a$10$VyXDUdNvT.4dlMJnQU8L5.GUwS7hARDxKIaV0LbWyjxdrqutz2azm', TRUE);
INSERT INTO `user` (`user_name`, `name`, `password`, `is_enabled`) VALUES ('charlie', 'Charlie C.', '$2a$10$vkxPB2hXaRIPQF58I8DmTeDbc1Z.frRm7DtyjU6wkWgobeDsMAbwi', TRUE);
INSERT INTO `user` (`user_name`, `name`, `password`, `is_enabled`) VALUES ('david', 'David D', '$2a$10$FC/vajAWKBi9X4ZMDV37Fe1TEosv1qWkSfd00ciwrTyI1ojD4RP1y', TRUE);

INSERT INTO `role` (`role_name`) VALUES ('MANAGER');
INSERT INTO `role` (`role_name`) VALUES ('USER');

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES(1, 1);
INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES(2, 2);
INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES(3, 1);
INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES(4, 2);
```
* Demo Accounts:

| Username | Password   | Role    |
|----------|------------|---------|
| alice    | alice123   | MANAGER |
| bob      | bob456     | USER    |
| charlie  | charlie135 | MANAGER |
| david    | david246   | USER    |

* Start Spring Boot Application either through IDE or navigate to project folder and issuing the following command:
  * `./mvnw spring-boot:run` (MacOS/Linux)
  * `mvnw spring-boot:run` (Windows)


* Access the Login Page through `localhost:8080` using any browser.