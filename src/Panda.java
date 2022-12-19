public class Panda implements Animal{
    int currentCalories = 0;
    @Override
    public void eat(FoodType food, int calories) {
        if (food.equals(FoodType.PLANTS)) {
            this.currentCalories = (calories/2);
        }
    }
    @Override
    public boolean isSated(){
        if(currentCalories >= 3000) {
            return true;
        }
        return false;
    }
}
