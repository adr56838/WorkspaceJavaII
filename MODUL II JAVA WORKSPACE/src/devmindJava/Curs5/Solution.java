package devmindJava.Curs5;

public class Solution {

        public boolean isUgly(int n) {
            boolean result = false;



            if(n / 2 == 1 || n / 3 == 1 || n / 5 == 1){
                result = true;
            }else if(n%2 ==0){
                result = true;

            }else if(n % 3 == 0) {
                result = true;

            }else if(n%5==0){
                result = true;
            } else if(n % 2==0 && n%3==0){
                result = true;

            }else if(n % 2 ==0 && n%5==0){
                result = true;
            }else if(n%3==0 && n%5==0){
                result = true;

            }



            return result;
        }

    }

