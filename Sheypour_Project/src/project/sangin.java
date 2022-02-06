package project;
public class sangin{
    String name;
    double gheymat;
    
    public sangin(String name,double gheymat){
        this.name=name;
        this.gheymat=gheymat;
    }
    
    public void print(){
        System.out.println(name+","+gheymat);
    }
    
    @Override
    public String toString(){
        String s=name+","+gheymat;
        return s;
    }
}
