/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbyvalue;

class Rectangle{
     double height;
     double width;
     Rectangle(double h,double w){
         height=h;
         width=w;
     }
     void Area(){
 
         System.out.println("The area: "+height*width);
     }
     void reshape(Rectangle r,double a,double b){
         height=r.height*a;
         width=r.width*b;
         
     }
    

}
public class PassByValue {

    
    public static void main(String[] args) {
        Rectangle R1=new Rectangle(4.0,5.0);
        
        R1.Area();
        System.out.println("R1's height "+R1.height);
        System.out.println("R1's width "+R1.width);
        Rectangle R2=new Rectangle(0.0,0.0);
        
        
        R2.reshape(R1,3.0,2.0);
        System.out.println("R1's height "+R2.height);
        System.out.println("R1's width "+R2.width);
        R2.Area();
    }
    
}
