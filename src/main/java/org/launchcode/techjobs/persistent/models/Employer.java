package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name  = "employer_id")
    private List<Job> jobs = new ArrayList<>();
    @NotBlank(message = "location is required")
    @Size(max = 100)
    private String location;

    public Employer() {
    }
    public Employer(String location,List<Job> jobs) {
        super();
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public List<Job> getJobs() {
        return jobs;
    }
    public void setJobs(List<Job> jobs){
        this.jobs = jobs;
    }
}
