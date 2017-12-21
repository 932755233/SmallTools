package com.zzy.pht;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    // 全局数组
    private final static String[] strDigits = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public MD5() {
    }

    // 返回形式为数字跟字符串
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        // System.out.println("iRet="+iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    // 返回形式只为数字
    private static String byteToNum(byte bByte) {
        int iRet = bByte;
        System.out.println("iRet1=" + iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        return String.valueOf(iRet);
    }

    // 转换字节数组为16进制字串
    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    private static String GetMD5Code(String strObj) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            // md.digest() 该函数返回值为存放哈希值结果的byte数组
            resultString = byteToString(md.digest(strObj.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }

    public static String getStanderdMd5(String str){
        if (str==null||str.length()==0){
            return str;
        }
        return GetMD5Code(str);
    }


    /**
     * 如果密码大于24位会数组越界
     * @param pwd
     * @return
     */
    public static String getMyMd5(String pwd) {
        String totleStr = "WUJIANDONG20150101PHTFDATA";

        pwd = pwd.replace("0", "~").replace("1", "$").replace("2", "!").replace(
                "3", "@").replace("4", ":").replace("5", "]").replace("6", "[")
                .replace("7", "{").replace("8", "}").replace("9", "`");
        totleStr = totleStr.substring(0, totleStr.length() - pwd.length());
        pwd = totleStr + pwd;
        MD5 getMD5 = new MD5();
        return getMD5.GetMD5Code(pwd);
    }

    /**
     * 如果密码大于24位会数组越界
     * @param pwd
     * @return
     */
    public static String getMd5WithUpperCase(String pwd) {
        String totleStr = "WUJIANDONG20150101PHTFDATA";
        pwd = pwd.toUpperCase();
        pwd = pwd.replace("0", "~").replace("1", "$").replace("2", "!").replace(
                "3", "@").replace("4", ":").replace("5", "]").replace("6", "[")
                .replace("7", "{").replace("8", "}").replace("9", "`");
        totleStr = totleStr.substring(0, totleStr.length() - pwd.length());
        pwd = totleStr + pwd;
        MD5 getMD5 = new MD5();
        return getMD5.GetMD5Code(pwd);
    }
}