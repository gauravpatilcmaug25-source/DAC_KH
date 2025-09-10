import java.util.Scanner;

class Qtwentyfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
		
		if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            return;
        }
        
        String grade;
        
        switch (marks) {
            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24 : grade = "F";
            case 25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44 : grade = "E";
            case 45,46,47,48,49,50,51,52,53,54 : grade = "D";
            case 55,56,57,58,59,60,61,62,63,64,65,66,67,68,69 : grade = "C";
            case 70,71,72,73,74,75,76,77,78,79,80,81,82,83,84 : grade = "B";
            case 85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100 : grade = "A";
            default : grade = "Invalid";
        }
        
        System.out.println("Grade: " + grade);
    }
}

/*
        String grade;

        switch (marks / 10) {
            case 10: 
            case 9:  
            case 8: 
                grade = (marks >= 85) ? "A" : "B";
                break;

            case 7:  
                grade = "B";
                break;

            case 6:  
            case 5:  
                grade = (marks >= 55) ? "C" : "D";
                break;

            case 4: 
            case 3:
            case 2:  
                grade = (marks >= 45) ? "D" : (marks >= 25 ? "E" : "F");
                break;

            default: // 0–24
                grade = "F";
        }

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
*/
