package bsu.rfe.java.group6.lab1.Podobed.varA3;


    public class Cheese extends Food {
        public Cheese() {
            super("Сыр");
        }
        public void consume() {
            System.out.println(this + " съеден" + " и калорийностью: " + calculateCalories());
        }
        public double calculateCalories()
        {
            return 70;
        }
// Переопределять метод equals() в данном классе не нужно, т.к. он
// не добавляет новых полей данных, а сравнение по внутреннему полю name
// уже реализовано в базовом классе
// Переопределять метод toString() в данном классе не нужно, т.к. он
// не добавляет внутренних полей данных, а возврат поля name уже
// реализован в версии toString() базового класса
    }

