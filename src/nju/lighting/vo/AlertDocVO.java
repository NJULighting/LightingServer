package nju.lighting.vo;

import java.util.ArrayList;

public class AlertDocVO implements DocVO{

    private ArrayList<AlertDocItemVO> alertDocItems;

    private String reason;

    private long time;

    private String username;

    public ArrayList<AlertDocItemVO> getAlertDocItems() {
        return alertDocItems;
    }

    public void setAlertDocItems(ArrayList<AlertDocItemVO> alertDocItems) {
        this.alertDocItems = alertDocItems;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}



