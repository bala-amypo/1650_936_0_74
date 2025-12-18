package com.example.demo.service.Impl;
public Validserviceimpl implements Validservice{
    @Autowired Validationrepository vali;
    @Override
    public Validationentity posttdata(Validationentity val){
        return vali.save(val);
    }
}