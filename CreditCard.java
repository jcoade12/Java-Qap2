// CreditCard.java
public class CreditCard {
    private final Person owner;
    private final Money balance;
    private final Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0, 0); // Initial balance is zero
        this.creditLimit = new Money(creditLimit); // Use the copy constructor
    }

    public String getPersonals() {
        return owner.toString();
    }

    public Money getBalance() {
        return new Money(balance); // Return a new Money object (copy)
    }

    public Money getCreditLimit() {
        return new Money(creditLimit); // Return a new Money object (copy)
    }

    public Money getAvailableCredit() {
        Money availableCredit = new Money(creditLimit);
        availableCredit.subtract(balance);
        return availableCredit; // Return a new Money object (copy)
    }

    public void charge(Money amount) {
        Money newBalance = new Money(balance);
        newBalance.add(amount);
        if (newBalance.compareTo(creditLimit) > 0) {
            System.out.println("Exceeds credit limit");
        } else {
            balance.add(amount);
            System.out.println("Charge: " + amount);
        }
    }

    public void payment(Money amount) {
        balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }

    @Override
    public String toString() {
        return "CreditCard[owner=" + owner + ", balance=" + balance + ", creditLimit=" + creditLimit + "]";
    }
}
