final class FinalClass {
    private final int constantValue = 100;

    public final void display() {
        System.out.println("This is a final method in a final class.");
    }

    public int getConstantValue() {
        return constantValue;
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
        System.out.println("Final Variable Value: " + obj.getConstantValue());
    }
}
