package rakserver;

import java.util.ArrayList;

public class RakServer {
    private String id;
    private String lokasi;
    private ArrayList<Client> clients;

    public RakServer(String id, String lokasi) {
        this.id = id;
        this.lokasi = lokasi;
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("ID: ").append(id).append("\n");
        info.append("Lokasi: ").append(lokasi).append("\n");
        info.append("Clients:\n");
        for (Client client : clients) {
            info.append(client.getInfo()).append("\n");
        }
        return info.toString();
    }
}
