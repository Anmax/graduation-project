--服务器应用监控系统


--删除sbcj_czxt表中的所有数据并保留结构
truncate table sbcj_czxt;

--sbcj_czxt测试代码
insert into sbcj_czxt 
values(001,'Administrator','Windows 7','amd64','1975-12-23 12:12:12',sysdate(),1,'1975-12-23 12:12:12',sysdate());
commit;
select * from sbcj_czxt order by Rksj desc;
truncate table sbcj_czxt;


--sbcj_wjcc测试代码
insert into sbcj_wjcc
values(001,'NTFS','C:/',700,sysdate(),sysdate());
commit;
select * from sbcj_wjcc order by Rksj desc;
truncate table sbcj_wjcc;


--sbcj_cpu_nc测试代码
insert into sbcj_cpu_nc
values(001,2,'2.20',6.0,4095,1957,2137,91.2,sysdate(),sysdate());
commit;
select * from sbcj_cpu_nc order by Rksj desc;
truncate table sbcj_cpu_nc;


--sbcj_fq测试代码
insert into sbcj_fq
values(001,'C:/','/','C:/',35848,18961,16886,53.0,sysdate(),sysdate());
commit;
select * from sbcj_fq order by Rksj desc;
truncate table sbcj_fq;


--sbcj_cpio测试代码
insert into sbcj_cpio
values(001,'D:/',113188,14393,sysdate(),sysdate());
commit;
select * from sbcj_cpio order by Rksj desc;
truncate table sbcj_cpio;




--sbcj_wkll测试代码                                                               
insert into sbcj_wkll(Sbid,Wkmc,IP,Lrl,Srdbs,Srcbs,Lcl,Scdbs,Sccbs,Cjsj,Rksj)
values(001,'eth0','0.0.0.0',0,0,0,0,0,0,sysdate(),sysdate());
commit;
select * from sbcj_wkll order by Rksj desc;
truncate table sbcj_wkll;


--sbcj_dlyh测试代码    
insert into sbcj_dlyh(Sbid,Yhm,Sj,IP,Cjsj,Rksj)
values(001,'Admin',sysdate(),'192.168.1.1',sysdate(),sysdate());
commit;
select * from sbcj_dlyh order by Rksj desc;
truncate table sbcj_dlyh;


--sbcj_yhcz测试代码                                                               
insert into sbcj_yhcz(Sbid,Yhm,Dlsj,IP,Ml,Tcsj,Cjsj,Rksj)
values(001,'Admin',sysdate(),'192.168.1.2','delete * form ****',sysdate(),sysdate(),sysdate());
commit;
select * from sbcj_yhcz order by Rksj desc;
truncate table sbcj_yhcz;


--sbcj_ztzj测试代码                    
insert into sbcj_ztzj(Sbid,Zjmc,Czxtbb,Czxtnh,Kjsj,
                      Dqsj,Sfwjzd,Gs,Zp,Cpu_Syl,
                      Zl,Sysl,Nc_Syl,Cpzl,Cpsyl,
                      Cp_Syl,Lrl,Lcl,Zhdlyh,Zhdlsj,Rksj)
values(
      001,'Admin','Windows 7','amd64',sysdate(),
      sysdate(),0,2,'2.20',50,
      4095,2000,48,35840,16740,
      54.0,27043,44607,'Admin',sysdate(),sysdate()
      );
commit;
select * from sbcj_ztzj order by Rksj desc;
truncate table sbcj_ztzj;





