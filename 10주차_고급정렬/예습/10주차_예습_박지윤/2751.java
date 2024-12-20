import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        String num=br.readLine();

        int [] arr=new int[Integer.parseInt(num)];

        for(int i=0;i<Integer.parseInt(num);i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int value:arr){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
