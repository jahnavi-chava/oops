class BankAccount {
    String Name;
    int AccNO, currbal;

    BankAccount(String Name, int AccNO, int currbal) {
        this.Name = Name;
        this.AccNO = AccNO;
        this.currbal = currbal;
        System.out.println("The customer details are: " + this.Name + " " + this.AccNO + " " + this.currbal);
    }

    public void withdraw(int withdrawalAmount) {
        if (withdrawalAmount <= currbal) {
            currbal = currbal - withdrawalAmount;
            System.out.println("Remaining balance: " + currbal);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public int deposit(int depositAmount) {
        currbal = currbal + depositAmount;
        return currbal;
    }

    public static void main(String[] args) {
        BankAccount ram = new BankAccount("ram", 1234, 1000);
        ram.withdraw(500); // Example of valid withdrawal
        ram.withdraw(500); // Another example of valid withdrawal
        int finalAmount = ram.deposit(5001);
        System.out.println("Final balance: " + finalAmount);
    }
}