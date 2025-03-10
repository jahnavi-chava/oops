class Calculator {
    int a = 4;
    int b = 5;

    class Addition extends Calculator {
        public void add(int a, int b) {
            System.out.println("Addition=" + (a + b));
        }
    }

    class Subtraction extends Addition {
        public void sub(int a, int b) {
            System.out.println("Subtraction=" + (a - b));
        }
    }

    class Multiplication extends Subtraction {
        public void mul(int a, int b) {
            System.out.println("Multiplication=" + (a * b));
        }
    }

    class Division extends Multiplication {
        public void div(int a, int b) {
            System.out.println("Division=" + (a / b));
        }
    }
}

class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Calculator.Addition add = c.new Addition();
        add.add(4, 5);
        
        Calculator.Subtraction sub = c.new Subtraction();
        sub.sub(4, 5);
        
        Calculator.Multiplication mul = c.new Multiplication();
        mul.mul(4, 5);
        
        Calculator.Division div = c.new Division();
        div.div(4, 5);
    }
}
