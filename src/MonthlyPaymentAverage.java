import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class MonthlyPaymentAverage {
    public static void main(String[] args) {
        int [] monthNames=new int[12];
        monthNames [0]= 1000000;
        monthNames [1]= 11000000;
        monthNames [2]= 10000000;
        monthNames [3]= 13000000;
        monthNames [4]= 14000000;
        monthNames [5]= 15000000;
        monthNames [6]= 16000000;
        monthNames [7]= 17000000;
        monthNames [8]= 18000000;
        monthNames [9]= 19000000;
        monthNames [10]= 20000000;
        monthNames [11]= 21000000;
        int total=0;
        for (int counter =0 ;counter<12;counter++){
            total+= monthNames [counter];
        }
           int avarageIncome =total/12;

            System.out.println(avarageIncome);
    }
}
