package com.chapter4_1;

public class Throws {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = getFactorial(a);
            System.out.println(b);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getFactorial(int number) throws Exception {
        if (number < 1) throw new Exception("Number can not be lower then 1");

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

//    alternative method
public static int getFactorial2(int num){

    int result=1;
    try{
        if(num<1) throw new Exception("The number is less than 1");

        for(int i=1; i<=num;i++){

            result*=i;
        }
    }
    catch(Exception ex){

        System.out.println(ex.getMessage());
        result=num;
    }
    return result;
}
}


