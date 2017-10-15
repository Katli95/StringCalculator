package stringCalKata;

import java.util.ArrayList;

public class stringCalc{
    public static int add(String numbers){
        if(numbers == ""){
            return 0;
        }
        String[] numsToAdd = numbers.split("(\n|,)");
        int sum = 0;
        ArrayList<Integer> negs = new ArrayList<Integer>();
        for(int i = 0; i < numsToAdd.length; i++){
            int num = Integer.parseInt(numsToAdd[i]);
            if(num < 0){
                negs.add(num);
            }else{
                sum += num;
            }
        }

        if(!negs.isEmpty()){
            String err = "Negatives not allowed: ";
            err += negs.get(0);
            throw new IllegalArgumentException(err);
        }

        return sum;
    }

    public static void main(String args[]){
        System.out.println("hello");
    }
}