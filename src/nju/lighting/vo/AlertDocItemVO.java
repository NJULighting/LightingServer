package nju.lighting.vo;

public class AlertDocItemVO {

    private String commodityId;

    private int count;

    public boolean isHasFail() {
        return hasFail;
    }

    public void setHasFail(boolean hasFail) {
        this.hasFail = hasFail;
    }

    private boolean hasFail = false;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
