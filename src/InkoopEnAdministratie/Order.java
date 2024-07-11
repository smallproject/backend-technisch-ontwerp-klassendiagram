package InkoopEnAdministratie;

import java.util.Date;

public class Order {
    private String id;
    private Date orderDate;
    private double totalAmount;
    private String status;
    private Date createdAt;
    private Date updatedAt;

    private User userId;
}
