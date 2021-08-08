public class BasicJavaTest{
    public static void main(String[] args){
    
        BasicJava test = new BasicJava();
        
        test.OneTo255();
        test.OddTo255();
        System.out.println(test.SumTo255());

        int[] myArray = {1,3,5,7,9,13};
        test.itArray(myArray);
        test.findMax(myArray);
        test.arrayOddNumbers();
    }
}