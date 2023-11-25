package org.chathura.singleton;

public class Database {
    private String name;

    private static Database instance;

    //synchronized keyword make the getInstance function threadSafe.
    // Otherwise different threads may instantiate multiple objects
    public static synchronized Database getInstance(String name){
        if(instance==null){
            instance=new Database(name);
        }
        return instance;
    }
    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
