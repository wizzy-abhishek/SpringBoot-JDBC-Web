package com.abhishek.Implenting_JDBC.Web.service;

import com.abhishek.Implenting_JDBC.Web.pojo.Alien;
import com.abhishek.Implenting_JDBC.Web.repository.AddDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlienService {

    private AddDetailsRepo addDetailsRepo ;

    public AddDetailsRepo getAddDetails() {
        return addDetailsRepo;
    }

    @Autowired
    public void setAddDetails(AddDetailsRepo addDetailsRepo) {
        System.out.println("Setter of service class called : ");
        this.addDetailsRepo = addDetailsRepo;
    }

    public int add(Alien alien){
        if (addDetailsRepo == null) {
            System.out.println("addDetailsRepo is null!");
            return 0;
        }
        System.out.println("Service class worked, saving Alien: " + alien);
        return addDetailsRepo.save(alien);
    }
}
