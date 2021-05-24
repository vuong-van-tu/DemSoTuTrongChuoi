import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String st = sc.nextLine();
        st = chuanHoa(st);
        System.out.println(st);
        String[] strings = st.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < strings.length; i++) {
            int value = 1;
            if (map.containsKey(strings[i])) {
                value += map.get(strings[i]);
            }
            map.put(strings[i], value);
        }
        System.out.println(map);
    }

    public static String chuanHoa(String st) {
        st = st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        return st;
    }
}
