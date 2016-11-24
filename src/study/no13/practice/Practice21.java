package study.no13.practice;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * 使用scanner.next(pattern)方法
 * Practice21.java
 * @author sunny
 * 2016年11月24日上午8:03:07
 */
public class Practice21 {
	static  String threatData = 
			"58.27.82.161@02/10/2015\n"
			+ "204.45.234.40@02/11/2015\n"
			+ "58.27.82.161@02/11/2015\n"
			+ "58.26.82.161@02/12/2015\n"
			+ "[next log section with different data format]";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(threatData);
		String regex = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})";
		while(scan.hasNext(regex)){//hasNext(pattern) next(pattern), match() 方法使用
			scan.next(regex);
			MatchResult match = scan.match();
			String ip = match.group(1);
			String date =match.group(2);
			System.out.format("Threat on %s from %s\n",date,ip);
		}
	}

}
