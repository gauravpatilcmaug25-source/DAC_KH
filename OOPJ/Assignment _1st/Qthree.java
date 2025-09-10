import java.util.Scanner;

class Qthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t Hii 🖐!! Welcome To Public Bank Of India 🏦💷 \n");
        System.out.println("Enter the Transaction You wanna make 💷💶💶");

        int tran = sc.nextInt();

        if (tran > 0) {
            System.out.println("You have Deposited : $" + tran);
        } else if (tran < 0) {
            System.out.println("You have Withdrawn : $" + (-tran));
        } else {
            System.out.println("Invalid Transaction 👎 ");
        }

        sc.close();
    }
}
