public class uniqueinstance {
    private final int uniqueId;
    private String data;
    private static int idCounter = 1;
    {
        uniqueId = idCounter++;
    }
    public UniqueInstance(String data) {
        this.data = data;
    }
    public int getUniqueId() {
        return uniqueId;
    }
    public String getData() {
        return data;
    }
    public static void main(String[] args) {

    }
}
