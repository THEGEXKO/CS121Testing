package ClassACtivity;


public class Class2 {
     double getLength;
     double getWidth;
     double getArea;


     Class2(Double getLength, Double getWidth, Double getArea){
          this.getWidth = getWidth;
          this.getLength = getLength;
          this.getArea = getArea;

     }
     public void setGetLength(double getLength){
          this.getLength = getLength;
     }
     public  void setGetWidth(double getWidth){
          this.getWidth = getWidth;
     }
     public void setGetArea(double getArea){
          this.getArea = getArea;
     }
     public void displayInfo() {
          System.out.printf("The Width is %s and the length is %s so the area must be %s",getWidth,getLength,getArea);

     }
}
