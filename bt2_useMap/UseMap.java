package bt2_useMap;

import java.util.HashMap;

public class UseMap {
    public static void main(String[] args) {
        String string = "lua nep la lua nep lang lua len lop lop long lon no ne";
        HashMap<String, Integer> map = new HashMap<>();
        String[] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            int value = 1;
            if (stringArray[i] != null) {
                for (int j = i + 1; j < stringArray.length; j++) {
                    if (stringArray[j] != null && stringArray[i].equals(stringArray[j])) {
                        value++;
                        stringArray[j] = null;
                    }
                }
                map.put(stringArray[i],value);
            }
        }
        System.out.println(map);
    }
}
