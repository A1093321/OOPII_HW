import java.util.*;

public class HW0922_1 {
    public static void main(String[] args) throws Exception {
        var Rnum = new TreeSet();
        ArrayList<Integer> randomnum = new ArrayList<Integer>();
        
        System.out.println("�q1~100�A��10�Ӥ����ƪ���");
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
            System.out.printf("��%2d�ӼƦr�O: %d%n", i+1, randomnum.get(i));
        }

        System.out.printf("TreeSet�����Ӽ�: %d%n", Rnum.size());
        System.out.printf("TreeSet���e: ");
        System.out.println(Rnum);
        System.out.printf("TreeSet���̤p����: %d%n", Rnum.first());
        System.out.printf("TreeSet���̤j����: %d%n", Rnum.last());
        System.out.println(Rnum.subSet(30, 70));
    }       
}
