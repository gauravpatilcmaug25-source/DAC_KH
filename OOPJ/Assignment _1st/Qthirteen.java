import java.util.Scanner;

class Qthirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Classes : ");
        int tc = sc.nextInt();

        System.out.println("Enter Attended Classes : ");
        int ac = sc.nextInt();

        System.out.println("Any medical leave (Y/N): ");
        char ml = sc.next().charAt(0);

        double per = (100.0 * ac) / tc;

        System.out.println("Attendance = " + per + "%");

        if (per >= 75) {
            System.out.println("Allow to sit in exam ✅");
        } 
        else if (per < 75 && (ml == 'Y' || ml == 'y')) {
            System.out.println("Allow to sit in exam due to medical cause 🏥");
        } 
        else {
            System.out.println("Not allowed ❌");
        }

        sc.close();
    }
}
