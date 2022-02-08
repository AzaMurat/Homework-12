package peaksot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");
        Person person = context.getBean("person1", Person.class);
        Person person2 = context.getBean("person2", Person.class);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(person);
        System.out.println("------------------------------------------");
        System.out.println(person.getAnimal().animalMinus());
        System.out.println("------------------------------------------");
        System.out.println(person.getAnimal().animalPlus());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(person2);
        System.out.println("-------------------------------------------");
        System.out.println(person.getAnimal().animalMinus());
        System.out.println("-------------------------------------------");
        System.out.println(person.getAnimal().animalPlus());

        context.close();
    }
}
