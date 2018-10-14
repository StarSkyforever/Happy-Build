package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

public class t_power extends LitePalSupport {
    private int power_id;
    //电源提供商
    private String power_manufacturer;

    private String power_name;

    private String power_model;

    private String power_output;

    private String power_sata_interface;

    private int power_price;

    @Override
    public String toString() {
        return "t_power{" +
                "power_id=" + power_id +
                ", power_manufacturer='" + power_manufacturer + '\'' +
                ", power_name='" + power_name + '\'' +
                ", power_model='" + power_model + '\'' +
                ", power_output='" + power_output + '\'' +
                ", power_sata_interface='" + power_sata_interface + '\'' +
                ", power_price=" + power_price +
                '}';
    }

    public int getPower_price() {
        return power_price;
    }

    public void setPower_price(int power_price) {
        this.power_price = power_price;
    }

    public int getPower_id() {
        return power_id;
    }

    public void setPower_id(int power_id) {
        this.power_id = power_id;
    }

    public String getPower_manufacturer() {
        return power_manufacturer;
    }

    public void setPower_manufacturer(String power_manufacturer) {
        this.power_manufacturer = power_manufacturer;
    }

    public String getPower_name() {
        return power_name;
    }

    public void setPower_name(String power_name) {
        this.power_name = power_name;
    }

    public String getPower_model() {
        return power_model;
    }

    public void setPower_model(String power_model) {
        this.power_model = power_model;
    }

    public String getPower_output() {
        return power_output;
    }

    public void setPower_output(String power_output) {
        this.power_output = power_output;
    }

    public String getPower_sata_interface() {
        return power_sata_interface;
    }

    public void setPower_sata_interface(String power_sata_interface) {
        this.power_sata_interface = power_sata_interface;
    }




}
