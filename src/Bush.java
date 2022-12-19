public class Bush implements Animal {
    int currentCalories = 0;
    @Override
    public void eat(FoodType food, int calories) {
        if (food.equals(FoodType.LIGHT))
            this.currentCalories = calories;
    }
    @Override
    public boolean isSated(){
        if(currentCalories >= 50) {
            return true;
        }
        return false;
    }
}