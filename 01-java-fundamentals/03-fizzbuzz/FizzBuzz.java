public class FizzBuzz {
    public String fizzDigit(int num) {
        if(num%3==0 && num%5==0){
            return "FizzBuzz";
        }
        else if(num%3==0){
            return "Fizz";
        }
        else if(num%5==0){
            return "Buzz";
        }
        else{
            return Integer.toString(num);
        }
    }
}
