package com.zzy;

import sun.rmi.runtime.Log;

import javax.swing.text.html.HTMLDocument;
import javax.xml.crypto.Data;
import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

//        BigDecimal aa = new BigDecimal("100");
//
//        BigDecimal[] bigDecimals = aa.divideAndRemainder(new BigDecimal("2"));
//        System.out.println(bigDecimals[0]+"----"+bigDecimals[1]);


//        String strDecode = DesUtils.strDecode("B0DD01C9A9E3C5EA57EA7E4C3AA902208B86CD6534F82AF8");
//        String strDecode = DesUtils.strDecode("0014651BF554BAE0264E2CFA3FF8CE9C8B86CD6534F82AF8");
        switch (7) {
            case 7:{
                String content = "slkdfjalsdkjlfjlskdjf1998sduewiuqwjekqwe";
                Pattern compile = Pattern.compile("\\d\\d");
                Matcher matcher = compile.matcher(content);
                while (matcher.find()){
                    System.out.println(matcher.group());
                }

                break;
            }
            case 6: {
                List<String> codeList = new ArrayList<>();
                for (int n = 0; n < 1000; n++) {
                    codeList.add("name" + n);
                }
                log("zzy---" + codeList.get(codeList.size() - 1));

                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < codeList.size(); i++) {
                    String item = codeList.get(i);
                    if (i % 1000 == 0) {
                        if (sb.length() != 0) {
                            log("写入数据：" + sb.toString());
                            sb.setLength(0);
                            sb.append(item);
                        } else {
                            sb.append(item);
                        }
                    } else {
                        sb.append("脑袋");
                        sb.append(item);
                    }
                }
                log("写入数据：" + sb.toString());

                break;
            }
            case 5: {
                SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                Date date = new Date();
                try {
//                    date = timeFormat.parse("2018-02-05 07:00:00");
                    Date date1 = timeFormat.parse("2018-02-05 06:30:00");
                    log(date.getTime() + "-----" + date1.getTime());
                    log(date.compareTo(date1) + "");
                } catch (ParseException e) {
                    e.printStackTrace();
                }


                break;
            }
            case 4: {


                SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                try {
//                    Date date = new Date();
                    Date date = timeFormat.parse("2018-02-05 06:00:00");

                    Date date1 = timeFormat.parse("2018-02-05 05:59:00");

                    log(date.getTime() + "-----" + date1.getTime());
                    log(date.after(date1) + "");
                } catch (ParseException e) {
                    e.printStackTrace();
                }


                break;
            }
            case 3: {
                List<String> data = new ArrayList<>();
                data.add("zhou");
                data.add("li");
                data.add("fan");
                data.add("zhao");


                log(data.indexOf("zhao") + "");
                break;
            }
            case 0: {
                Date date = new Date();
                date.setTime(Long.decode("1517230088349"));
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println(format.format(date));
                break;
            }
            case 1: {
                try {

                    File file = new File("/Users/zzy/Desktop/baowen.txt");

                    StringBuffer sb = new StringBuffer();
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String s = null;
                    while ((s = br.readLine()) != null) {
                        sb.append(s);
                    }
                    br.close();

                    String result = sb.toString();
//                    result = result.replace("↵", "");
                    result = result.replace("\\", "");

                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    bw.write(result, 0, result.length());
                    bw.flush();
                    bw.close();

                    System.out.println(file.getAbsolutePath());
                    System.out.println(result);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                break;
            }

            case 2: {
//                String ss = "{\"d\":{\"__type\":\"TrainWebNew.Class.Model.ServerResult\",\"ErrInfo\":null,\"sverTime\":null,\"Result\":true,\"State\":0,\"isSuccess\":true,\"Message\":\"\",\"Data\":\"{\\r\\n  \\\"BillNumber\\\": null,\\r\\n  \\\"BusinessData\\\": {\\r\\n    \\\"教练信息\\\": {\\r\\n      \\\"Data\\\": [\\r\\n        {\\r\\n          \\\"ROWID\\\": 1,\\r\\n          \\\"教练__编号\\\": \\\"ygd201609020015\\\",\\r\\n          \\\"教练__照片\\\": null,\\r\\n          \\\"教练__姓名\\\": \\\"时文锋\\\",\\r\\n          \\\"教练__满度\\\": \\\"100%\\\",\\r\\n          \\\"TB_班次__名称\\\": \\\"新班次\\\",\\r\\n          \\\"TB_班次__编号\\\": \\\"tpb201609020007_6\\\",\\r\\n          \\\"教练__准驾车型__名称\\\": \\\"C1\\\",\\r\\n          \\\"科目__培训阶段\\\": \\\"科二\\\",\\r\\n          \\\"科目__编号\\\": 2,\\r\\n          \\\"教练__场地\\\": null,\\r\\n          \\\"教练__手机\\\": \\\"17864062858\\\",\\r\\n          \\\"教练__车辆信息__车牌号\\\": \\\"\\\",\\r\\n          \\\"教练__评分次数\\\": 0,\\r\\n          \\\"教练__自我介绍\\\": \\\"\\\"\\r\\n        }\\r\\n      ],\\r\\n      \\\"RowCount\\\": 1,\\r\\n      \\\"BID\\\": null,\\r\\n      \\\"IntroductFieldName\\\": \\\"\\\",\\r\\n      \\\"IntroductTableName\\\": \\\"\\\",\\r\\n      \\\"KeyField\\\": \\\"\\\",\\r\\n      \\\"Name\\\": \\\"教练信息\\\",\\r\\n      \\\"Page\\\": {\\r\\n        \\\"Creat\\\": false,\\r\\n        \\\"isPage\\\": false,\\r\\n        \\\"PageCount\\\": 20,\\r\\n        \\\"PageCurrent\\\": 1,\\r\\n        \\\"PageTotal\\\": 0,\\r\\n        \\\"SystemWhereItem\\\": [],\\r\\n        \\\"Total\\\": 0,\\r\\n        \\\"WhereItem\\\": []\\r\\n      },\\r\\n      \\\"PrimaryKeyFields\\\": [],\\r\\n      \\\"UIIndex\\\": null\\r\\n    }\\r\\n  },\\r\\n  \\\"common\\\": null,\\r\\n  \\\"CreatID\\\": null,\\r\\n  \\\"Name\\\": null,\\r\\n  \\\"PluginData\\\": null,\\r\\n  \\\"state\\\": 0,\\r\\n  \\\"summary\\\": null,\\r\\n  \\\"Type\\\": 0,\\r\\n  \\\"uiIndex\\\": null\\r\\n}\"}}";
                String ss = "{\"d\":{\"__type\":\"TrainWebNew.Class.Model.ServerResult\",\"ErrInfo\":null,\"sverTime\":null,\"Result\":true,\"State\":0,\"isSuccess\":true,\"Message\":\"\",\"Data\":\"{  \\\"BillNumber\\\": null,  \\\"BusinessData\\\": {    \\\"教练信息\\\": {      \\\"Data\\\": [        {          \\\"ROWID\\\": 1,          \\\"教练__编号\\\": \\\"ygd201609020015\\\",          \\\"教练__照片\\\": null,          \\\"教练__姓名\\\": \\\"时文锋\\\",          \\\"教练__满度\\\": \\\"100%\\\",          \\\"TB_班次__名称\\\": \\\"新班次\\\",          \\\"TB_班次__编号\\\": \\\"tpb201609020007_6\\\",          \\\"教练__准驾车型__名称\\\": \\\"C1\\\",          \\\"科目__培训阶段\\\": \\\"科二\\\",          \\\"科目__编号\\\": 2,          \\\"教练__场地\\\": null,          \\\"教练__手机\\\": \\\"17864062858\\\",          \\\"教练__车辆信息__车牌号\\\": \\\"\\\",          \\\"教练__评分次数\\\": 0,          \\\"教练__自我介绍\\\": \\\"\\\"        }      ],      \\\"RowCount\\\": 1,      \\\"BID\\\": null,      \\\"IntroductFieldName\\\": \\\"\\\",      \\\"IntroductTableName\\\": \\\"\\\",      \\\"KeyField\\\": \\\"\\\",      \\\"Name\\\": \\\"教练信息\\\",      \\\"Page\\\": {        \\\"Creat\\\": false,        \\\"isPage\\\": false,        \\\"PageCount\\\": 20,        \\\"PageCurrent\\\": 1,        \\\"PageTotal\\\": 0,        \\\"SystemWhereItem\\\": [],        \\\"Total\\\": 0,        \\\"WhereItem\\\": []      },      \\\"PrimaryKeyFields\\\": [],      \\\"UIIndex\\\": null    }  },  \\\"common\\\": null,  \\\"CreatID\\\": null,  \\\"Name\\\": null,  \\\"PluginData\\\": null,  \\\"state\\\": 0,  \\\"summary\\\": null,  \\\"Type\\\": 0,  \\\"uiIndex\\\": null}\"}}";
                ss = ss.replace("\\", "");

                System.out.println(ss);
                break;
            }
        }


    }

    public static void log(String str) {
        System.out.println(str);

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
