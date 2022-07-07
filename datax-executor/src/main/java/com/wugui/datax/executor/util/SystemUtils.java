package com.wugui.datax.executor.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * @author maokeluo
 * @description 多隆镇楼，bug退散🙏🙏🙏
 * 系统工具
 * @date 2020/1/7
 */
public class SystemUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(SystemUtils.class);

    private static String ADDAX_HOME;

    private SystemUtils() {
    }

    /**
     * 获取环境变量中的Datax路径
     *
     * @return
     */
    public static String getDataXHomePath() {
        if (StringUtils.isNotEmpty(ADDAX_HOME)) return ADDAX_HOME;
        String dataXHome = System.getenv("ADDAX_HOME");
        if (StringUtils.isBlank(dataXHome)) {
            //LOGGER.warn("DATAX_HOME 环境变量为NULL");
            return null;
        }
        ADDAX_HOME = dataXHome.endsWith(File.separator) ? dataXHome : dataXHome.concat(File.separator);
        //LOGGER.info("DATAX_HOME:{}", DATAX_HOME);
        return ADDAX_HOME;
    }
}
