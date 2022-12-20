public class Pig implements Animal{
    int currentCalories = 0;
    public static final int REQUIRED_MEAT_CALORIES =1000;
    public static final int REQUIRED_PLANT_CALORIES =1000;
    @Override
    public void eat(FoodType food, int calories) {
        if (food.equals(FoodType.MEAT) && food.equals(FoodType.PLANTS)) {
            this.currentCalories = calories;
        }
    }
    @Override
    public boolean isSated(){
        if(currentCalories >= 3000 && currentCalories >= REQUIRED_MEAT_CALORIES && currentCalories >= REQUIRED_PLANT_CALORIES) {
            return true;
        }
        return false;
    }
}

