public class EXE1_Bank {
    protected double Bnc;

    public void setBnc(double Bnc){
        this.Bnc=Bnc;
    }
    public double getBnc(){
        return Bnc;
    }
    public double withdraw(double Bnc){
        this.Bnc-=Bnc;
        return this.Bnc;
    }
}

