import java.util.ArrayList;

public class BasicJava {
    public void OneTo255(){
        for (int i = 0; i<256; i++){
            System.out.println(i);
        }
    }
    public void OddTo255(){
        for (int i=0; i<256; i++){
            if (i%2 ==1){
                System.out.println(i);
            }
        }
    }
    public int SumTo255() {
        int sum = 0;
        for(int i = 1; i <= 255; i++) {
            sum+= i;
        }
        return sum;
        }
    public void itArray(int[] myArray){
        for (int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
    public void findMax(int[] myArray){
        int max = myArray[0];
        for (int i=1;i<myArray.length;i++){
            if (max<myArray[i]){
                max = myArray[i];
            }
        }
        System.out.println(max);
    }
    public void arrayOddNumbers(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i < 256; i+=2){
            y.add(i);
        }
        System.out.println(y);
    }
}