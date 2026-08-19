abstract class Bank{
    private static int balance=1000;

    public  int getbalance(){
        return balance;
    }
    public  void setBalance(int val){
        balance=val;
    }
}

class Sbi extends Bank{
    public void debit(int bal){
        int currVal=super.getbalance();
        currVal-=bal;
        super.setBalance(currVal);
    }

    public void credit(int bal){
        int currVal=super.getbalance();
        currVal+=bal;
        super.setBalance(currVal);

    }
}
void main() {
    Sbi s = new Sbi();
    System.out.println(s.getbalance());
    s.debit(200);
    System.out.println(s.getbalance());
}
