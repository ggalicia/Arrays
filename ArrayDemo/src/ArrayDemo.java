public class ArrayDemo {

    public static void main(String[] args)
    {
        //initialize some integers
        //these can be considered single value containers
        int state1PopulationCount = 502;
        int state2PopulationCount = 765;
        int state3PopulationCount = 987;
        int state4PopulationCount = 456;
        int state5PopulationCount = 876;

        //Initialize an integer array with size 5
        //remember that it has a starting index of 0 and a
        //final index of 4
        //this can be considered a multi-value container
        //notice that when you print an empty array
        //you get an hexadecimal value
        //in here, the array's values are set to 0
        int[] countryPopulation = new int[5];
        System.out.println("Country Population is: " + countryPopulation);

        //print the first element of this empty array
        //Arrays have 0 as their default value
        //print it to see it
        System.out.println("Value of the first element in this array: " + countryPopulation[0]);

        //print all values in the array
        //this is one way to print all values in the array
        for(int x: countryPopulation)
        {
            System.out.println(x);
        }

        //print the size of the array
        System.out.println("The size of array is: " + countryPopulation.length);

        //second way to print all values in the array
        //make use of length
        for(int x = 0; x<countryPopulation.length;x++)
        {
            System.out.println(countryPopulation[x]);
        }

        //update values of the array
        countryPopulation[0] = state1PopulationCount;
        countryPopulation[1] = state2PopulationCount;
        countryPopulation[2] = state3PopulationCount;
        countryPopulation[3] = state4PopulationCount;
        countryPopulation[4] = state5PopulationCount;

        //print values of the array
        for (int x : countryPopulation) {
            System.out.println(x);
        }

        System.out.println("New array with similar values: ");
        //To specify initial values to an array, do this:
        //inplicit way
        //int[] countryPopulation2 = {502, 765, 987, 456, 876};
        //explicit way
        int[] countryPopulation2 = new int[]{502, 765, 987, 456, 876};
        //print the array
        for(int x:countryPopulation2)
        {
            System.out.println(x);
        }

        //print the sum of the population for both arrays
        int count = 0;
        for(int x: countryPopulation)
        {
            count += x;
        }
        System.out.println("The total population of CountryPopulation Array is: " + count);

        //print the sum of the population for both arrays
        int count2 = 0;
        for(int x: countryPopulation2)
        {
            count2 += x;
        }
        System.out.println("The total population of CountryPopulation2 Array is: " + count2);

        //new array
        int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
        System.out.println("myArray.length: " + myArray.length);
        System.out.println("myArray[1]: " + myArray[1]);

    }
}
