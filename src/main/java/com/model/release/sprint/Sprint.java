package com.model.release.sprint;

import com.model.release.Release;

public class Sprint extends Release {
    private String name;
    private String length;
    private String startDateOffset;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(String startDateOffset) {
        this.startDateOffset = startDateOffset;
    }
}
