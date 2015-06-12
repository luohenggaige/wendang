package com.easymap.version;

import java.util.ArrayList;
import java.util.Collections;

import proguard.annotation.Keep;
import proguard.annotation.KeepName;

/**
 * EzManager的当前版本
 */
@Keep
@KeepName

public class Version {

	final private static ArrayList<IVersion> verList;
	
	static {
		verList = new ArrayList<IVersion>();
		
		VersionImpl ver = null; 
		
		ver = new VersionImpl("V5.0.3.201409091530","beta");
		ver.addDescription("运维监控5.0.3测试版本发布有如下改动");
		ver.addDescription("系统日志中服务日志应用平台名称显示“Other”修改为固定“应用一”。");
		ver.addDescription("系统日志中服务日志或其他查询的默认显示时间改为一星期。");
		ver.addDescription("用户管理权限信息修改下空间权限属性删除功能。");
		ver.addDescription("用户管理权限信息修改下空间权限面图层查询的不同错误对应相应的提示。");
		verList.add(ver);
		
		ver = new VersionImpl("V5.0.1.201405071404", "beta");
		ver.addDescription("修改5.0版本bug");
		ver.addDescription("修改部署文档，安全助手配置文档");
		verList.add(ver);
		
		ver = new VersionImpl("V5.0.0.201403211544", "beta");
		ver.addDescription("运维监控5.0.0测试版发布，有如下改动:");
		ver.addDescription("1、原运维管理系统（版本号）产品与服务监控系统产品（版本号）整合为新的运维监控系统产品。");
		ver.addDescription("2、前端页面与功能交互重构，调整。");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.10.201312021640", "beta");
		ver.addDescription("运维4.0.10测试版发布，有如下改动:");
		ver.addDescription("1、修改BUG [B130801-001]运维API中updateUserPassword接口在中间件集群下其功能没有实现。");
		ver.addDescription("2、修改BUG [B131027-008]getThemePrivilegeChildNodesWithFilter接口无法获取数据");
		ver.addDescription("3、修改BUG [B130809-011]运维用户列表信息展现缺陷");
		ver.addDescription("4、修改BUG [B130912-007]运维管理系统日志记录缺陷");
		ver.addDescription("5、修改BUG [B131029-001]运维管理系统导出的日志无法用2010Office打开");
		ver.addDescription("6、修改BUG [B131024-002]getDataPrivilege接口获取不到数据");
		ver.addDescription("7、修改BUG [B131027-001]getPropertyPrivilege接口获取的sql语句有问题");
		ver.addDescription("8、修改BUG [B131027-006]getUser与getUserById两接口实现功能重复");
		ver.addDescription("9、修改BUG 支持oracle spatial空间数据库");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.9.201310101344", "beta");
		ver.addDescription("运维4.0.9测试版发布，有如下改动:");
		ver.addDescription("1.为运维API提供对应的SQL");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.8.201309091659", "beta");
		ver.addDescription("运维4.0.8测试版发布，有如下改动:");
		ver.addDescription("1.修改BUG [B130822-014]运维空间权限面图层模糊查询没有实现。");
		ver.addDescription("2、修改BUG [B130823-005]分级管理员无法将空间面图层分配给角色");
		ver.addDescription("3、修改BUG [B130814-008]空间面图层分页有问题");
		ver.addDescription("4、修改BUG [B130822-029]分级管理员创建应用填写信息输入英文输入法逗号引起的缺陷。");
		ver.addDescription("5、修改BUG [B130802-011]分级管理员角色管理缺陷");
		ver.addDescription("6、修改BUG [B130822-019]分级管理员创建的角色进行修改后会失去其角色权限");
		ver.addDescription("7、修改BUG [B130821-011]在IE9浏览器下执行批量导入组织机构用户失败");
		ver.addDescription("8、修改BUG [B130826-002]建议去除掉Update.sql脚本");
		ver.addDescription("9、修改BUG [B130821-015]在Oracle11g上创建数据脚本的表空间及用户名大小写问题");
		ver.addDescription("10、修改BUG [B130804-001]日志统计界面标签提示文字错误");
		ver.addDescription("11、修改BUG [B130816-004]日志统计界面缺陷");
		ver.addDescription("12、修改BUG [B130821-014]添加新用户用户描述中含有英文输入法的逗号导致的缺陷");
		ver.addDescription("13、修改BUG [B130822-012]删除专题权限下的图层专题树会自动回缩");
		ver.addDescription("14、修改BUG [B130801-002]屏蔽分级管理员角色管理模块下角色的（数据，空间权限）删除功能");
		ver.addDescription("15、完善运维部署手册");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.7.201308141700", "beta");
		ver.addDescription("运维4.0.7测试版发布，有如下改动:");
		ver.addDescription("1、修改bug[B130801-010]pollux.conf配置文件里修改图层标准代码导致数据权限分配和空间权限分配错误。");
		ver.addDescription("2、修改bug[B130802-009]分级管理员登录运维其拥有的权限建议只能查看");
		ver.addDescription("3、修改bug[B130801-003]应用关系树在“添加”与“删除”应用时会自动收回");
		ver.addDescription("4、修改bug[B130802-014]分级管理员用户管理缺陷");
		ver.addDescription("5、修改bug[B130802-011]分级管理员角色管理缺陷");
		ver.addDescription("6、修改bug[B130802-022]应用管理模块缺陷");
		ver.addDescription("7、修改bug[B130801-002]屏蔽分级管理员用户对（角色，数据，空间权限）删除功能");
		ver.addDescription("8、修改bug[B130802-008]运维系统无法处理在EzSpatial中删除标准对应的专题时的故障");
		ver.addDescription("9、修改bug[B130801-003]应用关系树在“添加”与“删除”应用时会自动收回");
		ver.addDescription("10、修改bug[B130802-018]空间权限分级管理缺陷");
		ver.addDescription("11、修改bug[B130804-001]日志统计界面标签提示文字错误");
		ver.addDescription("12、修改bug[B130805-002]角色所附带的空间面图层无法单独向下分配");
		ver.addDescription("13、修改bug[B130801-007]运维用户列表每页显示用户数目没有标注");
		ver.addDescription("14、修改bug[B130801-006]pollux.conf配置文件里EzServerClient配置注解是错误的");
		ver.addDescription("15、修改bug[B130801-014]角色管理空间属性分配为空时报SQl语句错误");
		ver.addDescription("16、修改bug[B130801-015]屏蔽分级管理员下角色管理模块空间权限属性权限分配对话框中的删除功能");
		ver.addDescription("17、修改bug[B130801-008]角色和应用添加时必填选项需要标红");
		ver.addDescription("18、运维部署手册更新");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.6.201307250924", "beta");
		ver.addDescription("运维4.0.6测试版发布，有如下改动:");
		ver.addDescription("1、组织机构与用户信息的外部导入修改。");
		ver.addDescription("2、分级管理员登陆运维系统能够删除所属机构。");
		ver.addDescription("3、增加删除用户时提示信息。");
		ver.addDescription("4、组织机构导入增加导入方式。");
		ver.addDescription("5、分配空间权限属性树形显示。");
		ver.addDescription("6、日志导出文件应用系统列导出值为时间。");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.5.201306280915", "beta");
		ver.addDescription("运维4.0.5测试版发布，有如下改动:");
		ver.addDescription("1、组织机构与用户信息的外部导入。（约定文件格式与结构）");
		ver.addDescription("2、分级权限下的分级管理员本级组织机构与用户维护功能");
		ver.addDescription("3、多线程日志插入错误，增加序列。");
		ver.addDescription("更新：解决日志翻倍插入的bug");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.4.201306081000", "beta");
		ver.addDescription("修改4.0.3版本中的bug:");
		ver.addDescription("1、修改bug[B130531-013] 超级用户ezmap下日志查询报错");
		ver.addDescription("2、修改bug[B130531-014] 日志管理无法查出普通管理员的操作信息");
		ver.addDescription("3、修改bug[B130531-017] 空间面图层分级权限完善");
		ver.addDescription("4、修改bug[B130531-021] 应用系统模块权限完善");
		ver.addDescription("5、修改bug[B130531-012] 普通管理员创建的系统无法显示");
		ver.addDescription("6、加入许可验证");
		ver.addDescription("更新内容：1、修改bug:角色管理中删除功能权限，未连带删除数据权限。");
		ver.addDescription("2、修改bug:用户管理下删除功能权限，界面上数据权限有残留。");
		ver.addDescription("3、修改bug:普通管理员zzy拥有角色的空间权限，为其他用户分配，界面上没有。");
		ver.addDescription("4、修改bug:调换部门之后用户管理的身份被默认为否。");
		ver.addDescription("5、修改bug:超级管理员删除分级管理员所创建拥有的功能权限，有数据残留");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.3.201305240940", "beta");
		ver.addDescription("运维4.0.3测试版发布，有如下改动:");
		ver.addDescription("1、修改4.0.2版本中的bug");
		ver.addDescription("2、日志管理中加入运维系统的操作日志");
		ver.addDescription("3、数据库升级采用新的升级方式（使用SQLCheck软件）");
		ver.addDescription("4、不再支持IP和统计权限");
		ver.addDescription("5、支持运维API3.1.12版本查询");
		ver.addDescription("6、完善分级管理");
		ver.addDescription("7、部分页面细节调整");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.2.201304181549", "beta");
		ver.addDescription("运维4.0.2测试版发布，有如下改动:");
		ver.addDescription("1、新版系统界面的调整。");
		ver.addDescription("2、完善分级管理机制。");
		ver.addDescription("3、运维4.0.1相关bug修改。");
		ver.addDescription("4、暂不支持API访问");
		verList.add(ver);
		
		//
		ver = new VersionImpl("V4.0.1.201303111342", "beta");
		ver.addDescription("运维4.0.1测试版发布，在保留运维3之前的版本功能上，新增如下内容:");
		ver.addDescription("1、新增用户批量分配权限功能，包括角色权限，数据权限，空间权限。");
		ver.addDescription("2、新增用户调配功能，能调配用户所属组织机构");
		ver.addDescription("3、系统界面和数据库表的调整，优化系统流程。");
		ver.addDescription("4、完善分级管理机制。");
		ver.addDescription("5、暂不支持API访问");
		verList.add(ver);

		// 排序
		Collections.sort(verList);
	}

	public static void main(String[] args) {
		System.out.print(getVersion());
	}

	/**
	 * 产生当前版本的发布信息
	 * @param releaseFile
	 * @return
	 */
	@Keep
	@KeepName
	public static String getReleaseInfo(Boolean onlyCurrentVersion) {
		StringBuffer content = new StringBuffer("");

		if( onlyCurrentVersion ){
			IVersion v = verList.get(0);
			content.append(v.getVersion() + " " + v.getVersionType());
			
			int nVerDespCount = v.getVersionDescription().length;
			for (int j = 0; j < nVerDespCount ; j++) {
				content.append("[").append(j + 1).append("]");
				content.append(v.getVersionDescription()[j]);
			}
		}else{
			//附加上版本信息
			int nVerCount = verList.size();
			for (int i = 0; i < nVerCount; i++) {
				IVersion v = verList.get(i);
				content.append(v.getVersion() + " " + v.getVersionType());
				if( i == 0 ){
					content.append("(*当前版本*)");
				}
				content.append("\r\n");
				
				int nVerDespCount = v.getVersionDescription().length;
				for (int j = 0; j < nVerDespCount ; j++) {
					content.append("[").append(j + 1).append("]");
					content.append(v.getVersionDescription()[j]);
					content.append("\r\n");
				}
				if(i != nVerCount-1)content.append("\r\n\r\n");
			}
		}

		// 返回数据
		return content.toString();
	}
	
	/**
	 * 获取当前版本信息
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String getVersion() {
		return verList.get(0).getVersion();
	}

	/**
	 * 获得当前版本的修改内容
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String[] getVersionDescription() {
		return verList.get(0).getVersionDescription();
	}
	@Keep
	@KeepName
	public static int getVersionCount() {
		return verList.size();
	}

	/**
	 * 获取当前版本信息
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String getVersion(int index) {
		return verList.get(index).getVersion();
	}

	/**
	 * 获得当前版本的修改内容
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String[] getVersionDescription(int index) {
		return verList.get(index).getVersionDescription();
	}

	/**
	 * 获取当前版本信息
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String getVersionType(int index) {
		return verList.get(index).getVersionType();
	}

	/**
	 * 获得当前版本的修改内容
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String[] getVersionErrors(int index) {
		return verList.get(index).getVersionErrors();
	}
}
