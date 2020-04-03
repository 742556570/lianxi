package lambda;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

import static java.time.temporal.TemporalAdjusters.*;

public class Java8date {
	public  static  void  main(String [] args){
		
	//获取当前日期 年月日时分秒
	 LocalDateTime currentTime = LocalDateTime.now();
     System.out.println("当前时间: " + currentTime);
    //  获取当前日期
     LocalDate date1 = currentTime.toLocalDate();
     System.out.println("date1: " + date1);
     Month month = currentTime.getMonth();
       int    monthNumber= currentTime.getMonthValue(); //  返回的是一个数字
     int day = currentTime.getDayOfMonth();// 返回一个月的第几天
     int seconds = currentTime.getSecond(); // 返回大的是多少秒   
      
     System.out.println("月: " + month +"--"+monthNumber+", 日: " + day +", 秒: " + seconds);

    System.out.println("----------------------------------------------------------------"); 
    System.out.println("----------------------------------------------------------------"); 
     
    LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);  //  可以自己动态的设置时间日期
    System.out.println("date2: " + date2);
      
    System.out.println("----------------------------------------------------------------"); 
    
    System.out.println("----------------------------------------------------------------");  
     LocalDateTime ldt1 = LocalDateTime.of(2017, Month.JANUARY, 4, 17, 23, 52);
    LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 4);
    LocalTime localTime = LocalTime.of(17, 23, 52);
    LocalDateTime ldt2 = localDate.atTime(localTime);
    System.out.println(ldt1.toString()+"\t"+localDate+"\t"+localTime+"\t"+ldt2); 
    
   
    // 12 december 2014   //  of方法就是直接创建自己的时间
    LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
    System.out.println("date3: " + date3);

      
    // 22 小时 15 分钟
    LocalTime date4 = LocalTime.of(22, 15);
    System.out.println("date4: " + date4);
      
    // 解析字符串
    LocalTime date5 = LocalTime.parse("20:15:30");
    System.out.println("date5: " + date5);

    LocalDate localDate1 = LocalDate.now();  // 初始化一个日期：2017-01-04
    int year = localDate1.getYear();                     // 年份：2017
    Month month1 = localDate1.getMonth();                 // 月份：JANUARY
    int number=localDate1.getMonthValue();
    int dayOfMonth = localDate1.getDayOfMonth();         // 月份中的第几天：4
    DayOfWeek dayOfWeek = localDate1.getDayOfWeek();     // 一周的第几天：WEDNESDAY
    int length = localDate1.lengthOfMonth();             // 月份的天数：31
    boolean leapYear = localDate1.isLeapYear();          // 是否为闰年：false
   
    System.out.println(localDate1.toString()+"\t"+year+"\t"+month1+number+"\t"+dayOfMonth+"\t"+dayOfWeek+"\t"+length+"\t"+leapYear); 
    System.out.println("----------------------------------------------------------------"); 
    
    System.out.println("----------------------------------------------------------------");  
    
    LocalDateTime   l =LocalDateTime.of(2018,12, 1, 12, 12,12);
    LocalDateTime   l0=LocalDateTime.now();
    Duration  duration=Duration.between(l, l0);
    long days = duration.toDays();              // 这段时间的总天数
    long hours = duration.toHours();            // 这段时间的小时数
    long minutes = duration.toMinutes();        // 这段时间的分钟数
    long seconds1 = duration.getSeconds();       // 这段时间的秒数
    long milliSeconds = duration.toMillis();    // 这段时间的毫秒数
    long nanoSeconds = duration.toNanos();      // 这段时间的纳秒数
    
    System.out.println(days+"\t"+hours+"\t"+minutes+"\t"+seconds1+"\t"+milliSeconds+"\t"+nanoSeconds); 

    
    //都是时间间隔的操作
    Duration duration1 = Duration.of(5, ChronoUnit.DAYS);       // 5天
    Duration duration2 = Duration.of(1000, ChronoUnit.MILLIS);  // 1000毫秒
    long days1 = duration1.toDays();
    System.out.println(duration1+"\t"+duration2+"\t"+days1);  
    
    LocalDate   p=LocalDate.of(2017, 1, 1);
    LocalDate  p1=LocalDate.now(); 
 
    Period   p4=Period.between(p, p1);
    System.out.println(p4);
    System.out.println("----------------------------------------------------------------"); 
    
    System.out.println("----------------------------------------------------------------");  
    
   
    
    LocalDate date = LocalDate.of(2019, 12, 19);          // 2017-01-05

    LocalDate date11 = date.withYear(2016);              // 修改为 2016-01-05
    LocalDate date21 = date.withMonth(2);                // 修改为 2017-02-05
    LocalDate date31 = date.withDayOfMonth(1);           // 修改为 2017-01-01

    LocalDate date41 = date.plusYears(1);                // 增加一年 2018-01-05
    LocalDate date51 = date.minusMonths(2);              // 减少两个月 2016-11-05
    LocalDate date6 = date.plus(5, ChronoUnit.DAYS);    // 增加5天 2017-01-10

    
    System.out.println(date11);  
    System.out.println(date21);  
    System.out.println(date31);  
    System.out.println(date41);  
    System.out.println(date51);  
    System.out.println(date6); 
    
    System.out.println("----------------------------------------------------------------"); 
    
    System.out.println("----------------------------------------------------------------");  
    
    LocalDate date7 =date.with(nextOrSame(DayOfWeek.SUNDAY)) ;   // 返回下一个距离当前时间最近的星期日
    LocalDate date9 = date.with(lastInMonth(DayOfWeek.SATURDAY));   // 返回本月最后一个星期六
    
    System.out.println(date7+"\t"+date9);
    
    System.out.println("---------------------- 格式化日期日期变成字符串------------------------------------------");  
    
    LocalDateTime dateTime = LocalDateTime.now();
    String strDate1 = dateTime.format(DateTimeFormatter.BASIC_ISO_DATE);    // 20170105
    String strDate2 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);    // 2017-01-05
    String strDate3 = dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME);    // 14:20:16.998
    String strDate4 = dateTime.format(DateTimeFormatter.ofPattern("yyyy年-MM月-dd日"));   // 2017-01-05
    //String strDate5 = dateTime.format(DateTimeFormatter.ofPattern("今天是：YYYY年 MMMM DD日 E", Locale.CHINESE)); // 今天是：2017年 一月 05日 星期四
    
    System.out.println(strDate1+"\t"+strDate2+"\t"+strDate3+"\t"+strDate4+"\t"); 
    
    
    System.out.println("---------------------- 格式化日期字符串变成日期------------------------------------------");  
    String strDate6 = "2017-01-05";
    String strDate7 = "2017-01-05 12:30:05";
    
    LocalDate date111 = LocalDate.parse(strDate6, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    LocalDateTime dateTime1 = LocalDateTime.parse(strDate7, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    System.out.println(date111+"\t"+dateTime1); 
    System.out.println("----------------------------------------------------");
    
    // 日期的算数操作
    LocalDate  ld111=LocalDate.of(2017,10,10);
    LocalDate  ld112=LocalDate.now();
    long  l1=ld112.toEpochDay()-ld111.toEpochDay();   //  计算天数 
    System.out.println(ld112+"----"+ld111+"="+l1+"\t"+ld112.toEpochDay()+"\t"+ld111.toEpochDay());
    
	}    
}
