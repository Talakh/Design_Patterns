package structural.adapter;

import structural.adapter.Dog.Dog;
import structural.adapter.Lions.Lion;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class WildDogAdapter implements Lion {

    private Dog dog;

    public WildDogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String roar() {
        return dog.bark();
    }
}
