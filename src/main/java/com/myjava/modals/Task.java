package com.myjava.modals;

import java.util.Date;

public class Task {
	private String id;
	private String title;
	private String description;
	private Date createdOn;
	private Date updatedon;
	protected Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.createdOn = new Date();
		this.updatedon = new Date();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getUpdatedon() {
		return updatedon;
	}
	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", createdOn=" + createdOn
				+ ", updatedon=" + updatedon + "]";
	}
}
