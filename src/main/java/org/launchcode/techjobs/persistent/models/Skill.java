package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @OneToMany(mappedBy = "skills")
    private List<Job> jobs= new ArrayList<>();
    private String description;
    public Skill() {}
    public Skill(String description, List<Job> jobs){
        this.description = description;
        this.jobs = jobs;
    }
    public List<Job> getJobs(){
        return jobs;
    }
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}