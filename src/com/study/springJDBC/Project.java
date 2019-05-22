/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.springJDBC;

import java.util.List;
import java.util.Map;

public class Project {
    String projectId;
    String projectName;
    Employee projectManager;
    List<String> skills;
    Map<String,Address> locations;

    public Project() {
        this.projectId ="";
        this.projectName = "";
    }
    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public Project(String projectId, String projectName, Employee projectManager) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectManager = projectManager;
    }

    public Project(String projectId, String projectName, Employee projectManager, List<String> skills, Map<String, Address> locations) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectManager = projectManager;
        this.skills = skills;
        this.locations = locations;
    }

    

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Employee getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Employee projectManager) {
        this.projectManager = projectManager;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Map<String, Address> getLocations() {
        return locations;
    }

    public void setLocations(Map<String, Address> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Project{" + "projectId=" + projectId + ", projectName=" + projectName + ", projectManager=" + projectManager + ", skills=" + skills + ", locations=" + locations + '}';
    }   
    
}
