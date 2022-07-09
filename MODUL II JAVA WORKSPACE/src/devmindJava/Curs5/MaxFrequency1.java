package devmindJava.Curs5;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxFrequency1 {


    public static void main(String[] args){
        int aux = 0;
        int cnt = 0;
        int frequency = 0;
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2,1,2,5,13,5,18,2,16,10,1,1,1,2,4,3,5,6,7,7,8,5));
        ArrayList<Integer> listMaxFrequency = new ArrayList<>();

        for(int i = 0; i <list1.size();i++){
        aux = list1.get(i);
        cnt = 0;
        for(int j = i ; j<list1.size();j++){
            if(aux == list1.get(j)){
                cnt++;
            }
        }
        if(cnt > frequency){
            frequency = cnt;
            listMaxFrequency.clear();
            listMaxFrequency.add(list1.get(i));
        } else if(cnt == frequency){
            listMaxFrequency.add(list1.get(i));
        }
        }
        System.out.println(listMaxFrequency);
    }
}


