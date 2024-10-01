package rakserver;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Client> clients;

    public User(String username, String password) {
        this.username = username;   
        this.password = password;
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Username: ").append(username).append("\n");
        return info.toString();
    }
}
