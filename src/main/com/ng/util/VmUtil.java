package com.ng.util;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 虚拟机实用工具类
 * @author  ZhengWei
 * @version 2013年11月12日下午2:02:07
 * @since   JDK1.6 
 */
public final class VmUtil {

	public static final RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	
	/**
	 * 返回表示正在运行的 Java 虚拟机的名称
	 * @return
	 */
	public static final String getRunningName() {
		return runtimeMXBean.getName();
	}
	
	/**
	 * 返回 Java 虚拟机实现名称
	 * @return
	 */
	public static final String getVmName() {
		return runtimeMXBean.getVmName();
	}
	
	/**
	 * 返回 Java 虚拟机实现供应商
	 * @return
	 */
	public static final String getVmVendor() {
		return runtimeMXBean.getVmVendor();
	}
	
	/**
	 * 返回 Java 虚拟机实现版本
	 * @return
	 */
	public static final String getVmVersion() {
		return runtimeMXBean.getVmVersion();
	}
	
	/**
	 * 返回Java虚拟机启动的时间，单位毫秒
	 * @return
	 */
	public static final long getStartTime() {
		return runtimeMXBean.getStartTime();
	}
	
	/**
	 * 返回Java虚拟机正常运行的时间，单位毫秒
	 * @return
	 */
	public static final long getVmUptime() {
		return runtimeMXBean.getUptime();
	}
	
	/**
	 * 返回系统类加载器用于搜索类文件的 Java 类路径
	 * @return
	 */
	public static final String getClassPath() {
		return runtimeMXBean.getClassPath();
	}
	
	public static final String getVmInfo(String separator) {
		StringBuilder info = new StringBuilder();
		info.append("虚拟机实现名字:").append(getVmName()).append(separator);
		info.append("虚拟机实现供应商:").append(getVmVendor()).append(separator);
		info.append("虚拟机实现版本:").append(getVmVersion()).append(separator);
		
		info.append("正运行的虚拟机名字:").append(getRunningName()).append(separator);
		info.append("启动时间:").append(sdf.format(new Date(getStartTime()))).append(separator);
		info.append("运行时间:").append(getVmUptime()).append("ms").append(separator);
		
		return info.toString();
	}
	
	public static final String getVmHtmlInfo() {
		return getVmInfo("<br/>");
	}
	
	public static void main(String[] args) {
		System.out.print(getVmInfo("\n"));
	}
	
}
