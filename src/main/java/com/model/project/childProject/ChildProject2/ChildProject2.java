package com.model.project.childProject.ChildProject2;

import com.model.project.ReportFile;
import com.model.project.childProject.ChildProject;

import java.util.List;

public class ChildProject2 extends ChildProject {
    private String name;
    private String releaseGroup;
    private List<ReportFile> reportFiles;
    private Object childProjects = null;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getReleaseGroup() {
        return releaseGroup;
    }

    @Override
    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    @Override
    public List<ReportFile> getReportFiles() {
        return reportFiles;
    }

    @Override
    public void setReportFiles(List<ReportFile> reportFiles) {
        this.reportFiles = reportFiles;
    }

}
