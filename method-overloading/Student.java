public class Student {
    public String name;
    public String department;
    public double cgpa;
    public int credits;
    public String scholarshipStatus;    
    
    public Student() {
        this.name = "Not Set";
        this.department = "CSE";
        this.cgpa = 0.0;
        this.credits = 9;
        this.scholarshipStatus = "Not Set";
    }    
    
    public void updateDetails(String name, double cgpa, int credits) {
        this.name = name;
        this.cgpa = cgpa;
        this.credits = credits;
        this.department = "CSE";
    }    
    
    public void updateDetails(String name, double cgpa, int credits, String department) {
        this.name = name;
        this.cgpa = cgpa;
        this.credits = credits;
        this.department = department;
    }    
    
    public void checkScholarshipEligibility() {
        if (cgpa >= 3.7) {
            scholarshipStatus = "Merit based scholarship";
            System.out.println(name + " is eligible for Merit based scholarship");
        } else if (cgpa >= 3.5 && credits > 10) {
            scholarshipStatus = "Need based scholarship";
            System.out.println(name + " is eligible for Need based scholarship");
        } else {
            scholarshipStatus = "No scholarship";
            System.out.println(name + " is not eligible for scholarship");
        }
    }    
    
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Credits: " + credits);
        System.out.println("Scholarship Status: " + scholarshipStatus);
    }
}