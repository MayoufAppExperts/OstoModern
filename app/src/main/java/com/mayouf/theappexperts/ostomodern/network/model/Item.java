package com.mayouf.theappexperts.ostomodern.network.model;

/**
 * Created by TheAppExperts on 08/11/2017.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("link_url")
    @Expose
    private java.lang.Object linkUrl;
    @SerializedName("sub_heading")
    @Expose
    private java.lang.Object subHeading;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("link_title")
    @Expose
    private java.lang.Object linkTitle;
    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("schedule_url")
    @Expose
    private String scheduleUrl;
    @SerializedName("set_url")
    @Expose
    private String setUrl;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("heading")
    @Expose
    private String heading;

    public java.lang.Object getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(java.lang.Object linkUrl) {
        this.linkUrl = linkUrl;
    }

    public java.lang.Object getSubHeading() {
        return subHeading;
    }

    public void setSubHeading(java.lang.Object subHeading) {
        this.subHeading = subHeading;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public java.lang.Object getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(java.lang.Object linkTitle) {
        this.linkTitle = linkTitle;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getScheduleUrl() {
        return scheduleUrl;
    }

    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    public String getSetUrl() {
        return setUrl;
    }

    public void setSetUrl(String setUrl) {
        this.setUrl = setUrl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

}