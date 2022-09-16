public class Student {
    private String name;
    private Integer age;
    private static String school = "uva";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public void printInfo()
    {
        System.out.println(this.name + " " + this.age + " " + Student.school);
    }

    public static void main(String[] args) {
        Student s1 = new Student("jack",15);
        Student s2 = new Student("David",20);
        s1.printInfo();
        s2.printInfo();
    }
}
