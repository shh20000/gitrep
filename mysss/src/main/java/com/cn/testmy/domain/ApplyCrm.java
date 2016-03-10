package com.cn.testmy.domain;

import java.io.Serializable;
import java.util.Date;

public class ApplyCrm implements Serializable {
	private static final long serialVersionUID = -4669999477823766186L;
	
	private Long applyCrmId;
	private String applyName;
	private String tel;
	private String type;
	private Date updatedTime;
	private String updatedBy;
	private Date createdTime;
	private String createdBy;
	
	public ApplyCrm() {
	}

	public Long getApplyCrmId() {
		return applyCrmId;
	}

	public void setApplyCrmId(Long applyCrmId) {
		this.applyCrmId = applyCrmId;
	}

	public String getApplyName() {
		return applyName;
	}

	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
}
