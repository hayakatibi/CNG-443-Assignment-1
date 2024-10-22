import java.util.Date;
public class Order {
    private Date orderDate;
    private LaundryItem [] itemList;
    private boolean paidStatus;
public double totalOrderCost(){
    double cost=0;
    for (int i = 0; i < itemList.length; i++) {
        cost+=itemList[i].totalCost();
    }
    return cost;
}
    public Order(LaundryItem[] itemList, boolean paidStatus) {
        this.orderDate = new Date();
        this.itemList = itemList;
        this.paidStatus = paidStatus;
    }

    public Order(LaundryItem[] itemList) {
        this.orderDate = new Date();
        this.itemList = itemList;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public LaundryItem[] getItemList() {
        return itemList;
    }

    public void setItemList(LaundryItem[] itemList) {
        this.itemList = itemList;
    }

    public boolean isPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(boolean paidStatus) {
        this.paidStatus = paidStatus;
    }
}
