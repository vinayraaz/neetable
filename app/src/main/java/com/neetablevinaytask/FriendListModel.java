package com.neetablevinaytask;

public class FriendListModel {
    private String name;
    private String dateTime;
    private String message;
    private String msgcount;
    private Integer userImage;

    public FriendListModel(String name, String dateTime, String message, String msgcount, Integer userImage) {
        this.name = name;
        this.dateTime = dateTime;
        this.message = message;
        this.msgcount = msgcount;
        this.userImage = userImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMsgcount() {
        return msgcount;
    }

    public void setMsgcount(String msgcount) {
        this.msgcount = msgcount;
    }

    public Integer getUserImage() {
        return userImage;
    }

    public void setUserImage(Integer userImage) {
        this.userImage = userImage;
    }
}
