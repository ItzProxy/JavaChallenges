public class Stuff{
    
    /*
        Assumes square size because not dynamic array
    */
    public static double[][] turn1Dto2D(double[] m) {
        int size =  (int)Math.sqrt((double)m.length);
        //System.out.println("1d-2d: "+m.length + " " + size);
        double[][] temp = new double[size][size];
        //uses offset
        for (int i = 0; i < m.length; i++) {
            temp[(int) i / size][i % size] = m[i];
        }
        return temp;
    }

    /*
        Assumes square size because not dynamic array
    */
    public static double[] turn2Dto1D(double[][] m) {
        int size = m.length*m.length;
        //System.out.println("2d-1d: "+ m.length + " " + size);
        double[] temp = new double[size];
        //uses offset
        for (int i = 0; i < size; i++) {
            //System.out.print("Accessing index(" + (int)(i/m.length) + "," + i%size + ")\n");
            temp[i] = m[(int)(i/m.length)][i%m.length];
            //System.out.print(temp[i] + "\n");
        }
        System.out.println();
        return temp;
    }
}