
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    char ch=(char)br.read();
    int asciivalue=ch;
    System.out.print(asciivalue);

    }
}
