package ie.gmit.single;

public class UserDataStoreService {
    private Store store = new Store();

    public void saveUser(User user) {
        store.store(user);
    }
}
