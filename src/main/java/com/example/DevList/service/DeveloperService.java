package com.example.DevList.service;

import com.example.DevList.DTO.DetailsDeveloperDTO;
import com.example.DevList.DTO.RegisterDeveloperDTO;
import com.example.DevList.model.Developer;
import com.example.DevList.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DeveloperService {

    @Autowired
    private DeveloperRepository repository;

    public List<DetailsDeveloperDTO> getDeveloper() {
        return repository.findAll().stream().map(d -> new DetailsDeveloperDTO(d.getId(),
                d.getName(), d.getNickname(), d.getEmail(), d.getCpf())).collect(Collectors.toList());
    }

    public void postDeveloper(RegisterDeveloperDTO data) {
        repository.save(new Developer(data));
    }

    public DetailsDeveloperDTO getDeveloperById(Long id) throws Exception {
        return repository.findById(id)
                .map(DetailsDeveloperDTO::new)
                .orElseThrow(() -> new Exception("Developer not found with id: " + id));
    }

    public void deleteDeveloper(Long id) {
        repository.deleteById(id);
    }


}
