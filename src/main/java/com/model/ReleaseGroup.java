package com.model;

import com.model.release.Release;

import java.util.List;

public class ReleaseGroup {
    private String name;
    private List<Release> releases;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Release> getReleases() {
        return releases;
    }

    public void setReleases(List<Release> releases) {
        this.releases = releases;
    }

    @Override
    public String toString() {
        return "ReleaseGroup{" +
                "name='" + name + '\'' +
                ", releases=" + releases +
                '}';
    }
}
