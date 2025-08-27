// public class DBStore {
//     FileStorage fs;
//     MongoDBStorage ms;

//     DBStore(FileStorage f, MongoDBStorage m) {
//         fs = f;
//         ms = m;
//     }

//     public void save() {
//         fs.saveToFile();
//         ms.save();
//     }
// }

public interface DBStore {
    void save();
}