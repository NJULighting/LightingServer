package nju.lighting.vo;

import nju.lighting.po.DocItemPO;

public class LossAndGainItemVO implements DocItemPO {

    private String commodityId;

    private int count;

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
