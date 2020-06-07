# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#production-ready)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)



### GraphQL Queries

run the project and hit the localhost:8080/graphiql to see an interface where you can actually test your API.

`localhost:8080/graphiql`

#### Add some data

`mutation{createUser(details:{id:"0001",name:"Smith",age:40,gender:"M",city:"Los Angeles",salary:100000}){
     id
   }
 }`
 
 `mutation{createUsers(details:[
    {id:"0001",name:"Smith",age:40,gender:"M",city:"Los Angeles",salary:100000},
  	{id:"0002",name:"Samuel",age:30,gender:"M",city:"Los Angeles",salary:200000},
    {id:"0003",name:"Joseph",age:33,gender:"M",city:"Chicago",salary:300000},
    {id:"0004",name:"Andrea",age:33,gender:"F",city:"Chicago",salary:800000}
  ]){ id } }`
 
#### Query by user id
`query {
   getUser(userId:"001"){
     id, 
     name
 }}` 

`query {
    getAllUser{
      id, 
      name
  }}`
