// package Duck Exceptions using throws;

class FileLoader{

    public void loadFile() throws ClassNotFoundException{
        Class.forName("Student");
    }
}

public class one {
    public static void main(String[] args) {
        

        FileLoader file = new FileLoader();

        try {
            file.loadFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
