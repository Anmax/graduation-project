package com.hsoft.winInfoMonitor.run;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.hsoft.winInfoMonitor.monitoring.Sbcj;

/**
 * 扫描程序启动器
 * @author 孟令伟
 *
 */
public class Running {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date())+"   扫描程序启动");
		System.out.println("-------------------");
		Sbcj sbcj = new Sbcj();
		int i = 1;
		while(true){			
			try {
				System.out.println(df.format(new Date())+"   程序开始执行第 "+i+"次扫描...");
				i++;			
				if(i < 50){
					sbcj.Czxt();
					sbcj.CPU_nc();
					sbcj.Cpio();
					sbcj.Wkll();
					sbcj.Wjcc();
					sbcj.Dlyh();
					sbcj.Yhcz();
					sbcj.Ztzj();							
					System.out.println(df.format(new Date())+"   扫描结束,暂时挂起...");
					System.out.println("-------------------");					
				}
				else{
					sbcj.truncate();
					i = 1;
					System.out.println(df.format(new Date())+"   警告：数据库中数据过多,执行清除操作...");
					System.out.println("-------------------");
				}
				
				//扫描间隔时间(单位毫秒)	
				Thread.sleep(500);				
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
