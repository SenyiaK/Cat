package src.src;
//Собаки ещё как умеют звуки воспроизводить, если ты понимаешь, о чём я:)
public class Dog extends Animals implements Bite {

    public Dog(String name) {super(name);}

    public Dog () {super();}

    @Override
    protected void jump() {

    }
//А вот если бы у тебя не было в Animals этого метода, то тебе бы его не пришлось здесь реализовывать.
    @Override
    public void scratch() {}

    @Override
    public void Bite() {
        System.out.print("Гав-гав");
    }

}
