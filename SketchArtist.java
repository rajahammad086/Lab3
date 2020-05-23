import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class SketchArtist {
// making an image of the person as per the demands of the user.
  public static void main ( String[] args ) {
     Scanner scanner = new Scanner(System.in);
     String hair;// for hair
     String haircolor;//it is going to save hair color
     String eyescolor;// will be saving eyes color
     System.out.println("are the hair:short or long?");
     hair=scanner.nextLine();
     System.out.println("is the colour of hair blond, brown or red?");
     haircolor=scanner.nextLine();
     System.out.println("are the eyes blue green or brown?");
     eyescolor=scanner.nextLine();
     Paint.buildWindow("Raja Hammad ", 0, 0, 1000, 1000, Color.WHITE);//back ground
     if (haircolor.equalsIgnoreCase("blond")){ // if hair color equals blond, it further checks if they are long or short.
     if (hair.equalsIgnoreCase("long")){
        Paint.setColor(new Color(179,131,56));//hair
     Paint.fillOval(200,220,500,500);//hair
     }
     if (hair.equalsIgnoreCase("short")){ 
        Paint.setColor(new Color(179,131,56));//hair
     Paint.fillOval(200,220,500,400);//hair
     }
     }
     else if (haircolor.equalsIgnoreCase("brown")) { // if hair color equals brown, it further checks if they are long or short.
        if (hair.equalsIgnoreCase("long")){
        Paint.setColor(new Color(101,50,50));//hair
     Paint.fillOval(200,220,500,500);//hair
     }
     if (hair.equalsIgnoreCase("short")){
        Paint.setColor(new Color(101,50,50));//hair
     Paint.fillOval(200,220,500,400);//hair
     }
     }
     else { // does for red hair color
        if (hair.equalsIgnoreCase("long")){
        Paint.setColor(Color.RED);//hair
     Paint.fillOval(200,220,500,500);//hair
     }
     if (hair.equalsIgnoreCase("short")){
        Paint.setColor(Color.RED);//hair
     Paint.fillOval(200,220,500,400);//hair
     }
     }
     
    
     
     
     Paint.setColor(new Color(136,78,66));
     Paint.fillRoundRect(300, 700, 300, 600,200 ,200); //body
     Paint.setColor(new Color(231,187,178));
     Paint.fillOval(250,250,400,500);//face
     Paint.setColor(Color.BLACK);
     Paint.drawTriangle(440,500,480,500,460,450);//nose
     Paint.drawLine(370,600,550,600);//lips
     
     //checks for eyes color and then draws those.
     if (eyescolor.equalsIgnoreCase("blue")){
        Paint.setColor(Color.BLUE);
     Paint.fillOval(340,350,50,50);//eyes
     Paint.fillOval(520,350,50,50);//eyes
     }
     else if ( eyescolor.equalsIgnoreCase("green")){
        Paint.setColor(Color.GREEN);
     Paint.fillOval(340,350,50,50);//eyes
     Paint.fillOval(520,350,50,50);//eyes
     }
     else{
        Paint.setColor(new Color(101,50,50));
     Paint.fillOval(340,350,50,50);//eyes
     Paint.fillOval(520,350,50,50);//eyes
     }
   
     
     
     
     
     
   
  }
  
}