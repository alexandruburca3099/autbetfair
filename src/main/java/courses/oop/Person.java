package courses.oop;

public class Person {
    private String name;
    private String cnp;
    private Gender sex;

    private boolean isHungry;

    public Person(String name, String cnp, Gender sex) {
        this.name = name;
        this.cnp = cnp;
        this.sex = sex;
    }


    public void eat() {
        if (isHungry) {
            isHungry = false;
        }
    }

    public void askForFood() {
        isHungry = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public Gender getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cnp='" + cnp + '\'' +
                ", sex=" + sex +
                '}';
    }
}