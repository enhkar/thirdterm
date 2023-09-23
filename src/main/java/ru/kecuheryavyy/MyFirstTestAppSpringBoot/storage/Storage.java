package ru.kecuheryavyy.MyFirstTestAppSpringBoot.storage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class Storage {

    private ArrayList<String> stringList;
    private HashMap<String, String> stringMap;

    @GetMapping("/update-array")
    public void updateArrayList(@RequestParam(value = "item") String item) {
        if (item == null) {
            return;
        }

        if (stringList == null) {
            stringList = new ArrayList<>();
        }

        stringList.add(item);
    }

    @GetMapping("/show-array")
    public String showArrayList() {
        if (stringList == null) {
            return "[ ]";
        }
        return stringList.toString();
    }

    @GetMapping("/update-map")
    public void updateHashMap(@RequestParam(value = "item") String item) {
        if (item == null) {
            return;
        }

        if (stringMap == null) {
            stringMap = new HashMap<>();
        }

        stringMap.put(item, item);
    }

    @GetMapping("/show-map")
    public String showHashMap() {
        if (stringMap == null) {
            return "{ }";
        }
        return stringMap.toString();
    }

    @GetMapping("/show-all-length")
    public String showAllLength() {
        int stringListLength = stringList != null ? stringList.size() : 0;
        int stringMapLength = stringMap != null ? stringMap.size() : 0;
        return String.format(
                "Длина списка строк: %s \nВ таблице строк элементов: %s", stringListLength, stringMapLength
        );
    }


}
