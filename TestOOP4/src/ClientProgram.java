public class ClientProgram {
    public static void main(String[] args) {
        Client[] clients = {
                new Client("Yakov","BenHemo"),
                new Client("Amit","aton"),
                new Client("Daniel","Gino")
        };


        clients[0].addPhone("0526650754");
        clients[0].addPhone("0507788778");
        System.out.println(clients[0]);
        System.out.println(clients[0].hasValidCellPhone());
        System.out.println(clients[0].hasGoldNumber());

        clients[1].addPhone("0526565656");
        

    }
}
