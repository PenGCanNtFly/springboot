package com.hanzo.springboot.adminlte.velocity.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hanzo.springboot.adminlte.velocity.model.XflushDataModel;
import com.hanzo.springboot.adminlte.velocity.service.MapKeyComparator;
import com.hanzo.springboot.adminlte.velocity.service.XflushServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.*;


/**
 * Created by P10103052 on 2017/4/1.
 */
@RestController
public class XflushDataController {

    @Autowired
//    private XflushService xflushService;
    private static XflushServiceImpl xflushService = new XflushServiceImpl();

    @RequestMapping(value = "/xflush")
    public String getDataFromXflush(@RequestParam("appname") String appname) {

        String url = "http://x.alibaba-inc.com/u_33/universalQuery";
        String json = "[{\"zones\":null,\"condition\":{\"plugin\":\"SPM\",\"contentType\":\"SPM\",\"dsId\":\"243\",\"end\":1491032411532,\"start\":1491028871532,\"tag\":null}}]";
        try {
//            System.out.println(xflushService.getXflushData(url, json));
            String result = xflushService.getXflushData(url, json);

            JSONArray jsonArray = JSON.parseObject(result).getJSONArray("data");
//            System.out.println(jsonArray);
            List<XflushDataModel> list = JSON.parseArray(jsonArray.get(0) + "", XflushDataModel.class);
//            System.out.println(list);

            Map<String, List> ret = new HashMap<>();
            List<double[]> listtmp = new ArrayList<>();

            ret.put("succrate", listtmp);

            for (XflushDataModel xflushDataModel : list) {
                if (appname.equals(xflushDataModel.getDims()[0])) {
                    Map<Long, Double[]> sortMap = new TreeMap<Long, Double[]>(new MapKeyComparator());
                    sortMap.putAll(xflushDataModel.getDataByTime());

                    for (Map.Entry<Long, Double[]> entry : sortMap.entrySet()) {
                        double[] tmp = new double[2];
                        try {
                            tmp[0] = (double)entry.getKey();
                            tmp[1] = entry.getValue()[2];
                        } catch (NullPointerException e) {

                        }
                        listtmp.add(tmp);
                    }
                    ret.put("succrate", listtmp);
                    break;
                }
            }
            System.out.println(JSON.toJSONString(ret));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "yangqi01/xflush";
    }

    @RequestMapping(value = "/xflush1")
    public String returnXflush1() {
        return "yangqi01/xflush";
    }
}
