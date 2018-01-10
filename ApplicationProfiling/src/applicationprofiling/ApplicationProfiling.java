package applicationprofiling;

import java.util.Map;

public class ApplicationProfiling {

    public final String key; // public String key; will be without memory leak
    

    public ApplicationProfiling(String key) {
        this.key = key;
    }

    public static void main(String[] args) {
        try {
            Map map = System.getProperties();
            for (;;) {
                map.put(new ApplicationProfiling("key"), "value");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
