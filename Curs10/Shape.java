package devmindJava.Curs10;

public class Shape {
    public String getText() {
        return text;
    }

    public String getMaterial() {
        return material;
    }

    private final String text;
    private final String material;


    public Shape(){
        this.text = "";
        this.material = "";

    }
    public Shape(String text, String material){
        this.text= text;
        this.material = material;
    }

    public double getSize(){//pull method, eu am definit getSize in triangle si Rectangle primind ca parametri base-height, respectiv width-height ce inseamna metoda asta? am vazut ca mi-a facut metoda si clasa 'abstract'

        //double result = -1f;
        return -1f;
    }
    @Override
    public String toString(){
        return String.format("made of %s, contains the text: \"%s\".",material,text);
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = prime * result;
        return result;
    }


}
