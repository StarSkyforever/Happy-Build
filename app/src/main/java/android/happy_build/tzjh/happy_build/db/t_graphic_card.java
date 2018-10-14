package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

public class t_graphic_card extends LitePalSupport {
    private int graphic_card_id;

    //图形显卡生产商
    private String graphic_card_manufacturer;
    //图形显卡名字
    private String graphic_card_name;
    //图形显卡型号
    private String graphic_card_model;
    //图形显卡核心数
    private String graphic_card_core;
    //图形显卡供电接口型号
    private String power_interface_type;
    //图形显卡输出接口
    private String output_interface;
    //图像显卡价格
    private int getGraphic_card_price;

    @Override
    public String toString() {
        return "t_graphic_card{" +
                "graphic_card_id=" + graphic_card_id +
                ", graphic_card_manufacturer='" + graphic_card_manufacturer + '\'' +
                ", graphic_card_name='" + graphic_card_name + '\'' +
                ", graphic_card_model='" + graphic_card_model + '\'' +
                ", graphic_card_core='" + graphic_card_core + '\'' +
                ", power_interface_type='" + power_interface_type + '\'' +
                ", output_interface='" + output_interface + '\'' +
                ", getGraphic_card_price=" + getGraphic_card_price +
                '}';
    }

    public int getGraphic_card_id() {
        return graphic_card_id;
    }

    public void setGraphic_card_id(int graphic_card_id) {
        this.graphic_card_id = graphic_card_id;
    }

    public String getGraphic_card_manufacturer() {
        return graphic_card_manufacturer;
    }

    public void setGraphic_card_manufacturer(String graphic_card_manufacturer) {
        this.graphic_card_manufacturer = graphic_card_manufacturer;
    }

    public String getGraphic_card_name() {
        return graphic_card_name;
    }

    public void setGraphic_card_name(String graphic_card_name) {
        this.graphic_card_name = graphic_card_name;
    }

    public String getGraphic_card_model() {
        return graphic_card_model;
    }

    public void setGraphic_card_model(String graphic_card_model) {
        this.graphic_card_model = graphic_card_model;
    }

    public String getGraphic_card_core() {
        return graphic_card_core;
    }

    public void setGraphic_card_core(String graphic_card_core) {
        this.graphic_card_core = graphic_card_core;
    }

    public String getPower_interface_type() {
        return power_interface_type;
    }

    public void setPower_interface_type(String power_interface_type) {
        this.power_interface_type = power_interface_type;
    }

    public String getOutput_interface() {
        return output_interface;
    }

    public void setOutput_interface(String output_interface) {
        this.output_interface = output_interface;
    }

    public int getGetGraphic_card_price() {
        return getGraphic_card_price;
    }

    public void setGetGraphic_card_price(int getGraphic_card_price) {
        this.getGraphic_card_price = getGraphic_card_price;
    }
}
