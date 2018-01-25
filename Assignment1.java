import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
    public Assignment1() {
        //Here for formalities
    }

    /*
    Sorts any size matrix using Arrays.sort
    */
    public static double[][] sortColumns(double[][] m) {
        double[][] temp = new double[m.length][]; //create a temporary 1D array
        //simply make m into a 1d array so its easier to sort
        //System.out.println("Builing 2d to 1d array");
        //System.out.println("Sorting");
        for(int i = 0; i < m.length; i++){
            temp[i] = getColumn(m,i);
            Arrays.sort(temp[i]);
        }
        //swap diags
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                if(i != j && i < j){
                   //System.out.println("swapping " + temp[i][j] + "("+i+","+j+") to " + temp[j][i] + "("+j+","+i+")");
                    swap(temp,i,j,j,i);
                    //System.out.println("Result: " + temp[i][j] + "(" + i + "," + j +") to " + temp[j][i] + "(" + j + "," + i +")");
                }
            }
        }
        return temp;
    }
    /*
    Swaps the src and dest of a double 2d array 
    @requires array to manip, 2 coordinates(x,y)
    */
    public static void swap(double[][] arr, int srcX, int srcY, int destX, int destY){
        double temp = arr[srcX][srcY];
        arr[srcX][srcY] = arr[destX][destY];
        arr[destX][destY] = temp;
    }
    /*
    Creates a 1d array and gets the column given the column index
    */
    public static double[] getColumn(double[][] arr, int index){
        double[] column = new double[arr.length];
        for(int i = 0; i < arr.length; i++){
            column[i] = arr[i][index];
        }
        return column;
    }

    /*
    adds st, nd, th ordinal given a certain int
    Taken from stackoverflow on ordinal function
    */
    public static String getOrdinalFor(int value) {
        int hundredRemainder = value % 100;
        int tenRemainder = value % 10;
        if (hundredRemainder - tenRemainder == 10) {
            return "th";
        }

        switch (tenRemainder) {
        case 1:
            return "st";
        case 2:
            return "nd";
        case 3:
            return "rd";
        default:
            return "th";
        }
    }

    /*
    Have user input double to a AxA matrix where A is some int
    */
    public static double[][] fill(int size) {
        int m_xy = size;//hard coded square size
        double[][] original_data = new double[m_xy][m_xy];
        Scanner in = new Scanner(System.in); //set up to read entire input
        //fills 2d array
        for (int row = 0; row < original_data.length; row++) {
            for (int col = 0; col < original_data[row].length; col++) {
                System.out.printf("Enter the %d%s element for this 2D array\n",(int)((row*size+1) + col%size),getOrdinalFor((int)((row*size+1) + col%size)));
                original_data[row][col] = in.nextDouble();
            }
            System.out.println();
        }
        in.close();
        return original_data;
    }

    public static void main(String[] args) {
        int size = 3;
        double[][] init = fill(size); //get user input
        System.out.println("Unsorted: "); //display user inputted array
        for (double[] var : init) {
            for (double v : var) {
                System.out.print(v + " ");
            }
            System.out.println("");
        }
        System.out.println("Sorted by column: "); //display array with columns sorted
        double[][] sorted = sortColumns(init);
        for (double[] var : sorted) {
            for (double v : var) {
                System.out.print(v + " ");
            }
            System.out.println("");
        }
    }
}