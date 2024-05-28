// Money.java
public class Money implements Comparable<Money> {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        if (cents >= 100) {
            this.dollars = dollars + cents / 100;
            this.cents = cents % 100;
        } else {
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    public Money(int dollars) {
        this(dollars, 0);
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(dollars);
        result = 31 * result + Integer.hashCode(cents);
        return result;
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    @Override
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return Integer.compare(this.dollars, other.dollars);
        } else {
            return Integer.compare(this.cents, other.cents);
        }
    }

    public void add(Money amount) {
        this.dollars += amount.dollars;
        this.cents += amount.cents;
        if (this.cents >= 100) {
            this.dollars += this.cents / 100;
            this.cents = this.cents % 100;
        }
    }

    public void subtract(Money amount) {
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = amount.dollars * 100 + amount.cents;
        int totalCents = totalCents1 - totalCents2;
        if (totalCents < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        this.dollars = totalCents / 100;
        this.cents = totalCents % 100;
    }
}
