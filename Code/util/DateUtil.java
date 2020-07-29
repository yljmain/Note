
import java.util.Calendar;
import java.util.Date;

public class DateUtil{

	/**
	* 获取日期所在月的第一天
	*/
	public static Date getMonthStart(Date date) {
        Calendar nowDateCal = Calendar.getInstance();
        nowDateCal.setTime(date);

        //设置为当月第一天
        nowDateCal.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        nowDateCal.set(Calendar.HOUR_OF_DAY, 0);
        //将秒至0
        nowDateCal.set(Calendar.SECOND, 0);
        //将分钟至0
        nowDateCal.set(Calendar.MINUTE, 0);
        return nowDateCal.getTime();
    }

	/**
	* 获取日期所在月的最后一天
	*/
	public static Date getMonthEnd(Date date){
        Calendar nowDateCal = Calendar.getInstance();
        nowDateCal.setTime(date);

        //设置为当月最后一天
        nowDateCal.set(Calendar.DAY_OF_MONTH, nowDateCal.getActualMaximum(Calendar.DAY_OF_MONTH));
        //将小时至23
        nowDateCal.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        nowDateCal.set(Calendar.MINUTE, 59);
        //将秒至59
        nowDateCal.set(Calendar.SECOND,59);

        // 获取本月最后一天的时间
        return nowDateCal.getTime();
    }

}