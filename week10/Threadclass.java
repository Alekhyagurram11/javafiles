public class classThread extends Thread{
    int number;
    public void multiply(int number){
        this.number = number;
    }
    public void run()
    {
        for(int i = 1;i<=12;i++)
            System.out.println(number+" * "+i+" = " +number*i);
    }
    public static void main(String[] args) {
        classThread obj = new classThread();
        classThread obj1 = new classThread();
        obj.multiply(2);
        obj1.multiply(5);
        obj.start();
        obj1.start();
    }
}
