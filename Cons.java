class Details{
    String name;
    int age;
    double weight;
    Details(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    void eat(){
        System.out.println(this.name+" is eating");
    }
    void drink(){
        System.out.println(this.name+" is drinking  *Burp.....");
    }
}
public class Cons {
    public static void main(String[] args) {
        Details detail=new Details("Joy",69,80);
        Details details=new Details("JoyKrishna",9,30);
        detail.eat();
        details.eat();
        detail.drink();
        details.drink();
    }
}
