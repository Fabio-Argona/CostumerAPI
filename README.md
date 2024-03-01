## Connection to h2 database

### http://localhost:8080/h2-console

spring.datasource.url=jdbc:h2:mem:db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.h2.console.enable=true
spring.h2.console.path=/h2-console

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.format_sql=true

![image](https://github.com/Fabio-Argona/CostumerAPI/assets/128233610/2ec9f3ba-f81f-49b8-9f9d-aed87d6f6baf)
