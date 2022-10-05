class TicketMachine implements Runnable{

    static int ticket = 1000;
    int distribution;
    Thread T;
    static int n = 0; 

    TicketMachine(String name){
        distribution = 0;
        T = new Thread(this, name);
        T.start();
    }
    public void run(){
        while(TicketSaled()){
            distribution += n;
            System.out.println(n);
        }
        System.out.println(T.getName()+" 賣出了 "+distribution+" 張票 ");
    }   

    private synchronized static boolean TicketSaled(){
        n = (int)(Math.random()*4)+1;
        
        if (ticket > 0){
            if (ticket > n)
            {
                ticket -= n;
                return true;
            }
            else if (ticket < n)
            {
                n = ticket;
                ticket = 0;
                return true;
            }
            else if(ticket == n)
            {
                ticket = 0;
                return true;
            }
            return false;
        }else{
            return false;
        }
    }
}
public class HW0929{
    public static void main(String[] args) {

        TicketMachine TM1 = new TicketMachine("TM1");
        TicketMachine TM2 = new TicketMachine("TM2");
        TicketMachine TM3 = new TicketMachine("TM3");
        TicketMachine TM4 = new TicketMachine("TM4");

    }        
}
