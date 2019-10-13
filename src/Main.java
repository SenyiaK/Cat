public class Main {



    //private static Object[] name;
    public static String [] name = {"Pers", "Masha", "Fishka", "Barsik"};

    //Добавь файл gitignore
//https://github.com/github/gitignore/blob/master/Java.gitignore

    public static void main(String[] args){

        Cat ourcat = new Cat((String) name[3]);
        ourcat.jump();
        ourcat.scratch();


        PlaySound cat1 = new Cat((String) name[1]);

        cat1.print();

        Animals cat2 = new Cat((String) name[0]);

        cat2.getName();
        cat2.print();

        Cat cat3 =  new Cat((String)name[3]);
        cat3.scratch();
        // write your code here
    }

    public static void setName(Object[] name) {

        Main.name = (String[]) name;
    }
    // write your code here
}