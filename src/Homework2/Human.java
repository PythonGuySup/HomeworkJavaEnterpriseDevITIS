package Homework2;

public class Human implements HumanInterface {
    private int age;
    private String name;
    private final static String regexNameValidation = "^[A-Za-z][A-Za-z0-9_]{3,29}$";

    public Human(int age, String name) throws IllegalArgumentException {
        if (age > 0 && name.matches(Human.regexNameValidation)) {
            this.age = age;
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name.matches(Human.regexNameValidation)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Возраст: " + this.age + " " + "Имя: " + this.name;
    }
}
