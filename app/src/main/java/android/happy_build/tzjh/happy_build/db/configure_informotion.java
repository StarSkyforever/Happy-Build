package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

public class configure_informotion extends LitePalSupport {

    private int configure_informotion_id;

    private t_case t_case;

    private t_cooler t_cooler;

    private t_cpu t_cpu;

    private t_ram t_ram;

    private t_graphic_card t_graphic_card;

    private t_hard_disk t_harddisk;

    private t_power t_power;

    private t_motherboard t_motherboard;

    public int getConfigure_informotion_id() {
        return configure_informotion_id;
    }

    public void setConfigure_informotion_id(int configure_informotion_id) {
        this.configure_informotion_id = configure_informotion_id;
    }

    public android.happy_build.tzjh.happy_build.db.t_case getT_case() {
        return t_case;
    }

    public void setT_case(android.happy_build.tzjh.happy_build.db.t_case t_case) {
        this.t_case = t_case;
    }

    public android.happy_build.tzjh.happy_build.db.t_cooler getT_cooler() {
        return t_cooler;
    }

    public void setT_cooler(android.happy_build.tzjh.happy_build.db.t_cooler t_cooler) {
        this.t_cooler = t_cooler;
    }

    public android.happy_build.tzjh.happy_build.db.t_cpu getT_cpu() {
        return t_cpu;
    }

    public void setT_cpu(android.happy_build.tzjh.happy_build.db.t_cpu t_cpu) {
        this.t_cpu = t_cpu;
    }

    public android.happy_build.tzjh.happy_build.db.t_ram getT_ram() {
        return t_ram;
    }

    public void setT_ram(android.happy_build.tzjh.happy_build.db.t_ram t_ram) {
        this.t_ram = t_ram;
    }

    public android.happy_build.tzjh.happy_build.db.t_graphic_card getT_graphic_card() {
        return t_graphic_card;
    }

    public void setT_graphic_card(android.happy_build.tzjh.happy_build.db.t_graphic_card t_graphic_card) {
        this.t_graphic_card = t_graphic_card;
    }

    public t_hard_disk getT_harddisk() {
        return t_harddisk;
    }

    public void setT_harddisk(t_hard_disk t_harddisk) {
        this.t_harddisk = t_harddisk;
    }

    public android.happy_build.tzjh.happy_build.db.t_power getT_power() {
        return t_power;
    }

    public void setT_power(android.happy_build.tzjh.happy_build.db.t_power t_power) {
        this.t_power = t_power;
    }

    public android.happy_build.tzjh.happy_build.db.t_motherboard getT_motherboard() {
        return t_motherboard;
    }

    public void setT_motherboard(android.happy_build.tzjh.happy_build.db.t_motherboard t_motherboard) {
        this.t_motherboard = t_motherboard;
    }
}
