/////////////////////////////
/*class: access_modifier
 *Input:--
 *Output:5
         45
         6
 *Description:Implementation Of access modifier 
 *Date:5-August-2021
 *Author Name:Shruti Nahar
 *////////////////////////
package practiceset4;

class C1{
	public int x = 5;
    protected int y =45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class access_modifier {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}

