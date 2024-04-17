public class BoxUnBox
{
    public static void main(String[] args)
    {
        //BOXING int - Integer ("Also known as AUTO-BOXING")
        int PrimitiveInt = 100;
        Integer WrappedInt=new Integer(PrimitiveInt);
        //UNBOXING Integer - int ("Also known as AUTO-UNBOXING")
        Integer WrappedInt2 = new Integer(200);
        int PrimitiveInt2 = WrappedInt2;
        System.out.println("Boxed Integer : " +WrappedInt);
        System.out.println("Unboxed int : " +PrimitiveInt2);
    }
}
