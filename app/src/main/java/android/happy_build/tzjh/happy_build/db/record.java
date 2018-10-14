package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

import java.util.Date;

public class record extends LitePalSupport {
    private int id;

    private admin admin_id;

    private user user_id;

    private String extra;

    private String occur_time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getOccur_time() {
        return occur_time;
    }

    public void setOccur_time(String occur_time) {
        this.occur_time = occur_time;
    }


}
