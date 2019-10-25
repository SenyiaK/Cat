import src.src.AbilityToScratch;
import src.src.Animals;
import src.src.Cat;
import src.src.PlaySound;


public class Main {



    //private static Object[] name;
    public static String [] name = {"Pers", "Masha", "Fishka", "Barsik"};

    //Добавь файл gitignore
//https://github.com/github/gitignore/blob/master/Java.gitignore
//зачем AbilityToScratch здесь? После такого у нас не получится собраться.
    public static void main(String[] args){

        Cat ourcat = new Cat((String) name[3]);
        ourcat.jump();
        ourcat.scratch();


        PlaySound cat1 = new Cat(name[1]);

        cat1.print();

        Animals cat2 = new Cat(name[0]);

        cat2.getName();
        cat2.print();
//Этот тип не должен здесь привестись таким образом, класс может реализовывать несколько интерфейсов.
        AbilityToScratch cat3 = new Cat(name[3]);
        cat3.scratch();

        // write your code here
    }
//зачем классу Main метод setName?
   // public static void setName(Object[] name) {

      //  Main.name = (String[]) name;
    }
    // write your code here
//}