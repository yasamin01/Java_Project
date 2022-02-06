package project;
public class zaminVabagh{
   long metraj;
   double  gheymat;
   String address;
   
   public zaminVabagh(long metraj,double gheymat,String address){
       this.metraj=metraj;
       this.gheymat=gheymat;
       this.address=address;
   }
   @Override
   public String toString(){
       String s=metraj+","+gheymat+","+address;
       return s;
   }
}
