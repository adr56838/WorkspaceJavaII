package devmindJava.Curs10;

public class Rectangle extends Shape{
    private final int width;
    private final int height;

    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String text, String material, int width, int height){
        super(text, material);
        this.width = width;
        this.height = height;
    }

    public void displayRectangleHeight(){
        String result = String.format("\nRectangle height is: %d ",height);
        System.out.println(result);
    }

    @Override
    public double getSize(){

        return (width*height)*1f;
    }

    @Override
    public String toString(){
        return String.format("Rectangle: height is %d, width is: %d, made of %s, contains the text: \"%s\".",height,width,super.getMaterial(),super.getText());
    }

    @Override
    public boolean equals(Object geometric){

        if(this.getClass() != geometric.getClass()){//acelasi tip
            return false;
        }

        Rectangle rectangleGeometric = (Rectangle) geometric;
        if(this.width == rectangleGeometric.width && this.height == rectangleGeometric.height){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {

        int prime = 31;
        int result = super.hashCode();
        result = prime * result + width;
        result = prime * result + height;

        return result;
    }
}
