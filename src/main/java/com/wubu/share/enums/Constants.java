/**
* @Title: Constants.java
* @Package com.uubee.consumer.utils.common
* @Description: TODO(用一句话描述该文件做什么)
* @author xiangf@uubee.com
* @date 2016年10月21日
* @version V1.0
*/
package com.wubu.share.enums;

/**
* @ClassName: Constants
* @Description: 常量包
* @author xiangf@uubee.com
* @date 2016年10月21日
*
*/
public interface Constants {
	
	/**
	 * 接口参数解密之后，放到request的中的key
	 */
	final String REQUEST_JSON = "request_json";
	/**
	 * 项目访问路径
	 */
	final String PROJECT_URL = "url_project";
	/**
	 * 缓存的键名
	 */
	final String CACHE_KEY_NAME = "key";
	/**
	 * 配置在配置文件中的项目名
	 */
	final String PRO_NAME = "proName";

	/**
	 * 流程配置参数名，关联uubee.property里面的参数名
	 */
	final String FLOW_CONFIG = "flow_config";
	
	/**
	 * 流程配置文件后缀
	 */
	final String FLOW_CONFIG_SUFFIX = ".json";
	
	/**
	 * 流程配置文件后缀
	 */
	final String FLOW_CONFIG_PREFIX = "WEB-INF/classes/com/uubee/consumer/flow/";
			
	
	final String CODE_SUCCESS = "000000";//成功返回码
	
	final String CODE_SUCCESS4 = "0000";//成功返回码
	
	/**
	 * 
	* @ClassName: CreditStatus
	* @Description: 未授信
	* @author xiangf@uubee.com
	* @date 2016年12月7日
	*
	 */
	public interface CreditStatus {
		/**
		 * 当前产品已授信
		 */
		final String Credit = "CREDIT";
		/**
		 * 当前商户下其他产品授信
		 */
		final String OtherCredit = "OTHERCREDIT";
		/**
		 * 未授信
		 */
		final String NoCredit = "NOCREDIT";
		
	}
	
	public interface NotifyMessageResult {
		/**
		 * 成功
		 */
		final String SUCCESS = "SUCCESS";
		/**
		 * 处理中
		 */
		final String PROCESSING = "PROCESSING";
		/**
		 * 失败
		 */
		final String FAILURE = "FAILURE";
		
	}
	
	/**
	* @ClassName: Transcode
	* @Description: 交易代码，返回说明
	* @author xiangf@uubee.com
	* @date 2016年11月15日
	*
	 */
	public interface TranscodeReturnType {
		/**
		 * h5页面返回
		 */
		final String H5_PAGE = "h5_page";
		/**
		 * web页面返回
		 */
		final String WEB_PAGE = "web_page";
		/**
		 * json数据返回
		 */
		final String JSON = "json";
		
	}
	
	/**
	 * 
	* @ClassName: TDEventId
	* @Description: 同盾事件id
	* @author xiangf@uubee.com
	* @date 2016年11月6日
	*
	 */
	public interface TDEventId {
		/**
		 * 注册
		 */
		String REGISTER = "register";
	}
	
	
	
	/**
	 * 
	* @ClassName: Chnl
	* @Description: 通道常量
	* @author xiangf@uubee.com
	* @date 2016年10月31日
	*
	 */
	public interface Chnl {
		/**
		 * H5通道
		 */
		final String H5 = "h5";
		/**
		 * WEB通道
		 */
		final String WEB = "web";
		
	}
	
	/**
	 * 
	* @ClassName: FaceResult
	* @Description: 超级实名人脸认证结果常量
	* @author xiangf@uubee.com
	* @date 2016年10月28日
	*
	 */
	public interface FaceResult {
		/**
		 * 人脸通过
		 */
		final String SUCCESS = "T";
		/**
		 * 人脸不通过
		 */
		final String FAIL = "F";
		/**
		 * 审核
		 */
		final String AUDIT = "C";
	}
	
	/**
	 * 
	* @ClassName: MessageKey
	* @Description: 短信模版在uubee.property配置文件中的key
	* @author xiangf@uubee.com
	* @date 2016年11月12日
	*
	 */
	public interface MessageKey {
		
		/**
		 * 激活审核失败短信模版
		 */
		final String CREDIT_AUDIT_FAIL = "sms.credit.audit.fail";
		/**
		 * 授信审核成功
		 */
		final String CREDIT_AUDIT_SUCC = "sms.credit.audit.succ";
		/**
		 * 支付审核失败短信模版
		 */
		final String PAY_AUDIT_FAIL = "sms.pay.audit.fail";
		/**
		 * 支付审核成功短信
		 */
		final String PAY_AUDIT_SUCC = "sms.pay.audit.succ";
		
	}
	
	/**
	 * 
	* @ClassName: ReqAction
	* @Description: 请求来源
	* @author xiangf@uubee.com
	* @date 2016年10月28日
	*
	 */
	public interface ReqAction {
		/**
		 * 授信
		 */
		final String CREDIT = "credit";
		/**
		 * 支付
		 */
		final String PAY = "pay";
	}
	
	/**
	 * 
	* @ClassName: FaceInfoOrder
	* @Description:人脸透传字段数据索引
	* @author xiangf@uubee.com
	* @date 2016年10月28日
	*
	 */
	public interface FaceInfoOrder {
		/**
		 * 外部商户号
		 */
		final Integer EXTER_PARTNER = 0;
		/**
		 * 请求动作
		 */
		final Integer REQ_ACTION = 1;
		/**
		 * 判断是web还是h5
		 */
		final Integer CLIENT_TYPE = 2;
		/**
		 * 订单id
		 */
		final Integer ORDER_ID = 3;
		/**
		 * 有贝订单编号
		 */
		final Integer OID_ORDERNO = 4;
		
	}
	
	/**
	 * 证件类型
	 * 
	 * @author Maple
	 *
	 */
	public interface IdType {
		// 身份证
		final String ID_CARD = "0";
	}

	/**
	 * 是否实名
	 * 
	 * @author Maple
	 *
	 */
	public interface FlagReal {
		// 已实名
		final String YES = "1";
		final String NO = "0";
	}

	/**
	 * 工作状态
	 * 
	 * @author Maple
	 *
	 */
	public interface WorkStatus {
		// 未毕业
		final String STUDY = "2";
		// 已毕业，无工作
		final String NO_WORK = "3";
		// 有工作
		final String WORKING = "1";
	}

	/**
	 * 联系人关系
	 * 
	 * @author Maple
	 *
	 */
	public interface Relationship {
		// 父母
		final String PARENT = "0";
		// 配偶
		final String SPOUSE = "1";
		// 亲戚
		final String RELATIVE = "2";
		// 朋友
		final String FRIEND = "3";
	}


	/**
	 * 额度变化类型
	 * 
	 * @author Maple
	 *
	 */
	public interface UserLimitChangeType {
		final String UPDATE = "1";
		final String ADD = "2";
		final String FREEZE = "3";
		final String UNFREEZE = "4";
	}

	/**
	 * 额度类型
	 * 
	 * @author Maple
	 *
	 */
	public interface TypeLimit {
		final String PERM = "1";
		final String TEMP = "2";
		final String FREEZE = "3";
	}

	/**
	 * 风控数据来源
	 * 
	 * @author Maple
	 *
	 */
	public interface RiskResource {
		// API渠道
		final String API = "15";
	}

	/**
	 * 风控数据采集参数类型
	 * 
	 * @author Maple
	 *
	 */
	public interface RiskParamType {
		// 通讯录
		final String CONTACT = "1002";
		// 通话记录
		final String CALL = "1003";
		// 短信
		final String MESSAGE = "1004";
		// 学历
		final String EDU = "1005";
		// 工作
		final String WORK = "1006";
		// 居住
		final String LIVE = "1007";
	}

	/**
	 * 风控系统学历信息毕业状态
	 * 
	 * @author Maple
	 *
	 */
	public interface RiskEduStatus {
		// 未毕业
		final String STUDY = "2";
		// 已毕业，无工作
		final String NO_WORK = "3";
		// 有工作
		final String WORKING = "1";
	}

	/**
	 * 
	 * 
	 * @ClassName: ProBigType
	 * 
	 * @Description: 产品大类
	 * 
	 * @author: yuanqf
	 * 
	 * @date: 2016年8月26日 下午2:12:43
	 * 
	 *        version V1.0
	 */

	public interface ProBigType {
		// 消费贷大类
		final String CONSUMER_LOAN = "100000";
		// 现金贷大类
		final String CASH_LOAN = "200000";
		// 程程白条大类
		final String TONHCHENG_CONSUMER = "300001";
		// 去哪儿大类
		final String QUNAER_CONSUMER = "300002";
		// 一嗨大类
		final String YIHAI_CONSUMER = "300003";
	}

	public interface SupportLoanBusinessCode {
		final String SUPPORT_LOAN = "0";
		final String NOSUPPORT_LOAN = "1";
	}

	/**
	 * 手续费是否砍头
	 */
	public interface FeeType {
		// 砍头
		final String NET_FEE = "1";
		// 不砍头
		final String NOTT_FEE = "2";
	}

	/**
	 * 提现状态
	 */
	public interface WithdrawStatus {
		// 提现成功
		final String SUCC = "0";
	}

	/**
	 * 还清标识
	 */
	public interface PayOffFlag {
		// 已还清
		final String YES = "0";
		// 未还清
		final String NO = "1";
	}

	/**
	 * 反欺诈结果
	 */
	public interface RiskResult {
		//
		final String Accept = "0";
		final String Reject = "1";
	}


	interface AuthSrc {
		String UUBEE = "0";
		String OTHERS = "1";
	}

    /**
     * 风控事件对象
     */
    public interface EventType {
    	/**
    	 * 风控-授信事件
    	 */
    	final String RISK_CREDIT = "credit";
    	/**
    	 * 风控-借贷事件
    	 */
    	final String RISK_LOAN = "loan";
    	/**
    	 * 风控-登录事件
    	 */
    	final String RISK_LOGIN = "login";
    	/**
    	 * 风控根节点
    	 */
    	final String RISK = "risk";
    }
    
    
    /**
     * 反欺诈+授信决策结果
     * @author Maple
     *
     */
    public interface RiskCreditAndAntiFraudResult {
    	/**
    	 * 通过审核
    	 */
    	final String PASS = "1";
    	/**
    	 * 拒绝
    	 */
    	final String REJECT = "2";
    	/**
    	 * 审核
    	 */
    	final String AUDITING = "5";
    	
    }
    
    /**
     * 
    * @ClassName: UserInfoStatus
    * @Description: 用户信息补充状态
    * @author xiangf@uubee.com
    * @date 2016年9月27日
    *
     */
    public interface UserInfoStatus{
    	/**
    	 * 联系人填充中
    	 */
    	final String CONTACT = "contact_fill";
    	/**
    	 * 教育信息填充中
    	 */
    	final String EDUCATION = "education_fill";
    	/**
    	 * 工作信息填充中
    	 */
    	final String WORKING = "work_fill";
    	/**
    	 * 信息补充完成
    	 */
    	final String COMPLETE = "complete_file";
    }
    
}
