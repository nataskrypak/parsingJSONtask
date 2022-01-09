package com.model.release;

import com.model.release.sprint.Sprint;

import java.util.List;

public class Release {
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

    public List<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(List<Sprint> sprints) {
        this.sprints = sprints;
    }

    public List<Sprint> sprints;

    @Override
    public String toString() {
        return "Release{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", startDateOffset='" + startDateOffset + '\'' +
                ", sprints=" + sprints +
                '}';
    }
}
