package peaksot.animal;

public class Rabbit implements Animal{
    private String breed;
    private int age;

    public Rabbit(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public Rabbit() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String animalPlus() {
        return ("fluffy!!!");
    }

    @Override
    public String animalMinus() {
        return ("wild!!!");
    }

    @Override
    public String toString() {
        return " Rabbit " +
                " breed " + breed +
                " age " + age;
    }
}
