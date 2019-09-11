package com.wuyafan.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuyafan.utils.StringUtils;



@Controller
public class WebController {

	@RequestMapping("toAdd.do")
	public String toAdd() {		
		return "add";
		
	}
	
	
	@RequestMapping("add.do")
	@ResponseBody
	public int add(String str) {
		if(StringUtils.isBlank(str)) {
            String replaceStr = StringUtils.replaceStr(str);
            System.out.println(replaceStr);
            return 1;
		}else {
			return 0;
		}
	}
	
	public static int getAge (Date src) {
		int date = src.getYear()
				return date;
		}

//		方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
		//示例:
		public static Date getDateByMonthInit (Date src) {
			Date month = src.getMonth();
			return  month;
		//TODO
		}

	//	方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
		//示例:
		public static Date getDateByMonthLast(Date src) {
			int timezoneOffset = src.getTimezoneOffset();
			
			return src;
		}


	//方法4：求未来日期离今天还剩的天数
	//示例:
	public static int getDaysByFuture (Date future) {
		int day = future.getDay();
		Date date=new Date(s);
		Date now=day-s;
		return day;
	}

	//方法5：求过去日期离今天过去的天数
	//示例:
	public static int getDaysByDeparted (Date departed) {
        int day = departed.getDay();
		Date date=new Date(s);
		Date now=day-s;
		return day;
	}


	
}
