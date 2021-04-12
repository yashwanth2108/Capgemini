# Capgemini
Capgemini Content Related to Training Period

1. Git
2. MongoDB
3. Core Java

 <br />

## GitHub Commands

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
 
## MongoDB 

* BSON  -> Binary representation of JSON. (Increase speed and more space).

* MongoDB use Collections for Storing Data.

* MongoDB use CAP theorm { Consistency , Availabilty , Partition Tolerance } 

* Patterns in Mongo  -> Schema Versioning , Subset , Computed , Bucket ,  Extended Reference

* default port number : 27017

## Mongo Shell Commands

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


## Aggregation  

### match

db.Person.aggregate([{ $match: {tags : { $size : 3 } }}])

### group

db.Person.aggregate([{ $group : { _id : { age : "$age" , gender : "$gender" } } }])

### project

db.getCollection('Person').aggregate([{$project : {name : 1}])

### sort

db.getCollection('Person').aggregate([{$sort : {name : 1}])

### count

db.Person.aggregate([{ $count: "age" }])

db.Person.aggregate([{ $count: "age" }]).toArray().length

db.Person.aggregate([{ $count: "age" }]).itcount()                                                               --> faster

db.Person.aggregate([{ $count: "total" }])

db.Person.find({}).count()                                                                                      --> much faster

### limit

db.getCollection('Person').aggregate([ { $limit :  100 } , { $sort : {name : 1}])


### unwind

db.Person.aggregate([{ $unwind: "$Array" },{$Project : {age : 1, name : 1}}])


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

AbstractApplicationContext.registerShutdownHook() : it runs when application ends , its time to destroy all beans


implements IntializerBean , had function afterPropertiesSet()
implements DisplosableBean , had function destroy()


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

###### <context:annotation-config/>

###### <context:component-scan base-package=""/>

### Annotations 

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










## Built With

* [Git](https://git-scm.com/downloads) - Git is software for tracking changes in any set of files.  
* [MongoDB](https://www.mongodb.com/) - MongoDB Atlas comes with built-in operational best practices so you can focus on delivering business value and accelerating application development instead of managing databases
* [Intellij](https://www.jetbrains.com/idea/download/) - IntelliJ IDEA is an integrated development environment written in Java for developing computer software. It is developed by JetBrains, and is available as an Apache 2 Licensed community edition, and in a proprietary commercial edition.
* [JDK](https://www.oracle.com/in/java/technologies/javase-jdk15-downloads.html) - The Java Development Kit is an implementation of either one of the Java Platform, Standard Edition, Java Platform, Enterprise Edition, or Java Platform, Micro Edition platforms released by Oracle Corporation in the form of a binary product aimed at Java developers on Solaris, Linux, macOS or Windows.
