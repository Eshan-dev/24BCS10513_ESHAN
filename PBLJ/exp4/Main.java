class InsufficientFundsException extends Exception{
    InsufficientFundsException(double amount){
        String msg = amount + " more needed";
        super(msg);
    }
}
class IllegalArgumentException extends Exception{
    IllegalArgumentException(String msg){
        super(msg);
    }
}
class BankAccount{
    double balance;
    public BankAccount(){
        balance = 500;
    }
    public void withdraw(double amount)throws InsufficientFundsException,IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
        }
        if(amount > balance){
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
    }
}
void  main(){
    BankAccount a = new BankAccount();
    try{
//    a.withdraw(50);
//    a.withdraw(0);
//    a.withdraw(-1);
    a.withdraw(5000);

    }catch (Exception e){
        System.out.println(e);
    }
}