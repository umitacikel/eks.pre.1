/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eksamenspreparation_jpa1;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project {

    @OneToMany(mappedBy = "pj")
    private List<ProjectUser> projectUsers;
    
    @Id
    String ProjectName;
    String description;
    String created;
    String lastModified;
    
    @ManyToMany
    private ProjectUser pu;
    
    @ManyToOne
    private Task ta;
    
    @Override
    public String toString() {
        return "Project{" + "name=" + ProjectName + ", description=" + description + ", created=" + created + ", lastModified=" + lastModified + '}';
    }
    
    public String getName() {
        return ProjectName;
    }

    public void setName(String name) {
        this.ProjectName = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
}
