package com.company;

public class CleanCode_AbsoluteNumberCalculator{


	// write your code here
        public static int findAbsolute(int number){
            boolean higher_than_0 = number >= 0;
            if(higher_than_0)return number;
            return -number;
        }

}
