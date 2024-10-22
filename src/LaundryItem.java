public class LaundryItem {
    private String type;
    private int quantity, price;
    private String notes;
    private Employee assigned;

    public LaundryItem(String type, int quantity, int price, String notes, Employee assigned) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.notes = notes;
        this.assigned = assigned;
    }

    public LaundryItem(String type, int quantity, int price) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }
    public double totalCost(){
        return quantity*price;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Employee getAssigned() {
        return assigned;
    }

    public void setAssigned(Employee assigned) {
        this.assigned = assigned;
    }
}
