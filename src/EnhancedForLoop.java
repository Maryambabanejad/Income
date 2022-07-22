import java.sql.SQLOutput;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] monthNames =new int[12];
        monthNames[0] = 500000;
        monthNames[1] = 1500000;
        monthNames[2] = 1300000;
        monthNames[3] = 1700000;
        monthNames[4] = 2500000;
        monthNames[5] = 500000;
        monthNames[6] = 1500000;
        monthNames[7] = 1000000;
        monthNames[8] = 750000;
        monthNames[9] = 500000;
        monthNames[10] = 1400000;
        monthNames[11] = 1100000;
        int total=0;
        for (int counter: monthNames) {
            total = total + counter;
        }
            int avarageIncome = total/12;
        System.out.println("your average incom :" +avarageIncome);

    }
}
