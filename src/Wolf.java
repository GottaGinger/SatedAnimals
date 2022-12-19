public class Wolf implements Animal{
    int currentCalories = 0;
    @Override
    public void eat(FoodType food, int calories) {
        if (food.equals(FoodType.MEAT)) {
            currentCalories += calories;
        }
    }
    @Override
    public boolean isSated(){
        if(currentCalories >= 800) {
            return true;
        }
        return false;
    }
}

