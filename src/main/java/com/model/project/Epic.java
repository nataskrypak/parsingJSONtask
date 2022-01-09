package com.model.project;

import java.util.List;

public class Epic {
    private String name;
    private String description;
    private Integer sSizes;
    private Integer startDateOffset;
    private List<String> releases;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getsSizes() {
        return sSizes;
    }

    public void setsSizes(Integer sSizes) {
        this.sSizes = sSizes;
    }

    public Integer getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(Integer startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    public List<String> getReleases() {
        return releases;
    }

    public void setReleases(List<String> releases) {
        this.releases = releases;
    }

    @Override
    public String toString() {
        return "Epic{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sSizes=" + sSizes +
                ", startDateOffset=" + startDateOffset +
                ", releases=" + releases +
                '}';
    }
}
