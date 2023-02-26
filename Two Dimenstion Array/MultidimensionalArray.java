class MultidimensionalArray {
    public static void main(String[] args) {

        // create a 2d array
        int[] x ={20,40,60};
        int[][] y = {
            {10, 20, 30}, 
            {40, 50, 60}, 
            {70, 30, 60}, 
        };
      
        //Value of X in array
           

        //Value of Y in Array
            for (int i = 0; i <= y.length; i++) {
                for (int j = 0; j <y[i].length ; j++) {
                    System.out.println(y[i][j]);
                }
            }
    }
}