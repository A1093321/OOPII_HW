import java.util.*;

public class HW0922_1 {
    public static void main(String[] args) throws Exception {
        var Rnum = new TreeSet();
        ArrayList<Integer> randomnum = new ArrayList<Integer>();
        
        System.out.println("眖1~10010ぃ狡计");
        while (true) {
            int check = 0;
            int n = (int)(Math.random()*100)+1;
            if ( randomnum.size() == 0){
                randomnum.add(n);
                continue;
            }
			for (int j = 0; j < randomnum.size(); j++) {
                if ( n == randomnum.get(j) ) {
                    check = 1;
                    break;
                }
            }
            if (check == 0){
                randomnum.add(n);
            }else{
                continue;
            }
            if ( randomnum.size() == 10){
                break;
            }
        }
        for (int i = 0; i < randomnum.size(); i++) {
            Rnum.add(randomnum.get(i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("材%2d计琌: %d%n", i+1, randomnum.get(i));
        }

        System.out.printf("TreeSetじ计: %d%n", Rnum.size());
        System.out.printf("TreeSetず甧: ");
        System.out.println(Rnum);
        System.out.printf("TreeSetい程计: %d%n", Rnum.first());
        System.out.printf("TreeSetい程计: %d%n", Rnum.last());
        System.out.println(Rnum.subSet(30, 70));
    }       
}
