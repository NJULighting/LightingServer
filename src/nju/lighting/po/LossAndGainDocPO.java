package nju.lighting.po;

import java.util.ArrayList;

public class LossAndGainDocPO implements DocPO {

    private ArrayList<LossAndGainItemPO> lossAndGains;

    private String reason;

    private long time;

    private String username;

    public ArrayList<LossAndGainItemPO> getLossAndGains() {
        return lossAndGains;
    }

    public void setLossAndGains(ArrayList<LossAndGainItemPO> lossAndGains) {
        this.lossAndGains = lossAndGains;
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
