public class Rectangle {
// has a width
// has a height
private int width;
private int height;
public Rectangle(int width, int height){
   this.width = width;
   this.height = height;
}



public static void main(String[] args) {
    Rectangle r1 = new Rectangle(4, 6);
    Rectangle r2 = new Rectangle(5, 3);
    System.out.println(r1.area());
    System.out.println(r1.isBigger(r2));
    
}

public int area(){
    return height*width;
}

public int perimeter(){
    return 2*height + 2*width;
}

public boolean isBigger(Rectangle otherRectangle){
    if(this.area() > otherRectangle.area()){
        return true;
    }
    else {
        return false;
    }
    }
}




