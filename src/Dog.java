package src.src;
//Собаки ещё как умеют звуки воспроизводить, если ты понимаешь, о чём я:)
public class Dog extends Animals implements Bite,AbilityToScratch {

    public Dog(String name) {

    }

    public Dog() {

    }

    void jump() {

    }
//А вот если бы у тебя не было в Animals этого метода, то тебе бы его не пришлось здесь реализовывать.
    // но я должна буду реализовать интерфейс AbilityToScratch здесь, так?

    @Override
    public void scratch() {}

    @Override
    public void Bite() {
        System.out.print("Гав-гав");
    }


}
