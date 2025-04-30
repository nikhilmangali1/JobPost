package com.learnspringweb.JobApp.repo;

import com.learnspringweb.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class JobRepo  {
    List<JobPost> jobs =
            new ArrayList<>(List.of(
                    new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL")),
                    new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow")),
                    new JobPost(3, "Frontend Developer", "Create amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS")),
                    new JobPost(4, "Network Engineer", "Design and maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
                    new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))

            ));
    public List<JobPost> getAllJobs(){

        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println("Job added...");
    }


    public void deleteJob(int postId) {
        jobs.removeIf(job -> job.getPostId() == postId);
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost job:jobs){
            if(job.getPostId()==jobPost.getPostId()){
                job.setPostId(jobPost.getPostId());
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public JobPost getJob(int postId) {

        for(JobPost job: jobs){
            if(job.getPostId() == postId) {
                return job;
            }
        }

        return null;
    }
}


