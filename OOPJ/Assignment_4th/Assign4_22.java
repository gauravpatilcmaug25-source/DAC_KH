class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
	
    protected void finalize() throws Throwable {
        System.out.println("Student object for " + name + " is being garbage collected");
    }
}

public class Assign4_22 {
    public static void main(String[] args) {
        Student s1 = new Student("Amit");
        s1 = null;

        System.gc();

        System.out.println("End of main method");
    }
}
