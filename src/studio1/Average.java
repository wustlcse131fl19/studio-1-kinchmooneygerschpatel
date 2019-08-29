package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
            ArgsProcessor ap = new ArgsProcessor(args);
            int n1 = ap.nextInt("Give me the first of the two numbers, please!");
            int n2 = ap.nextInt("Now the second!");
            double average = ( (double)n1  + n2 )/ 2;
            System.out.println(average);
        }
    }
