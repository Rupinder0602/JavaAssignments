package Assignment2;

public class ICICI extends Bank{
    Bank b= new Bank();
    int withdrawn=0;
    int dep=0;
    int prev_transaction;
    String tran_Status;


    int deposit(int money){
        dep=b.getSalary()+money;

        return  dep;

    }
    int withDrawl(int money){
        withdrawn=dep-money;
        try {
            if(withdrawn<0){
                System.out.println("Deposit can not in negative..");
                tran_Status="TRANSACTION FAIL!";
                return withdrawn;
            }else{
                tran_Status="TRANSACTION Pass!";
                return  withdrawn;


            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("TRANSACTION FAILURE!!");
        }

        return 0;
    }

    void log(){
        System.out.println("Time of transaction");
        System.out.println("User Account number: "+b.getAccountNo());

        System.out.println("Amount withdrawn: "+withdrawn);
        System.out.println("Amount before withdrawn: "+dep);
        System.out.println("Amount After withdrawn: "+withdrawn);
        System.out.println("Amount After withdrawn: "+tran_Status);


    }
    void exit(){
        System.exit(0);
    }
}
