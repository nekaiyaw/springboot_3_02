package com.example.springboot_3_02;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller

public class HomeController {
    @Autowired
    JobRepository jobRepository;

    @RequestMapping("/")
    public String listJobs(Model model){
        model.addAttribute("jobs",jobRepository.findAll());
        return "list";

        @GetMapping("/add")
        public String jobForm(Model model) {
            model.addAttribute("job",new BatchProperties.Job());
            return "jobForm";

            @PostMapping("/process")
                    public String processForm(@Valid Job job, BindingResult result){
                if (result.hasErrors())
                    return "jobform"

            }
            jobRepository.save(jobs);
            return"redirect";

    }
}
