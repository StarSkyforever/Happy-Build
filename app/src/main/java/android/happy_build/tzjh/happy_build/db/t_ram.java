package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

public class t_ram extends LitePalSupport {
    private int ram_id;
    //内存条生产商
    private String ram_manufacturer;
    //内存条系列名
    private String ram_name;
    //内存条型号
    private String ram_model;
    //内存条接口型号
    private String ram_interface_type;
    //内存条频率
    private String ram_frequency;
    //内存条大小
    private String ram_memory_capacity;
    //内存条价格
    private int ram_price;

    public String getRam_manufacturer() {
        return ram_manufacturer;
    }

    public void setRam_manufacturer(String ram_manufacturer) {
        this.ram_manufacturer = ram_manufacturer;
    }

    public String getRam_name() {
        return ram_name;
    }

    public void setRam_name(String ram_name) {
        this.ram_name = ram_name;
    }

    public String getRam_model() {
        return ram_model;
    }

    public void setRam_model(String ram_model) {
        this.ram_model = ram_model;
    }

    public String getRam_interface_type() {
        return ram_interface_type;
    }

    public void setRam_interface_type(String ram_interface_type) {
        this.ram_interface_type = ram_interface_type;
    }

    public String getRam_frequency() {
        return ram_frequency;
    }

    public void setRam_frequency(String ram_frequency) {
        this.ram_frequency = ram_frequency;
    }

    public String getRam_memory_capacity() {
        return ram_memory_capacity;
    }

    public void setRam_memory_capacity(String ram_memory_capacity) {
        this.ram_memory_capacity = ram_memory_capacity;
    }

    public int getRam_price() {
        return ram_price;
    }

    public void setRam_price(int ram_price) {
        this.ram_price = ram_price;
    }

    @Override
    public String toString() {
        return "t_ram{" +
                "ram_id=" + ram_id +
                ", ram_manufacturer='" + ram_manufacturer + '\'' +
                ", ram_name='" + ram_name + '\'' +
                ", ram_model='" + ram_model + '\'' +
                ", ram_interface_type='" + ram_interface_type + '\'' +
                ", ram_frequency='" + ram_frequency + '\'' +
                ", ram_memory_capacity='" + ram_memory_capacity + '\'' +
                ", ram_price=" + ram_price +
                '}';
    }

    public int getRam_id() {
        return ram_id;
    }

    public void setRam_id(int ram_id) {
        this.ram_id = ram_id;
    }
}
