package com.wubu.share.util;

/**
 * <p>
 * Title: Units
 * </p>
 * <p>
 * Description: 常量定义
 * </p>
 * <p>
 * Company: http://www.uubee.com/
 * </p>
 * 
 * @author liuzhy@uubee.com
 * @date 2015-9-10 下午5:20:03
 */
public interface Globals {

	String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"; // xml头
	String CONTENT_TYPE_JSON_UTF8 = "application/json; charset=UTF-8";
	// 通讯相关配置参数
	String ACTIVEMQ_MESSAGE_MACHINE_ID = "machineid";

	/*********************** 交易返回码 **************************/
	String TRANS_SUCCESS_RETCODE = "000000"; // 交易链路成功返回代码
	String TRANS_SUCCESS_RETMSG = "交易成功";
	String TRANS_FAIL_RETCODE = "999999"; // 交易链路成功返回代码
	String TRANS_FAIL_RETMSG = "交易失败";

	/**
	 * 手机、邮件验证码不匹配:111004
	 */
	String MOB_EML_CHKVALID_WARING = "111004"; // 手机、邮件验证码不匹配
	/**
	 * 手机、邮件验证码已失效:111005
	 */
	String MOB_EML_CHKVALID_ABATE = "111005"; // 手机、邮件验证码已失效
	/**
	 * 手机、邮件验证次数超限:111038
	 */
	String MOB_EML_CHLVALID_OUTTMS = "111038";
	/**
	 * 用户注册登录状态：正常
	 */
	String USER_STATUS_NORMAL = "0";
	/**
	 * 用户注册登录状态：未授信，身份信息不存在
	 */
	String USER_STATUS_NOCREDIT = "1";
	/**
	 * 用户注册登录状态：未授信，身份信息已存在
	 */
	String USER_STATUS_NOCREDIT2 = "2";

	/**
	 * 订单分期
	 */
	String AGING_ORDER_TYPE = "1";
	/**
	 * 账单分期
	 */
	String AGING_BILL_TYPE = "2";

	/**
	 * mcc码
	 */
	String MCC = "8888";

	/**
	 * 交易码
	 */
	interface transCode {
		String LOGIN = "7008";// 注册登录
		String FEE = "7114";// 费率查询
		String BANKCARD_QUERY = "7115";// 银行卡信息查询
		String USERINFO_QUERY = "7120";// 资料查询交易码
		String BIG_LIMIT_QUERY = "7116";// 大类额度查询
		String PROGRESS_QUERY = "7117";// 提现进度查询
		String SMALL_LIMIT_QUERY = "7121";// 小类额度查询
		String AUTH = "7211";// 身份认证
		String BROAD_CAST = "7010";// app广播
		String ADD_USERINFO = "7214";// 新增用户资料
		String USERINFO_STATUS_QUERY = "7119";// 用户资料状态查询
		String WITHDRAWSTREAM_QUERY = "7118";// 当前提现流水查询
		String PETTY_WITHDRAWREQUEST = "7212";// 小额提现申请
		String WITHDRAW_REPAY = "7213";// 提现还款
		String LOAN_CREDIT = "7215";// 现金贷授信申请
		String GLOBAL_CONFIG_QUERY = "7122";// 全局配置查询
		String APP_BANNER = "7009";// banner首页
		String CONFIG_QUERY = "7123";// 用户配置查询
		String CONFIG_UPDATE = "7216"; // 用户配置更新
		String BLACKLIST_QUERY = "7124"; // 黑名单查询
		String WITHDRAWLIST_QUERY = "7125"; // 提现记录查询
		String ORDERLIST_QUERY = "7127";// 订单列表查询
		String PRE_REPAY_CALC = "7220";// 提前还款试算
		String CONSUMER_REPAY = "7302";// 消费还款
		String REPAYLIST_QUERY = "7128"; // 还款计划查询
		String WITHDRAWDETAIL_QUERY = "7129"; // 提现订单详情查询
		String ORDERDETAIL_QUERY = "7130"; // 消费订单详情查询
		String CRAWL_AUTH = "7301";// 抓爬授权
		String USERSTATUS_UPDATE = "7219";// 用户状态更新

		String CASHGIFT_QUERY = "7221";// 红包查询
		String APPHOME_ACTIVITY = "7011";// 首页活动
		String USER_FEE = "7132";// 用户费率查询
	}

	/**
	 * 产品编号
	 */
	interface ProCode {
		String CONSUME = "100000";
		String LOAN_CASH = "200000";
		String LOAN_RAPID = "200001";
		String LOAN_EMERGENCY = "200002";
	}

	/**
	 * 资料类型
	 */
	interface meterialType {
		String TYPE_CONTACT = "1";// 联系人类型
		String TYPE_EDU = "2";// 学历类型
		String TYPE_WORK = "3";// 工作类型
	}

	/**
	 * 资料修改状态
	 */
	interface meterialModifyStatus {
		String MODIFY = "0";// 可以修改
		String NOT_MODIFY = "1";// 不能修改
	}

	/**
	 * 
	 * 
	 * @ClassName: userMeterialStatus
	 * 
	 * @Description: 用户状态
	 * 
	 * @author: yqf
	 * 
	 * @date: 2016-9-27 下午7:44:49
	 */
	interface userMeterialStatus {
		String NO_SUBMIT = "0";// 未提交
		String IN_HAND = "1";// 处理中
		String AUDIT_PASS = "2";// 审核通过
		String AUDIT_NOT_PASS = "3";// 审核未通过
		String FORBID = "4";// 禁止

	}

	/**
	 * 
	 * 
	 * @Description: 芝麻分状态
	 * 
	 * @author: yqf
	 * 
	 * @date: 2016-9-27 下午7:41:54
	 */
	interface userZhimaScoreStatus {
		String CREATE = "0";// 创建
		String AUTHORIZATIONED = "1";// 已授权
		String AUTHORIZATION_CANCEL = "2";// 授权被取消
	}

	/**
	 * 风控事件ID
	 */
	interface eventID {
		String CREDIT = "register";
		String LOAN = "loan_A";
	}

	/**
	 * 证件类型
	 */
	interface IDType {
		String ID_CARD = "0";
	}

	/**
	 * 费率类型
	 */
	interface FeeType {
		/* 砍头 */
		String PRE_DEDUCTION = "1";
		/* 不砍头 */
		String POST_DEDUCTION = "2";
	}

	/**
	 * 还清标识
	 */
	interface PayOffFlag {
		// 已还清
		String YES = "0";
		// 未还清
		String NO = "1";
	}

	/**
	 * 产品大类
	 * 
	 * @author Maple
	 * 
	 */
	public interface BigProType {
		// 现金贷
		final String CASH_LOAN = "200000";
	}

	/**
	 * 提现记录查询类型
	 */
	interface WithdrawQueryType {
		String ALL = "0";
		String REPAID = "1";
		String UN_REPAID = "2";
	}

	/**
	 * 还款类型标识
	 */
	interface RepayType {
		String ALL = "0";
		String PART = "1";
		String REMAIN = "2";
	}

	/**
	 * 红包类型标识
	 */
	interface CashgiftType {
		/**
		 * 通用红包
		 */
		String COMMON = "1";
		/**
		 * 借款红包
		 */
		String LOAN = "2";
		/**
		 * 还款红包
		 */
		String REPAY = "3";
	}

	/**
	 * 登录返回是否有可用红包
	 */
	interface LoginCashgiftStatus {
		/**
		 * 无可用红包
		 */
		String NONE = "0";
		/**
		 * 有可用红包
		 */
		String EXIST = "1";
	}

	interface CashGiftDBStatus {
		/**
		 * 已领用
		 */
		String GAINED = "1";
		/**
		 * 已消费
		 */
		String CONSUMERED = "2";
		/**
		 * 已冻结
		 */
		String FREEZED = "3";
	}

	interface CashGiftAppStatus {
		/**
		 * 未使用
		 */
		String NO_USED = "0";
		/**
		 * 已过期
		 */
		String BE_OVERDUE = "1";
		/**
		 * 已使用
		 */
		String HAVE_USED = "2";
		/**
		 * 已冻结
		 */
		String FREEZED = "3";
	}

	interface ConsumerRepayStatus {
		// 已还款
		String YES_REPAY = "0";
		// 未还清
		String NO_REPAY = "1";
		// 已退款
		String REFUND = "2";
	}

	/**
	 * 实名认证结果
	 */
	interface AuthResult {
		// 认证通过
		final String AUTH_PASS = "T";
		// 认证拒绝
		final String AUTH_REJECT = "F";
		// 无法认证
		final String AUTH_NO = "N";
		// 需要人审
		final String AUTH_AUDIT = "C";
	}

	/**
	 * 提现流水表risk_result字段结果
	 */
	interface RiskResult {
		// 风控通过
		final String RISK_PASS = "0";
		// 风控拒绝
		final String RISK_REJECT = "1";
		// 进人审
		final String RISK_AUDIT = "2";
	}

	/**
	 * 实名认证状态
	 */
	interface AuthStatus {
		// 状态正常
		final String STATUS_SUCC = "0";
		// 状态异常
		final String STATUS_FAIL = "1";
	}

	/**
	 * 
	 * 
	 * @ClassName: ProtocalType
	 * 
	 * @Description: 协议类型
	 * 
	 * @author: yqf
	 * 
	 * @date: 2017-1-5 上午10:30:07
	 */
	interface ProtocalType {
		// 借款协议
		final String LOAN_PROTOCAL = "A000001";
		// 服务协议
		final String SERVER_PROTOCAL = "A000005";
		// 代扣协议
		final String DAIKOU_PROTOCAL = "A000006";
		// 委托协议
		final String WEITUO_PROTOCAL = "A000007";
	}

	interface PreRepayFlag {
		// 提前还款
		final String PREREPAY = "1";
		// 非提前还款
		final String NOPREREPAY = "2";
	}

	interface CashGiftConsumerFlag {
		// 没有消费记录
		final String NO_CONSUMER_RECORD = "0";
		// 有消费记录
		final String CONSUMER_RECORD = "1";
	}

	interface CashGiftDeductibleType {
		// 抵息费
		final String DEDUCTIBLE_INTEREST_FEE = "0";
		// 抵息
		final String DEDUCTIBLE_INTEREST = "1";
		// 抵费
		final String DEDUCTIBLE_FEE = "2";

		// 全免
		final String FREE_SINGLE = "3";
	}

	interface SourceChnl {
		String H5DIVERSION = "04";
	}
}
