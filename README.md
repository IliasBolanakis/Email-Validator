# Email-Validator
Email Validator in Java made for one of my personal projects 

The validator was built as an annotation for a personal project of mine in JakartaEE.
It performs an SMTP lookup on MX records and works most of the time if mail exchanger 
doesn't have a store & forward mail protocol (Yahoo does-the only one i have found till now)

NOTE: It's possible for a non existent email to go through but not possible for a real email to fail
