package com.mayouf.theappexperts.ostomodern.network.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mayouf.theappexperts.ostomodern.network.model.Item;

public class Object {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("schedule_urls")
    @Expose
    private List<String> scheduleUrls = null;
    @SerializedName("publish_on")
    @Expose
    private String publishOn;
    @SerializedName("quoter")
    @Expose
    private String quoter;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("language_modified_by")
    @Expose
    private java.lang.Object languageModifiedBy;
    @SerializedName("plans")
    @Expose
    private List<java.lang.Object> plans = null;
    @SerializedName("cached_film_count")
    @Expose
    private Integer cachedFilmCount;
    @SerializedName("modified_by")
    @Expose
    private java.lang.Object modifiedBy;
    @SerializedName("temp_id")
    @Expose
    private Integer tempId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("language_publish_on")
    @Expose
    private String languagePublishOn;
    @SerializedName("language_modified")
    @Expose
    private String languageModified;
    @SerializedName("has_price")
    @Expose
    private Boolean hasPrice;
    @SerializedName("set_type_url")
    @Expose
    private String setTypeUrl;
    @SerializedName("temp_image")
    @Expose
    private String tempImage;
    @SerializedName("film_count")
    @Expose
    private Integer filmCount;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("language_version_url")
    @Expose
    private String languageVersionUrl;
    @SerializedName("quote")
    @Expose
    private String quote;
    @SerializedName("lowest_amount")
    @Expose
    private java.lang.Object lowestAmount;
    @SerializedName("formatted_body")
    @Expose
    private String formattedBody;
    @SerializedName("image_urls")
    @Expose
    private List<java.lang.Object> imageUrls = null;
    @SerializedName("hierarchy_url")
    @Expose
    private java.lang.Object hierarchyUrl;
    @SerializedName("schedule_url")
    @Expose
    private String scheduleUrl;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("version_number")
    @Expose
    private Integer versionNumber;
    @SerializedName("language_ends_on")
    @Expose
    private String languageEndsOn;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("language_version_number")
    @Expose
    private Integer languageVersionNumber;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("ends_on")
    @Expose
    private String endsOn;
    @SerializedName("version_url")
    @Expose
    private String versionUrl;
    @SerializedName("set_type_slug")
    @Expose
    private String setTypeSlug;

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

    public String getPublishOn() {
        return publishOn;
    }

    public void setPublishOn(String publishOn) {
        this.publishOn = publishOn;
    }

    public String getQuoter() {
        return quoter;
    }

    public void setQuoter(String quoter) {
        this.quoter = quoter;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public java.lang.Object getLanguageModifiedBy() {
        return languageModifiedBy;
    }

    public void setLanguageModifiedBy(java.lang.Object languageModifiedBy) {
        this.languageModifiedBy = languageModifiedBy;
    }

    public List<java.lang.Object> getPlans() {
        return plans;
    }

    public void setPlans(List<java.lang.Object> plans) {
        this.plans = plans;
    }

    public Integer getCachedFilmCount() {
        return cachedFilmCount;
    }

    public void setCachedFilmCount(Integer cachedFilmCount) {
        this.cachedFilmCount = cachedFilmCount;
    }

    public java.lang.Object getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(java.lang.Object modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLanguagePublishOn() {
        return languagePublishOn;
    }

    public void setLanguagePublishOn(String languagePublishOn) {
        this.languagePublishOn = languagePublishOn;
    }

    public String getLanguageModified() {
        return languageModified;
    }

    public void setLanguageModified(String languageModified) {
        this.languageModified = languageModified;
    }

    public Boolean getHasPrice() {
        return hasPrice;
    }

    public void setHasPrice(Boolean hasPrice) {
        this.hasPrice = hasPrice;
    }

    public String getSetTypeUrl() {
        return setTypeUrl;
    }

    public void setSetTypeUrl(String setTypeUrl) {
        this.setTypeUrl = setTypeUrl;
    }

    public String getTempImage() {
        return tempImage;
    }

    public void setTempImage(String tempImage) {
        this.tempImage = tempImage;
    }

    public Integer getFilmCount() {
        return filmCount;
    }

    public void setFilmCount(Integer filmCount) {
        this.filmCount = filmCount;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getLanguageVersionUrl() {
        return languageVersionUrl;
    }

    public void setLanguageVersionUrl(String languageVersionUrl) {
        this.languageVersionUrl = languageVersionUrl;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public java.lang.Object getLowestAmount() {
        return lowestAmount;
    }

    public void setLowestAmount(java.lang.Object lowestAmount) {
        this.lowestAmount = lowestAmount;
    }

    public String getFormattedBody() {
        return formattedBody;
    }

    public void setFormattedBody(String formattedBody) {
        this.formattedBody = formattedBody;
    }

    public List<java.lang.Object> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<java.lang.Object> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public java.lang.Object getHierarchyUrl() {
        return hierarchyUrl;
    }

    public void setHierarchyUrl(java.lang.Object hierarchyUrl) {
        this.hierarchyUrl = hierarchyUrl;
    }

    public String getScheduleUrl() {
        return scheduleUrl;
    }

    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getLanguageEndsOn() {
        return languageEndsOn;
    }

    public void setLanguageEndsOn(String languageEndsOn) {
        this.languageEndsOn = languageEndsOn;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getLanguageVersionNumber() {
        return languageVersionNumber;
    }

    public void setLanguageVersionNumber(Integer languageVersionNumber) {
        this.languageVersionNumber = languageVersionNumber;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getEndsOn() {
        return endsOn;
    }

    public void setEndsOn(String endsOn) {
        this.endsOn = endsOn;
    }

    public String getVersionUrl() {
        return versionUrl;
    }

    public void setVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl;
    }

    public String getSetTypeSlug() {
        return setTypeSlug;
    }

    public void setSetTypeSlug(String setTypeSlug) {
        this.setTypeSlug = setTypeSlug;
    }

}