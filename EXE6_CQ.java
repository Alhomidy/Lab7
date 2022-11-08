import java.util.ArrayList;

public class EXE6_CQ extends EXE4_NQ{
    private ArrayList<String> CHO;

    public EXE6_CQ()
    {
        CHO=new ArrayList<>();
    }
    public void addChoice(String CH1,boolean CORRECT)
    {
        CHO.add(CH1);
        if (CORRECT)
            setANSWER(CHO.size()+"");
    }
    public void display()
    {
        super.display();
        for (int i = 0; i <CHO.size() ; i++) {// to print array element
            System.out.println((i+1)+"      "+CHO.get(i));
        }
    }
}
