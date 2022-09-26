import java.util.*;

public class HW0922_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> month = new HashMap<Integer, String>();

        month.put(1, "January");
        month.put(2, "February");
        month.put(3, "March");
        month.put(4, "April");
        month.put(5, "May");
        month.put(6, "June");
        month.put(7, "July");
        month.put(8, "August");
        month.put(9, "September");
        month.put(10, "October");
        month.put(11, "November");
        month.put(12, "December");

        System.out.printf("input 1~12: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if ( m < 1 || m > 12){
            System.out.println("wrong number");
        }else{
            System.out.println(month.get(m));
        }
    }       
}
