class Bank {
    String name;
    int accno;
    double p;

    public Bank(String name, int accno, double p) {
        this.name = name;
        this.accno = accno;
        this.p = p;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Principal Amount: " + p);
    }
}

class Account extends Bank {
    double amt;

    public Account(String name, int accno, double p, double amt) {
        super(name, accno, p);
        this.amt = amt;
    }

    public void deposit() {
        p = p + amt;
    }

    public void withdraw() {
        if (amt > p) {
            System.out.println("INSUFFICIENT BALANCE");
        } else {
            p = p - amt;
            if (p < 500) {
                // Apply penalty
                p = p - (500 - p) / 10;
            }
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Transaction Amount: " + amt);
    }
}