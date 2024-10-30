package vn.iotstar.models;

import java.io.Serializable;

public class CategoryModels implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer categoryId;
    private String categoryName;
    private Boolean isEdit = false;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	@Override
	public String toString() {
		return "CategoryModels [categoryId=" + categoryId + ", categoryName=" + categoryName + ", isEdit=" + isEdit
				+ "]";
	}
    

}
