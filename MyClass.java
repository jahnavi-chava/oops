public class MyClass {
    public static int count = 0;
    public static final double pi = 3.1415;

    // Constructor
    public MyClass() {
        count++;
    }

    public static void main(String[] args) {
        // Create objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Print the final values of "count" and "pi"
        System.out.println("Final Count: " + count);
        System.out.println("Value of Pi: " + pi);
    }
}

