public class EclipseLab{ //name class circle when turning it in
// no main method 

private double radius; //didnt really need this, could have just set r to 1

public void Circle(){ //these are constructors because they have the smae name as the class. dont need a return type like void or something.
    
    radius = 1;
}

public void Circle(double r){
    
    radius = r;
}

public double calculateArea(double r){
    
    double a = Math.PI * Math.pow(r,2); //or just Math.PI*r*r
    return a;
}

    
}