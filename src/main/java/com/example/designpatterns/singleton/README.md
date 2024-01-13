# Singleton Design Pattern
When we want to create a single instance of the object, we can use Singleton design patterns.

It is mainly used in load heavyweight objects and loads them only once and is used multiple times like DB connection, Resources, etc.

We can create Singleton in multiple ways.

* Eager Initialization: Here, we will initialize the object in the constructor or when we initialize the class. We can use this pattern if we are sure that the object will be used in the application.
```java
class SingletonApp{
    
    private static SingletonApp instance = new SingletonApp();
    
    private SingletonApp(){
        
    }
    
    public SingletonApp getInstance(){
        return instance;
    }
}
```
* Lazy Initialization: If we are not clear whether object can be used or not in the application, we can go with Lazy Initialization.
```java
class SingletonApp{
    
    private static SingletonApp instance = null;
   
    private SingletonApp(){

    }
    
    public SingletonApp getInstance(){
        if(instance == null){
            instance = new SingletonApp();
        }
        return  instance;
    }
    
}
```
