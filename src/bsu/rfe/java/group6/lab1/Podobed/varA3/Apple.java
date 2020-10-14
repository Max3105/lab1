package bsu.rfe.java.group6.lab1.Podobed.varA3;

public class Apple extends Food
{

    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }
    public double calculateCalories()
    {
        if(size.equals("Big"))
        {
            return 100;
        }
        else
            if(size.equals("Middle"))
            {
                return 80;
            }
            else
            {
                return 50;
            }
    }

    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }

    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'" + " и калорийностью: " + calculateCalories();
    }


}
// checkout dev...       git merge mybranch   git push
