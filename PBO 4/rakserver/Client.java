package rakserver;

import java.util.ArrayList;

public class Client {
    private String clientId;
    private String nama;
    private ArrayList<User> users;

    public Client(String clientId, String nama) {
        this.clientId = clientId;
        this.nama = nama;
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Client ID: ").append(clientId).append("\n");
        info.append("Nama: ").append(nama).append("\n");
        info.append("Users:\n");
        for (User user : users) {
            info.append(user.getInfo()).append("\n");
        }
        return info.toString();
    }
}
