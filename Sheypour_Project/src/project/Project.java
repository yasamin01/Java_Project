package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static project.user.verify;

public class Project {
    public static void main(String[] args) {
        
        File F = new File("user.txt");
        File a = new File("khodro.txt");
        File b = new File("motor.txt");
        File c = new File("sangin.txt");
        File d = new File("rahnVaejare.txt");
        File e = new File("kharidVaforush.txt");
        File f = new File("zaminVabagh.txt");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("<LOGIN MENU>");
        System.out.println("Enter username:");        
        String username=input.nextLine();
        System.out.println("Enter password:");
        String password=input.nextLine();
        verify(username,password);

        System.out.println("<MENU>\n1:moshahede-ye agahi\n2:sabt-e agahi");
        int menuNum = input.nextInt();
        if(menuNum==1){
            System.out.println("Entekhab konid:\n1:Vasaayel-e naghlie\n2:Amlaak");
            int vorAnum = input.nextInt();
            if(vorAnum==1){
                System.out.println("Entekhab konid:\n1:khodro\n2:motor\n3:sangin");
                int number1=input.nextInt();
                switch (number1) {
                    case 1:
                        try{
                            Scanner myReader=new Scanner(a);
                            while(myReader.hasNextLine()){
                                String data= myReader.nextLine();
                                System.out.println(data);
                            }
                            myReader.close();
                        }catch(FileNotFoundException ef){
                            System.out.println("File not found");
                        }
                        
                        break;
                    case 2:
                        try{                            
                            Scanner myReader=new Scanner(b);
                            while(myReader.hasNextLine()){
                                String data= myReader.nextLine();
                                System.out.println(data);
                            }
                            myReader.close();
                        }catch(FileNotFoundException ef){
                            System.out.println("File not found");
                        }
                        
                        break;
                    case 3:
                        try{                        
                        Scanner myReader=new Scanner(c);
                            while(myReader.hasNextLine()){
                                String data= myReader.nextLine();
                                System.out.println(data);
                            }
                            myReader.close();
                        }catch(FileNotFoundException ef){
                            System.out.println("File not found");
                        }
                        
                        break;
                    default:
                        break;
                }
            }
            else if(vorAnum==2){
                System.out.println("Entekhab konid:\n1:rahnVaejare\n2:kharidVaForush\n3:zaminVabagh");
                int number2=input.nextInt();
                switch (number2) {
                    case 1:
                        try{                       
                        Scanner myReader=new Scanner(d);
                            while(myReader.hasNextLine()){
                                String data= myReader.nextLine();
                                System.out.println(data);
                            }
                            myReader.close();
                        }catch(FileNotFoundException ef){
                            System.out.println("File not found");
                        }
                        break;
                    case 2:
                        try{
                        Scanner myReader=new Scanner(e);
                            while(myReader.hasNextLine()){
                                String data= myReader.nextLine();
                                System.out.println(data);
                            }
                            myReader.close();
                        }catch(FileNotFoundException ef){
                            System.out.println("File not found");
                        }
                       
                        break;
                    case 3:
                        try{
                        Scanner myReader=new Scanner(f);
                            while(myReader.hasNextLine()){
                                String data= myReader.nextLine();
                                System.out.println(data);
                            }
                            myReader.close();
                        }catch(FileNotFoundException ef){
                            System.out.println("File not found");
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        else if(menuNum==2){
            System.out.println("Entekhab konid:\n1:Vasaayel-e naghlie\n2:Amlaak");
            int vorAnum = input.nextInt();
            if(vorAnum==1){
                System.out.println("Entekhab konid:\n1:khodro\n2:motor\n3:sangin");
                int number1=input.nextInt();
                switch (number1) {
                    case 1:
                        try{
                            System.out.println("Etelaat ra be tartib vared konid");
                            System.out.println("name,saleTolid,kilometers,color,noesoookht,gheymat");
                            Scanner fileInput= new Scanner(a);
                            khodro [] slist= new khodro[100];
                            int counter=0;
                            while(fileInput.hasNextLine()){
                                String s= fileInput.nextLine();
                                String[] splStrings=s.split(",");
                                slist[counter++]= new khodro(splStrings[0],Integer.parseInt(splStrings[1]),Long.parseLong(splStrings[2]),splStrings[3], splStrings[4],Double.parseDouble(splStrings[5]));
                            }
                            String m= input.nextLine();
                            if(m.length()==0)
                                m=input.nextLine();
                            String[] msplStrings= m.split(",");
                            slist[counter++]= new khodro(msplStrings[0],Integer.parseInt(msplStrings[1]),Long.parseLong(msplStrings[2]),msplStrings[3], msplStrings[4],Double.parseDouble(msplStrings[5]));
                            
                            try{
                            FileWriter fw= new FileWriter(a);
                            for(int i=0;i<counter;i++){
                                fw.write(slist[i].toString()+"\n");
                            }
                            fw.close();
                            }catch(IOException ef){
                                  System.out.println("IOException");
                            }
                        }catch(FileNotFoundException er){
                        
                        }
                    break;
                    case 2:
                        try{
                            
                            System.out.println("Etelaat ra be tartib vared konid");
                            System.out.println("name,gheymat");
                            Scanner fileInput= new Scanner(b);
                            motor [] slist= new motor[100];
                            int counter=0;
                            while(fileInput.hasNextLine()){
                                String s= fileInput.nextLine();
                                String[] splStrings=s.split(",");
                                slist[counter++]= new motor(splStrings[0],Double.parseDouble(splStrings[1]),Integer.parseInt(splStrings[2]));
                            }
                            String m= input.nextLine();
                            if(m.length()==0)
                                m=input.nextLine();
                            String[] msplStrings= m.split(",");
                            slist[counter++]= new motor(msplStrings[0],Double.parseDouble(msplStrings[1]),Integer.parseInt(msplStrings[2]));
                            
                            try{
                            FileWriter fw= new FileWriter(b);
                            for(int i=0;i<counter;i++){
                                fw.write(slist[i].toString()+"\n");
                            }
                            fw.close();
                            }catch(IOException ef){
                                  System.out.println("IOException");
                            }
                        }catch(FileNotFoundException er){
                        
                        }
                    break;
                    case 3:
                        try{
                            System.out.println("Etelaat ra be tartib vared konid");
                            System.out.println("name,gheymat");
                            Scanner fileInput= new Scanner(c);
                            sangin [] slist= new sangin[100];
                            int counter=0;
                            while(fileInput.hasNextLine()){
                                String s= fileInput.nextLine();
                                String[] splStrings=s.split(",");
                                slist[counter++]= new sangin(splStrings[0],Double.parseDouble(splStrings[1]));
                            }
                            String m= input.nextLine();
                            if(m.length()==0)
                                m=input.nextLine();
                            String[] msplStrings= m.split(",");
                            slist[counter++]= new sangin(msplStrings[0],Double.parseDouble(msplStrings[1]));
                            
                            try{
                            FileWriter fw= new FileWriter(c);
                            for(int i=0;i<counter;i++){
                                fw.write(slist[i].toString()+"\n");
                            }
                            fw.close();
                            }catch(IOException ef){
                                  System.out.println("IOException");
                            }
                        }catch(FileNotFoundException er){
                        
                        }
                        
                        break;
                    default:
                        break;
                }
            }
            else if(vorAnum==2){
                System.out.println("Entekhab konid:\n1:rahnVaejare\n2:kharidVaForush\n3:zaminVabagh");
                int number2=input.nextInt();
                switch (number2) {
                    case 1:
                        try{
                            
                            System.out.println("Etelaat ra be tartib vared konid");
                            System.out.println("sen,metraj,tedadeOtagh,rahn,ejare,address");
                            Scanner fileInput= new Scanner(d);
                            rahnVaejare [] slist= new rahnVaejare[100];
                            int counter=0;
                            while(fileInput.hasNextLine()){
                                String s= fileInput.nextLine();
                                String[] splStrings=s.split(",");
                                slist[counter++]= new rahnVaejare(Integer.parseInt(splStrings[0]),Long.parseLong(splStrings[1]),Integer.parseInt(splStrings[2]),Double.parseDouble(splStrings[3]),Double.parseDouble(splStrings[4]),splStrings[5]);
                            }
                            String m= input.nextLine();
                            if(m.length()==0)
                                m=input.nextLine();
                            String[] msplStrings= m.split(",");
                            slist[counter++]= new rahnVaejare(Integer.parseInt(msplStrings[0]),Long.parseLong(msplStrings[1]),Integer.parseInt(msplStrings[2]),Double.parseDouble(msplStrings[3]),Double.parseDouble(msplStrings[4]),msplStrings[5]);
                            
                            try{
                            FileWriter fw= new FileWriter(d);
                            for(int i=0;i<counter;i++){
                                fw.write(slist[i].toString()+"\n");
                            }
                            fw.close();
                            }catch(IOException ef){
                                  System.out.println("IOException");
                            }
                        }catch(FileNotFoundException er){
                        
                        }
                        
                        break;
                    case 2:
                        try{
                            System.out.println("Etelaat ra be tartib vared konid");
                            System.out.println("sen,metraj,tedadeOtagh,gheymat,address");   
                            Scanner fileInput= new Scanner(e);
                            kharidVaforush [] slist= new kharidVaforush[100];
                            int counter=0;
                            while(fileInput.hasNextLine()){
                                String s= fileInput.nextLine();
                                String[] splStrings=s.split(",");
                                slist[counter++]= new kharidVaforush(Integer.parseInt(splStrings[0]),Long.parseLong(splStrings[1]),Integer.parseInt(splStrings[2]),Double.parseDouble(splStrings[3]),splStrings[4]);
                            }
                            String m= input.nextLine();
                            if(m.length()==0)
                                m=input.nextLine();
                            String[] msplStrings= m.split(",");
                            slist[counter++]= new kharidVaforush(Integer.parseInt(msplStrings[0]),Long.parseLong(msplStrings[1]),Integer.parseInt(msplStrings[2]),Double.parseDouble(msplStrings[3]),msplStrings[4]);
                            
                            try{
                            FileWriter fw= new FileWriter(e);
                            for(int i=0;i<counter;i++){
                                fw.write(slist[i].toString()+"\n");
                            }
                            fw.close();
                            }catch(IOException ef){
                                  System.out.println("IOException");
                            }
                        }catch(FileNotFoundException er){
                        
                        }                    
                        break;
                    case 3:try{
                            System.out.println("Etelaat ra be tartib vared konid");
                            System.out.println("metraj,gheymat,address");  
                            Scanner fileInput= new Scanner(f);
                            zaminVabagh [] slist= new zaminVabagh[100];
                            int counter=0;
                            while(fileInput.hasNextLine()){
                                String s= fileInput.nextLine();
                                String[] splStrings=s.split(",");
                                slist[counter++]= new zaminVabagh(Long.parseLong(splStrings[0]),Double.parseDouble(splStrings[1]),splStrings[2]);
                            }
                            String m= input.nextLine();
                            if(m.length()==0)
                                m=input.nextLine();
                            String[] msplStrings= m.split(",");
                            slist[counter++]= new zaminVabagh(Long.parseLong(msplStrings[0]),Double.parseDouble(msplStrings[1]),msplStrings[2]);
                            
                            try{
                            FileWriter fw= new FileWriter(f);
                            for(int i=0;i<counter;i++){
                                fw.write(slist[i].toString()+"\n");
                            }
                            fw.close();
                            }catch(IOException ef){
                                  System.out.println("IOException");
                            }
                        }catch(FileNotFoundException er){
                        
                        }    
                        
                        break;
                    default:
                        break;
                }
            }
            else do{
               System.out.println("Entekhab konid:\n1:Vasaayel-e naghlie\n2:Amlaak");
               vorAnum = input.nextInt(); 
            }while(vorAnum!=1&&vorAnum!=2);
        }
        else  do{
            System.out.println("<MENU>\n1:moshahede-ye agahi\n2:sabt-e agahi");
            menuNum = input.nextInt();
        }while(menuNum!=1&&menuNum!=2);
    }
}   

