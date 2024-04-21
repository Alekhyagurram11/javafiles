import java.io.*;

class CopyCommand{
    public static void main(String[] args) {
        FileInputStream input;
        FileOutputStream  output;
        try{
            input = new FileInputStream("source");
            output = new FileOutputStream("Destination");
            while(input.available()>0){
                output.write(input.read());
            }
        }
        catch(FileNotFoundException obj){
            System.out.println("File Not Found!");
        }
        catch(IOException obj){
            System.out.println("Input/Output Exception!");
        }
    }
}
