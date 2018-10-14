package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

public class t_cpu extends LitePalSupport {
    private int cpu_id;

    private String cpu_manufacturer;

    private String cpu_name;

    private String cpu_model;

    private String cpu_frequency;

    private String cpu_core;

    private String cpu_interface_type;

    private String cpu_core_graphics_card;

    @Override
    public String toString() {
        return "t_cpu{" +
                "cpu_id=" + cpu_id +
                ", cpu_manufacturer='" + cpu_manufacturer + '\'' +
                ", cpu_name='" + cpu_name + '\'' +
                ", cpu_model='" + cpu_model + '\'' +
                ", cpu_frequency='" + cpu_frequency + '\'' +
                ", cpu_core='" + cpu_core + '\'' +
                ", cpu_interface_type='" + cpu_interface_type + '\'' +
                ", cpu_core_graphics_card='" + cpu_core_graphics_card + '\'' +
                '}';
    }

    public int getCpu_id() {
        return cpu_id;
    }

    public void setCpu_id(int cpu_id) {
        this.cpu_id = cpu_id;
    }

    public String getCpu_manufacturer() {
        return cpu_manufacturer;
    }

    public void setCpu_manufacturer(String cpu_manufacturer) {
        this.cpu_manufacturer = cpu_manufacturer;
    }

    public String getCpu_name() {
        return cpu_name;
    }

    public void setCpu_name(String cpu_name) {
        this.cpu_name = cpu_name;
    }

    public String getCpu_model() {
        return cpu_model;
    }

    public void setCpu_model(String cpu_model) {
        this.cpu_model = cpu_model;
    }

    public String getCpu_frequency() {
        return cpu_frequency;
    }

    public void setCpu_frequency(String cpu_frequency) {
        this.cpu_frequency = cpu_frequency;
    }

    public String getCpu_core() {
        return cpu_core;
    }

    public void setCpu_core(String cpu_core) {
        this.cpu_core = cpu_core;
    }

    public String getCpu_interface_type() {
        return cpu_interface_type;
    }

    public void setCpu_interface_type(String cpu_interface_type) {
        this.cpu_interface_type = cpu_interface_type;
    }

    public String getCpu_core_graphics_card() {
        return cpu_core_graphics_card;
    }

    public void setCpu_core_graphics_card(String cpu_core_graphics_card) {
        this.cpu_core_graphics_card = cpu_core_graphics_card;
    }
}
