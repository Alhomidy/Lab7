public class EXE3_BasicA extends EXE1_Bank {
    private double overdraft;
    @Override
    public double withdraw(double Bnc) {
        if (this.Bnc>=Bnc){
            overdraft+=30;
            this.Bnc-=Bnc;
        }
        else System.out.println("Cannot withdraw");
        return this.Bnc;
    }
    public double getOverdraft(){
        return overdraft;
    }
    public double payOverdraft(double Cash){
        overdraft-=Cash;
        return overdraft;
    }

    public static void main(String[] args) {
        EXE3_BasicA ACC=new EXE3_BasicA();
        ACC.setBnc(700);
            System.out.println("balance is: "+ACC.withdraw(300));
        System.out.println("balance is: "+ACC.withdraw(250));
        System.out.println("Overdraft is :"+ACC.getOverdraft());

    }
}
