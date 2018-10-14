package android.happy_build.tzjh.happy_build.db;

import org.litepal.crud.LitePalSupport;

import java.util.Date;

public class items extends LitePalSupport {
    private int items_id;

    private Date add_time;

    private String decription;

    private configure_informotion configureinformotion_id;

    private user user_id;

    private boolean status;

    private Date last_modified_time;

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public configure_informotion getConfigureinformotion_id() {
        return configureinformotion_id;
    }

    public void setConfigureinformotion_id(configure_informotion configureinformotion_id) {
        this.configureinformotion_id = configureinformotion_id;
    }

    public user getUser_id() {
        return user_id;
    }

    public void setUser_id(user user_id) {
        this.user_id = user_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getLast_modified_time() {
        return last_modified_time;
    }

    public void setLast_modified_time(Date last_modified_time) {
        this.last_modified_time = last_modified_time;
    }
}

