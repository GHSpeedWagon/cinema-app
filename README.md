# 🎬cinema-app🎬
___
## 📄Short description
___Cinema-app___ - it is a java web application that uses Hibernate and Spring frameworks.
___
### 📑Full Description📑
Application can create user with post request /register or login old user by /login request.
We can create movies, cinema halls, tickets, movie sessions by user with admin role. 

And create and fill shopping cart for current user.<br />
Also, application can handle (complete) shopping cart orders, check available movies, cinema-halls, movie-sessions, 
and after that shopping cart will be cleared. 
also, we can find out order history.<br />
For more details who can create and who can see go here -> [link](src/main/java/spring/config/SecurityConfig.java)
___
### 🛠Available endpoints🛠
+ POST: /register - all - **create new user**
+ GET: /cinema-halls - user/admin - **for check available cinema-halls**
+ POST: /cinema-halls - admin - **for create new cinema-hall**
+ GET: /movies - user/admin - **for check available movies**
+ POST: /movies - admin - **for create new movie**
+ GET: /movie-sessions/available - user/admin <br />
  **- for check available sessions**
+ POST: /movie-sessions - admin - **for create new session**
+ PUT: /movie-sessions/{id} - admin - **for update session by id**
+ DELETE: /movie-sessions/{id} - admin - **for delete session by id**
+ GET: /orders - user <br />
**- for check orders history for current user that was logged** 
+ POST: /orders/complete - user - **for complete order**
+ PUT: /shopping-carts/movie-sessions - user <br />
**- for add movie session to shopping cart**
+ GET: /shopping-carts/by-user - user <br />
**- for check shopping cart for user**
+ GET: /users/by-email - admin - **for check available user by his email**
___
### Schema
![schema](Hibernate_Cinema_Uml.png)
___
### Technologies used 

|   Technology  |    Version |
|-----|-----|
|   JDK   |   11   |
|   Spring  |   5.2.2 |
|  Spring Security   |   5.2.2 |
|   Spring Web  |   5.2.2 |
|   TomCat  |  9.0.69 |
|   Hibernate  |   5.4.27.Final |
|   Maven  |  3.8.6 |
|  MySQL   |  8.0.22 |

___
### 💻🛠Local set up tutorial💻🛠
1. Download TomCat with 9.0.69 (_IMPORTANT_) 
   + chose local server
   + press fix and chose 'cinema-app:war'
2. Change needed data into [db.properties](src/main/resources/db.properties) file
3. (optionally) Change 32nd, 33rd lines (email and password value)
in [DataInitializer.java](src/main/java/spring/config/DataInitializer.java) class, or you can change it in your database workspace
4. open Postman on pc, and use it for some request types

