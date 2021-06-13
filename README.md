# Capgemini
Capgemini Content Related to Training Period

1. Git
2. MongoDB
3. Core Java
4. Spring Framework

 <br />

## GitHub Commands

```javascript
* git status                                                                  -> status

* git config --gobal user.username                                            -> add git username

* git config --gobal user.email                                               -> add git email

* git config --local user.username                                            -> add local device user

* git commit -m  "comment that show after compeletion"                        -> data commit

* git remote add origin Add_Link                                              -> Adding github repository link

* git push origin master/main                                                 -> push all data from local folder to git rep 

* git init                                                                    -> initialize git

* git add File_name                                                           -> add file 

* git add -A                                                                  ->add all file

* git difftool Head                                                           -> diff b/w local ana workspace

* git difftool                                                                -> diff b/w index stage and 

* git checkout Branch_name/master                                             -> switch b/w branches

* git pull origin master/main                                                 -> remote to workspace

* git commit -a                                                               -> add and commit both

* git fetch                                                                   -> remote to local rep

* git merge                                                                   -> local to workspace

* git log -all --decorate --oneline --graph                                   -> check the head of branch

* git branch Branch_name                                                      -> create Branch

* git merge Branch_name                                                       -> merge branch in master / other branch

* git branch --merged                                                         -> how many branch get merged

* git branch -D Branch_name                                                   -> force delete branch

* git branch -d Branch_name                                                   -> delete branch

* git checkout -b branch_name                                                 -> create and checkout the branch

* git checkout 965f32a                                                        -> check status of particular state and this is called detached head not pointing to master

* git stash                                                                   -> we can save new change to file and we will apply those changes in future

* git stash list -p                                                           -> list all stash new change

* git stash apply stash@{number}                                              -> which stash u applying

* git stash apply

* git stash save "message"

* git stash list

* git checkout -b testing-rebase

* git rebase master

 <br />
 ```
 
## MongoDB 

* BSON  -> Binary representation of JSON. (Increase speed and more space).

* MongoDB use Collections for Storing Data.

* MongoDB use CAP theorm { Consistency , Availabilty , Partition Tolerance } 

* Patterns in Mongo  -> Schema Versioning , Subset , Computed , Bucket ,  Extended Reference

* default port number : 27017

## Mongo Shell Commands

```javascript
* show dbs -> show databases

* use first-test  -> u can use an Database that doesn't exist

* db.users.insertOne( { Name : 'Manav' , Age ; 29 } ) -> add one object to data

* db.users.insertMany( [ { Name : 'Manav' , Age ; 29 } , { Name : 'Manav' , Age ; 29 } ] ) -> add Many object to data

* show collections  -> show all collections we created (record)

* db.collections -> give name to inplace of collections to record holder

* db.users.find()  -> find record inside

* db.users.find( { Age : { $gt : 29 } } )  ->find data of Age is greater than 29  | gt = greatert than , lt = lower than ,  gte = greater than and equal to

* db.users.insertOne({name: {F_Name : 'Manav' , L_Name: 'Verma' },Age : 31 })

* db.users.find({"name.F_Name" : 'Manav'}) -> find sub record like name to first name

* db.users.update({name:'Manav'},{$set : {Age: 30}}) -> update record

* db.users.deleteOne({name: 'Manav Verma'})  ->delete one record

* db.createCollection('Books')  -> create Collection 

* db.dropDatabase() -> drop database

* db.createCollection('Name',{ capped : true , size: give_size , max : give_limit })                           -> CApped Collection , it will limit the collection size

* db.users.find( { $or: [ { name : 'Manav' } , {  Age : {$gt : 29 } } ] } )                                    -> filter using Or and And opretator 
```

## Aggregation  

### match

```javascript
db.Person.aggregate([{ $match: {tags : { $size : 3 } }}])
```
### group
```javascript
db.Person.aggregate([{ $group : { _id : { age : "$age" , gender : "$gender" } } }])
```
### project
```javascript
db.getCollection('Person').aggregate([{$project : {name : 1}])
```
### sort
```javascript
db.getCollection('Person').aggregate([{$sort : {name : 1}])
```
### count
```javascript
db.Person.aggregate([{ $count: "age" }])

db.Person.aggregate([{ $count: "age" }]).toArray().length

db.Person.aggregate([{ $count: "age" }]).itcount()                                                               --> faster

db.Person.aggregate([{ $count: "total" }])

db.Person.find({}).count()                                                                                      --> much faster
```
### limit
```javascript
db.getCollection('Person').aggregate([ { $limit :  100 } , { $sort : {name : 1}])
```

### unwind
```javascript
db.Person.aggregate([{ $unwind: "$Array" },{$Project : {age : 1, name : 1}}])
```

 <br />
 
## Java

### Transient Keyword

it is used when u don't want to save value of any variable at the time serialization , it will give default values

### List : interface

* ArrayList

* Vector

* LinkedList

* CopyOnWriteArrayList


### Map : Interface

HashMap : default capacity is 16 , when u enter 13 element then size increase by 2^n , n = 4 iniitially  m = number of entries , n = size of hash map
default value of arraylist and vector is 10 but it increase by 50% and twice


### Useful Interfaces 

* Consumer 

* Predicate 

* Supplier 

* Function



### Development Tools

* PMD

* FindBugs

* CheckStyle

* SonarQube

* Jacoco

<br />

## Java 11 New Features

```javascript
* List.toArray( String[]::new )

* Files.readString( Path.of(path) )

* Files.writeString( Path.of(path) , "Write text here",options)

* HttpRequest , HttpClient , HttpResponse Class

* Local Type : var

* Optional.isEmpty()

* java Demo.java  ->  run without .class file

* String.isBlank()

* String.lines()

* String.Strip()

* String.stripLeading()

* String.stripTrailing()

* String.Repeat(number)

* JUnit Testing
```

### Maven dependencies for Junit

* junit-jupiter-api

* junit-jupiter-engine

* junit-vintage-engine


 <br />
 
## Spring Core

### scope  

* singleton

* prototype


#### parent : inherit some bean property
#### merge : for merge inherited list 

```javascript
AbstractApplicationContext.registerShutdownHook() : it runs when application ends , its time to destroy all beans

implements IntializerBean , had function afterPropertiesSet()
implements DisplosableBean , had function destroy()
```

### Post Processors Methods

#### XML Based :

* init-method 

* destroy-method 

* default-init-method 

* default-destroy-method 

### Post Processor Interfaces

* implements BeanPostProcessor : perform things after or before bean initialization

* implements BeanFactoryPostProcessor : perform things after bean initialization


### XML Config and Scan

```javascript
<context:annotation-config/>

<context:component-scan base-package=""/>
```

### Annotations 

```javascript
* @Required
* @Autowired
* @Qualifier("id")
* @Resource(name="id")
* @PostConstruct
* @PreDestroy
* @Component
* @Service
* @Repository
* @Controller
```

### Bean Life Cycle

Spring Container --> Lodout Bean Definition --> Instantiate Bean --> dependencies injection --> BeanNameAware --> BeanFactoryAware --> ApplicationContextAware --> BeanPostProcessors -->  Method with PostConstruct --> InitializingBean --> Custom Configured with init-method --> Your Code Processing --> Method with PreDestroy -->  destroy Bean --> Custom Configured with destroy-method


### Aspect Oriented Programming (AOP)

AOP is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns.

### terminologies

* Aspect  --> cross cutting method 

* Join Point  --> methods 

* Advice  -->  action taken by ascpect on the join points  

* Pointcut  --> matches the fucntion to call


### Spring AOP dependencies

* aspectjrt

* spring aop

* aspectjweaver

## Maven

Building a software project typically consists of such tasks as downloading dependencies, putting additional jars on a classpath, compiling source code into binary code, running tests, packaging compiled code into deployable artifacts such as JAR, WAR, and ZIP files, and deploying these artifacts to an application server or repository.

Apache Maven automates these tasks, minimizing the risk of humans making errors while building the software manually and separating the work of compiling and packaging our code from that of code construction.

In this tutorial, we're going to explore this powerful tool for describing, building, and managing Java software projects using a central piece of information — the Project Object Model (POM) — that is written in XML.

### Project Object Model
The configuration of a Maven project is done via a Project Object Model (POM), represented by a pom.xml file. The POM describes the project, manages dependencies, and configures plugins for building the software.

The POM also defines the relationships among modules of multi-module projects. Let's look at the basic structure of a typical POM file:

```javascript
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.5.1</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.aws</groupId>
    <artifactId>aws-dynamoDB</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>war</packaging>
    <name>aws-dynamoDB</name>
    <description>Demo project for Spring Boot</description>
    <properties>
        <java.version>11</java.version>
        <spring-cloud.version>Hoxton.BUILD-SNAPSHOT</spring-cloud.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>com.amazonaws</groupId>
            <artifactId>aws-java-sdk-dynamodb</artifactId>
            <version>1.12.4</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>2.5.0</version>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>
```
### Dependencies
These external libraries that a project uses are called dependencies. The dependency management feature in Maven ensures automatic download of those libraries from a central repository, so you don't have to store them locally.

This is a key feature of Maven and provides the following benefits:

uses less storage by significantly reducing the number of downloads off remote repositories
makes checking out a project quicker
provides an effective platform for exchanging binary artifacts within your organization and beyond without the need for building artifact from source every time
In order to declare a dependency on an external library, you need to provide the groupId, artifactId, and the version of the library. Let's take a look at an example:

```javascript
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>4.3.5.RELEASE</version>
</dependency>
```
As Maven processes the dependencies, it will download Spring Core library into your local Maven repository.

### Repositories
A repository in Maven is used to hold build artifacts and dependencies of varying types. The default local repository is located in the .m2/repository folder under the home directory of the user.

If an artifact or a plug-in is available in the local repository, Maven uses it. Otherwise, it is downloaded from a central repository and stored in the local repository. The default central repository is Maven Central.

Some libraries, such as JBoss server, are not available at the central repository but are available at an alternate repository. For those libraries, you need to provide the URL to the alternate repository inside pom.xml file:
```javascript
<repositories>
    <repository>
        <id>JBoss repository</id>
        <url>http://repository.jboss.org/nexus/content/groups/public/</url>
    </repository>
</repositories>
```
Please note that you can use multiple repositories in your projects.

### Properties
Custom properties can help to make your pom.xml file easier to read and maintain. In the classic use case, you would use custom properties to define versions for your project's dependencies.

Maven properties are value-placeholders and are accessible anywhere within a pom.xml by using the notation ${name}, where name is the property.

Let's see an example:
```javascript
<properties>
    <spring.version>4.3.5.RELEASE</spring.version>
</properties>

<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>${spring.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>${spring.version}</version>
    </dependency>
</dependencies>
```
Now if you want to upgrade Spring to a newer version, you only have to change the value inside the<spring.version> property tag and all the dependencies using that property in their <version> tags will be updated.

Properties are also often used to define build path variables:
```javascript
<properties>
    <project.build.folder>${project.build.directory}/tmp/</project.build.folder>
</properties>

<plugin>
    //...
    <outputDirectory>${project.resources.build.folder}</outputDirectory>
    //...
</plugin>
```
### Build
The build section is also a very important section of the Maven POM. It provides information about the default Maven goal, the directory for the compiled project, and the final name of the application. The default build section looks like this:

```javascript
<build>
    <defaultGoal>install</defaultGoal>
    <directory>${basedir}/target</directory>
    <finalName>${artifactId}-${version}</finalName>
    <filters>
      <filter>filters/filter1.properties</filter>
    </filters>
    //...
</build>
```
The default output folder for compiled artifacts is named target, and the final name of the packaged artifact consists of the artifactId and version, but you can change it at any time.

### Using Profiles
Another important feature of Maven is its support for profiles. A profile is basically a set of configuration values. By using profiles, you can customize the build for different environments such as Production/Test/Development:

```javascript
<profiles>
    <profile>
        <id>production</id>
        <build>
            <plugins>
                <plugin>
                //...
                </plugin>
            </plugins>
        </build>
    </profile>
    <profile>
        <id>development</id>
        <activation>
            <activeByDefault>true</activeByDefault>
        </activation>
        <build>
            <plugins>
                <plugin>
                //...
                </plugin>
            </plugins>
        </build>
     </profile>
 </profiles>
 ```
As you can see in the example above, the default profile is set to development. If you want to run the production profile, you can use the following Maven command:

```javascript
mvn clean install -Pproduction
```

## Spring Framework

The Spring Framework is a mature, powerful and highly flexible framework focused on building web applications in Java.

One of the core benefits of Spring is that it takes care of most of the low-level aspects of building the application to allow us to actually focus on features and business logic.

Another strong point is that, while the framework is quite mature and well-established, it's very actively maintained and has a thriving dev community. This makes it quite up to date and aligned with the Java ecosystem right now.

Of course, there's a lot to learn to work well with Spring.

### Spring Boot
Spring Boot is an opinionated addition to the Spring platform, focused on convention over configuration — highly useful for getting started with minimum effort and creating standalone, production-grade applications.

This tutorial is a starting point for Boot, in other words a way to get started in a simple manner with a basic web application.

We'll go over some core configuration, a front-end, quick data manipulation, and exception handling.

#### Setup
First, let's use Spring Initializr to generate the base for our project.

The generated project relies on the Boot parent:

```javascript
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.4.0</version>
    <relativePath />
</parent>
```
The initial dependencies are going to be quite simple:
```javascript
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
</dependency>
```
#### Application Configuration
Next, we'll configure a simple main class for our application:

```javascript
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```
Notice how we're using @SpringBootApplication as our primary application configuration class. Behind the scenes, that's equivalent to @Configuration, @EnableAutoConfiguration and @ComponentScan together.

Finally, we'll define a simple application.properties file, which for now only has one property:

```javascript
server.port=8081
```

 #### Spring Security
  let's add security to our application by first including the security starter:
```javascript
<dependency> 
    <groupId>org.springframework.boot</groupId> 
    <artifactId>spring-boot-starter-security</artifactId> 
</dependency>
 ```
By now, we can notice a pattern: Most Spring libraries are easily imported into our project with the use of simple Boot starters.

Once the spring-boot-starter-security dependency is on the classpath of the application, all endpoints are secured by default, using either httpBasic or formLogin based on Spring Security's content negotiation strategy.

That's why, if we have the starter on the classpath, we should usually define our own custom Security configuration by extending the WebSecurityConfigurerAdapter class:
```javascript
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .anyRequest()
            .permitAll()
            .and().csrf().disable();
    }
}
 ```
In our example, we're allowing unrestricted access to all endpoints.

#### Web and the Controller
Next, let's have a look at a web tier. And we'll start by setting up a simple controller, the BookController.

We'll implement basic CRUD operations exposing Book resources with some simple validation:

 ```javascript
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Iterable findAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/title/{bookTitle}")
    public List findByTitle(@PathVariable String bookTitle) {
        return bookRepository.findByTitle(bookTitle);
    }

    @GetMapping("/{id}")
    public Book findOne(@PathVariable Long id) {
        return bookRepository.findById(id)
          .orElseThrow(BookNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book create(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookRepository.findById(id)
          .orElseThrow(BookNotFoundException::new);
        bookRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
        if (book.getId() != id) {
          throw new BookIdMismatchException();
        }
        bookRepository.findById(id)
          .orElseThrow(BookNotFoundException::new);
        return bookRepository.save(book);
    }
}
 ```
Given this aspect of the application is an API, we made use of the @RestController annotation here — which is equivalent to a @Controller along with @ResponseBody — so that each method marshals the returned resource right to the HTTP response.

Note that we're exposing our Book entity as our external resource here. That's fine for this simple application, but in a real-world application, we'll probably want to separate these two concepts.

#### Error Handling
Now that the core application is ready to go, let's focus on a simple centralized error handling mechanism using @ControllerAdvice:

 ```javascript
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ BookNotFoundException.class })
    protected ResponseEntity<Object> handleNotFound(
      Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "Book not found", 
          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler({ BookIdMismatchException.class, 
      ConstraintViolationException.class, 
      DataIntegrityViolationException.class })
    public ResponseEntity<Object> handleBadRequest(
      Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getLocalizedMessage(), 
          new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
 ```
Beyond the standard exceptions we're handling here, we're also using a custom exception, BookNotFoundException:

 ```javascript
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    // ...
}
 ```
This gives us an idea of what's possible with this global exception handling mechanism. To see a full implementation, have a look at the in-depth tutorial.

Note that Spring Boot also provides an /error mapping by default. We can customize its view by creating a simple error.html:
```javascript
<html lang="en">
<head><title>Error Occurred</title></head>
<body>
    <h1>Error Occurred!</h1>    
    <b>[<span th:text="${status}">status</span>]
        <span th:text="${error}">error</span>
    </b>
    <p th:text="${message}">message</p>
</body>
</html>
 ```
Like most other aspects in Boot, we can control that with a simple property:
```javascript
server.error.path=/error2
 ```
#### Testing
Finally, let's test our new Books API.

We can make use of @SpringBootTest to load the application context and verify that there are no errors when running the app:
```javascript
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringContextTest {

    @Test
    public void contextLoads() {
    }
}
 ```
Next, let's add a JUnit test that verifies the calls to the API we've written, using RestAssured:

 ```javascript
public class SpringBootBootstrapLiveTest {

    private static final String API_ROOT
      = "http://localhost:8081/api/books";

    private Book createRandomBook() {
        Book book = new Book();
        book.setTitle(randomAlphabetic(10));
        book.setAuthor(randomAlphabetic(15));
        return book;
    }

    private String createBookAsUri(Book book) {
        Response response = RestAssured.given()
          .contentType(MediaType.APPLICATION_JSON_VALUE)
          .body(book)
          .post(API_ROOT);
        return API_ROOT + "/" + response.jsonPath().get("id");
    }
}
 ```


## Built With

* [Git](https://git-scm.com/downloads) - Git is software for tracking changes in any set of files.  
* [MongoDB](https://www.mongodb.com/) - MongoDB Atlas comes with built-in operational best practices so you can focus on delivering business value and accelerating application development instead of managing databases
* [Intellij](https://www.jetbrains.com/idea/download/) - IntelliJ IDEA is an integrated development environment written in Java for developing computer software. It is developed by JetBrains, and is available as an Apache 2 Licensed community edition, and in a proprietary commercial edition.
* [JDK](https://www.oracle.com/in/java/technologies/javase-jdk15-downloads.html) - The Java Development Kit is an implementation of either one of the Java Platform, Standard Edition, Java Platform, Enterprise Edition, or Java Platform, Micro Edition platforms released by Oracle Corporation in the form of a binary product aimed at Java developers on Solaris, Linux, macOS or Windows.
* [Maven](https://maven.apache.org/download.cgi) - Maven is a build automation tool used primarily for Java projects. Maven can also be used to build and manage projects written in C#, Ruby, Scala, and other languages. The Maven project is hosted by the Apache Software Foundation, where it was formerly part of the Jakarta Project.
 * [Spring Intializer](https://start.spring.io/) - Spring Initializr Build Status · initializr · Basic language generation for Java, Kotlin and Groovy. · Build system abstraction with implementations for Apache Maven.
