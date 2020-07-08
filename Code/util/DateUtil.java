
import java.util.Calendar;
import java.util.Date;

public class DateUtil{

	/**
	* 获取日期所在月的最后一天
	*/
	public static Date getMonthEnd(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        //设置为当月最后一天
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        //将小时至23
        c.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        c.set(Calendar.MINUTE, 59);
        //将秒至59
        c.set(Calendar.SECOND,59);

        // 获取本月最后一天的时间
        return c.getTime();
    }

}