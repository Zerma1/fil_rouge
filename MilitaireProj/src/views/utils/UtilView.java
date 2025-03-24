package views.utils;

import java.util.*;

public class UtilView {
    public static <E extends Enum<E>> List<String> enumToList(Class<E> enumClass) {
        List<String> list = new ArrayList<String>();

        for(E e : enumClass.getEnumConstants()){
            list.add(e.name());
        }
        return list;
    }
}
