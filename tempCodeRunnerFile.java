    public static double[][] fill(int size) {
        int m_xy = size;//hard coded square size 
        double[][] original_data = new double[m_xy][m_xy];
        Scanner in = new Scanner(System.in); //set up to read entire input
        //fills 2d array
        for (int row = 0; row < original_data.length; row++) {
            for (int col = 0; col < original_data[row].length; col++) {
                System.out.printf("Enter the %d%s for this 2D array",(int)(row/size + row%size),getOrdinalFor((int)(row/size + row%size)));
                original_data[row][col] = in.nextDouble();
            }
            System.out.println();
        }
        in.close();
        return original_data;
    }