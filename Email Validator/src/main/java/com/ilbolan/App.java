package com.ilbolan;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        EmailValidator emailValidator = new EmailValidator();
        String[] addresses = {
                "hlias.bolanakes@gmail.com", // valid
                "nothlias.bolanakes@gmail.com", // invalid
                "hlias.bolanakes@hotmail.com", // invalid
                "hlias.bolanakes@yahoo.com", // invalid but yahoo uses store and forward
                "hlias.bolanakes@nowhere.com" // invalid domain name
        };

        for(var email : addresses)
            System.out.println(email + " is valid? " + emailValidator.isAddressValid(email));
    }
}
