package com.mayouf.theappexperts.ostomodern.network.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SetList {

    @SerializedName("objects")
    @Expose
    private List<Object> objects = null;

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }
}
