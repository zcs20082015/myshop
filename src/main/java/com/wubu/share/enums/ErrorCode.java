package com.wubu.share.enums;

/**
 * Title: ErrorCode <br>
 * Description: 消费金融产品错误返回码说明<br>
 * Company: http://www.uubee.com/
 * @author liuzhy@uubee.com
 * @date 2016年8月19日 下午3:43:22
 */
public enum ErrorCode {

	/********************************公共基础返回码（CODE以SYS开头，9000-9999，交易成功除外）**********************************/
	SUCCESS("0000", "交易成功"),
	SYS_SIGN_OR_DECRYPT_ERROR("9000", "系统异常，请联系客服处理。"),
	SYS_CHECK_PARAM_ERROR("9001", "系统传输数据错误，请重新填写。"),
	SYS_CHECK_TRADER_PARAM_ERROR("9002", "系统异常，请联系客服处理。"),
	SYS_SESSION_TIMEOUT("9003", "支付超时，请重新发起支付。"),
	SYS_REQUEST_METHOD_ERROR("9004", "系统异常，请联系客服处理。"),
	SYS_DATA_FORMAT_ERROR("9005", "系统异常，请联系客服处理。"),
	SYS_REPEAT_SUBMIT("9006", "您的请求重复提交或过于频繁，请稍后再试。"),
	SYS_OVERLOAD("9007", "系统繁忙，请稍后再试。"),
	SYS_MQSEND_FAIL("9008", "MQ消息发送异常"),
	SYS_FAIL("9999", "当前系统错误，请联系客服处理。"),
	
	
	SYS_CHECK_REQUEST_ERROR("9007", "系统异常，请联系客服处理。"),
	SYS_BUILD_API_RES("9008", "系统异常，请联系客服处理。"),
	SYS_CACHE_TIMEOUT("9009", "系统缓存异常，请稍后再试。"),
	SYS_AUDIT_NOPASS("9010", "有贝分期目前只开放部分用户使用，暂时无法为您提供服务，我们将努力扩大服务范围期待与您再次相逢。"),
	SYS_TRANSCODE_VALIDATE_FAIL("9011", "系统传输数据错误，请联系客服处理。"),
	SYS_PASSWORD_DEAL_FAIL("9012", "系统异常，请联系客服处理。"),
	/**************交易信息校验类返回码（701000-701999，VALIDATE开头）********************/
	VALIDATE_PARAM_ERROR("7010", "您填写的信息有误，请重新填写"),							//您填写的信息有误
	VALIDATE_MSGCODE_FAIL("7011", "请输入正确的验证码"),											//短信验证码错误
	VALIDATE_TOKEN_FAIL("7012", "登录信息已失效，请重新登录"),								//登录信息已失效，请重新登录
	VALIDATE_NOID_FAIL("7013", "该身份证号已绑定手机号{0}，请联系400-9936-111修改"),	 
	/**************交易消息类返回码（702000-702999，MSG开头）********************/
	MSG_SMSSEND_FAIL("7020", "短信发送失败"),												//短信发送失败
	MSG_ADDFEEDBACK_FAIL("7021", "意见反馈提交失败"),										//意见反馈提交失败
	MSG_VERSIONQRY_FAIL("7022", "检查版本更新失败"),										//检查版本更新失败
	MSG_PUSHRECORDQRY_FAIL("7023", "个人消息查询失败"),									//个人消息查询失败
	MSG_NO_NEWVERSION("7024", "当前已是最新版本"),	
	
	
	/********************************商户信息返回码（CODE以TRADER开头，1001-19999）**********************************/
	TRADER_INVALID("1001", "商户代码错误，请联系客服处理。"),
	TRADER_IP_INVALID("1002", "商户IP未鉴权，请联系客服处理。"),
	TRADER_USERID_NOTMATCH_MOBILE("1003", "当前手机号和帐号不一致，请确认是否更换过手机号并联系客服处理。"),
	TRADER_AGING_PRO_NOTEXIST("1004", "未查询到分期配置，请联系客服处理。"),
	TRADER_PARA_NOTEXIST("1005", "控制参数查询失败，请联系客服处理。"),
	TRADER_USER_BIND_QUERY_FAIL("1006", "系统查询失败，请联系客服处理。"),
	TRADER_USER_BIND_MOB_ERROR("1007", "该手机号已被手机尾号{0}绑定，请确认是否更换过手机号并联系客服处理。"),
	TRADER_SIGN_FAIL("1008", "商户签名校验失败"),
	
	/********************************用户信息返回码（CODE以USER开头，2001-29999）**********************************/
	USER_REGISTER_FAIL("2001", "注册失败，请重新发起申请。"),
	USER_ACTIVE_FAIL("2002", "激活失败，请重新发起申请。"),
	USER_NOT_EXIST("2003", "用户信息不存在，请联系商户进行信息注册。"),
	USER_INFO_QUERY_FAIL("2004", "用户信息查询失败，请稍后再试。"),
	USER_PASSWORD_ERROR("2005", "登陆密码错误，请重新输入。"),
	USER_VERIFYCODE_ERROR("2006", "验证码错误，请重新输入。"),
	USER_RISK_HIT("2007", "有贝分期目前只开放部分用户使用，暂时无法为您提供服务，我们将努力扩大服务范围期待与您再次相逢。"),
	USER_RISK_FAIL("2008", "风控校验失败。"),
	USER_RISK_CHECK("2009", "您的申请正在审核中，我们将尽快将审核结果通知到您。"),
	USER_BANKBIND_NO("2010", "您未绑定银行卡，请绑卡后重试。"),
	USER_BANKBIND_QUERY_FAIL("2011", "未查到绑定银行卡，您可以绑定新卡或稍后再试。"),
	USER_LIMIT_BALA_LACK("2012", "您的可用额度不足，您暂时无法使用有贝分期。"),
	USER_ACCT_BALA_LACK("2013", "您的有贝账户余额不足，您暂时无法使用有贝分期。"),
	USER_ORDERLIST_QUERY_FAIL("2014","用户订单详情信息查询失败，请稍后再试。"),							//用户订单详情查询失败
	USER_ORDER_QUERY_FAIL("2015","用户订单总记录查询失败，请稍后再试。"),								//用户订单总记录查询失败
	USER_AUTOREPAY_SET_FAIL("2016","自动还款功能开通失败，请在“有贝”微信公众号内重新开通。"),
	USER_STAT_EXCE("2017","用户状态异常，禁止登陆。"),
	USER_INFO_UPDATE_FAIL("2018","用户信息更新失败。"),
	USER_RHINFO_NONE("2019","用户租房信息不存在。"),
	USER_FILEINFO_NONE("2020","用户文件信息不存在。"),
	USER_CASHGIFT_NONE("2021","您来晚一步，红包已被抢完了。"),
	USER_WORK_QUERY_FAIL("2022", "工作信息查询异常"),
	USER_WORK_SAVE_FAIL("2023", "工作信息保存异常"),
	USER_EDU_QUERY_FAIL("2024", "教育信息查询异常"),
	USER_EDU_SAVE_FAIL("2025", "教育信息保存异常"),	
	USER_CONTACT_QUERY_FAIL("2026", "联系人信息查询异常"),
	USER_LIVE_SAVE_FAIL("2027", "居住信息保存异常"),	
	USER_LIVE_QUERY_FAIL("2028", "居住信息查询异常"),
	USER_CONTACT_SAVE_FAIL("2029", "联系人信息保存异常"),
	USER_ID_HAS_BEEN("2030", "用户号已被占用，请重新输入或者直接登陆"),
	USER_MOB_HAS_BEEN("2031", "手机号已被占用，请重新输入或者直接登陆"),
	/********************************支付信息返回码（CODE以PAY开头，3001-39999）**********************************/
	PAY_BILL_QUERY_FAIL("3001", "订单信息查询失败。请重试。"),
	PAY_AGING_QUERY_FAIL("3002", "订单信息查询失败，请稍后再试。"),
	PAY_ORDER_QUERY_FAIL("3003", "订单信息查询失败。"),
	PAY_BILL_CREATE_FAIL("3004", "支付异常，请重新支付。"),
	PAY_AGING_INFO_NOTMATCH("3005", "您多次发起的分期信息不一致，请以第一次为准，或重新下单并分期。"),
	PAY_HAS_SUCCESS("3006", "您已支付成功，无需再次支付"),
	PAY_AMT_LIMIT("3007", "当前交易金额超过您的可用额度。"),
	PAY_AMT_MIN_LIMIT("3008", "您的订单金额未达到分期最低金额，请选择适合的商品进行分期。"),
	PAY_AMT_ERROR("3009", "您的交易金额和订单金额不匹配，请核对后再试。"),
	PAY_FAIL("3010", "支付处理失败，请联系客服。"),
	PAY_BANKCARDPAY_FAIL("3011", "银行卡扣款失败-"),
	PAY_PROCESS("3012", "交易正在处理中，请勿重复提交。"),
	PAY_HAS_REPAY("3013", "该笔订单已还款，请勿重复还款。"),
	PAY_REPAY_FAIL("3014", "还款处理失败，请联系客服处理。"),
	PAY_REPAY_PROCESS("3015", "还款处理中，请勿重复提交。"),
	PAY_USE_LIMIT_FAIL("3016", "支付处理中，请勿重复提交"),
	PAY_ORDERREPAY_STATUS_ERROR("3017", "还款订单状态异常，请稍后再试。"),							//订单状态异常
	
	/********************************费率信息返回码（CODE以FEE开头，3501-3599）**********************************/
	FEE_NOT_FOUND("3501", "未找到费率。"),
	FEE_AMT_NOT_MATCH("3502", "前后端金额、费率校验异常。"),
	FEE_PARSE_FAIL("3503", "费率信息转换异常"),

	/********************************提现信息返回码（CODE以WITHDRAW开头，3601-3699）**********************************/
	WITHDRAW_RECORD_QUERY_ERROR("3601", "提现查询异常。"),
	WITHDRAW_RUNNINT_EXIST("3602", "存在正在进行中。"),
	WITHDRAW_REJECTED_LIMIT("3603","超出今日申请上限，请明天再试!"),
	
	/********************************其他类型返回码（CODE自定义，8001-89999）**********************************/
	ZHIMA_AUTH_FAIL("8001", "芝麻分授权失败，请重新授权！如果您没有开通芝麻分，可以下载支付宝APP，在支付宝＞我的＞芝麻信用＞芝麻分内开通即可。"),
	ZHIMA_QUERY_FAIL("8002", "芝麻分查询失败，请稍后重试。"),
	PHOTO_UPLOAD_FAIL("8003", "图片上传失败，请重新上传！"),
	CARD_HAS_BIND("8004", "银行卡已签约，无需再次签约。"),
	CARD_BIND_APPLY_FAIL("8005", "绑卡失败，请确认姓名、身份证号、银行卡号及银行预留手机号，是否和银行卡开户信息一致。"),
	CARD_BIND_VERIFY_FAIL("8006", "绑卡失败，请确认验证码是否正确并重试。"),
	CARD_NOT_SUPPORT("8007", "此银行卡暂不支持该业务，请换卡重试。"),
	CARD_CVV2_OR_VALIDATE_ERROR("8008", "请核对并输入正确的有效期和安全码。"),
	OCR_BEHIND_FAIL("8009", "身份证反面照识别失败，请重试。"),
	OCR_FRONT_FAIL("8010", "身份证正面照识别失败，请重试。"),
	OCR_NOTMATCH_NAME("8011", "姓名和上传证件不匹配，请重新上传。"),
	OCR_NOTMATCH_IDNO("8012", "身份证号码和上传证件不匹配，请重新上传。"),
	MSG_VERIFY_FAIL("8013", "验证码验证失败，请重新输入验证码。"),
	MSG_SEND_FAIL("8014", "验证码发送失败，请重新获取验证码。"),
	AGING_CACUL_FAIL("8015", "还款计划试算失败。"),
	AGING_QUERY_FAIL("8016","分期记录查询失败，请稍后重试。"),
	AGING_TRANS_FAIL("8017","分期记录转换异常，请稍后重试并联系客服处理。"),
	CARD_APPLY_NO_ERROR("8018","银行卡号输入有误，请重新输入。"),
	CARD_APPLY_MOB_ERROR("8019","银行预留手机号输入有误，请重新输入。"),
	HTTP_CLIENT_FAIL("8020","HTTP请求处理失败"),
	SHA_SIGN_FAIL("8021","SIGN签名生成失败"),
	TOKEN_ERROR("8022","token不存在"),
	IMG_DEAL_FALL("8023","图片上传出错，请您重拍"),//图片上传出错
	WX_IMAGE_DOWNFAIL("8024","图片上传出错，请您重拍"),//微信图片下载失败
	CARD_NOT_BIND("8026", "银行卡未签约。"),
	CARD_CVV2_ERROR("8027", "银行卡安全码错误。"),
	CARD_VALIDATE_ERROR("8028", "银行卡有效期错误。"),
	CARD_NOTEQUAL_NAME("8029", "请输入本人银行卡。"),
	CARD_SIGN_ING("8030","银行卡签约处理中"),
	/********************************超级实名错误类型返回码（CODE自定义，8101-8199）**********************************/
	FACE_SIGN_PARAM_NOT_FOUND("8101","系统异常，请稍后再试。"),
	FACE_MD5_PARAM_NOT_FOUND("8102","系统异常，请稍后再试。"),
	FACE_SIGN_VERIFY_FAIL("8103","系统异常，请稍后再试。"),
	FACE_SIGN_ERROR("8104","系统异常，请稍后再试。"),
	FACE_VALIDATE_FAIL("8105","有贝分期目前只开放部分用户使用，暂时无法为您提供服务，我们将努力扩大服务范围期待与您再次相逢。"),
	FACE_AUDIT_REJECT("8106","有贝分期目前只开放部分用户使用，暂时无法为您提供服务，我们将努力扩大服务范围期待与您再次相逢。"),
	
	/********************************订单错误类型返回码（CODE自定义，8201-8299）**********************************/
    ORDER_SAVE_FIAL("8201", "系统异常，请联系客服处理。"),//订单保存失败
    ORDER_DETAIL_QUERY_FAIL("8202", "系统异常，请联系客服处理。"),
	ORDER_UPDATE_FIAL("8203", "系统异常，请联系客服处理。"),
	ORDER_UPDATE_STATUS_FIAL("8204", "系统异常，请联系客服处理。"),
	ORDER_QUERY_FIAL("8205", "系统异常，请联系客服处理。"),
	ORDER_NOANDOID_NOTMATCH("8206", "外部单号和有贝订单号不匹配，请联系客服处理。"),//外部单号和有贝订单号不匹配
	ORDER_DTORDER_NOTMATCH("8207", "未查询到该笔订单，如有疑问，请联系客服处理。"),//订单时间不匹配
	ORDER_USERID_NOTMATCH("8208", "未查询到该笔订单，如有疑问，请联系客服处理。"),//订单下单人不匹配
	ORDER_QUERY_NONE("8209", "不存在该笔订单，如有疑问，请联系客服处理。"),//订单查询不存在
	ORDER_CANOT_CANCEL("8210", "该订单暂不支持取消，如有疑问，请联系客服处理。"),//该订单暂不支持取消
	ORDER_STATE_EXCE("8211", "该订单当前状态不支持支付操作，如有疑问，请联系客服处理。"),//该订单暂不支持确认

	/********************************活动错误类型返回码（CODE自定义，8301-8399）**********************************/
	ACTIVITY_OFFLINE("8301", "活动已下线"),
	ACTIVITY_USER_INVALIDATE("8302", "很抱歉，您无法参加该活动"),
	ACTIVITY_OUTOFCOUPON("8303", "优惠券已抢光"),
	ACTIVITY_NOT_STARTED("8304", "活动未开始，请耐心等待"),
	ACTIVITY_COUPON_REPEATE("8305", "您已抢到红包，不能重复抢购"),
	
    ;
    
    public final String code;
    public final String msg;
    public final String logmsg;

    ErrorCode(String code, String msg){
        this.code = code;
        this.msg = msg;
        this.logmsg = msg;
    }
    
    ErrorCode(String code, String msg, String logmsg){
        this.code = code;
        this.msg = msg;
        this.logmsg = logmsg;
    }
}
