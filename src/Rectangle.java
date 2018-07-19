public class  Rectangle{
  public int lenght;
  public int width;

  public Rectangle(int lenght,int width){
    this.lenght = lenght;
    this.width = width;
  }
  
  public int getArea(){
    return length*width;
  }

  public int getPerimeter(){
    return 2*(length + width); 
  }
}
