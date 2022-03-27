public class connection {

    private static connection conn;

    private connection() {
    }

    public static connection getInstance() {
        if (conn == null) {
            conn = new connection();
        }
        return conn;
    }
}
