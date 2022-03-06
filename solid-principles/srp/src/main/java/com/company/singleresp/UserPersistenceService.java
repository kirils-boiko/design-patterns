package com.company.singleresp;

public class UserPersistenceService {

    private Store store;

    public UserPersistenceService() {
        this.store = new Store();
    }

    public void saveUser(User user) {
        store.store(user);
    }
}
