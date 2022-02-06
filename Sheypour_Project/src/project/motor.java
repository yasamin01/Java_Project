package project;
public class motor{
    String name;
    double gheymat;
    int saleTolid;
    
    public motor(String name,double gheymat,int saleTolid){
        this.name=name;
        this.gheymat=gheymat;
        this.saleTolid=saleTolid;
    }
    
    public void print(){
        System.out.println(name+","+gheymat+","+saleTolid);
    }
    
    @Override
    public String toString(){
        String s=name+","+gheymat+","+saleTolid;
        return s;
    }
    
}
