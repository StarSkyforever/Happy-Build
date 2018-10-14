package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

public class t_hard_disk extends LitePalSupport {
    private int hard_disk_id;

    private String hard_disk_manufacturer;

    private String hard_disk_name;

    private String hard_disk_model;

    private String hard_disk_capacity;

    private String hard_disk_interface;

    private String hard_disk_type;

    private String hard_disk_price;

    public int getHard_disk_id() {
        return hard_disk_id;
    }

    public void setHard_disk_id(int hard_disk_id) {
        this.hard_disk_id = hard_disk_id;
    }

    public String getHard_disk_manufacturer() {
        return hard_disk_manufacturer;
    }

    public void setHard_disk_manufacturer(String hard_disk_manufacturer) {
        this.hard_disk_manufacturer = hard_disk_manufacturer;
    }

    public String getHard_disk_name() {
        return hard_disk_name;
    }

    public void setHard_disk_name(String hard_disk_name) {
        this.hard_disk_name = hard_disk_name;
    }

    public String getHard_disk_model() {
        return hard_disk_model;
    }

    public void setHard_disk_model(String hard_disk_model) {
        this.hard_disk_model = hard_disk_model;
    }

    public String getHard_disk_capacity() {
        return hard_disk_capacity;
    }

    public void setHard_disk_capacity(String hard_disk_capacity) {
        this.hard_disk_capacity = hard_disk_capacity;
    }

    public String getHard_disk_interface() {
        return hard_disk_interface;
    }

    public void setHard_disk_interface(String hard_disk_interface) {
        this.hard_disk_interface = hard_disk_interface;
    }

    public String getHard_disk_type() {
        return hard_disk_type;
    }

    public void setHard_disk_type(String hard_disk_type) {
        this.hard_disk_type = hard_disk_type;
    }

    public String getHard_disk_price() {
        return hard_disk_price;
    }

    public void setHard_disk_price(String hard_disk_price) {
        this.hard_disk_price = hard_disk_price;
    }

    @Override
    public String toString() {
        return "t_hard_disk{" +
                "hard_disk_id=" + hard_disk_id +
                ", hard_disk_manufacturer='" + hard_disk_manufacturer + '\'' +
                ", hard_disk_name='" + hard_disk_name + '\'' +
                ", hard_disk_model='" + hard_disk_model + '\'' +
                ", hard_disk_capacity='" + hard_disk_capacity + '\'' +
                ", hard_disk_interface='" + hard_disk_interface + '\'' +
                ", hard_disk_type='" + hard_disk_type + '\'' +
                ", hard_disk_price='" + hard_disk_price + '\'' +
                '}';
    }
}
