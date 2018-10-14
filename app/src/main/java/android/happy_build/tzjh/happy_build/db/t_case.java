package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

public class t_case extends LitePalSupport{

    private int case_id;

    private String case_manufacturer;

    private String case_name;

    private String case_model;

    private String case_size;

    private String case_motherboard_compatibility;

    private String case_panel_interface;

    private String case_price;

    @Override
    public String toString() {
        return "t_case{" +
                "case_id=" + case_id +
                ", case_manufacturer='" + case_manufacturer + '\'' +
                ", case_name='" + case_name + '\'' +
                ", case_model='" + case_model + '\'' +
                ", case_size='" + case_size + '\'' +
                ", case_motherboard_compatibility='" + case_motherboard_compatibility + '\'' +
                ", case_panel_interface='" + case_panel_interface + '\'' +
                ", case_price='" + case_price + '\'' +
                '}';
    }

    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
    }

    public String getCase_manufacturer() {
        return case_manufacturer;
    }

    public void setCase_manufacturer(String case_manufacturer) {
        this.case_manufacturer = case_manufacturer;
    }

    public String getCase_name() {
        return case_name;
    }

    public void setCase_name(String case_name) {
        this.case_name = case_name;
    }

    public String getCase_model() {
        return case_model;
    }

    public void setCase_model(String case_model) {
        this.case_model = case_model;
    }

    public String getCase_size() {
        return case_size;
    }

    public void setCase_size(String case_size) {
        this.case_size = case_size;
    }

    public String getCase_motherboard_compatibility() {
        return case_motherboard_compatibility;
    }

    public void setCase_motherboard_compatibility(String case_motherboard_compatibility) {
        this.case_motherboard_compatibility = case_motherboard_compatibility;
    }

    public String getCase_panel_interface() {
        return case_panel_interface;
    }

    public void setCase_panel_interface(String case_panel_interface) {
        this.case_panel_interface = case_panel_interface;
    }

    public String getCase_price() {
        return case_price;
    }

    public void setCase_price(String case_price) {
        this.case_price = case_price;
    }
}
