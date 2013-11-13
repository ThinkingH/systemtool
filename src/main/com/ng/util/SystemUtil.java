package com.ng.util;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

/**
 * 系统工具类
 * @author  ZhengWei
 * @version 2013年11月12日下午2:29:24
 * @since   JDK1.6 
 */
public final class SystemUtil {

	public static final OperatingSystemMXBean osMXBean = ManagementFactory.getOperatingSystemMXBean();
	
	/**
	 * 获得操作系统的名字
	 * @return
	 */
	public static final String getOsName() {
		return osMXBean.getName();
	}
	
	/**
	 * 获得操作系统的版本
	 * @return
	 */
	public static final String getOsVersion() {
		return osMXBean.getVersion();
	}
	
	/**
	 * 获得操作系统的架构
	 * @return
	 */
	public static final String getOsArch() {
		return osMXBean.getArch();
	}
	
	/**
	 * 获得操作系统最近一分钟内的负载值,如果小于0，则表示不支持负载均衡检测
	 * @return
	 */
	public static final double getOsLoadAverage() {
		return osMXBean.getSystemLoadAverage();
	}
	
	/**
	 * 返回 Java 虚拟机可以使用的处理器数目
	 * @return
	 */
	public static final int getAvailableProcessors() {
		return osMXBean.getAvailableProcessors();
	}
	
	public static final String getOsInfo(String separator) {
		StringBuilder info = new StringBuilder();
		info.append("操作系统名字:").append(getOsName()).append(separator);
		info.append("操作系统版本:").append(getOsVersion()).append(separator);
		info.append("操作系统架构:").append(getOsArch()).append(separator);
		info.append("操作系统负载:").append(getOsLoadAverage()).append(separator);
		info.append("可用处理器数量:").append(getAvailableProcessors()).append(separator);
		return info.toString();
	}
	
	public static final String getOsHtmlInfo() {
		return getOsInfo("<br/>");
	}
	
	public static void main(String[] args) {
		System.out.println(getOsInfo("\n"));
	}
	
}
