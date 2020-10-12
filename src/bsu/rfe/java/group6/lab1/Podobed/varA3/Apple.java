package bsu.rfe.java.group6.lab1.Podobed.varA3;

public class Apple extends Food
{

    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
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
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }
}
// checkout dev...       git merge mybranch   git push
