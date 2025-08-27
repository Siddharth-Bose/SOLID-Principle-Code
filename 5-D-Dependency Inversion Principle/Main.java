public class Main {
    public static void main(String[] args) {
        DBStore fs = new FileStorage();
        DBStore ms = new MongoDBStorage();

        fs.save();
        ms.save();
    }
}
