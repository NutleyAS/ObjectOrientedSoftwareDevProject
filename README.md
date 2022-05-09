# ObjectOrientedSoftwareDevProject

## Introduction
This respository was created using code developed for a Java Project which was part of the Object Oriented Software Development Module of the Higher Diploma in Software Development at GMIT. The application contains a command line menu-driven Java application that is capable of encrypting and decrypting short messages 
or file using a Rail Fence cypher.

## Class List

There are 5 separate Classes that are contained within the project that enables the project to work. They are;

1. FileManagement.java
   * This Class contains all the methods required for reading and saving the data into files.
2. Decryption.java
   * This class contains all the decryption methods for the application.
3. DisplayMenus.java
   * This Class contains all the methods for displaying the user menus.
4. Encryption.java
   * This class contains all of the encryption methods for the application.
5. Runner.java
   * This contains the main method for running the application.

## Design

### FileManagement
   
   This contains 2 static methods:
   * Open File: This allows the application to open a file and verify if it exists. In order to allow this application to work the java.io.FileInputStream library had to be imported.
   * Save to File: This method saves a given string into a file provided the application can find the file. For the error handling a catch was used that required the use of the jave.io.IOException library.

### Decryption
   
   This contains 3 static methods:
   * regenerateMatrix: This generates the decryption matrix from an encrypted text. It requires the string of the encrypted text, the rail fence key and the matrix to be filled in.
   * generateOriginalTxt: This method takes the decryption matrix as the input and from this generates the unencrypted text.
   * displayMatric: This method display the decryption matrix.

**NOTE Decrypting Larger txt Files Can Take Time.**

### Displays Menus
   
   * start: While the declaration 'boolean keepRunning = true' the application will show the Main Menu. The choices are linked to the runner class and the methods there for running the sub-menus.
   * static menus: Used to display multiple sub-menus.

### Encryption

This contains 3 static methods:

   * createMatrix: This method generates the encryption matrix from the inputted file or text.
   * generateEncryptedTxt: This method takes the encryption matrix as an input and from this it generates the encrypted text.
   * displayMatrix: This method displays the encrypted matrix.

**NOTE When encrypting larger text files the execution can take time.**

### Runner

This contains the methods for running the application. It also contains code that allows the sub-menus to operate.

## Execution

This application uses a command-line menu and sub-menus to allow the user to encrypt and decrypt files/text using the rail fence cypher. After running the program the user will see the main menu that offers the following options:

### Main Menu

  * User Input Encryption
  * User Input Decryption
  * File Input Encryption
  * File Input Decryption
  * Exit Application

The application looks for the user to input a number that corresponds to the option that they wish to used("Select an option [1-5]") This is the same for all the sub-menus. If the user does not input the correct integer the program will 
println "[ERROR] Invalid input please select an option [1-5]." and look again for the user input.

### User Input Encryption

When the user inputs '1' into the Main Menu the program will ask the user to "Please input text that you want to Encrypt:". Once the user has done this the application will then ask the user to "Please enter the Rail Fence Key: ". 
Once this has been done the user will be presented with the Encryption Menu that offers the following options:

  * Display results on the screen
  * Save results to a file
  * Display the encryption matrix
  * Return to the main Menu

The user is asked to select an option 1-4. 

**Option 1** displays the result on the screen and prompt the user to press enter to continue. Pressing enter will return the user to the Encryption Menu.

**Option 2** asks the user to enter a file name to save the text to. Provided the application can find the file it will save to it. If it cannot it will println "Unable to save to file : " + fileName. If this happens the user will get to input the name again. Once it saves the user will be prompted to press enter to return to the Encryption Menu.

**Option 3** displays the encryption matrix. To retrun to the Encryption Menu the user presses enter.

**Option 4** returns the user to the Main Menu.

### User Input Decryption

When the user inputs '2' into the Main Menu the program will ask the user to "Please input text that you want to Decrypt: ". Once the user has done this the application wil then ask the user to "Please enter the Rail Fence Key: ". Once this has been done the user will be presented with the Decryption Menu that offers the following options:

  * Display results on the screen
  * Save results to a file
  * Display the decryption matrix
  * Return to the main Menu

The user is asked to select an option 1-4. 

**Option 1** displays the result on the screen and prompt the user to press enter to continue. Pressing enter will return the user to the Decryption Menu.

**Option 2** asks the user to enter a file name to save the text to. Provided the application can find the file it will save to it. If it cannot it will println "Unable to save to file : " + fileName. If this happens the user will get to input the name again. Once it saves the user will be prompted to press enter to return to the Decryption Menu.

**Option 3** displays the decryption matrix. To return to the Decryption Menu the user presses enter.

**Option 4** returns the user to the Main Menu.

### File Input Encryption

When the user inputs '3' into the Main Menu the program will ask the user to "Please input the file name that is to be Encrypted:". Provided the application can find the file it will then ask the user to enter the Rail Fence Key. If it cannot find the file it will output "File not found!" and the user will have to try and input the file again. Once the user has inputted the Rail Fence Key the application will display the File Encryption Menu with the following Options:

  * Display results on the screen
  * Save results to a file
  * Return to the main Menu

The User is asked to select an option 1-3.

**Option 1** displays the result on the screen and prompt the user to press enter to continue. Pressing enter will return the user to the File Encryption Menu.

**Option 2** asks the user to enter a file name to save the text to. Provided the application can find the file it will save to it. If it cannot it will println "Unable to save to file : " + fileName. If this happens the user will get to input the name again. Once it saves the user will be prompted to press enter to return to the File Encryption Menu.

**Option 3** returns the user to the Main Menu.

### File Input Decryption

When the user inputs '4' into the Main Menu the program will ask the user to "Please input the file name that is to be Decrypted:". Once the user has done this the application will then ask the user to "Please enter the Rail Fence Key: ". If it cannot find the file it will output "File not found!" and the user will have to try and input the file again. Once the user has inputted the Rail Fence Key the application will display the File Decryption Menu with the following Options:

  * Display results on the screen
  * Save results to a file
  * Return to the main Menu

**Option 1** displays the result on the screen and prompt the user to press enter to continue. Pressing enter will return the user to the File Encryption Menu.

**Option 2** asks the user to enter a file name to save the text to. Provided the application can find the file it will save to it. If it cannot it will println "Unable to save to file : " + fileName. If this happens the user will get to input the name again. Once it saves the user will be prompted to press enter to return to the File Decryption Menu.

**Option 3** returns the user to the Main Menu.

