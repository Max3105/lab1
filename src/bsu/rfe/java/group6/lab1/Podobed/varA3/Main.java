package bsu.rfe.java.group6.lab1.Podobed.varA3;




public class Main {

    public static void main(String[] args) throws Exception {
// Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        int howmanyMilk = 0;
        int howmanyApple = 0;
        int howmanyCheese = 0;
        int howmanyBigApple=0;
        int howmanyMiddleApple=0;
        int HowmanyLittleApple=0;
        int HowmanyBigMilk=0;
        int HowmanyMiddleMilk=0;
        int HowmanyLittleMilk=0;

        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                howmanyCheese++;
                breakfast[itemsSoFar] = new Cheese();
                
            } else if (parts[0].equals("Apple")) {
                howmanyApple++;
                breakfast[itemsSoFar] = new Apple(parts[1]);
                if(parts[1].equals("Big"))
                {
                    howmanyBigApple++;
                }
                else if(parts[1].equals("Middle"))
                {
                    howmanyMiddleApple++;
                }
                else {
                    HowmanyLittleApple++;
                }
            }
            if (parts[0].equals("Milk")) {
                howmanyMilk++;
                breakfast[itemsSoFar] = new Milk(parts[1]);
                if(parts[1].equals("1.5%"))
                {
                    HowmanyLittleMilk++;
                }
                else if(parts[1].equals("2.5%"))
                {
                    HowmanyMiddleMilk++;
                }
                else {
                    HowmanyBigMilk++;
                }
            }
            itemsSoFar++;
        }
        for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;
            System.out.println("Apples eaten: " + howmanyApple);
            System.out.println("Parts of cheese eaten: " + howmanyCheese);
            System.out.println("Cups of milk drank: " + howmanyMilk);
            System.out.println(itemsSoFar + " products eaten");
            System.out.println("Calories from Milk 1.5% : "+HowmanyLittleMilk);
            System.out.println("Calories from Milk 2.5% : "+HowmanyMiddleMilk);
            System.out.println("Calories from Milk 5% : "+HowmanyBigMilk);
            System.out.println("Calories from Big apple "+ howmanyBigApple);
            System.out.println("Calories from Middle apple "+ howmanyMiddleApple);
            System.out.println("Calories from Little apple "+ HowmanyLittleApple);
    }
}