package com.hsoft.winInfoMonitor.run;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.hsoft.winInfoMonitor.monitoring.Sbcj;

/**
 * ɨ�����������
 * @author ����ΰ
 *
 */
public class Running {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(new Date())+"   ɨ���������");
		System.out.println("-------------------");
		Sbcj sbcj = new Sbcj();
		int i = 1;
		while(true){			
			try {
				System.out.println(df.format(new Date())+"   ����ʼִ�е� "+i+"��ɨ��...");
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
					System.out.println(df.format(new Date())+"   ɨ�����,��ʱ����...");
					System.out.println("-------------------");					
				}
				else{
					sbcj.truncate();
					i = 1;
					System.out.println(df.format(new Date())+"   ���棺���ݿ������ݹ���,ִ���������...");
					System.out.println("-------------------");
				}
				
				//ɨ����ʱ��(��λ����)	
				Thread.sleep(500);				
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
