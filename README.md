# Ecommerce-Web-Application-sak
"The E-Commerce Application is built using Java and Spring Boot, emphasizing security, scalability, and ease of maintenance. The backend leverages Spring Data JPA for seamless interaction with a MySQL database, efficiently managing entities such as users, products, categories, and orders. User authentication is securely handled by Auth0, ensuring a reliable means of accessing REST APIs."
----------
the api are documented on swagger UI , one can access and understand the api well 
----------
# Content
User
- Registration & Login
- Fetch categories and products based on category
- Adding & deleting products to cart
- Managing address and products quantity
- Ordering products and fetching order status

 Admin:-
- Login
- Users
- Address
- Categories
- Products
- Price & discount
- Orders
# Technologies:
- Java 17 or above
- Spring Boot 3.0
- Maven
- MySQL
- Spring Data JPA
 - Spring Security
- JSON Web Tokens (JWT)
 - Auth0
 - Swagger UI
- -------------
# Security
The API is secured using JSON Web Tokens (JWT) handled by Auth0. To access the API, you will need to obtain a JWT by authenticating with the /login endpoint. The JWT should then be passed in the Authorize option available in the Swagger-ui.
--------------
Example:
Authorization: <your_jwt>

------------
# Running the App
- Click File > Import...
- Select Maven > Existing Maven Projects and click Next
- Browse to the project directory and click Finish
- Update the values in application.properties with your MySQL database connection details.
- Run the app: Right-click the project in the Package Explorer and click Run As > Spring Boot App.
  ---------
 # API documentation
     API documentation is available via Swagger UI at http://localhost:8080/swagger-ui/index.html

  -----------
  # Swagger-ui
  ![ecomer-sak](https://github.com/user-attachments/assets/bd697027-377d-4189-a00b-ee61f4058b2f)
<img width="947" alt="2nd swagger" src="https://github.com/user-attachments/assets/17ad1d1c-cbac-46be-9c1a-ff74ed69bcfe">
-----
<img width="947" alt="3nd-eco" src="https://github.com/user-attachments/assets/e1fa708d-cca0-4f36-a47a-e77aac988b94">
-----
<img width="947" alt="0999-cemm" src="https://github.com/user-attachments/assets/7048873b-a865-4f14-8423-afe39f068b14">

# ER diagram




<img width="605" alt="erdiagram" src="https://github.com/user-attachments/assets/94039c51-1722-4ed8-a365-563258fa1d48">
