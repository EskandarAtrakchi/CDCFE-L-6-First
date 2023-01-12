package rhntn;
public class MatureStudent extends Student {
    private int age;

    public MatureStudent(String name, String id, int age) {
        super(name, id);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
