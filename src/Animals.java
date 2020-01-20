package src.src;
//Зачем здесь Type parameter? Ты же его даже не используешь
public abstract class Animals<weight> {

    public String name;
    //Почему это поле статическое?
    public static int weight;


    public Animals(String name) {
        this.name = name;
    }
    //Предлагаю тут исходить из соображения, что у любого животного должно быть имя, а вес сделай по умолчанию.
    //Либо у животных нет имени и используется пустой конструктор из 17 строки.
    public Animals(int weight) {this.weight = weight;}

    public Animals() {}

    public void eat() {
        System.out.println("Ом-ном-ном");
    }

    //С прыжками ты поторопилась, но что сделано, то сделано, не стоит оставлять этот метод абстрактным, сделай
    //для него базовую реализацию, чтобы он мог кинуть UnsupportedOperationException
    protected abstract void jump();

    public static void getName() {}

    public void print() {}

    //Оставь этот абстрактный метод интерфейсу, не все звери умеют царапаться, представляешь, если бы слоны умели, а
    //ещё любили бы запрыгнуть хозяину на ручки? Не много было бы хозяев у слонов:)
    public abstract void scratch();
}
