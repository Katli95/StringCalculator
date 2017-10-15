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
            }else if(num <= 1000){
                sum += num;
            }
        }

        if(!negs.isEmpty()){
            String err = "Negatives not allowed: ";

            for(int i = 0; i < negs.size(); i++){
                err += negs.get(i);
                if(i != negs.size() - 1){
                    err+=",";
                }
            }

            throw new IllegalArgumentException(err);
        }

        return sum;
    }

    public static void main(String args[]){
        System.out.println("hello");
    }
}