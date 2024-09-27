package main.java.org.example;

public class StringConcepts {

    public static void main(String[] args) {

        //String --> It is a combination of characters

        //It is the only non primitive data that is present in the Object class
        //Strings are immutable???

        String b="This is my first string program that we are discussing";

        //Prints the number of characters present in the string
        //Always start counting from 1, 2, 3.......
        System.out.println(b.length());

        //Checks if the given string is empty or not
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(b.isEmpty());

        //Checks if the given string is blank or not
        //Returns true if the above condition is satisfied else false
        System.out.println(b.isBlank());

        //isEmpty and isBlank
        b="";

        //Return true because the string does not have any values
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());

        b="  ";

        //It will return false, because it has white spaces
        //It will check for any character is present or not in the string
        System.out.println(b.isEmpty());

        //It will return true, because it has only white spaces in the string
        System.out.println(b.isBlank());

        b="This is my first string program that we are discussing";

        //Converts the string to Capital letters
        System.out.println(b.toUpperCase());

        //Converts the string to small letters
        System.out.println(b.toLowerCase());

        b="This is my first string program that we are discussing";

        //Checks if the given string is starting with the word 'is' or not
        //Returns true if the above condition is satisfied else it returns false
        //Case Sensitivity matters
        System.out.println(b.startsWith("is"));
        System.out.println(b.startsWith("THIS"));
        System.out.println(b.startsWith("this"));

        //If we want to break the case sensitivity
        //Convert the complete string to capital letter or small letter and do the validations
        System.out.println(b.toLowerCase().startsWith("this"));

        b="This is my first string program that we are discussing";

        //Checking whether the string is starting with the 'first',
        // if we are taking the string from 10th index position
        //We need to count starting from 0,1,2,3, .......
        System.out.println(b.startsWith("first",11));

        //Checking if the string is ending with 'scussing' or not
        //Returns true if the above condition is satisfied or not
        //else it returns false
        System.out.println(b.endsWith("scussing"));

        b="This is my first string program that we are discussing";

        System.out.println(b.endsWith("are discussing"));

        //Replacing the word 'first' with the word 'second' in the given string
        System.out.println(b.replace("first","second"));

        //If the word 'FIRST' is not present, then it will return the original string
        System.out.println(b.replace("FIRST","second"));

        b="This is my first string program that we are discussing";

        //It will check whether the word 'ring' is present in the string or not
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(b.contains("ring"));
        System.out.println(b.contains("hat we"));
        System.out.println(b.contains("FIRST"));

        //Joining two strings
        //And it will appended/added at the end of the string
        System.out.println(b.concat(" !!Yes It Is"));

        b="This is my first string program that we are discussing";

        //Prints the character that is present at 30th index position
        System.out.println(b.charAt(30));

        //Throw String Index Out Of Bounds Exception, if we are trying to find an index position
        //that is greater than the length of the string
//        System.out.println(b.charAt(300));

        b="This is my first string program that we are discussing";

        System.out.println(b.charAt(3));

        //Prints the string starting from 31st index position till the end
        System.out.println(b.substring(31));
        System.out.println(b.substring(20));

        //Throw String Index Out Of Bounds Exception, if we are trying to find an index position
        //that is greater than the length of the string
//        System.out.println(b.substring(400));

        //Prints the string starting from 30th index position till 38th index position
        //Inclusive of starting index position and exclusive of end index position
        System.out.println(b.substring(30,38));

        System.out.println(b.substring(10,29));

        b="This is my first string program that we are discussing \n";

        //Throw String Index Out Of Bounds Exception, if we the starting index position is greater than end index position
//        System.out.println(b.substring(30,20));

        //Repeats the same string for seven times
        System.out.println(b.repeat(7));

        //Prints the index position of the first occurence of the character 'i' that is present in the string
        System.out.println(b.indexOf('i'));

        //Returns -1 if the character is not present
        System.out.println(b.indexOf('K'));

        b="This is my first string program that we are discussing";

        System.out.println(b.indexOf("irst"));

        //Checks of the index position of the word 'is' from the 45th index position
        System.out.println(b.indexOf("is",45));
        System.out.println(b.indexOf("is",48)); //Returns  -1 since it is not present from 48th index position

        //It checks for the character between 30th and 35th index position
        System.out.println(b.indexOf('l',30,35));
        System.out.println(b.indexOf('p',30,35));

        //Prints the index position of the last occurence of letter 'i'
        System.out.println(b.lastIndexOf('i'));
        System.out.println(b.lastIndexOf("are"));

        //Returns -1 if the req string or character is not present in the string
        System.out.println(b.lastIndexOf('Z'));

        b="This is my first string program that we are discussing";

//        System.out.println(b.lastIndexOf("my",20));
//        System.out.println(b.charAt(2));

//        b.charAt(2) --> Return a character

        //Convert that character to a string: Character.toString(b.charAt(2))

        //Print a specific character for n number of times
        String dummy=Character.toString(b.charAt(20));
        //repeat functions works on a string only, not on character
        System.out.println(dummy.repeat(10));

        String c3="        Jack is        ";

        //Removes the white spaces that is present at the start and at the end of the string
        System.out.println(c3.trim());

        //Removes the white spaces that is present at the start of the string
        System.out.println(c3.stripLeading());

        //Removes the white spaces that is present at the end of the string
        System.out.println(c3.stripTrailing());

        String s4="This is a new day to begin a new show";

        //Replace all the words of 'new' with 'old'
        System.out.println(s4.replace("new", "old"));

        //Replaces the first occurence of 'new' with 'old'
        System.out.println(s4.replaceFirst("new","old"));

        //Prints the ASCII value of the character that is present at 10th index position
        System.out.println(s4.codePointAt(10));

        s4="This is a new day to begin a new show";

        String s5="This is a new day to Begin a new Show";

        //Checks if the strings are equal or not
        //Returns true if the above condition is satisfied else it returns false
        //Case Sensitivity matters here
        System.out.println(s4.equals(s5));

        //Case Sensitivity does not matters here
        //Checks if the strings are equal or not
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(s4.equalsIgnoreCase(s5));

        //Returns 0 if both the strings are equal
        //Returns +ve value if the first string is greater than second string
        //Returns -ve value if the first string is lesser than second string
        //Here it compares character by character ascii value
        //Case sensivity is ignored here
        System.out.println(s4.compareToIgnoreCase(s5));

        //If there is a mismatch, it will print the difference of ASCII Values
        System.out.println(s4.compareTo(s5));


    }
}
