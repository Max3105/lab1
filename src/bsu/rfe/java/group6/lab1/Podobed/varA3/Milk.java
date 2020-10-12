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
            return super.toString() + " жирностью '" + fat.toUpperCase() + "'";
        }

        public boolean equals(Object arg0) {
            if (super.equals(arg0)) {
                if (!(arg0 instanceof Milk)) return false;
                return fat.equals(((Milk)arg0).fat);
            } else
                return false;
        }
}
