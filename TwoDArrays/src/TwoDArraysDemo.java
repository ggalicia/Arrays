public class TwoDArraysDemo {

    public static void main(String[] args)
    {
        //2D Array Example
        int[][] worldPopulation = {
                //states for country1>>   0     1     2    3     4     5    6
                                        {123, 4569, 2345, 9829, 2982, 132, 2332},   //0>>country 1
                                        {1323, 2332, 2345, 9829, 2982},             //1>>country 2
                                        {152, 8432, 9786, 987, 2982, 132},          //2>>country 3
                                  };
        System.out.println("World Population is: " + worldPopulation +" and length is: " + worldPopulation.length);
        System.out.println("World Population[0] is: " + worldPopulation[0] +" and length is: " + worldPopulation[0].length);
        System.out.println("World Population[1] is: " + worldPopulation[1] +" and length is: " + worldPopulation[1].length);
        System.out.println("World Population[2] is: " + worldPopulation[2] +" and length is: " + worldPopulation[2].length);
        System.out.println("World Population[0][0] is: " + worldPopulation[0][0]);

        //Write/Update Data
        worldPopulation[1][2] = 777;
        System.out.println("World Population[1][2] is: " + worldPopulation[1][2]);

        //Read all data
        for(int i = 0; i<worldPopulation.length;i++)//0 to 2
        {
            for(int j = 0; j<worldPopulation[i].length;j++)
            {
                System.out.println(worldPopulation[i][j] + " ");
            }

            System.out.println();
        }

        //note
        int[][] arr = new int[3][5];
        //this means that I want 3 1D Arrays with 5 elements each
        //all of the values have a default value of 0.

        //update program

    }
}
