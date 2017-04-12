package com.hanzo.springboot.adminlte.velocity.model;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Map;

/**
 * Created by P10103052 on 2017/4/1.
 */
public class XflushDataModel {

    private String[] dims;
    private Map<Long, Double[]> dataByTime;

    public XflushDataModel() {
    }

    public String[] getDims() {
        return dims;
    }

    public void setDims(String[] dims) {
        this.dims = dims;
    }

    public Map<Long, Double[]> getDataByTime() {
        return dataByTime;
    }

    public void setDataByTime(Map<Long, Double[]> dataByTime) {
        this.dataByTime = dataByTime;
    }

    @Override
    public String toString() {
        return "XflushDataModel{" + "dims=" + Arrays.toString(dims) + "dataByTime=" + dataByTime +"}";
    }
}
