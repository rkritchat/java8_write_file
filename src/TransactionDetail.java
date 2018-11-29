import java.io.Serializable;
import java.math.BigDecimal;

public class TransactionDetail implements Serializable {
    private String id;
    private String time;
    private String description;
    private BigDecimal amount;

    public String getId() {
        return id;
    }

    public TransactionDetail setId(String id) {
        this.id = id;
        return this;
    }

    public String getTime() {
        return time;
    }

    public TransactionDetail setTime(String time) {
        this.time = time;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TransactionDetail setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransactionDetail setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        return "TransactionDetail{" +
                "id='" + id + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
