

class A  {
int a=5;
    A()
    {
        System.out.println("constructor is called\n");
    }

    A(int a)
    {

        System.out.println("a="+a);
    }

}
class Constructor
{

    public static void main(String[] args) {

        A obj=new A();
        A obj2=new A();


    }
}