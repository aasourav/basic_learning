/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingobject;
import java.util.*;


class Point{
      double x;
      double y;
 
    Point(double x,double y){
       this.x=x;
       this.y=y;
    }
    Point(){
       x=y=0.0;
    }
    Point(Point P){
        x=P.x;
        y=P.y;
    }

    double distance(Point P){
        double dis=(P.x-x)*(P.x-x)+(P.y-y)*(P.y-y);
        dis=Math.sqrt(dis);
        return dis;
    } 
    void midPoint(Point P,Point Q){
         x=(P.x+Q.x)/2;
         y=(P.y+Q.y)/2;
    }
    
    
    
}
public class PassingObject {
    public static void main(String[] args) {
       Point P1=new Point();
       Point P2=new Point(4.0,4.0);
       Point P3=new Point(P1);   
       System.out.println("x : "+P3.x+" y :"+P3.y);
       
       
       
       
       P3.midPoint(P1,P2);
       
       
       
       System.out.println("x : "+P3.x+" y :"+P3.y);
       

       
       
       
    }
    
}
