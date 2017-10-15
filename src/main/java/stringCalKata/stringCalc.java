package stringCalKata;

public class stringCalc{
    public static int add(String numbers){
        if(numbers == ""){
            return 0;
        }
        String[] numsToAdd = numbers.split(",");
        int sum = 0;
        for(int i = 0; i < numsToAdd.length; i++){
            sum += Integer.parseInt(numsToAdd[i]);
        }
        return sum;
    }

    public static void main(String args[]){
        System.out.println("hello");
    }
}