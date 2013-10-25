package com.hsoft.winInfoMonitor.monitoring;

/**
 * ��Ҫ��֧����
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
 *  �ɼ���Ϣ��
 * @author ����ΰ
 *
 */

/**
 * ���巽��������
 */
public class Sbcj {	
	public Sbcj(){
		
	}
	Sbcj_DAO dao = new Sbcj_DAO();
	//����ϵͳ
	public void Czxt(){
		sbcj_czxt czxtVO = new sbcj_czxt();         
		//��ȡ��������
		Map<String, String> map = System.getenv();
		String Zjmc = map.get("COMPUTERNAME");      
		//��ȡ����ϵͳ�汾		
		Properties props = System.getProperties();  
		String Czxtbb = props.getProperty("os.name");
		//����ϵͳ�ں�		
		String Czxtnh = props.getProperty("os.arch");	
		czxtVO.setZjmc(Zjmc);
		czxtVO.setCzxtbb(Czxtbb);
		czxtVO.setCzxtnh(Czxtnh);		
		dao.addSbcj_czxt(czxtVO);
	}
	
	//�ļ��洢
	public void Wjcc() throws SigarException{	
		Sigar sigar = new Sigar();
		FileSystem fslist[] = sigar.getFileSystemList();
		for(int i=0;i<fslist.length;i++){
			sbcj_wjcc wjccVO = new sbcj_wjcc();
			FileSystem fs = fslist[i];
			//��ȡ�̷�����
			String Lb = fs.getSysTypeName();
			//�ļ��洢Ŀ¼
			String Wjccml = fs.getDirName();
			//�ļ���С
			long Wjdx = 0;
			if(!(fs.getSysTypeName()).equals("cdrom")){			
				FileSystemUsage usage = null;
				usage = sigar.getFileSystemUsage(fs.getDirName());
				switch (fs.getType()) {
				case 0: // TYPE_UNKNOWN ��δ֪
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
	
	//CPU�ڴ�
	public void CPU_nc() throws SigarException{
		sbcj_cpu_nc cpu_ncVO= new sbcj_cpu_nc(); 
		Sigar sigar = new Sigar();
		CpuInfo infos[] = sigar.getCpuInfoList();
		//��ȡCPU����
		int Gs = infos.length;
		//��ȡCPU��Ƶ
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

	       
	//����I/O
	public void Cpio() throws SigarException{		 
		Sigar sigar = new Sigar();
		FileSystem fslist[] = sigar.getFileSystemList();
		for(int i=0;i<fslist.length;i++){
			sbcj_cpio cpioVO = new sbcj_cpio();
			FileSystem fs = fslist[i];			
			if(!(fs.getSysTypeName()).equals("cdrom")){
				//��ȡ��������
				String Cpmc = fs.getDevName();
				FileSystemUsage usage = null;
				usage = sigar.getFileSystemUsage(fs.getDirName());
				//��ȡ��λʱ�������
				float Dcs = usage.getDiskReads();
				//��ȡ��λʱ��д����
				float Xcs = usage.getDiskWrites();
				
				cpioVO.setCpmc(Cpmc);
				cpioVO.setDcs(Dcs);
				cpioVO.setXcs(Xcs);
				
				dao.addSbcj_cpio(cpioVO);
			}		
		}	
	}
	
	//��������
	public void Wkll() throws SigarException{
		sbcj_wkll wkllVO = new sbcj_wkll();
		Sigar sigar = new Sigar();
		String ifNames[] = sigar.getNetInterfaceList();
		for(int i = 0;i<ifNames.length;i++){
			//��ȡ��������
			String name = ifNames[i];
			NetInterfaceConfig ifconfig = sigar.getNetInterfaceConfig(name);
			//��ȡIP��ַ
			String IP = ifconfig.getAddress();			
			NetInterfaceStat ifstat = sigar.getNetInterfaceStat(name);
			//��ȡ��λʱ��������
			long Lrl = ifstat.getRxBytes();
			//��ȡ��λʱ�����붪����
			long Srdbs = ifstat.getRxDropped();
			//��ȡ��λʱ������������
			long Srcbs = ifstat.getRxErrors();
			//��ȡ��λʱ��������
			long Lcl = ifstat.getTxBytes();
			//��ȡ��λʱ�����������
			long Scdbs = ifstat.getTxDropped();
			//��ȡ��λʱ����������
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
	
	//��¼�û�
	public void Dlyh() throws UnknownHostException{
		sbcj_dlyh dlyhVO = new sbcj_dlyh();         //��¼�û�
		Map<String, String> map = System.getenv();
		String Yhm = map.get("USERNAME");           // ��ȡ�û���
		InetAddress addr;
		addr = InetAddress.getLocalHost();
		String IP = addr.getHostAddress();          //��ȡIP
		 
		dlyhVO.setYhm(Yhm);
		dlyhVO.setIP(IP);
		
		dao.addSbcj_dlyh(dlyhVO);
	}
	
	//�û�����
	public void Yhcz() throws UnknownHostException{
		sbcj_yhcz yhczVO = new sbcj_yhcz();         //��¼�û�
		Map<String, String> map = System.getenv();
		String Yhm = map.get("USERNAME");           // ��ȡ�û���
		InetAddress addr;
		addr = InetAddress.getLocalHost();
		String IP = addr.getHostAddress();          //��ȡIP
		 
		yhczVO.setYhm(Yhm);
		yhczVO.setIP(IP);
		
		dao.addSbcj_yhcz(yhczVO);
	}
	
	//״̬�ܽ�
	public void Ztzj() throws Exception{
		sbcj_ztzj ztzjVO = new sbcj_ztzj();
		//01.��ȡ��������
		Map<String, String> map = System.getenv();
		String Zjmc = map.get("COMPUTERNAME");      
		//02.��ȡ����ϵͳ�汾		
		Properties props = System.getProperties();  
		String Czxtbb = props.getProperty("os.name");
		//03.����ϵͳ�ں�		
		String Czxtnh = props.getProperty("os.arch");
		Sigar sigar = new Sigar();
		CpuInfo infos[] = sigar.getCpuInfoList();
		//04.��ȡCPU����
		int Gs = infos.length;
		//05.��ȡCPU��Ƶ
		long Zp = 0;
		for (int i = 0; i < infos.length; i++) {
			CpuInfo info = infos[i];
			Zp += info.getMhz();		
		}
		//06.CPUʹ����
		//07.�ڴ�����
		Mem mem = sigar.getMem();
		long Zl = mem.getTotal() / 1024L/1024;
		//08.�ڴ�ʹ������
		long Sysl = mem.getUsed() / 1024L/1024;
		//09.�ڴ�ʹ����
		float Nc_Syl = Sysl/Zl;
				
		FileSystem fslist[] = sigar.getFileSystemList();
		//10.��������
		long Cpzl = 0;
		//11.����ʣ����
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
				case 0: // TYPE_UNKNOWN ��δ֪
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
		//12.����ʹ����
		float Cp_Syl= Cp_Syl01/t;
		
		String ifNames[] = sigar.getNetInterfaceList();
		//13.��λʱ��������
		long Lrl = 0;
		//14.��λʱ��������
		long Lcl = 0;
		for(int i = 0;i<ifNames.length;i++){
			String name = ifNames[i];
			NetInterfaceStat ifstat = sigar.getNetInterfaceStat(name);
			Lrl += ifstat.getRxBytes();
			Lcl += ifstat.getTxBytes();
		}
		
		//15.����½�û�
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
	
	//��ձ����
	public void truncate(){
		dao.truncate();
	}
		
}
