package reflection;

import iojava.json.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Car car = new Car("Mercedess", 70_000);
        car.run(100);


        //1. przez uzycie nazwy klasy
        Class carClass = Car.class;
        //2. przez obiekt
        Class carClass2 =  car.getClass();
        //3. przez pelna nazwę klasy
        Class carClass3 = Class.forName("reflection.Car");


        Method[] methods = carClass3.getMethods();
        for (Method method : methods) {
       /*     System.out.println("Typ zwracany:");
            System.out.println(method.getReturnType());
            System.out.println("Nazwa:");*/
            //System.out.println(method.getName());
        }

        //wyszukać metodę i ją wywołać - wykonane!
        //wyszukać konstruktor i go wywołać (tworząc nowy obiekt)
        //zmienić wartość w prywatnym polu bez uzycia settera
                                            // nazwa metody, przyjmowane parametry
        Method methodRun = carClass.getMethod("run", int.class);
        System.out.println(methodRun);
        methodRun.invoke(car,  10);


    }
}
