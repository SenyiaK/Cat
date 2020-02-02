package src.src;
//Зачем package src.src; убрала? Вернул.
// Поняла свой косяк здесь. Если не указывать, что данный класс относится к src,
// то при компиляции он не соберется и запустить программу будет не возможно, т.к. этот класс содержит main(String[] args)

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

// import static jdk.nashorn.internal.objects.Global.print;


public class Main {
//public static String [] name = {"Pers", "Masha", "Fishka", "Barsik"};



//Добавь файл gitignore в нём укажи маски файлов, которые git отслеживать не должен.
//https://github.com/github/gitignore/blob/master/Java.gitignore

    public static void main(String[] args){

       // Cat ourcat = new Cat((String) name[3]);
      //  ourcat.jump();
      //  ourcat.scratch();


       // PlaySound cat1 = new Cat(name[1]);

       // cat1.print();

       // Animals cat2 = new Cat(name[0]);

        //cat2.getName();
       // cat2.print();

       // AbilityToScratch cat3 = new Cat(name[3]);
        //cat3.scratch();

        // write your code here





        ArrayList<String> animals = new ArrayList<>();
        List<String> cats = new ArrayList<>();
        //List<String> cats = new ArrayList<>();
        cats.add("Cтеша");
        cats.add("Степа");
        //Cat richard = new Cat("Ричард");
        //Cat pushok = new Cat("Пушок");
       // cats.add(richard);
       //cats.add(pushok);
        List<String> dogs = new ArrayList<>();
        dogs.add("Рэм");
        dogs.add("Cэм");
        dogs.add("Дик");
        //Dog  boyka = new Dog("Бойка");
       // Dog djack = new Dog("Джэк");
        //Dog sam = new Dog("Сэм");
        //dogs.add(boyka);
       // dogs.add(djack);
        //dogs.add(sam);
        animals.addAll(cats);
        animals.addAll(dogs);
        System.out.println("Animals: "+animals);

        for (int i = 0; i < animals.size(); i++) {
           if (cats instanceof ArrayList) {
               Method[] methods = Cat.class.getDeclaredMethods();
               for (Method method : methods)
                   System.out.println(method);
               //Посмотри метод instanceOf, он здесь больше подойдёт, можно будет тогда оставить
               //один список с кошками и собаками
               //У тебя и так умолчательная реализация метода содержит System.out.println() пользуйся ей, вызывай методы.
           } else {
               Method[] methodsDog = Dog.class.getDeclaredMethods();
               for (Method methodDog : methodsDog)
                   System.out.println(methodDog);

           }
                   }
                }
            }
        //}




