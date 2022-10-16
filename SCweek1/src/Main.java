import java.io.InputStreamReader;
import java.util.*;
import java.net.URL;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String email = read.readLine();
        String address = "https://www.ecs.soton.ac.uk/people/"+email;
        URL url = new URL(address);
        BufferedReader web = new BufferedReader(new InputStreamReader(url.openStream()));
        for(int i = 1;i<14;i++){
            web.readLine();
        }
        String wantedLine = web.readLine();
        String[] l = wantedLine.split("[=\"]+");
        String name = l[3];
        System.out.println(name);
        }
    }
