package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x1 = (int) (5 * Math.pow(Integer.parseInt(a), 2) + 3);
        int x2 = (int) (5 * Math.pow(Integer.parseInt(b), 2) + 3);

        if (x1 == x2)
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        else if (x1 > x2)
            return 1;
        else
            return -1;
    }
}
