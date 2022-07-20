package devmindJava.Curs10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.print("#SHAPE");
        Shape forma = new Shape("Math is easy", "plastic");
        System.out.println("\nApply \"toString()\" for shape");
        System.out.println("\t" + forma);
        System.out.println("\nArea of generic shape is: " + forma.getSize());


        System.out.print("\n#TRIANGLE");

        Triangle firstTriangle = new Triangle("I reflect light", "glass", 23, 11);
        Triangle secondTriangle = new Triangle(23, 11);
        Triangle thirdTriangle = new Triangle(27, 12);
        Triangle fourthTriangle = thirdTriangle;
        System.out.println("\nApply \"toString()\" for triangle");
        System.out.println("\t" + firstTriangle);
        firstTriangle.displayTriangleHeight();

        System.out.println("\nArea of triangle is: " + firstTriangle.getSize());

        System.out.println("\nApply \"equals(Object)\" for triangle");
        System.out.println("\tFirst equals second? " + firstTriangle.equals(secondTriangle));
        System.out.println("\tFirst equals third? " + firstTriangle.equals(thirdTriangle));
        System.out.println("\tSecond equals third? " + secondTriangle.equals(thirdTriangle));
        System.out.println("\tFourth equals third? " + fourthTriangle.equals(thirdTriangle));

        System.out.println("\nApply \"hashCode()\" for triangle");
        System.out.println("\tFirst triangle hashcode: " + firstTriangle.hashCode());
        System.out.println("\tSecond triangle hashcode: " + secondTriangle.hashCode());
        System.out.println("\tThird triangle hashcode: " + thirdTriangle.hashCode());
        System.out.println("\tFourth triangle hashcode: " + fourthTriangle.hashCode());


        System.out.print("\n#RECTANGLE");

        Rectangle firstRectangle = new Rectangle("Yellow rectangle", "steel", 10, 50);
        Rectangle secondRectangle = new Rectangle(10, 50);
        Rectangle thirdRectangle = new Rectangle(25, 20);
        Rectangle fourthRectangle = thirdRectangle;
        System.out.println("\nApply \"toString()\" for rectangle");
        System.out.println("\t" + firstRectangle);
        firstRectangle.displayRectangleHeight();

        System.out.println("\nArea of rectangle is: " + firstRectangle.getSize());

        System.out.println("\nApply \"equals(Object)\" for rectangle");
        System.out.println("\tFirst equals second? " + firstRectangle.equals(secondRectangle));
        System.out.println("\tFirst equals third? " + firstRectangle.equals(thirdRectangle));
        System.out.println("\tSecond equals third? " + secondRectangle.equals(thirdRectangle));
        System.out.println("\tFourth equals third? " + fourthRectangle.equals(thirdRectangle));

        System.out.println("\nApply \"hashCode()\" for rectangle");
        System.out.println("\tFirst rectangle hashcode: " + firstRectangle.hashCode());
        System.out.println("\tSecond rectangle hashcode: " + secondRectangle.hashCode());
        System.out.println("\tThird rectangle hashcode: " + thirdRectangle.hashCode());
        System.out.println("\tFourth rectangle hashcode: " + fourthRectangle.hashCode()+ "\n") ;

        // defined 2 generic shapes
        Shape formaGenerica1 = new Shape("Glass is curved", "glass");
        Shape formaGenerica2 = new Shape("Pencil is cylindrical", "plastic");
        // defined 2 triangles
        Triangle bestTriangle = new Triangle("It sounds better", "aluminium", 10, 15);
        Triangle softTriangle = new Triangle("It bends anyway", "foam", 30, 40);
        // defined 2 rectangles
        Rectangle hardRectangle = new Rectangle("It is rock", "concrete", 20, 17);
        Rectangle imaginaryRectangle = new Rectangle("It is 3D", "soap", 19, 23);

        ArrayList<Shape> geometricForms = new ArrayList<>();
        geometricForms.add(formaGenerica1);
        geometricForms.add(formaGenerica2);
        geometricForms.add(bestTriangle);
        geometricForms.add(softTriangle);
        geometricForms.add(hardRectangle);
        geometricForms.add(imaginaryRectangle);

        System.out.println("Upcasting toString()");
        System.out.println(geometricForms + "\n");


        //getSize
        System.out.println("Upcasting getSize()");
        for (Shape geometricFormsNEW : geometricForms) {
            System.out.println("getSize() of geometricForms-->> " + geometricFormsNEW.getMaterial() + " = " + geometricFormsNEW.getSize());
        }
        //downcasting
        System.out.println("\nDowncasting display");
        for (Shape geometricFormDown : geometricForms) {
            if (geometricFormDown instanceof Triangle triangleForms) {
                triangleForms.displayTriangleHeight();
            } else if (geometricFormDown instanceof Rectangle rectangleForms) {
                rectangleForms.displayRectangleHeight();
            }
        }

    }
}
