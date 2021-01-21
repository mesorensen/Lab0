public class EclipseLabApp{ //call it circleApplication in EclipseLabApp
    
    public static void main(String[] agrs){
        
        Circle myCircle = new Circle(); //new circleis made
        double area= myCircle.calculateArea(100.45); // method is called (from other program)
        System.out.println("The area is " + area);
    }
    
    
}