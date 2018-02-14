package Assignment2.a2p5;
import java.util.*;
/*
MyString2 that looks and works like String without 
using the String functions in their respective functions such as substring does not use String.substring()
*/
public class MyString2{
    //sole variable
    private String value;

    public MyString2(String s){
        this.value = s;
    }
    /*
        Looks at the lexicographically difference
        Checks by iterating through the character array of both strings provided
            -Each letter is converted to its unary value(ascii)
                -Find difference and set lexicoDiff to it
                -Check if lexicoDiff is not 0, break
                    -This means that we have found a difference so we return that

        If lexicographically same then the only last check is if the length is different then we return the difference between the lengths
     */
    public int compare(String s){
        int lexicoDiff = 0;
        //taking the unicode difference between the 2
        int minLength = Math.min(s.length(), this.value.length()); //get the min length
        //iterate through array
            for(int i = 0; i < minLength; i++) {
                lexicoDiff += (int) this.value.charAt(i) - (int) s.charAt(i);
                if(lexicoDiff != 0){ //if lexicographically different, return the first unary difference between the two characters
                    break;
                }
            }
            if(lexicoDiff == 0){
                lexicoDiff = this.value.length()-s.length(); //if lexicographically similar then length is next thing to check
            }
            return lexicoDiff;
    }
    /*
    Takes
    */
    public MyString2 substring(int begin){
        int len = this.value.length() - begin;
        System.out.println("Length = " + len);
        if(len < 0){ //if begin is greater than or equal to length of the string this make sure that there is no negative size
            len = 0;
        }
        char[] temp = this.toChars();
        char[] newString2Container = new char[len]; //create new temporary char[]
        for(int i = 0; i < len; i++){
            newString2Container[i] = temp[i+begin]; //set the newSTring2Container to have the between range(begin, this.value.length())
        }
        return new MyString2(new String(newString2Container)); //uses String(char[] var) function
    }
    public MyString2 toUpperCase(){
        char[] x = this.toChars(); //change to char[]
        for(int i = 0; i < this.value.length(); i++){ //iterate over the whole entire array
            if((int)x[i] >= 97 && (int)x[i] <= 122){ //check if letter in ascii is lowercase
                x[i] = (char)(x[i] - 32); //change to uppercase
            }
        }

        return new MyString2(new String(x)); //returns a new function
    }
    /*
        @Description
        Returns the string as a char array by iterating over the string using charAt and putting into a array
        @return
        character array
    */
    public char[] toChars(){
        char[] charArray = new char[this.value.length()]; //creates char array with size of length of this string
        for(int i = 0; i < this.value.length(); i++){
            charArray[i] = this.value.charAt(i); //sets letter with charAt of this string
        }
        return charArray;
    }
    /*
        Return true or false based on boolean given
    */
    public static MyString2 valueOf(boolean b){
        return b ? new MyString2("true") : new MyString2("false");
    }
    @Override
    public String toString(){
        return this.value;
    }
    public static void main(String[] args){
        String toTest = "true"; //init string

        String compareString = "true"; //toCompare positive test
        String compareStringNeg = "false"; //toCompare negative test

        int subStringOffset = 2;
        int subStringBegin = Math.abs(toTest.length() - subStringOffset); //always take 3rd letter on, unless it messes up then we let compareTo get rid of any > string len
        System.out.println(subStringBegin);

        System.out.println("Testing using '" + toTest + "' as the initial String for MyString2");
        MyString2 x = new MyString2(toTest);
        System.out.println("Testing compareTo with negative test and positive test");
        System.out.println("Testing with '" + compareString+"' (positive test)");
        System.out.println(x.compare(compareString));
        System.out.println("Testing with '" + compareStringNeg+"' (negative test)");
        System.out.println(x.compare(compareStringNeg));
        System.out.println("Testing substring, beginning with the '" + toTest.charAt(subStringBegin) + "' of " + toTest + " as the starting point");
        MyString2 newTemp = x.substring(subStringBegin);
        System.out.println(newTemp);
        System.out.println("Testing toUpperCase now");
        System.out.println(x.toUpperCase());
        System.out.println("Testing toChar[], printed out with ',' in between");
        for(char p : x.toChars()){
            System.out.print(p + ",");
        }
        System.out.println();
        System.out.println("Testing valueOf() using false as the boolean");
        System.out.println(x.valueOf(false));
        System.out.println("Finished testing...exiting.");
        System.out.println("String".compareTo("String"));
        System.out.println("true".compareTo("false"));
    }
}
