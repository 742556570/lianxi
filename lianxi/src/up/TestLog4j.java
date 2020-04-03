package up;

import org.apache.log4j.Logger;
public class TestLog4j {
	   private static Logger logger=Logger.getLogger(TestLog4j.class);
	public static void main(String[] args)  {
		  logger.error("我是一个error信息1");
	        logger.error("我是一个error信息2");
	        logger.error("我是一个error信息3");
	        logger.info("我是一个info信息1");
	        logger.info("我是一个info信息2");
	        logger.info("我是一个info信息3");
	        logger.debug("我是一个debug信息1");
	        logger.debug("我是一个debug信息2");
	        logger.debug("我是一个debug信息3");
		
		
	}	
}
