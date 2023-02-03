package Practice;

abstract class campus{
    abstract void displayCollegeName(String name);
    abstract void displayCityName(String name);
    void staff(){
        int teachingStaff = 25;
        int nonTeachingStaff = 18;
        int total = teachingStaff+nonTeachingStaff;
        System.out.println("Total staff = "+total);
    }
}

class department extends campus{
    void displayBranch(){
        String branch = "Mechanical";
        System.out.println("Branch name is "+branch);
    }
    void displayCollegeName(String name) {
        System.out.println("College name is "+name);
    }

    void displayCityName(String name) {
        System.out.println("City name is "+name);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        department dept = new department();
        dept.displayBranch();
        dept.displayCityName("Bengaluru");
        dept.displayCollegeName("SJBIT");
        dept.staff();

        campus camp = new department();
        camp.displayCityName("Chickballapura");
        camp.displayCollegeName("SJCIT");
        camp.staff();
    }
}
