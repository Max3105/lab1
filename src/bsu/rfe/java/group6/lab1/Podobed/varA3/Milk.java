package bsu.rfe.java.group6.lab1.Podobed.varA3;

    public class Milk extends Food {
        private String fat;

        public Milk(String fat) {
            super("Молоко");
            this.fat = fat;
        }

        public String getfat() {
            return fat;
        }


        public void setfat(String fat) {
            this.fat = fat;
        }

        @Override
        public void consume() {
            System.out.println(this + " выпито");
        }

        public String toString() {
            return super.toString() + " жирностью '" + fat.toUpperCase() + "'" + " и калорийностью: " + calculateCalories();
        }
public double calculateCalories()
{
    if(fat.equals(" 1.5%"))
    {
        return 20;
    }
    else
        if(fat.equals(" 2.5%"))
        {
            return 30;
        }
        else
        {
            return 54;
        }
}

}
