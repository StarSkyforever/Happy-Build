package android.happy_build.tzjh.happy_build.db;

public class record {
    private int id;

    private String extra;

    private String occur_time;

    private items items_id;

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

    public items getItems_id() {
        return items_id;
    }

    public void setItems_id(items items_id) {
        this.items_id = items_id;
    }
}
