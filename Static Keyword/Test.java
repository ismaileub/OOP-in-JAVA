
public class Test {

    public static void main(String[] args) {

        Student student1 = new Student("Shohan", 101);
        Student student2 = new Student("Yeasir", 102);

        student1.displayInformation();
        student2.displayInformation();

        //to access the static variable din't need to use object object because it related to class 
        //System.out.println("Institution:" Student.universityName+);
    }

}
