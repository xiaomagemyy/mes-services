package com.unilever.hefei.mes.common.util;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**  
 * @Description: [字符串工具类]
 * @Author:      [ade]
 * @Version:     [v1.0.0]
 */ 
public class StringHelper {
	
	/**
	 * 对象数据拷贝（对象属性相同，即可传值，注意属性类型不同，有可能出错）
	 * @Author: gsh
	 * @param a 有值对象
	 * @param b 被赋值对象
	 * @return 转换后下划线大写方式命名的字符串
	 */
	public static void objectCopy(Object objA,Object objB) {
		BeanUtils.copyProperties(objA, objB);
	}

	public static String getStringByObject(Object s) {
		if (s == null) {
			return "";
		} else {
			return s.toString();
		}
	}
	public static String getStringByString(String s) {
		if (s == null) {
			return "";
		} else {
			return s.toString();
		}
	}
	
	/**
	 * 将驼峰式命名的字符串转换为下划线大写方式。如果转换前的驼峰式命名的字符串为空，则返回空字符串。
	 * 例如：HelloWorld->HELLO_WORLD
	 * @param name 转换前的驼峰式命名的字符串
	 * @return 转换后下划线大写方式命名的字符串
	 */
	public static String camelToUnderline(String name) {
	    StringBuilder result = new StringBuilder();
	    if (name != null && name.length() > 0) {
	        // 将第一个字符处理成大写
	        result.append(name.substring(0, 1).toUpperCase());
	        // 循环处理其余字符
	        for (int i = 1; i < name.length(); i++) {
	            String s = name.substring(i, i + 1);
	            // 在大写字母前添加下划线
	            if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {
	                result.append("_");
	            }
	            // 其他字符直接转成大写
	            result.append(s.toUpperCase());
	        }
	    }
	    return result.toString();
	}
	 
	/**
	 * 将下划线大写方式命名的字符串转换为驼峰式。如果转换前的下划线大写方式命名的字符串为空，则返回空字符串。
	 * 例如：HELLO_WORLD->HelloWorld
	 * @param name 转换前的下划线大写方式命名的字符串
	 * @return 转换后的驼峰式命名的字符串
	 */
	public static String underlineToCamel(String name) {
	    StringBuilder result = new StringBuilder();
	    // 快速检查
	    if (name == null || name.isEmpty()) {
	        // 没必要转换
	        return "";
	    } else if (!name.contains("_")) {
	        // 不含下划线，仅将首字母小写
	        return name.substring(0, 1).toLowerCase() + name.substring(1);
	    }
	    // 用下划线将原始字符串分割
	    String camels[] = name.split("_");
	    for (String camel :  camels) {
	        // 跳过原始字符串中开头、结尾的下换线或双重下划线
	        if (camel.isEmpty()) {
	            continue;
	        }
	        // 处理真正的驼峰片段
	        if (result.length() == 0) {
	            // 第一个驼峰片段，全部字母都小写
	            result.append(camel.toLowerCase());
	        } else {
	            // 其他的驼峰片段，首字母大写
	            result.append(camel.substring(0, 1).toUpperCase());
	            result.append(camel.substring(1).toLowerCase());
	        }
	    }
	    return result.toString();
	}
	
	/**
	 * Java中编码函数，对应js中 str = unescape(str);进行解码
	 * @param src
	 * @return
	 */
	public static String escape(String src)
	{
		int i;
		char j;
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length() * 6);
		for (i = 0; i < src.length(); i ++)
		{
			j = src.charAt(i);
			if(Character.isDigit(j) || Character.isLowerCase(j) || Character.isUpperCase(j))
				tmp.append(j);
			else
				if(j < 256)
				{
					tmp.append("%");
					if(j < 16)
						tmp.append("0");
					tmp.append(Integer.toString(j, 16));
				} 
				else
				{
					tmp.append("%u");
					tmp.append(Integer.toString(j, 16));
				}
		}
		return tmp.toString();
	}
	
	/**
	 * 获取字符串中的数字
	 * @param str
	 * @return
	 */
	public static String getNumber(String str){
		str=str.trim();
		String obj = "";
		if(!StringUtils.isBlank(str)){
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>=48 && str.charAt(i)<=57){
					obj += str.charAt(i);
				}
			}
		}
		return obj;
	}
	
	/**
	 * 获取字符串中的数字
	 * @param int
	 * @return
	 */
	public static Integer getIntNumber(String str){
		str=str.trim();
		String obj = "";
		if(!StringUtils.isBlank(str)){
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>=48 && str.charAt(i)<=57){
					obj += str.charAt(i);
				}
			}
		}
		return Integer.parseInt(obj);
	}
	/**
	 * 获取字符串中最左边部分的数字
	 * @param str
	 * @return
	 */
	public static Integer getFrontIntNumber(String str){
		str=str.trim();
		String obj = "";
		if(!StringUtils.isBlank(str)){
			boolean flag=false;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>=48 && str.charAt(i)<=57){
					obj += str.charAt(i);
					flag=true;
				}
				if(flag){
					if(str.charAt(i)<48 || str.charAt(i)>57){
						break;
					}
				}
			}
		}
		return Integer.parseInt(obj);
	}
	/**
	 * 获取字符串中的中文部分
	 * @param str
	 * @return
	 */
	public static String getChinaWord(String str){
		str=str.trim();
		String obj = "";
		if(!StringUtils.isBlank(str)){
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>=0x4e00 && str.charAt(i)<=0x9fbb){
					obj += str.charAt(i);
				}
			}
		}
		return obj;
	}
	
	/**
	 * 获取字符串中的数字
	 * @param int
	 * @return
	 */
	public static Integer getIntByObject0(Object str) {
		if (str == null) {
			return 0;
		}
		String str2 = str.toString().trim();
		try {
			if (str2.indexOf(".") >= 0) {
				str2 = str2.split("\\.")[0];
			}
			return Integer.parseInt(str2);
		} catch (Exception ex) {
			return 0;
		}
	}
	
	public static Double formatDouble(Double d, Integer nu) {

		BigDecimal b = new BigDecimal(d);
		return b.setScale(nu, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static Double getDoubleByObject(Object ds, Integer nu) {
		Double d = getDoubleByObject(ds);
		BigDecimal b = new BigDecimal(d);
		return b.setScale(nu, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 获取字符串中的数字
	 * 
	 * @param int
	 * @return
	 */
	public static Double getDoubleByObject(Object str) {
		if (str == null) {
			return Double.parseDouble("0");
		}
		String str2 = str.toString().trim();
		try {
			return Double.parseDouble(str2);
		} catch (Exception ex) {
			return Double.parseDouble("0");
		}
	}

	/**
	 * 去除字符串中的数字
	 * 
	 * @param str
	 * @return
	 */
	public static String removeNumber(String str){
		return str.replaceAll("[\\d.]+","");
	}
	
	/**
	 * 去除字符串中的字母
	 * @param str
	 * @return
	 */
	public static String removeLetter(String str){
		return str.replaceAll("[a-zA-Z]","");
	}
	
	/**
	 * 验证是否由全是数字组成
	 * @param str
	 * @return
	 */
	public static Boolean vaildNumber(String str){
		Pattern pattern = Pattern.compile("[0-9]*");  
	    return pattern.matcher(str).matches(); 
	}
	
	/**
	 * 10进制转换16位2进制数
	 * @param str
	 * @return
	 */
	public static String binaryConver(Integer num){
		String numStr = Integer.toBinaryString(num);
		Integer numLen = numStr.length();
		numLen = 16-numLen;
		String flag = "0";
		for(int i = 0;i<numLen-1;i++){
			flag = flag + "0";
		}
		numStr = flag + numStr;
		return numStr;
	}
	
	public static void main(String[] args) {
		System.err.println(StringHelper.reverse(binaryConver(256)));
	}
	
	/**
	 * 修改顺序
	 */
	public static String reverse(String str){
		StringBuffer stringBuffer = new StringBuffer(str);  
        stringBuffer.reverse();  
		return stringBuffer.toString();
	}
	
	/**
	 * 所有16位2进制数组合字符串判断具体报警点项
	 */
	public static String getTagNum(String allStr){
		String returnStr = "";
		int num = allStr.length();
		for(int i = 0;i<num-1;i++){
			String str = String.valueOf(allStr.charAt(i));
			if(str.equals("1")){
				returnStr = returnStr + " " + (i + 1);
			}
		}
		return returnStr;
	}
	
	/**
	 * 去重
	 * @param List<String>
	 * @return
	 */
	public static List<String> getDuplicateRemoval(List<String> list){
		HashSet<String> h = new HashSet<String>(list);
		List<String> resultList=new ArrayList<String>();
		resultList.addAll(h);   
		return resultList;  
	}
	
	public static String toString(Object o) {
		if (o == null || o.toString().trim().equals("")) {
			return "";
		} else {
			return o.toString();
		}
	}
	
	public static long nullToLongZero(Object o) {
		if (o == null || o.toString().trim().equals("")) {
			return 0;
		} else {
			return Long.parseLong(o.toString());
		}
	}

	public static int nullToIntegerZero(Object o) {
		if (o == null || o.toString().trim().equals("")) {
			return 0;
		} else {
			return Integer.parseInt(o.toString());
		}
	}

	public static float nullToFloatZero(Object o) {
		if (o == null || o.toString().trim().equals("")) {
			return 0.0f;
		} else {
			return Float.parseFloat(o.toString());
		}
	}

	public static double nullToDoubleZero(Object o) {
		if (o == null || o.toString().trim().equals("")) {
			return 0.00;
		} else {
			return Double.parseDouble(o.toString());
		}
	}

	public static Double toObjectDouble(Object o) {
		return Double.valueOf(nullToDoubleZero(o) + "");
	}

	public static String formatNumber(String s, String style) {
		double d = nullToDoubleZero(s);
		DecimalFormat nf = new DecimalFormat(style);
		return nf.format(d);
	}

	public static String formatNum(String s, char c, int len) {
		String temp = "";
		for (int i = 0; i < len; i++) {
			temp = temp + c;
		}
		temp = temp + s;
		return temp.substring(temp.length() - len);
	}

	public static String formDataEncode(String s) {
		try {
			return java.net.URLEncoder.encode(s, "UTF-8");
		} catch (Exception e) {
			return s;
		}
	}

	public static BigDecimal stringToDecimal(String s) {
		if ((s != null) && (s != "")) {
			return new BigDecimal(s);
		} else {
			return new BigDecimal(0);
		}
	}

	public static boolean toBoolean(Object o) {
		if (o == null) {
			return false;
		}
		String s = o.toString().toLowerCase();
		if (s.equals("yes") || s.equals("true") || s.equals("1")
				|| s.equals("y") || s.equals("t") || s.equals("on")) {
			return true;
		} else {
			return false;
		}
	}

	public static java.sql.Date stringToDate(String s) {
		return java.sql.Date.valueOf(s);
	}

	public static int stringToInt(String s) {
		if (s.length() > 0) {
			return Integer.parseInt(s);
		} else {
			return 0;
		}
	}

	public static java.sql.Date GetCurrentDate() {
		return new java.sql.Date(System.currentTimeMillis());
	}

	public static String intercept(String reg, int len, String tail) {
		int i = reg.length();
		if (i <= len) {
			return reg;
		} else {
			return reg.substring(0, len) + tail;
		}
	}

	public static Long addLong(Long long1, Long long2) {
		return Long.valueOf(Long.parseLong(long1 + "")
				+ Long.parseLong(long2 + "") + "");
	}

	public static String relaceAll(String oldstring, String regex,
			String replacement) {
		int pos, oldpos;
		StringBuffer sb = new StringBuffer();
		oldpos = 0;
		pos = oldstring.indexOf(regex);
		while (pos > -1) {
			sb.append(oldstring.substring(oldpos, pos));
			oldpos = pos + regex.length();
			pos = oldstring.indexOf(regex, pos + 1);
			sb.append(replacement);
		}
		sb.append(oldstring.substring(oldpos, oldstring.length()));
		return sb.toString();
	}

	public static String[] toStringArray(String str, String delim) {
		if (str == null || str.equals("")) {
			return null;
		}
		ArrayList list = new ArrayList();
		StringTokenizer st = new StringTokenizer(str, delim);
		while (st.hasMoreTokens()) {
			String value = st.nextToken();
			list.add(value);
		}
		String[] array = new String[list.size()];
		list.toArray(array);
		return array;
	}

	public static Long[] toLongArray(String str, String delim) {
		if (str == null || str.equals("")) {
			return null;
		}
		ArrayList list = new ArrayList();
		StringTokenizer st = new StringTokenizer(str, delim);
		while (st.hasMoreTokens()) {
			String value = st.nextToken();
			list.add(Long.valueOf(value));
		}
		Long[] array = new Long[list.size()];
		list.toArray(array);
		return array;
	}

	/**
	 * 获取文件名后缀（不包括点）
	 * @param int
	 * @return
	 */
	public static String getNoSuffix(String fileName) {
		return fileName.substring(fileName.lastIndexOf(".")+1);//得到点后面的后缀，不包括点
	}
	
	/**
	 * 获取文件名后缀
	 * @param int
	 * @return
	 */
	public static String getSuffix(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));//得到点后面的后缀，包括点
	}
	
}
