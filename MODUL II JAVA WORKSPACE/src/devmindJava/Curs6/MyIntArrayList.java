package devmindJava.Curs6;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyIntArrayList {
    private int[] elements;
    private int size;
    private int[] c;



    public MyIntArrayList() {
        this(10);
    }

    public MyIntArrayList(int initialCapacity) {
        this.elements = new int[initialCapacity];
    }

    public MyIntArrayList(MyIntArrayList c){
        this.elements = Arrays.copyOf(this.c,c.size);
    }



    //void add(int index, int element)
    public void add(int index, int element){
        if (this.size == this.elements.length - 1) {
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        for(int i = this.size; i > index;i--){
            this.elements[i] = this.elements[i-1];
        }
        this.elements[index] = element;
        size++;
    }
    public void print(){
        //System.out.println("Capacity: " + this.elements.length);
        //System.out.println("Size: " + this.size);
        for(int i = 0 ; i < this.size;i++){
            System.out.print(elements[i] + " ");

        }
        System.out.println();
    }
    // boolean add(int e)
    public boolean add(int e) {
        if (this.size == this.elements.length ) {
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        this.elements[size] = e;
        this.size++;

        return true;
    }

    //boolean contains(int e)
    public boolean contains(int e){
        boolean result = false;
        for(int i = 0;i < this.size;i++){
            if(elements[i] == e){
                result = true;
                break;
            }
        }
        return result;
    }
    // int lastIndexOf(int e)
    public int lastIndexOf(int e){
        int index = 0;
        for(int i = elements.length - 1; i > index; i--){
            if(elements[i] == e){
                index = i;
            }
        }
        return index;
    }
    // int get(int index)
    public int get(int index){
        int element = 0;
        for(int i = 0; i <elements.length;i++){
            if(i == index ){
                element = elements[i];

            }
        }
        return element;
    }
    //int size()
    public int size() {
        return this.size;
    }
    //int indexOf(int e)
    public int indexOf(int e) {
        for (int i=0; i<this.size; i++) {
            if (this.elements[i] == e) {
                return i;
            }
        }
        return -1;
    }
    //void trimToSize()
    public void trimToSize(){
        this.elements = Arrays.copyOf(this.elements,size);

    }
    //boolean remove(int e)
    public boolean remove(int e){
        boolean exist = false;

        for(int i = 0, k = 0; i < elements.length;i++){
            if(this.elements[i] == e){
                exist = true;
                this.size--;
                continue;

            } else {
                this.elements[k++] = this.elements[i];
                this.elements = Arrays.copyOf(this.elements,elements.length);

            }

        }

        return exist;
    }

    //int removeElementAtIndex(int index)
    public int removeElementAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            // should throw IndexOutOfBoundsException
            System.out.println("Throwing IndexOutOfBoundsException when trying to" +
                    " remove element at position " + index);
            return -1;
        }

        int removedElement = this.elements[index];
        for (int i=index; i<this.size; i++) {
            this.elements[i] = this.elements[i+1];
        }
        this.size--;

        return removedElement;
    }
    //void clear()
    public void clear() {
        this.size = 0;
    }
    //int set(int index, int e)
    public int set(int index, int e) {
        if (index < 0 || index >= this.size) {
            // should throw IndexOutOfBoundsException
            System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
                    " the element " + e + " at position " + index);
            return -1;
        }

        int replacedElement = this.elements[index];
        this.elements[index] = e;
        return replacedElement;
    }
    //boolean addAll(MyIntArrayList c)
   public void addAll(MyIntArrayList c){
        if (this.size + c.size > this.elements.length ) {
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
      for(int j = 0, i = this.size; j < c.size; j++){
          this.elements[i] = c.elements[j];
          i++;
      }
      this.size += c.size;

    }
    //boolean addAll(int index, MyIntArrayList c)
    boolean addAll(int index, MyIntArrayList c){
        if(this.size + c.size >= this.elements.length){
            this.elements = Arrays.copyOf(this.elements,this.size * 2 + c.size);
        }

        for(int i = this.size -1; i >= index; i--){
            this.elements[i + c.size] = this.elements[i];
        }
        for (int i = 0; i <c.size; i++){
            this.elements[index] = c.elements[i];
            index++;
        }

        this.size += c.size;
        return true;
    }

    //void ensureCapacity(int minCapacity)
    void ensureCapacity(int minCapacity){
        if(minCapacity > this.elements.length){
            this.elements = Arrays.copyOf(this.elements, minCapacity);
        }
    }






}
