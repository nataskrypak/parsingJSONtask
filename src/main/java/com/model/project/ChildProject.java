package com.model.project;

import java.util.List;

public class ChildProject{
    private String name;
    private String releaseGroup;
    private List<ReportFile> reportFiles;
    private List<ChildProject> childProjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    public List<ReportFile> getReportFiles() {
        return reportFiles;
    }

    public void setReportFiles(List<ReportFile> reportFiles) {
        this.reportFiles = reportFiles;
    }

    public List<ChildProject> getChildProjects() {
        return childProjects;
    }

    public void setChildProjects(List<ChildProject> childProjects) {
        this.childProjects = childProjects;
    }

    @Override
    public String toString() {
        return "ChildProject{" +
                "name='" + name + '\'' +
                ", releaseGroup='" + releaseGroup + '\'' +
                ", reportFiles=" + reportFiles +
                ", childProjects=" + childProjects +
                '}';
    }
}
