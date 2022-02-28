package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList tail = new ArrayList<>(value.length());
        tail.add(value);
        return tail;
    }

}
