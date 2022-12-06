package model;
import java.math.BigDecimal;

public class DestinationCard {
    private BigDecimal value;
    private String currency;

    public DestinationCard(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "value= " + value +
                ", currency= '" + currency + '\'' +
                '}';
    }
}