package com.das.starter.models;

public class Rating {

	int rating;
	String comment;
	int timestamp;
	int projectId;
	int dataId;
	int userId;
	String userName;
	
	public Rating(int rating, String comment, int timestamp, int projectId, int dataId, int userId, String userName) {
		this.rating = rating;
		this.comment = comment;
		this.timestamp = timestamp;
		this.projectId = projectId;
		this.dataId = dataId;
		this.userId = userId;
		this.userName = userName;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "Rating [rating=" + rating + ", comment=" + comment + ", timestamp=" + timestamp + ", projectId="
				+ projectId + ", dataId=" + dataId + ", userId=" + userId + ", userName=" + userName + "]";
	}
}
