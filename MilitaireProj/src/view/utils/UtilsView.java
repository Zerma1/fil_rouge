package view.utils;

import java.util.ArrayList;
import java.util.List;

public class UtilsView {

    public static <E extends Enum> List<String> enumToListString(Class<E> enumClass){
        List<String> list = new ArrayList<String>();

        for(E e : enumClass.getEnumConstants()){
            list.add(e.name());
        }

        return list;
    }

}
