package no.nith.pg5100.entity.one_to_many;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class MyOrder {
    @Id
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @OneToMany
    @JoinTable(name = "OrderToOrderLine")
    private List<OrderLine> orderLines;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderLines=" + orderLines +
                ", creationDate=" + creationDate +
                ", id=" + id +
                '}';
    }
}
