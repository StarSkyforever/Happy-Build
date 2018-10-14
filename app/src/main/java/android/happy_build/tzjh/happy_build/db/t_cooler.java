package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

public class t_cooler extends LitePalSupport {
    private int  cooler_id;

    private String cooler_manufacturer;

    private String cooler_name;

    private String cooler_model;

    private String cooler_heat_dissipation_mode;

    private String cooler_scope_application;

    private String cooler_price;

    @Override
    public String toString() {
        return "t_cooler{" +
                "cooler_id=" + cooler_id +
                ", cooler_manufacturer='" + cooler_manufacturer + '\'' +
                ", cooler_name='" + cooler_name + '\'' +
                ", cooler_model='" + cooler_model + '\'' +
                ", cooler_heat_dissipation_mode='" + cooler_heat_dissipation_mode + '\'' +
                ", cooler_scope_application='" + cooler_scope_application + '\'' +
                ", cooler_price='" + cooler_price + '\'' +
                '}';
    }

    public int getCooler_id() {
        return cooler_id;
    }

    public void setCooler_id(int cooler_id) {
        this.cooler_id = cooler_id;
    }

    public String getCooler_manufacturer() {
        return cooler_manufacturer;
    }

    public void setCooler_manufacturer(String cooler_manufacturer) {
        this.cooler_manufacturer = cooler_manufacturer;
    }

    public String getCooler_name() {
        return cooler_name;
    }

    public void setCooler_name(String cooler_name) {
        this.cooler_name = cooler_name;
    }

    public String getCooler_model() {
        return cooler_model;
    }

    public void setCooler_model(String cooler_model) {
        this.cooler_model = cooler_model;
    }

    public String getCooler_heat_dissipation_mode() {
        return cooler_heat_dissipation_mode;
    }

    public void setCooler_heat_dissipation_mode(String cooler_heat_dissipation_mode) {
        this.cooler_heat_dissipation_mode = cooler_heat_dissipation_mode;
    }


    public String getCooler_scope_application() {
        return cooler_scope_application;
    }

    public void setCooler_scope_application(String cooler_scope_application) {
        this.cooler_scope_application = cooler_scope_application;
    }

    public String getCooler_price() {
        return cooler_price;
    }

    public void setCooler_price(String cooler_price) {
        this.cooler_price = cooler_price;
    }
}
