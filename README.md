
# Need a Password? ByteBlaze it!

**ByteBlaze** is a simple, modular, and extensible password generator app in Java that allows you to create random passwords with customizable length and character sets.

# Overview
The ByteBlaze password generator consists of three main classes:


**CharacterSet**: Encapsulates the character sets (uppercase letters, lowercase letters, digits, and special characters) and provides methods for getting specific character sets.

**PasswordRequirements**: Encapsulates the password requirements (length, and whether to include uppercase letters, lowercase letters, digits, and special characters). This class also provides a method to validate if a generated password meets the specified requirements.



**PasswordGenerator**: Generates random passwords based on the given paramaters.



# Usage
To generate a random password, follow these steps:

1. Create a PasswordRequirements instance with your desired password requirements, such as length and which character sets to include (uppercase letters, lowercase letters, digits, and special characters).


`PasswordRequirements requirements = new PasswordRequirements(10, true, true, true, true);`




In this example, we're creating a password requirement for a password of length 10, with all character sets included.

2. Call the generateRandomPassword method from the PasswordGenerator class, passing the PasswordRequirements instance as an argument.

`String password = PasswordGenerator.generateRandomPassword(requirements);`



3. The generated password will be returned as a string, which you can use as needed.


`System.out.println(password);`



# Example
Here's a complete example of how touse the password generator in your code:


    public class Main {  
    public static void main(String[] args) {  
    // Define password requirements  
    int length = 10;  
    boolean includeUpper = true;  
    boolean includeLower = true;  
    boolean includeDigits = true;  
    boolean includeSpecial = true;  
      
     // Create a PasswordRequirements instance PasswordRequirements requirements = new PasswordRequirements(length, includeUpper, includeLower, includeDigits, includeSpecial);  
     // Generate a random password String password = PasswordGenerator.generateRandomPassword(requirements);  
     // Print the generated password System.out.println(password); }

This example demonstrates how to create a PasswordRequirements instance and generate a random password using the PasswordGenerator class. The generated password will have a length of 10 characters and will include uppercase letters, lowercase letters, digits, and special characters. The password will be printed to the console.


# THANKS FOR USING BYTEBLAZE! 
