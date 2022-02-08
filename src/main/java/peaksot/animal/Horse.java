package peaksot.animal;

public class Horse implements Animal{
    private String name;
    private int age;

    public Horse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Horse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String animalPlus() {
        return ("drive fast!!!");
    }

    @Override
    public String animalMinus() {
        return ("cost dearly!!!");
    }

    @Override
    public String toString() {
        return " Horse " +
                " name " + name +
                " age " + age;
    }
}
