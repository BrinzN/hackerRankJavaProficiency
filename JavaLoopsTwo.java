import java.util.*;
import java.io.*;

public class JavaLoopsTwo {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            if(t>=0 && t<=500){
                for(int i=0;i<t;i++){
                    int a = in.nextInt();
                    int b = in.nextInt();
                    int n = in.nextInt();

                    if((a>=0 && a<=50) && (b>=0 && b<=50) && (n>=1 && n<=15)){
                        for (int j = 0; j < n; j++) {
                            a += b;
                            System.out.print(a + " ");
                            b *= 2;
                        }
                        System.out.println();
                    }
                }

            }
            in.close();
        }
}
