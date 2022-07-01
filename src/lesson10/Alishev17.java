package lesson10;

public class Alishev17 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Dmitry", 33);
        String s1 = "Dmitry";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 55);
        person1.speak();
        person2.speak();
    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " I'm " + age + " years old");
        }
    }
}
