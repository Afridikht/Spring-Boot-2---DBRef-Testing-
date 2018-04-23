# Spring-Boot-2---DBRef-Testing-
Lazy initialization/loading not working after upgrading to 2.0

This Repository is created for expalaining Bug https://jira.spring.io/browse/DATAMONGO-1931

For more explaination, kindly navigate to https://github.com/Afridikht/Spring-Boot-2---DBRef-Testing-/blob/master/MongodbTesting/src/main/java/com/test/service/TestingService.java

You can reproduce same results by 
1.  First creating data for `MainEntity` & `InnerEntity` documents using http://localhost:8080/add with method type `POST`
2.  Retrieve data by calling http://localhost:8080/get with method type `POST`and debug `TestingService`
