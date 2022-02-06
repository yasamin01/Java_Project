package project;
public class rahnVaejare{
   int sen;
   long metraj;
   int tedadeOtagh;
   double rahn;
   double ejare;
   String address;
   
   public rahnVaejare(int sen,long metraj,int tedadeOtagh,double rahn,double ejare,String address){
       this.sen=sen;
       this.metraj=metraj;
       this.tedadeOtagh=tedadeOtagh;
       this.rahn=rahn;
       this.ejare=ejare;
       this.address=address;
   }
   @Override
   public String toString(){
       String s=sen+","+metraj+","+tedadeOtagh+","+rahn+","+ejare+","+address;
       return s;
   }
}
