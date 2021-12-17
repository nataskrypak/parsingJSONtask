package com.model.project;

import com.model.Project;

public class ReportFile extends Project {
    public String fileLocation;
    public Integer startDateOffset;

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
