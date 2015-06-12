package com.easymap.version;

import java.util.ArrayList;
import java.util.Collections;

import proguard.annotation.Keep;
import proguard.annotation.KeepName;

/**
 * EzManager�ĵ�ǰ�汾
 */
@Keep
@KeepName

public class Version {

	final private static ArrayList<IVersion> verList;
	
	static {
		verList = new ArrayList<IVersion>();
		
		VersionImpl ver = null; 
		
		ver = new VersionImpl("V5.0.3.201409091530","beta");
		ver.addDescription("��ά���5.0.3���԰汾���������¸Ķ�");
		ver.addDescription("ϵͳ��־�з�����־Ӧ��ƽ̨������ʾ��Other���޸�Ϊ�̶���Ӧ��һ����");
		ver.addDescription("ϵͳ��־�з�����־��������ѯ��Ĭ����ʾʱ���Ϊһ���ڡ�");
		ver.addDescription("�û�����Ȩ����Ϣ�޸��¿ռ�Ȩ������ɾ�����ܡ�");
		ver.addDescription("�û�����Ȩ����Ϣ�޸��¿ռ�Ȩ����ͼ���ѯ�Ĳ�ͬ�����Ӧ��Ӧ����ʾ��");
		verList.add(ver);
		
		ver = new VersionImpl("V5.0.1.201405071404", "beta");
		ver.addDescription("�޸�5.0�汾bug");
		ver.addDescription("�޸Ĳ����ĵ�����ȫ���������ĵ�");
		verList.add(ver);
		
		ver = new VersionImpl("V5.0.0.201403211544", "beta");
		ver.addDescription("��ά���5.0.0���԰淢���������¸Ķ�:");
		ver.addDescription("1��ԭ��ά����ϵͳ���汾�ţ���Ʒ�������ϵͳ��Ʒ���汾�ţ�����Ϊ�µ���ά���ϵͳ��Ʒ��");
		ver.addDescription("2��ǰ��ҳ���빦�ܽ����ع���������");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.10.201312021640", "beta");
		ver.addDescription("��ά4.0.10���԰淢���������¸Ķ�:");
		ver.addDescription("1���޸�BUG [B130801-001]��άAPI��updateUserPassword�ӿ����м����Ⱥ���书��û��ʵ�֡�");
		ver.addDescription("2���޸�BUG [B131027-008]getThemePrivilegeChildNodesWithFilter�ӿ��޷���ȡ����");
		ver.addDescription("3���޸�BUG [B130809-011]��ά�û��б���Ϣչ��ȱ��");
		ver.addDescription("4���޸�BUG [B130912-007]��ά����ϵͳ��־��¼ȱ��");
		ver.addDescription("5���޸�BUG [B131029-001]��ά����ϵͳ��������־�޷���2010Office��");
		ver.addDescription("6���޸�BUG [B131024-002]getDataPrivilege�ӿڻ�ȡ��������");
		ver.addDescription("7���޸�BUG [B131027-001]getPropertyPrivilege�ӿڻ�ȡ��sql���������");
		ver.addDescription("8���޸�BUG [B131027-006]getUser��getUserById���ӿ�ʵ�ֹ����ظ�");
		ver.addDescription("9���޸�BUG ֧��oracle spatial�ռ����ݿ�");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.9.201310101344", "beta");
		ver.addDescription("��ά4.0.9���԰淢���������¸Ķ�:");
		ver.addDescription("1.Ϊ��άAPI�ṩ��Ӧ��SQL");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.8.201309091659", "beta");
		ver.addDescription("��ά4.0.8���԰淢���������¸Ķ�:");
		ver.addDescription("1.�޸�BUG [B130822-014]��ά�ռ�Ȩ����ͼ��ģ����ѯû��ʵ�֡�");
		ver.addDescription("2���޸�BUG [B130823-005]�ּ�����Ա�޷����ռ���ͼ��������ɫ");
		ver.addDescription("3���޸�BUG [B130814-008]�ռ���ͼ���ҳ������");
		ver.addDescription("4���޸�BUG [B130822-029]�ּ�����Ա����Ӧ����д��Ϣ����Ӣ�����뷨���������ȱ�ݡ�");
		ver.addDescription("5���޸�BUG [B130802-011]�ּ�����Ա��ɫ����ȱ��");
		ver.addDescription("6���޸�BUG [B130822-019]�ּ�����Ա�����Ľ�ɫ�����޸ĺ��ʧȥ���ɫȨ��");
		ver.addDescription("7���޸�BUG [B130821-011]��IE9�������ִ������������֯�����û�ʧ��");
		ver.addDescription("8���޸�BUG [B130826-002]����ȥ����Update.sql�ű�");
		ver.addDescription("9���޸�BUG [B130821-015]��Oracle11g�ϴ������ݽű��ı�ռ估�û�����Сд����");
		ver.addDescription("10���޸�BUG [B130804-001]��־ͳ�ƽ����ǩ��ʾ���ִ���");
		ver.addDescription("11���޸�BUG [B130816-004]��־ͳ�ƽ���ȱ��");
		ver.addDescription("12���޸�BUG [B130821-014]������û��û������к���Ӣ�����뷨�Ķ��ŵ��µ�ȱ��");
		ver.addDescription("13���޸�BUG [B130822-012]ɾ��ר��Ȩ���µ�ͼ��ר�������Զ�����");
		ver.addDescription("14���޸�BUG [B130801-002]���ηּ�����Ա��ɫ����ģ���½�ɫ�ģ����ݣ��ռ�Ȩ�ޣ�ɾ������");
		ver.addDescription("15��������ά�����ֲ�");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.7.201308141700", "beta");
		ver.addDescription("��ά4.0.7���԰淢���������¸Ķ�:");
		ver.addDescription("1���޸�bug[B130801-010]pollux.conf�����ļ����޸�ͼ���׼���뵼������Ȩ�޷���Ϳռ�Ȩ�޷������");
		ver.addDescription("2���޸�bug[B130802-009]�ּ�����Ա��¼��ά��ӵ�е�Ȩ�޽���ֻ�ܲ鿴");
		ver.addDescription("3���޸�bug[B130801-003]Ӧ�ù�ϵ���ڡ���ӡ��롰ɾ����Ӧ��ʱ���Զ��ջ�");
		ver.addDescription("4���޸�bug[B130802-014]�ּ�����Ա�û�����ȱ��");
		ver.addDescription("5���޸�bug[B130802-011]�ּ�����Ա��ɫ����ȱ��");
		ver.addDescription("6���޸�bug[B130802-022]Ӧ�ù���ģ��ȱ��");
		ver.addDescription("7���޸�bug[B130801-002]���ηּ�����Ա�û��ԣ���ɫ�����ݣ��ռ�Ȩ�ޣ�ɾ������");
		ver.addDescription("8���޸�bug[B130802-008]��άϵͳ�޷�������EzSpatial��ɾ����׼��Ӧ��ר��ʱ�Ĺ���");
		ver.addDescription("9���޸�bug[B130801-003]Ӧ�ù�ϵ���ڡ���ӡ��롰ɾ����Ӧ��ʱ���Զ��ջ�");
		ver.addDescription("10���޸�bug[B130802-018]�ռ�Ȩ�޷ּ�����ȱ��");
		ver.addDescription("11���޸�bug[B130804-001]��־ͳ�ƽ����ǩ��ʾ���ִ���");
		ver.addDescription("12���޸�bug[B130805-002]��ɫ�������Ŀռ���ͼ���޷��������·���");
		ver.addDescription("13���޸�bug[B130801-007]��ά�û��б�ÿҳ��ʾ�û���Ŀû�б�ע");
		ver.addDescription("14���޸�bug[B130801-006]pollux.conf�����ļ���EzServerClient����ע���Ǵ����");
		ver.addDescription("15���޸�bug[B130801-014]��ɫ����ռ����Է���Ϊ��ʱ��SQl������");
		ver.addDescription("16���޸�bug[B130801-015]���ηּ�����Ա�½�ɫ����ģ��ռ�Ȩ������Ȩ�޷���Ի����е�ɾ������");
		ver.addDescription("17���޸�bug[B130801-008]��ɫ��Ӧ�����ʱ����ѡ����Ҫ���");
		ver.addDescription("18����ά�����ֲ����");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.6.201307250924", "beta");
		ver.addDescription("��ά4.0.6���԰淢���������¸Ķ�:");
		ver.addDescription("1����֯�������û���Ϣ���ⲿ�����޸ġ�");
		ver.addDescription("2���ּ�����Ա��½��άϵͳ�ܹ�ɾ������������");
		ver.addDescription("3������ɾ���û�ʱ��ʾ��Ϣ��");
		ver.addDescription("4����֯�����������ӵ��뷽ʽ��");
		ver.addDescription("5������ռ�Ȩ������������ʾ��");
		ver.addDescription("6����־�����ļ�Ӧ��ϵͳ�е���ֵΪʱ�䡣");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.5.201306280915", "beta");
		ver.addDescription("��ά4.0.5���԰淢���������¸Ķ�:");
		ver.addDescription("1����֯�������û���Ϣ���ⲿ���롣��Լ���ļ���ʽ��ṹ��");
		ver.addDescription("2���ּ�Ȩ���µķּ�����Ա������֯�������û�ά������");
		ver.addDescription("3�����߳���־��������������С�");
		ver.addDescription("���£������־���������bug");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.4.201306081000", "beta");
		ver.addDescription("�޸�4.0.3�汾�е�bug:");
		ver.addDescription("1���޸�bug[B130531-013] �����û�ezmap����־��ѯ����");
		ver.addDescription("2���޸�bug[B130531-014] ��־�����޷������ͨ����Ա�Ĳ�����Ϣ");
		ver.addDescription("3���޸�bug[B130531-017] �ռ���ͼ��ּ�Ȩ������");
		ver.addDescription("4���޸�bug[B130531-021] Ӧ��ϵͳģ��Ȩ������");
		ver.addDescription("5���޸�bug[B130531-012] ��ͨ����Ա������ϵͳ�޷���ʾ");
		ver.addDescription("6�����������֤");
		ver.addDescription("�������ݣ�1���޸�bug:��ɫ������ɾ������Ȩ�ޣ�δ����ɾ������Ȩ�ޡ�");
		ver.addDescription("2���޸�bug:�û�������ɾ������Ȩ�ޣ�����������Ȩ���в�����");
		ver.addDescription("3���޸�bug:��ͨ����Աzzyӵ�н�ɫ�Ŀռ�Ȩ�ޣ�Ϊ�����û����䣬������û�С�");
		ver.addDescription("4���޸�bug:��������֮���û��������ݱ�Ĭ��Ϊ��");
		ver.addDescription("5���޸�bug:��������Աɾ���ּ�����Ա������ӵ�еĹ���Ȩ�ޣ������ݲ���");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.3.201305240940", "beta");
		ver.addDescription("��ά4.0.3���԰淢���������¸Ķ�:");
		ver.addDescription("1���޸�4.0.2�汾�е�bug");
		ver.addDescription("2����־�����м�����άϵͳ�Ĳ�����־");
		ver.addDescription("3�����ݿ����������µ�������ʽ��ʹ��SQLCheck�����");
		ver.addDescription("4������֧��IP��ͳ��Ȩ��");
		ver.addDescription("5��֧����άAPI3.1.12�汾��ѯ");
		ver.addDescription("6�����Ʒּ�����");
		ver.addDescription("7������ҳ��ϸ�ڵ���");
		verList.add(ver);
		
		ver = new VersionImpl("V4.0.2.201304181549", "beta");
		ver.addDescription("��ά4.0.2���԰淢���������¸Ķ�:");
		ver.addDescription("1���°�ϵͳ����ĵ�����");
		ver.addDescription("2�����Ʒּ�������ơ�");
		ver.addDescription("3����ά4.0.1���bug�޸ġ�");
		ver.addDescription("4���ݲ�֧��API����");
		verList.add(ver);
		
		//
		ver = new VersionImpl("V4.0.1.201303111342", "beta");
		ver.addDescription("��ά4.0.1���԰淢�����ڱ�����ά3֮ǰ�İ汾�����ϣ�������������:");
		ver.addDescription("1�������û���������Ȩ�޹��ܣ�������ɫȨ�ޣ�����Ȩ�ޣ��ռ�Ȩ�ޡ�");
		ver.addDescription("2�������û����书�ܣ��ܵ����û�������֯����");
		ver.addDescription("3��ϵͳ��������ݿ��ĵ������Ż�ϵͳ���̡�");
		ver.addDescription("4�����Ʒּ�������ơ�");
		ver.addDescription("5���ݲ�֧��API����");
		verList.add(ver);

		// ����
		Collections.sort(verList);
	}

	public static void main(String[] args) {
		System.out.print(getVersion());
	}

	/**
	 * ������ǰ�汾�ķ�����Ϣ
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
			//�����ϰ汾��Ϣ
			int nVerCount = verList.size();
			for (int i = 0; i < nVerCount; i++) {
				IVersion v = verList.get(i);
				content.append(v.getVersion() + " " + v.getVersionType());
				if( i == 0 ){
					content.append("(*��ǰ�汾*)");
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

		// ��������
		return content.toString();
	}
	
	/**
	 * ��ȡ��ǰ�汾��Ϣ
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String getVersion() {
		return verList.get(0).getVersion();
	}

	/**
	 * ��õ�ǰ�汾���޸�����
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
	 * ��ȡ��ǰ�汾��Ϣ
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String getVersion(int index) {
		return verList.get(index).getVersion();
	}

	/**
	 * ��õ�ǰ�汾���޸�����
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String[] getVersionDescription(int index) {
		return verList.get(index).getVersionDescription();
	}

	/**
	 * ��ȡ��ǰ�汾��Ϣ
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String getVersionType(int index) {
		return verList.get(index).getVersionType();
	}

	/**
	 * ��õ�ǰ�汾���޸�����
	 * 
	 * @return
	 */
	@Keep
	@KeepName
	public static String[] getVersionErrors(int index) {
		return verList.get(index).getVersionErrors();
	}
}
