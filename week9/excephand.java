public class Exceptions{
    public static void main(String[] args){
        try{
            Class.forName("ClassName");
        }
        catch(ClassNotFoundException obj){
            System.out.println("Class Not Found");
        }
        try{
            String name = null;
            System.out.println(name.length());
        }
        catch(NullPointerException obj){
            System.out.println("Null Pointer Exception");
        }
        try{
            int a = 10/0;
        }
        catch(ArithmeticException obj){
            System.out.println("Arithmetic Exception");
        }
        try{
            int arr[] = {1,2};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("Array Index out of range");
        }
    }
}
