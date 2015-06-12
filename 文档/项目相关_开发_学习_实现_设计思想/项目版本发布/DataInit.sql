INSERT INTO D_USERMANAGER_VERSION VALUES('5.0.3');
COMMIT;
delete from D_MD5;
prompt Loading D_MD5...
insert into D_MD5 (PWDTYPE)
values ('否');
commit;
prompt Deleting D_ZZJGLX...
delete from D_ZZJGLX;
commit;
prompt Loading D_ZZJGLX...
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('1', '警务区', null);
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('2', '消防', null);
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('3', '交警', null);
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('11', '市局', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('12', '分局', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('13', '派出所', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('14', '警务责任区/社区', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('15', '辖区', '1');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('21', '消防支队', '2');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('22', '消防大队', '2');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('23', '消防中队', '2');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('31', '交警支队', '3');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('32', '交警大队', '3');
insert into D_ZZJGLX (JGLXDM, JGLXMC, PARENT)
values ('33', '交警中队', '3');
commit;
prompt Deleting D_DL_TYPE...
delete from D_DL_TYPE;
commit;
prompt Loading D_DL_TYPE...
insert into D_DL_TYPE (DM, MC)
values ('9', '其他');
insert into D_DL_TYPE (DM, MC)
values ('0', '登录');
insert into D_DL_TYPE (DM, MC)
values ('1', '登出');
insert into D_DL_TYPE (DM, MC)
values ('2', '添加');
insert into D_DL_TYPE (DM, MC)
values ('3', '删除');
insert into D_DL_TYPE (DM, MC)
values ('4', '修改');
insert into D_DL_TYPE (DM, MC)
values ('5', '查询');
insert into T_DOMAIN(domainid,domainname,owner) values('-1','运维管理系统','ezmap');
insert into D_PARAM(key,value) values('polling','false');
insert into D_PARAM(key,value) values('smtphost','smtp.163.com');
insert into D_PARAM(key,value) values('mail','ezmanager_ceshi@163.com');
insert into D_PARAM(key,value) values('mailpass','iquwming');
insert into D_PARAM(key,value) values('recipients','ezmanager_receive@163.com');
insert into D_PARAM(key,value) values('intervalsec','600');
insert into D_PARAM(key,value) values('intervalsde','600');
insert into D_PARAM(key,value) values('warnningdistancehour','11');
insert into EZSM_SOFTWARETYPE (SWT_TYPEID, SWT_TYPENAME, SWT_REMARK) values ('1', '数据库服务器', null);
insert into EZSM_SOFTWARETYPE (SWT_TYPEID, SWT_TYPENAME, SWT_REMARK) values ('2', '消息中间件', null);
insert into EZSM_SOFTWARETYPE (SWT_TYPEID, SWT_TYPENAME, SWT_REMARK) values ('3', 'SDE', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('1', '栅格地图服务', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('2', 'WMTS服务', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('3', 'WMS服务', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('4', 'WFS服务', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('5', '数据访问更新服务', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('6', '地址匹配服务', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('7', '专题图服务', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('8', '资源目录与元数据服务', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('9', '地理信息搜索服务', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('10', '服务监控', null);
insert into EZSM_SERVICETYPE (ST_TYPEID, ST_TYPENAME, ST_REMARK) values ('11', '栅格地图联网服务', null);
commit;
EXIT;
