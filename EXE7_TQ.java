import java.util.ArrayList;
import java.util.Scanner;

public class EXE7_TQ {
    public static void main(String[] args) {
        ArrayList<EXE4_NQ> all= new ArrayList<>();

        EXE4_NQ q1=new EXE4_NQ();
        q1.setTEXT("Whats your name ? ");
        q1.setANSWER("Faisal");

        EXE6_CQ  q2=new EXE6_CQ();
        q1.setTEXT("Who are you?");
        q2.addChoice("Abobakr",false);
        q2.addChoice("Faisal",true);
        q2.addChoice("Bashar",false);

        EXE4_NQ q3=new EXE4_NQ();
        q3.setTEXT("How You doing?");
        q3.setANSWER("Fine ");

        EXE5_FQ q4=new EXE5_FQ();
        q4.setTEXT("INVENTOR OF JAVA IS _____");
        q4.setANSWER("James gosling");

        all.add(q1);
        all.add(q2);
        all.add(q3);
        all.add(q4);


        for (int i = 0; i <all.size() ; i++) {
            PQ(all.get(i));
        }
    }
    public static void PQ(EXE4_NQ q)
    {
        q.display();
        Scanner in = new Scanner(System.in);
        String r=in.next();
        System.out.println(q.checkANSWER(r));
    }

}