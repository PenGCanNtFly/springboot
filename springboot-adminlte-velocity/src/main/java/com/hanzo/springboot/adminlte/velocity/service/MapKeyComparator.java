package com.hanzo.springboot.adminlte.velocity.service;

import java.util.Comparator;

/**
 * Created by P10103052 on 2017/4/1.
 */
public class MapKeyComparator implements Comparator<Long> {

    @Override
    public int compare(Long a1, Long a2) {
        return  a1.compareTo(a2);
    }

}
