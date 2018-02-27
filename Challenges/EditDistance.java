import java.util.*;
/*
Naive method () and
Dyanamic Programming(Using A*)
Taken from https://en.wikipedia.org/wiki/Edit_distance
Defined as 
insertion a = uv such that a(e) = aev 
deletion a = uv a/v = u
substitution for a single symbol such that y != x such that the change a = aux to ayx (x -> y)
*/
public class EditDistance{


    //checks if value parameters against each other
    //returns the lowest one
    private int min(int x, int y, int z){
        if(x < z && x < y){
            return x;
        }
        else if(y < x && y < z){ //check
            return y;
        }
        else{ //last choice
            return z;
        }
    }

    public EditDistance(){}

    /*
        Check if it should insert, delete or substitute depending on the cost
        Each operation is a positive cost as there is no way
        Each cost is denoted by the ASCII value
        So if its inserting the ASCII value of the inserted char is added to the sum
        if its deleting then the ascii value being deleted is added to the sum
        if its substituting then its doing an insertion and deletion, so the cost of is the sum of those 2 operations together

        Ex. "DoomB" and "Leok"
        (All characters will be lower case)
        Comparing the latter to the former
        (~E == empty character)
        So, 
            d != l, substitution of d for l, Cost += (deletion of d) + (insertion of l)
            e != o, subtition of
            o == o, same, so no change required
            m != k, 
            B != ~E,

        Naive method done using greedy algorithm of scope of only at the character and only manipulating one side to match the other instead of finding
        the lowest common distance between both

        The A* method solves this by considering each branch
    */
    public static int EditDistanceNaive(String str1, String str2){
        int editDistanceCost = 0;
        //so working with immutable strings is annoying in java, so this will be done haphazard
        //change into StringBuilder so that we can easily manipulate the string content without going to garbage collection every so often
        StringBuilder b1 = new StringBuilder(str1);
        StringBuilder b2 = new StringBuilder(str2);

        //goes through every letter in the latter and compares if same then it moves on
        //if different checks if insertion, deletion or is better
        //There will a counter that keeps track of current index of the string

        
        


        return editDistanceCost;
    }

    /*
        A* algorithm

        Given initial problem state
    */
    public static int EditDistanceDyanmic(String str1, String str2){

    }

    /*
        CAN I DO STRIPS AI!? Probably not.
    */

    public static int EditDistanceStrips(String str1, String str2)
}