import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;
// import static jdk.nashorn.internal.objects.Global.print;


public class Main {



    // public static String [] name = {"Pers", "Masha", "Fishka", "Barsik"};


    //Добавь файл gitignore
//https://github.com/github/gitignore/blob/master/Java.gitignore
//зачем AbilityToScratch здесь? После такого у нас не получится собраться.
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
           cats.add("Cтеша");
           cats.add("Степа");
        List<String> dogs = new ArrayList<>();
        dogs.add("Рэм");
        dogs.add("Cэм");
        dogs.add("Дик");
         animals.addAll(cats);
         animals.addAll(dogs);
        out.println("Animals: "+animals);

        for (int i = 0; i < animals.size(); i++) {
            if (dogs.contains(animals.get(i))) {
                System.out.println("scratch");
                System.out.println("Bite");
            }
                else {
                        System.out.println("jump");
                        System.out.println("scratch");
                        System.out.println("PlaySounds");

                    }
                }
            }
        }




