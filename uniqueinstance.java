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
        UniqueInstance instance1 = new UniqueInstance("Instance 1 data");
        UniqueInstance instance2 = new UniqueInstance("Instance 2 data");
        UniqueInstance instance3 = new UniqueInstance("Instance 3 data");

        System.out.println("Instance 1: " + instance1.getUniqueId() + " — " + instance1.getData());
        System.out.println("Instance 2: " + instance2.getUniqueId() + " — " + instance2.getData());
        System.out.println("Instance 3: " + instance3.getUniqueId() + " — " + instance3.getData());
    }
}
