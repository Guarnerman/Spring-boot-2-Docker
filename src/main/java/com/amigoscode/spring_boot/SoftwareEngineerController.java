package com.amigoscode.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(1, "Mario", "JS, Node, React, TailwindCSS"),
                new SoftwareEngineer(2, "Yisus", "JS, Node, Angular, MaterialUI"),
                new SoftwareEngineer(3, "Paul", "Java, Spring, Sprong-Boot")
        );
    }
}
