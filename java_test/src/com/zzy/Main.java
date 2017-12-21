package com.zzy;

import javax.swing.text.html.HTMLDocument;
import java.math.BigDecimal;
import java.util.*;

public class Main {
//    Map<String, String> data = new HashMap<>();
//
//    public Main() {
//
////        data.put("a", "1");
////        data.put("b", "2");
////        data.put("c", "3");
////        data.put("d", "4");
////        data.put("e", "5");
////        data.put("f", "6");
//
//
////        if("1".equals(INTERNATION_DETAIL)){
////            commission = new BigDecimal(REMARK);
////            commission=commission.multiply(new BigDecimal(amount)).setScale(2, BigDecimal.ROUND_HALF_UP);
////            if(commission.compareTo(new BigDecimal("0.00"))==0){
////                commission=new BigDecimal("0.01");
////            }
////        }else if("2".equals(INTERNATION_DETAIL)){
////            commission = new BigDecimal(REMARK);
////        }
//
//
//
//    }


    public static void main(String[] args) {
        // write your code here
//        new Main();

//        String ss = "iuhjui";
//
//        String a = ss.replace("n", "a");
//
//        System.out.println(a);


//        double a= 0.8d;
//        float b= 0.8f;
//        System.out.println(b+0.00000000000001);
//        System.out.println(a+0.00000000000001);

//        Map<String,String> map = new HashMap<>();
//
//        map.put("a", "6");
//        map.put("b", "5");
//        map.put("c", "");
//        map.put("d", "3");
//        map.put("e", "2");
//        map.put("f", "1");
//
//        Main m = new Main();
//
//        m.putData(map);
//
//
//
//        System.out.println(m.data.toString());

//        String str = "请确认是否之前此手机号进行过注册，您可以通过找回密码功能进行重置密码并登录。如确实已被他人注册，请使用其他手机号进行注册。";
//        String searchStr = "注册";
//        StringBuilder sb = new StringBuilder(str);
//        List<Integer> indexList = new ArrayList<>();
//
//        while (str.lastIndexOf(searchStr) != -1) {
//
//
//            int i = str.lastIndexOf(searchStr);
//            indexList.add(i);
//
//            str = str.substring(0, i);
//
//
//            sb.insert(i + searchStr.length(), "</font>");
//            sb.insert(i, "<font color='#444444'>");
//        }
//
//        System.out.println(indexList.toString());
////        Collections.reverse(indexList);
//        System.out.println(indexList.toString());
//
////        for (int index : indexList) {
////            System.out.println(index);
////
////        }
//
//        System.out.println(sb.toString());

        BigDecimal aa = new BigDecimal("100");

        BigDecimal[] bigDecimals = aa.divideAndRemainder(new BigDecimal("2"));
        System.out.println(bigDecimals[0]+"----"+bigDecimals[1]);


    }

//    public void putData(Map<String, String> map) {
//        Set<String> keySet = map.keySet();
//
//        for (Iterator<String> it = keySet.iterator(); it.hasNext(); ) {
//            String next = it.next();
//            String value = map.get(next);
//            if (value!=null && !"".equals(value)) {
//                data.put(next, value);
//            }
//
//        }
//
//
//    }


}
