public class EXE4_NQ {
    protected String TEXT; 
    protected String ANSWER;

    public EXE4_NQ() {
        TEXT=null;
        ANSWER=null;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public void setANSWER(String ANSWER) {
        this.ANSWER = ANSWER;
    }
    public void display()
    {
        System.out.println(TEXT);
    }
    public boolean checkANSWER(String RES)
    {
        return ANSWER.toUpperCase().equals(RES.toUpperCase());
    }
}
