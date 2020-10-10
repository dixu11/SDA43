package oop.zad17;

public class ExceptionsDemo {
    public static void main(String[] args) {
        FileConnection fileConnection = new FileConnection();
        try {
            fileConnection.connect();
            System.out.println(fileConnection.downloadFileContent());
        } catch (FileConnectionException e) {
            System.out.println("Problem połączenia z plikiem");
        } catch (FileDbConnectionException e) {
            System.out.println(e.getMessage());
        }finally {
            fileConnection.disconnect();
        }

        System.out.println("Is connected: " + fileConnection.isConnected());
        System.out.println("Hello");
    }

}



