import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {


    @Test
    void DeerTest() {
        Deer deer = new Deer();
        deer.eat(FoodType.PLANTS, 1200);
        assertEquals(true, deer.isSated());

    }

    @Test
    void BushTest() {
        Bush bush = new Bush();
        bush.eat(FoodType.PLANTS, 30);
        assertEquals(false, bush.isSated());

    }

    @Test
    void PigTest() {
        Pig pig = new Pig();
        pig.eat(FoodType.MEAT, 300);
        assertEquals(false, pig.isSated());

    }

    @Test
    void ChimpTest() {
        Chimp chimp = new Chimp();
        chimp.eat(FoodType.MEAT, 1300);
        assertEquals(true, chimp.isSated());
    }

    @Test
    void PandaTest() {
        Panda panda = new Panda();
        panda.eat(FoodType.PLANTS, 3000);
        assertNotEquals(true, panda.isSated());
        panda.eat(FoodType.PLANTS, 6000);
        assertEquals(true, panda.isSated());
    }

    @Test
    void WolfTest() {
        Wolf wolf = new Wolf();
        wolf.eat(FoodType.MEAT, 100);
        wolf.eat(FoodType.MEAT, 200);
        wolf.eat(FoodType.MEAT, 300);
        assertEquals(true, wolf.isSated());
    }

}