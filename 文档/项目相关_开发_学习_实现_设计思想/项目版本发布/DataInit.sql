INSERT INTO D_USERMANAGER_VERSION VALUES('5.0.3');
COMMIT;
delete from D_MD5;
prompt Loading D_MD5...
insert into D_MD5 (PWDTYPE)
values ('��');
commit;
prompt Deleting D_ZZJGLX...
delete from D_ZZJGLX;
commit;
prompt Loading D_ZZJGLX...
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('1', '������', null);
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('2', '����', null);
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('3', '����', null);
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('11', '�о�', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('12', '�־�', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('13', '�ɳ���', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('14', '����������/����', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('15', 'Ͻ��', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('21', '����֧��', '2');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('22', '�������', '2');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('23', '�����ж�', '2');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('31', '����֧��', '3');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('32', '�������', '3');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('33', '�����ж�', '3');
commit;
prompt Deleting D_DL_TYPE...
delete from D_DL_TYPE;
commit;
prompt Loading D_DL_TYPE...
insert into D_DL_TYPE (DM, MC)
values ('9', '����');
insert into D_DL_TYPE (DM, MC)
values ('0', '��¼');
insert into D_DL_TYPE (DM, MC)
values ('1', '�ǳ�');
insert into D_DL_TYPE (DM, MC)
values ('2', '���');
insert into D_DL_TYPE (DM, MC)
values ('3', 'ɾ��');
insert into D_DL_TYPE (DM, MC)
values ('4', '�޸�');
insert into D_DL_TYPE (DM, MC)
values ('5', '��ѯ');
insert into T_DOMAIN(domainid,domainname,owner) values('-1','��ά����ϵͳ','ezmap');
insert into D_PARAM(key,value) values('polling','false');
insert into D_PARAM(key,value) values('smtphost','smtp.163.com');
insert into D_PARAM(key,value) values('mail','ezmanager_ceshi@163.com');
insert into D_PARAM(key,value) values('mailpass','iquwming');
insert into D_PARAM(key,value) values('recipients','ezmanager_receive@163.com');
insert into D_PARAM(key,value) values('intervalsec','600');
insert into D_PARAM(key,value) values('intervalsde','600');
insert into D_PARAM(key,value) values('warnningdistancehour','11');
insert into EZSM_SOFTWARETYPE (SWT_TYPEID, SWT_TYPENAME, SWT_REMARK) values ('1', '���ݿ������', null);
insert into EZSM_SOFTWARETYPE (SWT_TYPEID, SWT_TYPENAME, SWT_REMARK) values ('2', '��Ϣ�м��', null);
insert into EZSM_SOFTWARETYPE (SWT_TYPEID, SWT_TYPENAME, SWT_REMARK) values ('3', 'SDE', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('1', 'դ���ͼ����', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('2', 'WMTS����', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('3', 'WMS����', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('4', 'WFS����', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('5', '���ݷ��ʸ��·���', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('6', '��ַƥ�����', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('7', 'ר��ͼ����', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('8', '��ԴĿ¼��Ԫ���ݷ���', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('9', '������Ϣ��������', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('10', '������', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('11', 'դ���ͼ��������', null);
commit;
EXIT;
