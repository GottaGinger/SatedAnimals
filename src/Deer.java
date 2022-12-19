public class Deer implements Animal {
    int currentCalories = 0;

    @Override
    public void eat(FoodType food, int calories) {
        if(food.equals(FoodType.PLANTS))
            this.currentCalories = calories;
    }
    @Override
    public boolean isSated() {
        if(currentCalories >= 1200) {
            return true;
        }
        return false;
    }
}
