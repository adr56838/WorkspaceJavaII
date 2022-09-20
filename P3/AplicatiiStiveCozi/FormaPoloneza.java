package devmindJava.P3.AplicatiiStiveCozi;
import java.util.*;


public class FormaPoloneza {

    public static String postFixForm(String expresie) {

        StringBuilder formaPostFixata = new StringBuilder(" ");
        Stack<Character> stiva = new Stack<>();

        for(int i = 0; i < expresie.length(); i++){
            char c = expresie.charAt(i);
            if(c == ' '){ // daca avem spatiu gol sarim peste
                continue;

        //1.2. dacă entitatea este un operand (i.e. un număr), atunci:
        // 1.2.1 adaugă la forma postfixată
            }  if(Character.isDigit(c)){
                formaPostFixata.append(c);
                continue;

            } if(Algorithms.isLeftParanthesis(c)){
                stiva.push(c);
                continue;
            }

            if( Algorithms.isOperator(c)){

                while( !stiva.isEmpty() &&
                        !Algorithms.isLeftParanthesis(c) &&
                        (Algorithms.precedenceValue(c) < Algorithms.precedenceValue(stiva.peek()) ||
                        (Algorithms.precedenceValue(c) == Algorithms.precedenceValue(stiva.peek()) &&
                                Algorithms.leftRightAssociativity(stiva.peek())))){
                    //  1.3.1.1 extrage O2 și adaugă-l la forma postfixată
                    formaPostFixata.append(stiva.peek());
                    stiva.pop();
                }

                //1.3.2 adaugă O1 în stivă
                stiva.push(c);
                continue;

                //1.4 dacă entitatea este o paranteză-stânga, atunci:
            }else if(c == '('){
                // 1.4.1 adaugă paranteza în stivă
                stiva.push(c);
                //1.5 dacă entitatea este o paranteză-dreapta, atunci:
            }else if(c == ')'){
                // 1.5.1 cât timp operatorul din vârful stivei (fie el O) nu este paranteză-stânga:
                while(!stiva.isEmpty() && !Algorithms.isLeftParanthesis(stiva.peek())){
                    //1.5.1.1 extrage O și adaugă-l la forma postfixată
                    formaPostFixata.append(stiva.peek());
                    stiva.pop();
                }
                // 1.5.2 dacă stiva s-a golit (și nu s-a găsit o paranteză-stânga)
                if(stiva.isEmpty()){
                    //1.5.2.1 returnează eroare (i.e. expresia avea paranteze greșite)
                    System.err.println("Expresia are paranteze gresite");
                }else{
                    stiva.pop();
                }
            }
        }
        while(!stiva.isEmpty()){
            if(stiva.peek() == '(') {
                System.out.println("Expresia are paranteze gresite");
            }
                formaPostFixata.append(stiva.pop());
        }
        return formaPostFixata.toString();
    }
    public static int evaluareExpresie(String expresie) {

        Stack<Integer> evaluare = new Stack<>();
        for(int i = 0; i < expresie.length();i++){
            char c = expresie.charAt(i);
            if(c == ' '){
                continue;
            }else if(Character.isDigit(c)){
                evaluare.push(c -'0');
            }else if(Algorithms.isOperator(c)){
                System.out.println(c);
                int op1 = evaluare.peek();
                evaluare.pop();
                int op2 = evaluare.peek();
                evaluare.pop();

                switch(c){
                    case '+':
                        evaluare.push(op2+op1);
                        break;
                    case '-':
                        evaluare.push(op2-op1);
                        break;
                    case '*':
                        evaluare.push(op2*op1);
                        break;
                    case '/':
                        evaluare.push(op2/op1);
                        break;
                    case '^':
                        evaluare.push((int) Math.pow(op2,op1));
                        break;
                }
            }else if(!evaluare.isEmpty()){
                System.err.println("Expresia postfixata este gresita");
            }
        }
        return evaluare.pop();
    }

    public static void main(String[] args){
        String expresie = "3+(2+1)*2^3^2-8/(5-1*2/2)";
        System.out.println(postFixForm(expresie));
        System.out.println(evaluareExpresie(postFixForm(expresie)));
    }
}
