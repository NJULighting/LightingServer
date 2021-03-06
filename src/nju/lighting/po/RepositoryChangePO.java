package nju.lighting.po;

public class RepositoryChangePO {

    public static final String BUY = "BUY";

    public static final String SELL = "SELL";

    private String changeType = BUY;

    private int count;

    private String commodityId;

    private double amount;

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
