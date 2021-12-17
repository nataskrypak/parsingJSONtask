package com.model;

import com.model.project.childProject.ChildProject;
import com.model.project.Epic;
import com.model.project.ReportFile;
import com.model.project.RootCaus;

import java.util.List;

public class Project {

    private String name;
    private String releaseGroup;
    private List<ReportFile> reportFiles;
    private List<ChildProject> childProjects;
    private List<RootCaus> rootCauses;
    private List<Epic> epics;

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

    public List<RootCaus> getRootCauses() {
        return rootCauses;
    }

    public void setRootCauses(List<RootCaus> rootCauses) {
        this.rootCauses = rootCauses;
    }

    public List<Epic> getEpics() {
        return epics;
    }

    public void setEpics(List<Epic> epics) {
        this.epics = epics;
    }

}
