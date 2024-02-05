package com.example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

    private File file;
    private String fileFileName;
    private String fileContentType;

    // Getters and setters for file, fileFileName, and fileContentType

    public String execute() throws IOException {
        String destPath = "C:\\uploads"; // Change this to your desired directory
        File destFile = new File(destPath, fileFileName);
        FileUtils.copyFile(file, destFile);
        return SUCCESS;
    }
}
