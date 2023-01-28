package domain;

public class Customer {

    private int ID;
    private boolean isNew;
    private float total;

    public Customer() {
        ID = 1;
        isNew = true;
        total = 1000;

    }

    public void displayCustomerInfo() {
        System.out.println("ID the client:" + ID);
        System.out.println("isNew client status:" + isNew);
        System.out.println("total the amount of orders for the year:" + total);
    }

    public void setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
        }

    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;

    }

    public void setTotal(float total) {
        if (total > 0) {
            this.total = total;
        }

    }
}
