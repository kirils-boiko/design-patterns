package com.company.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    // Classes used by controller
    private UserValidator validator;
    private UserPersistenceService persistenceService;

    public UserController() {
        this.validator = new UserValidator();
        this.persistenceService = new UserPersistenceService();
    }

    //Create a new user
    public String createUser(String userJson) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);

        boolean valid = validator.validateUser(user);
        if(!valid) {
            return "ERROR";
        }

        persistenceService.saveUser(user);
        
        return "SUCCESS";
    }
}