package com.example.demo.controller;
@RestController
public class Validationrepository{
    @Autowired Validservice va;
    @PostMapping("/postt")
    public Validationentity sendata(@RequestBody Validationentity val){
        return va.posttdata(val);
    }