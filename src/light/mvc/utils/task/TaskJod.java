package light.mvc.utils.task;

import light.mvc.utils.DateUtils;
import light.mvc.utils.HttpGetPost;
import light.mvc.utils.Logger;
import light.mvc.utils.PublicVariable;
import light.mvc.utils.StringUtil;

/**
 * Spring任务计划类
 * @author DongMeng
 * @date 2016-10-18
 */
public class TaskJod {
	private static Logger logger = Logger.getLog(TaskJod.class);
	
	/**
	 * 清理已经过期的商家活动
	 * 执行时间：凌晨1点
	 * @author DongMeng
	 * @date 2017-02-09
	 */
	public void clearOverbuePort(){
		logger.info("========="+DateUtils.getCurrentTime()+"开始清理'已经过期的商家活动'!");
		String sendUrl = PublicVariable.getValue("ClearDataService");
		if(StringUtil.isNotEmpty(sendUrl)){
			HttpGetPost.sendGet(sendUrl, "");
			logger.info("========="+DateUtils.getCurrentTime()+"清理'已经过期的商家活动'完毕!");
		} else {
			logger.warn("Error：请求接口不存在!");
		}
	}

}
