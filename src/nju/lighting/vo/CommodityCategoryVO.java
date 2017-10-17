package nju.lighting.vo;

import java.util.ArrayList;

public class CommodityCategoryVO {

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    private String categoryName;

    private ArrayList<CommodityCategoryVO> subCategories;

    private ArrayList<CommodityVO> subCommodities;

    private boolean isLowestLeverCategory;

    public ArrayList<CommodityCategoryVO> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(ArrayList<CommodityCategoryVO> subCategories) {
        this.subCategories = subCategories;
    }

    public ArrayList<CommodityVO> getSubCommodities() {
        return subCommodities;
    }

    public void setSubCommodities(ArrayList<CommodityVO> subCommodities) {
        this.subCommodities = subCommodities;
    }

    public boolean isLowestLeverCategory() {
        return isLowestLeverCategory;
    }

    public void setLowestLeverCategory(boolean lowestLeverCategory) {
        isLowestLeverCategory = lowestLeverCategory;
    }
}
