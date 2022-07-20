package devmindJava.Curs10;

import java.util.Objects;

public class Triangle extends Shape {
    private final int base;
    private final int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(String text, String material, int base, int height) {
        super(text, material);
        this.base = base;
        this.height = height;
    }

    public void displayTriangleHeight(){
        String result = String.format("\nTriangle height is: %d ",height);
        System.out.println(result);
    }

    @Override
    public double getSize(){

        return (base * height) / 2f;
    }

    @Override
    public String toString(){
        return String.format("Triangle: height is %d, base is: %d, made of %s, contains the text: \"%s\".",height,base,super.getMaterial(),super.getText());
    }

    @Override

    public boolean equals(Object geometric){
        if(this.getClass() != geometric.getClass()){
            return false;
        }

        Triangle triangleGeometric = (Triangle)geometric;

        if( this.base == triangleGeometric.base ){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {

        int prime = 31;
        int result = super.hashCode();
        result = prime * result + base;
        result = prime * result + height;

        return result;
    }
}

