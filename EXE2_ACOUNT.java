public class EXE2_ACOUNT extends EXE1_Bank{
    @Override
    public double withdraw(double Bnc) {
        if (this.Bnc>=Bnc)
            this.Bnc-=Bnc;
        else
            System.out.println("your balance is less");
        return this.Bnc;
    }

    public static void main(String[] args) {
        EXE2_ACOUNT ACount=new EXE2_ACOUNT();
       ACount.setBnc(700);
        System.out.println("your balance is : "+ACount.withdraw(800));
    }
}
