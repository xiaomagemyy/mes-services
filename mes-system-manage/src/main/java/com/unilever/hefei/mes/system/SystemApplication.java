package com.unilever.hefei.mes.system;

import com.unilever.hefei.mes.common.util.StringHelper;
import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName SystemApplication
 * @Description TODO
 * @Author XiaoMaGe
 * @Date 2021/4/8 13:25
 * @Version 1.0
 **/
public class SystemApplication {
    public static void main(String[] args) {
        String data = analysisData("0_0_0_0_0_16_0_0_2048");
        System.out.println(data);
    }

    /**
     * 分析报警点原因
     */
    public static String analysisData(String code){
        String allStr = "";
        if(StringUtils.isNotBlank(code)){
            String numStr = "0000000000000000";
            String[] codes = code.split("_");
            for(String deviceAlarmNum:codes){
                numStr = "0000000000000000";
                Integer alarmNum = Integer.parseInt(deviceAlarmNum);
                if(alarmNum !=0){
                    //返回16位2进制数
                    numStr = StringHelper.binaryConver(alarmNum);
                    numStr = StringHelper.reverse(numStr);//倒叙
                    allStr = allStr + numStr;
                }else{
                    allStr = allStr + numStr;
                }
            }
            if(allStr != null){
                allStr = StringHelper.getTagNum(allStr);
            }
        }
        return allStr;
    }
}
