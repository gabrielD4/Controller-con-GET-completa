package com.example.ex2salutojson;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class SalutController {

    @GetMapping(path = "/saluto/{provincia}")
    public User saluto(@RequestParam String nome, @PathVariable String provincia) {
        return new User(nome, provincia);
    }
}
