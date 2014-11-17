package examples.crud.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by serhii on 06.11.14.
 */
@Entity
@Table(name = "orders")
@JsonAutoDetect
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", nullable = false)
    @JsonProperty
    private int id;
    @Column(name = "order_number", nullable = false, unique = true)
    @JsonProperty
    private String orderNumber;
    @Column(name = "order_date", nullable = false)
    @JsonProperty
    private Date date;

    @ManyToMany
    @JoinTable(name = "order_has_products", joinColumns = {@JoinColumn(name = "order_id")}, inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private List<Product> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", date=" + date +
                '}';
    }
}