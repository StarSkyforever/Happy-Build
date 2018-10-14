package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

public class t_motherboard extends LitePalSupport {
    private int motherboard_id;
    //主板生产商
    private String motherboard_manufactured;
    //主板名
    private String motherboard_name;
    //主板型号
    private String motherboard_model;
    //主板硬盘接口类型
    private String motherboard_hard_disk_interface_type;
    //主板cpu接口
    private String motherboard_cpu_interface;

    private String motherboard_specification;
    //主板内存接口型号
    private String motherboard_ram_interface_type;
    //主板价格
    private int motherboard_price;

    public int getMotherboard_id() {
        return motherboard_id;
    }

    public void setMotherboard_id(int motherboard_id) {
        this.motherboard_id = motherboard_id;
    }

    public String getMotherboard_manufactured() {
        return motherboard_manufactured;
    }

    public void setMotherboard_manufactured(String motherboard_manufactured) {
        this.motherboard_manufactured = motherboard_manufactured;
    }

    public String getMotherboard_name() {
        return motherboard_name;
    }

    public void setMotherboard_name(String motherboard_name) {
        this.motherboard_name = motherboard_name;
    }

    public String getMotherboard_model() {
        return motherboard_model;
    }

    public void setMotherboard_model(String motherboard_model) {
        this.motherboard_model = motherboard_model;
    }

    public String getMotherboard_hard_disk_interface_type() {
        return motherboard_hard_disk_interface_type;
    }

    public void setMotherboard_hard_disk_interface_type(String motherboard_hard_disk_interface_type) {
        this.motherboard_hard_disk_interface_type = motherboard_hard_disk_interface_type;
    }

    public String getMotherboard_cpu_interface() {
        return motherboard_cpu_interface;
    }

    public void setMotherboard_cpu_interface(String motherboard_cpu_interface) {
        this.motherboard_cpu_interface = motherboard_cpu_interface;
    }

    public String getMotherboard_ram_interface_type() {
        return motherboard_ram_interface_type;
    }

    public void setMotherboard_ram_interface_type(String motherboard_ram_interface_type) {
        this.motherboard_ram_interface_type = motherboard_ram_interface_type;
    }

    public int getMotherboard_price() {
        return motherboard_price;
    }

    public void setMotherboard_price(int motherboard_price) {
        this.motherboard_price = motherboard_price;
    }

    @Override
    public String toString() {
        return "t_motherboard{" +
                "motherboard_id=" + motherboard_id +
                ", motherboard_manufactured='" + motherboard_manufactured + '\'' +
                ", motherboard_name='" + motherboard_name + '\'' +
                ", motherboard_model='" + motherboard_model + '\'' +
                ", motherboard_hard_disk_interface_type='" + motherboard_hard_disk_interface_type + '\'' +
                ", motherboard_cpu_interface='" + motherboard_cpu_interface + '\'' +
                ", motherboard_ram_interface_type='" + motherboard_ram_interface_type + '\'' +
                ", motherboard_price=" + motherboard_price +
                '}';
    }
}
