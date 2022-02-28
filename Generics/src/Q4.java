import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Pair {
    public String key ;
    public String value;
    public void setKey(String str){
        this.key=str;
    }
    public void setValue(String str ){
        this.value=value;
    }
    public void setValue(Date d){
        System.out.println(d);
    }
}
class demo{
    public static void main(String[] args) {
        Pair p = new Pair();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key and val : ");
        String key = sc.nextLine();
        String val = sc.nextLine();
        p.setKey(key);
        p.setValue(val);
        Pair p1 = new Pair();
        p1.setKey("Today is: ");
        p1.setValue(new java.util.Date());

    }
}