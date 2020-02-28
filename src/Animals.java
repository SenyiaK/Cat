package src.src;

public abstract class Animals {

    public String name;
    //Почему это поле статическое?
    public int weight;
// чтобы независимо от любого объекта этого класса его использовать. Или же нужно было задать, но не объявлять, т.е.
    // не присваивать данной переменной никакого значения?

   // public Animals(String name) {
       // this.name = name;
    //}

    public Animals(String name) {

    }

    public Animals() {

    }

    public void eat() {
        System.out.println("Ом-ном-ном");
    }


    void jump() {
        throw new UnsupportedOperationException("jump");
    }


    public static void getName() {

    }

    public void print() {

}

    //Оставь этот абстрактный метод интерфейсу, не все звери умеют царапаться, представляешь, если бы слоны умели, а
    //ещё любили бы запрыгнуть хозяину на ручки? Не много было бы хозяев у слонов:)
   // public abstract void scratch();
    // правильно ли я поняла, что я просто буду реализовать интерфейс в классах, относящихся к какому либо виду животного?
}
