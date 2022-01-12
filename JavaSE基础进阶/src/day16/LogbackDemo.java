package day16;

import ch.qos.logback.core.joran.action.NewRuleAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
    //声明打印日志对象
    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        LOGGER.debug("程序开始运行");

        int sum =0;
        for (int i = 0; i < 10; i++) {
            LOGGER.debug("第"+i+"次循环");
            sum+=i;
        }
        LOGGER.debug("1-10的和为:"+sum);
        LOGGER.debug("程序运行结束");
    }
   /* //声明打印日志对象
    private static final  Logger LOGGER=LoggerFactory.getLogger(LogbackDemo.class);
    //
    public static void main(String[] args) {
        LOGGER.debug("程序开始运行");
        int sum =0;
        for (int i = 1; i <= 10; i++) {
            LOGGER.debug("第"+i+"次循环");
            sum+=i;
        }
        LOGGER.debug("1-10的和为"+sum);
        LOGGER.debug("程序运行结束");
    }*/
}
