package nju.lighting.vo;

import java.util.ArrayList;

public class LossAndGainDocVO implements DocVO {

    private ArrayList<LossAndGainItemVO> lossAndGains;

    private String reason;

    private long time;

    private String username;

    public ArrayList<LossAndGainItemVO> getLossAndGains() {
        return lossAndGains;
    }

    public void setLossAndGains(ArrayList<LossAndGainItemVO> lossAndGains) {
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
