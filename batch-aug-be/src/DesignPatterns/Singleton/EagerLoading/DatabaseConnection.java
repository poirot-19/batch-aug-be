package DesignPatterns.Singleton.EagerLoading;

public class DatabaseConnection {

    private static DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        return instance;
    }
}
