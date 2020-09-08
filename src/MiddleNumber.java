import java.io.*;


public class MiddleNumber {

        public static void main(String[] args) throws Exception {
            //write your code here
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(rd.readLine());
            int b = Integer.parseInt(rd.readLine());
            int c = Integer.parseInt(rd.readLine());

            if ((b>=a && c<=a) || (c>=a && b<=a)){
                System.out.print(a);
            }
            else if ((a>=b && c<=b) || (c>=b && a<=b)){
                System.out.print(b);
            }
            else {
                System.out.print(c);
            }
        }
    }

