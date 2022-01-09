package com.model.project;

public class ReportFile {
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

    @Override
    public String toString() {
        return "ReportFile{" +
                "fileLocation='" + fileLocation + '\'' +
                ", startDateOffset=" + startDateOffset +
                '}';
    }
}
