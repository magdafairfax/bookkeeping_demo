I am using Hibernate as test database which is not persistent but is very 
quick and easy way to implement a proof of concept.

I created 3 tables: 

    Transactions which will hold all transactions,
    Tags - relationship is one to muulti meaning
           one transaction can have multiple tags
    TagType - conains all type of tags

I tried to implement a database structure which reflects the 
given transaction interfce. The relationsship between Transactions and 
Tags is one to many.

I created a bidirectional association with a @OneToMany annotation on the parent side
of the relationship and a @ManyToOne annotation on the child side of the relationship.
With annotation @@ManyToOne and @OneToMany is very easy to implement all
methods given in Transaction interface.
There isn't a lot of source code to show but but Springboot generates
everithing behind the scens, meaning all necessary beans and wiring.

You can acces the database http://localhost:8080/h2-console/

I changed the name of  Transaction interface given in specification into Transaction repository and
I didn't need to define al the methods because Springboot will do that for me using @Repository anotation. 

I created a controller and test with the transaction with Postman. 
How to get a json list of all transactions:  http://localhost:8080/trans/

GET :  http://localhost:8080/trans/rc1/tags find the number of tags

To get a specific transactions http://localhost:8080/trans/rc1

I also added a couple of unit tests.