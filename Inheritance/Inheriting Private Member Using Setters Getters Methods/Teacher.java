
public class Teacher extends Person {
    //setName() getName() setAge()  getAge()

    private String qualification;

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getqualification() {
        return qualification;
    }

    void displayInformation() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getqualification());

    }

}
