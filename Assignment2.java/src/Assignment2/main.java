package Assignment2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        SBI s=new SBI();
        BOI b=new BOI();
        ICICI i=new ICICI();
        Bank bank=new Bank();
        Scanner scan=new Scanner(System.in);
        int option='\0';
       
        int salary;
        String name;
        char c;
        System.out.println("******* Welcome to Bank ********\n");

        System.out.println("Name: "+bank.getpName());
        System.out.println("Account number: "+bank.getAccountNo());
        System.out.println("Salary: "+bank.getSalary());

        System.out.println("******** Select your bank *********\n");
        System.out.println("1. SBI ");
        System.out.println("2. BOI ");
        System.out.println("3. ICICI ");

do{
    option =scan.nextInt();
    switch (option){
        case 1:
            System.out.println(" Welcome to SBI Bank");
            System.out.println(" What would you like to do?");
            System.out.println("D. Deposit");
            System.out.println("W. Withdraw");
            System.out.println("L. Check for log");
            System.out.println("Q. exit");


            do {
                 c = scan.next().charAt(0);
                switch (c) {
                    case 'D':
                        System.out.printf("Enter deposit amount: ");
                        salary = scan.nextInt();
                        s.deposit(salary);
                        System.out.println("Your deposit Amount : " + s.deposit(salary));
                        break;
                    case 'W':
                        System.out.printf("Enter withdrawn amount ; ");
                        salary = scan.nextInt();
                        s.withDrawl(salary);
                        System.out.println("Your withdrawn Amount is: " + s.withDrawl(salary));
                        break;
                    case 'L':
                        s.log();
                    case 'Q':
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong Input!");
                        break;
                }
            }while (c!='Q');
                break;

        case 2:
            System.out.println("Welcome to Bank Of India");
            System.out.println(" What would you like to do?");
            System.out.println("D. Deposit");
            System.out.println("W. Withdraw");
            System.out.println("L. Check for log");
            System.out.println("Q. exit");
            do {
                c = scan.next().charAt(0);
                switch (c) {
                    case 'D':
                        System.out.println("Enter deposit amount: ");
                        salary = scan.nextInt();
                        b.deposit(salary);
                        System.out.println("Your deposit Amount: " + b.deposit(salary));
                        break;
                    case 'W':
                        System.out.println("Enter withdrawn amount: ");
                        salary = scan.nextInt();
                        b.withDrawl(salary);
                        System.out.println("Your withdrawn Amount is: " + b.withDrawl(salary));
                        break;
                    case 'L':
                        b.log();
                    case 'Q':
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong Input!");
                        break;
                }
            }while (c!='Q');

            break;
        case 3:
            System.out.printf("Welcome to ICICI Bank");
            System.out.println(" What would you like to do?");
            System.out.println("D. Deposit");
            System.out.println("W. Withdraw");
            System.out.println("L. Check for log");
            System.out.println("Q. exit");
            do {
                c = scan.next().charAt(0);
                switch (c) {
                    case 'D':
                        System.out.printf("Enter deposit amount: ");
                        salary = scan.nextInt();
                        i.deposit(salary);
                        System.out.println("Your deposit Amount: " + i.deposit(salary));
                        break;
                    case 'W':
                        System.out.printf("Enter withdrawn amount: ");
                        salary = scan.nextInt();
                        i.withDrawl(salary);
                        System.out.println("Your withdrawn Amount is: " + i.withDrawl(salary));
                        break;
                    case 'L':
                        i.log();
                    case 'Q':
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong Input!");
                        break;
                }
            }while (c!='Q');
            break;
        default:
            System.out.printf("Oops! something went wrong");
break;
    }break;
}while(option!=3);


    }
}
