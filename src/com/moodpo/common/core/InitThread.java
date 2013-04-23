package com.moodpo.common.core;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * 系统初始化类
 * @author xiaoxie
 * @date 2013-4-23 下午04:46:14
 * @email yangxiaoxiehaha@gmail.com
 * @version 1.1
 */
public class InitThread extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {

		String path = System.getProperty("webapp.root")
				+ "WEB-INF/classes/config/config.properties";

		SysConfig.initConfig(path);

	}

}
