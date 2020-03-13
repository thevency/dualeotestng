import java.io.Console;
import java.util.Scanner;

public class ForString {

    public static void main(String[] argv){
        Scanner myObj = new Scanner(System.in);

        get(myObj.nextLine(), "1-000");
    }

    public static void get(CharSequence... charSequence){
//        CharSequence charSequence = "kshdksljd dkasdhiSHD DAHS";
        for(int i =0;i<charSequence.length;i++){
            System.out.println("charSequence: "+ charSequence[i]);
        }

//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(charSequence);
//        System.out.println("stringBuilder: "+ stringBuilder);
    }
}
