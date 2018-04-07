package unit.testing;

public class Calculator {
    private String name;

    public int addition(int num1, int num2) {
        int total= num1 + num2;
        return total;
    }

    public int substraction(int num1, int num2) {
        int total= num1 - num2;
        return total;
    }

    public int multiplication(int num1, int num2) {
        int total = num1* num2;
        return total;
    }

    public boolean equalNum(int num1, int num2) {
        return (num1-1 == num2);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
