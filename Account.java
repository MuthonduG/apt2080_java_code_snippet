// Abstract parent class for all account types
abstract public class Account {
    
    private int id;
    private String name;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void performOperation(DataSource dataSource) {
        if (dataSource != null) {
            dataSource.execute();
        } else {
            System.out.println("Operation failed: No valid DataSource provided.");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}