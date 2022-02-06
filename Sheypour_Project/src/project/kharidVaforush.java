package project;
public class kharidVaforush{
   int sen;
   long metraj;
   int tedadeOtagh;
   double  gheymat;
   String address;
   
   public kharidVaforush(int sen,long metraj,int tedadeOtagh,double gheymat,String address){
       this.sen=sen;
       this.metraj=metraj;
       this.tedadeOtagh=tedadeOtagh;
       this.gheymat=gheymat;
       this.address=address;
       
   }
   @Override
   public String toString(){
       String s=sen+","+metraj+","+tedadeOtagh+","+gheymat+","+address;
       return s;
   }
}
