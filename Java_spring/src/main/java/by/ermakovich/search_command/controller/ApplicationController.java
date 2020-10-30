package by.ermakovich.search_command.controller;


import by.ermakovich.search_command.entity.Application;
import by.ermakovich.search_command.entity.Events;
import by.ermakovich.search_command.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping
    public List<Application> GetAllApplication(){
        List<Application> allApplications = applicationService.findByIdGreaterThan(0);
        return  allApplications;
    }

    @GetMapping(value = "/{id}")
    public Application GetApplicationById(long id){
        Application allApplications = applicationService.findById(id);
        return  allApplications;
    }

    @PostMapping
    public Application AddApplication(Application app){
        Application application = applicationService.addApp(app);
        return  application;
    }

    @DeleteMapping(value = "/{id}")
    public void DeleteApplication(@PathVariable("id") long id){
        applicationService.deleteApp(id);

    }

}
