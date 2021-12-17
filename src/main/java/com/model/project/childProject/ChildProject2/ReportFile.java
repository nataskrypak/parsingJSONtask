package com.model.project.childProject.ChildProject2;

import com.model.project.childProject.ChildProject;

public class ReportFile extends ChildProject {
    private String fileLocation;
    private Integer startDateOffset;

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public Integer getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(Integer startDateOffset) {
        this.startDateOffset = startDateOffset;
    }
}
