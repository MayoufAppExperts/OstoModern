package com.mayouf.theappexperts.ostomodern.network.model;

/**
 * Created by TheAppExperts on 08/11/2017.
 */
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EpisodeModel {

    @SerializedName("subtitle")
    @Expose
    private Object subtitle;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("schedule_urls")
    @Expose
    private List<String> scheduleUrls = null;
    @SerializedName("image_urls")
    @Expose
    private List<Object> imageUrls = null;
    @SerializedName("publish_on")
    @Expose
    private String publishOn;
    @SerializedName("talent_urls")
    @Expose
    private List<Object> talentUrls = null;
    @SerializedName("schedule_url")
    @Expose
    private String scheduleUrl;
    @SerializedName("plan_urls")
    @Expose
    private List<Object> planUrls = null;
    @SerializedName("language_publish_on")
    @Expose
    private String languagePublishOn;
    @SerializedName("episode_number")
    @Expose
    private Object episodeNumber;
    @SerializedName("language_modified_by")
    @Expose
    private Object languageModifiedBy;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("language_version_url")
    @Expose
    private String languageVersionUrl;
    @SerializedName("version_number")
    @Expose
    private Integer versionNumber;
    @SerializedName("modified_by")
    @Expose
    private Object modifiedBy;
    @SerializedName("language_ends_on")
    @Expose
    private String languageEndsOn;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("items")
    @Expose
    private List<String> items = null;
    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("created_by")
    @Expose
    private Object createdBy;
    @SerializedName("tag_urls")
    @Expose
    private List<Object> tagUrls = null;
    @SerializedName("ends_on")
    @Expose
    private String endsOn;
    @SerializedName("synopsis")
    @Expose
    private String synopsis;
    @SerializedName("version_url")
    @Expose
    private String versionUrl;
    @SerializedName("parent_url")
    @Expose
    private Object parentUrl;
    @SerializedName("language_version_number")
    @Expose
    private Integer languageVersionNumber;
    @SerializedName("language_modified")
    @Expose
    private String languageModified;

    public Object getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public List<String> getScheduleUrls() {
        return scheduleUrls;
    }

    public void setScheduleUrls(List<String> scheduleUrls) {
        this.scheduleUrls = scheduleUrls;
    }

    public List<Object> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<Object> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getPublishOn() {
        return publishOn;
    }

    public void setPublishOn(String publishOn) {
        this.publishOn = publishOn;
    }

    public List<Object> getTalentUrls() {
        return talentUrls;
    }

    public void setTalentUrls(List<Object> talentUrls) {
        this.talentUrls = talentUrls;
    }

    public String getScheduleUrl() {
        return scheduleUrl;
    }

    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    public List<Object> getPlanUrls() {
        return planUrls;
    }

    public void setPlanUrls(List<Object> planUrls) {
        this.planUrls = planUrls;
    }

    public String getLanguagePublishOn() {
        return languagePublishOn;
    }

    public void setLanguagePublishOn(String languagePublishOn) {
        this.languagePublishOn = languagePublishOn;
    }

    public Object getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(Object episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public Object getLanguageModifiedBy() {
        return languageModifiedBy;
    }

    public void setLanguageModifiedBy(Object languageModifiedBy) {
        this.languageModifiedBy = languageModifiedBy;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getLanguageVersionUrl() {
        return languageVersionUrl;
    }

    public void setLanguageVersionUrl(String languageVersionUrl) {
        this.languageVersionUrl = languageVersionUrl;
    }

    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Object getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Object modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getLanguageEndsOn() {
        return languageEndsOn;
    }

    public void setLanguageEndsOn(String languageEndsOn) {
        this.languageEndsOn = languageEndsOn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public Object getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    public List<Object> getTagUrls() {
        return tagUrls;
    }

    public void setTagUrls(List<Object> tagUrls) {
        this.tagUrls = tagUrls;
    }

    public String getEndsOn() {
        return endsOn;
    }

    public void setEndsOn(String endsOn) {
        this.endsOn = endsOn;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getVersionUrl() {
        return versionUrl;
    }

    public void setVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl;
    }

    public Object getParentUrl() {
        return parentUrl;
    }

    public void setParentUrl(Object parentUrl) {
        this.parentUrl = parentUrl;
    }

    public Integer getLanguageVersionNumber() {
        return languageVersionNumber;
    }

    public void setLanguageVersionNumber(Integer languageVersionNumber) {
        this.languageVersionNumber = languageVersionNumber;
    }

    public String getLanguageModified() {
        return languageModified;
    }

    public void setLanguageModified(String languageModified) {
        this.languageModified = languageModified;
    }

}