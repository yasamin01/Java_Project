package project;
public class khodro{
   String name;
   int saleTolid;
   long kilometers;
   String color;
   String noeSookht;
   double gheymat;
   
   public khodro(String name,int saleTolid,long kilometers,String color,String noeSookht,double gheymat){
       this.name=name;
       this.saleTolid=saleTolid;
       this.kilometers=kilometers;
       this.color=color;
       this.noeSookht=noeSookht;
       this.gheymat=gheymat;
   }
   
   public void print(){
       System.out.println(name+","+saleTolid+","+kilometers+","+color+","+noeSookht+","+gheymat);
   }
   @Override
   public String toString() {
    
    String s = name+","+saleTolid+","+kilometers+","+color+","+noeSookht+","+gheymat;
    return s;
   }
}
