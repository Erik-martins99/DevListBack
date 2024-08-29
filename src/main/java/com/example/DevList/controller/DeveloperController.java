package com.example.DevList.controller;


import com.example.DevList.DTO.DetailsDeveloperDTO;
import com.example.DevList.DTO.RegisterDeveloperDTO;
import com.example.DevList.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class DeveloperController {

    @Autowired
    private DeveloperService service;

    @GetMapping("/developer")
    public List<DetailsDeveloperDTO> getDeveloper() {
        return service.getDeveloper();
    }

    @PostMapping("/developer")
    public void postDeveloper(@RequestBody RegisterDeveloperDTO data) {
        service.postDeveloper(data);
    }

    @GetMapping("/developer/{id}")
    public DetailsDeveloperDTO getDeveloperById(@PathVariable Long id) throws Exception {
        return service.getDeveloperById(id);
    }

    @DeleteMapping("/developer/{id}")
    public void deleteDeveloper(@PathVariable Long id) {
        service.deleteDeveloper(id);
    }
}
