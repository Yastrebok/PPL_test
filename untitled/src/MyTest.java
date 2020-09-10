

public class MyTest {

    public static void main(String[] args) {

        System.out.println(getTotalSum(1000));
    }

    public static Integer getTotalSum(Integer edge){
        int totalSum = 0;
        for (int i = 1; i < edge; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                totalSum += i;
            }
        }
        return totalSum;
    }

}
