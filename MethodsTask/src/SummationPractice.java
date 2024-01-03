import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(3);
        numbers.add(7);
        numbers.add(13);
        numbers.add(4);
        numbers.add(5);
        numbers.add(17);

        System.out.println(SummationNum(numbers));

    }

    public static int SummationNum(ArrayList<Integer> summation){
        int sum=0;
        for(int i = 0; i<summation.size();i++){
            sum += summation.get(i);

        }
        return sum;
    }

}
