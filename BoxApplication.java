class Box{
    double length;
    double width;
    double height;
    Box(){
        length=-1;
        width=-1;
        height=-1;
    }
    Box(double len,double wid,double hgt){
        length=len;
        width=wid;
        height=hgt;
    }
    Box(Box ob){
        length=ob.length;
        width=ob.width;
        height=ob.height;
    }
    Box(double len){
        length=width=height=len;
    }
    double volume(){
    return length*width*height;
    }
}
class Boxweight extends Box{
    double weight;
    Boxweight(){
        super();
        weight=-1;
    }
    Boxweight(double len,double wid,double hgt,double wt){
        super(len,wid,hgt);
        weight=wt;
    }
    Boxweight(Boxweight ob){
     super(ob);
     weight=ob.weight;
    }
}
class Shipment extends Boxweight{
    double cost;
    Shipment(){
        super();
        cost=-1;
    }
    Shipment(double len,double wid,double hgt,double wt,double c){
        super(len,wid,hgt,wt);
        cost=c;
    }
    Shipment(Shipment ob){
        cost=ob.cost;
    }
}
public class BoxApplication {

    public static void main(String[] args) {
        Shipment shipment1= new Shipment(10,12,8,9.5,0.9);
        Shipment shipment2= new Shipment(.3,3.47,1.79,.36,110);
        double vol=shipment1.volume();
        System.out.println("VOlume is "+vol);
        System.out.println("Weight of shipment:"+shipment1.weight);
        System.out.println("Shipment cost is $"+shipment1.cost);
        double vol2=shipment2.volume();
        System.out.println("VOlume is "+vol2);
        System.out.println("Weight of shipment:"+shipment2.weight);
        System.out.println("Shipment cost is $"+shipment2.cost);
    }
}