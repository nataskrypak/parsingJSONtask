package com.model;

public class Project {
    public String name;
    public String releaseGroup;
    public List<ReportFile> reportFiles;
    public List<ChildProject> childProjects;
    public List<RootCaus> rootCauses;
    public List<Epic> epics;
}
