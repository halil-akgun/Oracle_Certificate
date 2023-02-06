package Soru_215;

public class App {
    public static void main(String[] args) throws LogFileException {
        App obj = new App();
        try {
            obj.open();
            obj.process();
        } catch (Exception e) {
            System.out.println("Completed.");
        }
    }
    public void process() throws LogFileException{
        System.out.println("Processed");
        throw new LogFileException();
    }
    public void open() {
        System.out.println("Opened.");
        throw new AccessViolationException();
    }
}

