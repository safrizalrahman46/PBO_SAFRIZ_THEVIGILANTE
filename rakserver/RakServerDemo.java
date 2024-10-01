package rakserver;

public class RakServerDemo {
    public static void main(String[] args) {
        // Create Users
        User user1 = new User("alice", "password123");
        User user2 = new User("bob", "password456");

        // Create Clients
        Client client1 = new Client("C001", "Client One");
        Client client2 = new Client("C002", "Client Two");

        // Add users to clients
        client1.addUser(user1);
        client1.addUser(user2);

        // Create RakServers
        RakServer rakServer1 = new RakServer("R001", "Location A");
        RakServer rakServer2 = new RakServer("R002", "Location B");

        // Add clients to RakServers
        rakServer1.addClient(client1);
        rakServer1.addClient(client2);

        // Print information
        System.out.println("RakServer 1 Info:");
        System.out.println(rakServer1.getInfo());
        
        System.out.println("RakServer 2 Info:");
        System.out.println(rakServer2.getInfo());
    }
}
