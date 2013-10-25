package com.hsoft.winInfoMonitor.monitoring;

/**
 * 需要的支持类
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Properties;
import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.NetInterfaceStat;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import com.hsoft.winInfoMonitor.dao.Sbcj_DAO;
import com.hsoft.winInfoMonitor.vo.sbcj_cpio;
import com.hsoft.winInfoMonitor.vo.sbcj_cpu_nc;
import com.hsoft.winInfoMonitor.vo.sbcj_czxt;
import com.hsoft.winInfoMonitor.vo.sbcj_dlyh;
import com.hsoft.winInfoMonitor.vo.sbcj_wjcc;
import com.hsoft.winInfoMonitor.vo.sbcj_wkll;
import com.hsoft.winInfoMonitor.vo.sbcj_yhcz;
import com.hsoft.winInfoMonitor.vo.sbcj_ztzj;

/**
 *  采集信息类
 * @author 孟令伟
 *
 */

/**
 * 具体方法及解释
 */
public class Sbcj {	
	public Sbcj(){
		
	}
	Sbcj_DAO dao = new Sbcj_DAO();
	//操作系统
	public void Czxt(){
		sbcj_czxt czxtVO = new sbcj_czxt();         
		//获取主机名称
		Map<String, String> map = System.getenv();
		String Zjmc = map.get("COMPUTERNAME");      
		//获取操作系统版本		
		Properties props = System.getProperties();  
		String Czxtbb = props.getProperty("os.name");
		//操作系统内核		
		String Czxtnh = props.getProperty("os.arch");	
		czxtVO.setZjmc(Zjmc);
		czxtVO.setCzxtbb(Czxtbb);
		czxtVO.setCzxtnh(Czxtnh);		
		dao.addSbcj_czxt(czxtVO);
	}
	
	//文件存储
	public void Wjcc() throws SigarException{	
		Sigar sigar = new Sigar();
		FileSystem fslist[] = sigar.getFileSystemList();
		for(int i=0;i<fslist.length;i++){
			sbcj_wjcc wjccVO = new sbcj_wjcc();
			FileSystem fs = fslist[i];
			//获取盘符类型
			String Lb = fs.getSysTypeName();
			//文件存储目录
			String Wjccml = fs.getDirName();
			//文件大小
			long Wjdx = 0;
			if(!(fs.getSysTypeName()).equals("cdrom")){			
				FileSystemUsage usage = null;
				usage = sigar.getFileSystemUsage(fs.getDirName());
				switch (fs.getType()) {
				case 0: // TYPE_UNKNOWN ：未知
					break;
				case 1: // TYPE_NONE
					break;
				case 2: 
					Wjdx = usage.getTotal()/1024;
				}
			}
			wjccVO.setLb(Lb);
			wjccVO.setWjccml(Wjccml);
			wjccVO.setWjdx(Wjdx);
			
			dao.addSbcj_wjcc(wjccVO);
		}
	}
	
	//CPU内存
	public void CPU_nc() throws SigarException{
		sbcj_cpu_nc cpu_ncVO= new sbcj_cpu_nc(); 
		Sigar sigar = new Sigar();
		CpuInfo infos[] = sigar.getCpuInfoList();
		//获取CPU个数
		int Gs = infos.length;
		//获取CPU主频
		long zp = 0;
		for (int i = 0; i < infos.length; i++) {
			CpuInfo info = infos[i];
			zp += info.getMhz();		
		}
		Mem mem = sigar.getMem();
		long Zl = mem.getTotal() / 1024L/1024;
		long Sysl = mem.getUsed() / 1024L/1024;
		long Ncsy = mem.getFree() / 1024L/1024;
		float Nc_Syl = Sysl/Zl;
		
		cpu_ncVO.setGs(Gs);
		cpu_ncVO.setZp(zp+"");
		cpu_ncVO.setZl(Zl);
		cpu_ncVO.setSysl(Sysl);
		cpu_ncVO.setNcsy(Ncsy);
		cpu_ncVO.setNc_Syl(Nc_Syl);
		
		dao.addSbcj_cpu_nc(cpu_ncVO);		
	}

	       
	//磁盘I/O
	public void Cpio() throws SigarException{		 
		Sigar sigar = new Sigar();
		FileSystem fslist[] = sigar.getFileSystemList();
		for(int i=0;i<fslist.length;i++){
			sbcj_cpio cpioVO = new sbcj_cpio();
			FileSystem fs = fslist[i];			
			if(!(fs.getSysTypeName()).equals("cdrom")){
				//获取磁盘名称
				String Cpmc = fs.getDevName();
				FileSystemUsage usage = null;
				usage = sigar.getFileSystemUsage(fs.getDirName());
				//获取单位时间读次数
				float Dcs = usage.getDiskReads();
				//获取单位时间写次数
				float Xcs = usage.getDiskWrites();
				
				cpioVO.setCpmc(Cpmc);
				cpioVO.setDcs(Dcs);
				cpioVO.setXcs(Xcs);
				
				dao.addSbcj_cpio(cpioVO);
			}		
		}	
	}
	
	//网卡流量
	public void Wkll() throws SigarException{
		sbcj_wkll wkllVO = new sbcj_wkll();
		Sigar sigar = new Sigar();
		String ifNames[] = sigar.getNetInterfaceList();
		for(int i = 0;i<ifNames.length;i++){
			//获取网卡名称
			String name = ifNames[i];
			NetInterfaceConfig ifconfig = sigar.getNetInterfaceConfig(name);
			//获取IP地址
			String IP = ifconfig.getAddress();			
			NetInterfaceStat ifstat = sigar.getNetInterfaceStat(name);
			//获取单位时间流入量
			long Lrl = ifstat.getRxBytes();
			//获取单位时间输入丢包数
			long Srdbs = ifstat.getRxDropped();
			//获取单位时间输入错包数；
			long Srcbs = ifstat.getRxErrors();
			//获取单位时间流出量
			long Lcl = ifstat.getTxBytes();
			//获取单位时间输出丢包数
			long Scdbs = ifstat.getTxDropped();
			//获取单位时间输出错包数
			long Sccbs = ifstat.getTxErrors();
			
			wkllVO.setWkmc(name);
			wkllVO.setIP(IP);
			wkllVO.setLrl(Lrl);
			wkllVO.setSrdbs(Srdbs);
			wkllVO.setSrcbs(Srcbs);
			wkllVO.setLcl(Lcl);
			wkllVO.setScdbs(Scdbs);
			wkllVO.setSccbs(Sccbs);
			
			dao.addSbcj_wkll(wkllVO);
		}
	}
	
	//登录用户
	public void Dlyh() throws UnknownHostException{
		sbcj_dlyh dlyhVO = new sbcj_dlyh();         //登录用户
		Map<String, String> map = System.getenv();
		String Yhm = map.get("USERNAME");           // 获取用户名
		InetAddress addr;
		addr = InetAddress.getLocalHost();
		String IP = addr.getHostAddress();          //获取IP
		 
		dlyhVO.setYhm(Yhm);
		dlyhVO.setIP(IP);
		
		dao.addSbcj_dlyh(dlyhVO);
	}
	
	//用户操作
	public void Yhcz() throws UnknownHostException{
		sbcj_yhcz yhczVO = new sbcj_yhcz();         //登录用户
		Map<String, String> map = System.getenv();
		String Yhm = map.get("USERNAME");           // 获取用户名
		InetAddress addr;
		addr = InetAddress.getLocalHost();
		String IP = addr.getHostAddress();          //获取IP
		 
		yhczVO.setYhm(Yhm);
		yhczVO.setIP(IP);
		
		dao.addSbcj_yhcz(yhczVO);
	}
	
	//状态总结
	public void Ztzj() throws Exception{
		sbcj_ztzj ztzjVO = new sbcj_ztzj();
		//01.获取主机名称
		Map<String, String> map = System.getenv();
		String Zjmc = map.get("COMPUTERNAME");      
		//02.获取操作系统版本		
		Properties props = System.getProperties();  
		String Czxtbb = props.getProperty("os.name");
		//03.操作系统内核		
		String Czxtnh = props.getProperty("os.arch");
		Sigar sigar = new Sigar();
		CpuInfo infos[] = sigar.getCpuInfoList();
		//04.获取CPU个数
		int Gs = infos.length;
		//05.获取CPU主频
		long Zp = 0;
		for (int i = 0; i < infos.length; i++) {
			CpuInfo info = infos[i];
			Zp += info.getMhz();		
		}
		//06.CPU使用率
		//07.内存总量
		Mem mem = sigar.getMem();
		long Zl = mem.getTotal() / 1024L/1024;
		//08.内存使用数量
		long Sysl = mem.getUsed() / 1024L/1024;
		//09.内存使用率
		float Nc_Syl = Sysl/Zl;
				
		FileSystem fslist[] = sigar.getFileSystemList();
		//10.磁盘总量
		long Cpzl = 0;
		//11.磁盘剩余量
		long Cpsyl= 0;	
		float Cp_Syl01= 0;
		int t = 1;
		for(int i=0;i<fslist.length;i++){
			t++;
			FileSystem fs = fslist[i];
			if(!(fs.getSysTypeName()).equals("cdrom")){			
				FileSystemUsage usage = null;
				usage = sigar.getFileSystemUsage(fs.getDirName());
				switch (fs.getType()) {
				case 0: // TYPE_UNKNOWN ：未知
					break;
				case 1: // TYPE_NONE
					break;
				case 2: 
					Cpzl += usage.getTotal()/1024;
					Cpsyl += usage.getFree()/1024;
					float usePercent = (float) (usage.getUsePercent() * 100D);
					Cp_Syl01 += usePercent;
				}
			}
		}
		//12.磁盘使用率
		float Cp_Syl= Cp_Syl01/t;
		
		String ifNames[] = sigar.getNetInterfaceList();
		//13.单位时间流入量
		long Lrl = 0;
		//14.单位时间流出量
		long Lcl = 0;
		for(int i = 0;i<ifNames.length;i++){
			String name = ifNames[i];
			NetInterfaceStat ifstat = sigar.getNetInterfaceStat(name);
			Lrl += ifstat.getRxBytes();
			Lcl += ifstat.getTxBytes();
		}
		
		//15.最后登陆用户
		String Zhdlyh = map.get("USERNAME"); 
		
		ztzjVO.setZjmc(Zjmc);
		ztzjVO.setCzxtbb(Czxtbb);
		ztzjVO.setCzxtnh(Czxtnh);
		ztzjVO.setGs(Gs);
		ztzjVO.setZp(Zp+"");
		ztzjVO.setCpu_Syl(49);
		ztzjVO.setZl(Zl);
		ztzjVO.setSysl(Sysl);
		ztzjVO.setNc_Syl(Nc_Syl);
		ztzjVO.setCpzl(Cpzl);
		ztzjVO.setCpsyl(Cpsyl);
		ztzjVO.setCp_Syl(Cp_Syl);
		ztzjVO.setLrl(Lrl);
		ztzjVO.setLcl(Lcl);
		ztzjVO.setZhdlyh(Zhdlyh);
		
		dao.addSbcj_ztzj(ztzjVO);		
	}
	
	//清空表操作
	public void truncate(){
		dao.truncate();
	}
		
}
