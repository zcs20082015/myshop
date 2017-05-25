package com.wubu.share.enums;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import com.alibaba.fastjson.JSONObject;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 * <p>Title: WebElementModel </p>
 * <p>Description: 读取xml配置文件工具类</p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author liuzhy@uubee.com
 * @date 2015-11-9 上午10:17:38
 */
public class WebElementModel {

	private static Logger log = Logger.getLogger(WebElementModel.class);
	private InputStream stream;
	private Element xmlRoot;
	@SuppressWarnings("rawtypes")
    private List groupWebElementList;
	@SuppressWarnings("rawtypes")
    private List webElementList = new ArrayList();

	private WebElementModel() throws Exception {
		SAXBuilder sb = new SAXBuilder();
		stream = this.getClass().getResourceAsStream("WebElement.xml");
		Document doc = sb.build(stream);
		xmlRoot = doc.getRootElement(); // 得到根元素
		groupWebElementList = xmlRoot.getChildren("enuName");
		stream.close();
	}

	private static WebElementModel instance = null;

	public static WebElementModel getInstance() {
		if (null == instance) {
			try {
				instance = new WebElementModel();
			} catch (Exception e) {
				log.error("读取xml配置文件工具类异常", e);
			}
		}
		return instance;
	}

	/**
	 * <p>Function: 根据objectName和enu_value获取对应的enu_name值</P>
	 * @author liuzhy@uubee.com
	 * @date 2015-11-9 上午10:42:16
	 * @param groupName
	 * @param enu_value
	 * @return
	 */
	@SuppressWarnings("rawtypes")
    public String getWebElementValue(String groupName, String enu_value) {
		for (int i = 0; i < groupWebElementList.size(); i++) {
			Element element = (Element) groupWebElementList.get(i);
			String objectName = element.getAttributeValue("objectName");
			if (null != objectName && objectName.equals(groupName)) {
				List childElementList = element.getChildren("webElement");
				for (int j = 0; j < childElementList.size(); j++) {
					Element childElement = (Element) childElementList.get(j);
					String value = childElement.getAttributeValue("enu_value");
					if (value.equals(enu_value))
						return childElement.getAttributeValue("enu_name");
				}
			}
		}
		return null;
	}
	
	/**
	 * Function: 根据objectName获取改组所有键值，并返回数组list<br>
	 * @author liuzhy@uubee.com
	 * @date 2015年12月22日 下午4:36:24
	 * @param groupName
	 * @return
	 */
	@SuppressWarnings({ "rawtypes"})
    public ArrayList<Enumerate> getWebElementEnuList(String groupName) {
		ArrayList<Enumerate> listOfGroup = new ArrayList<Enumerate>();
		Enumerate enumerate = new Enumerate();
		for (int i = 0; i < groupWebElementList.size(); i++) {
			Element element = (Element) groupWebElementList.get(i);
			String objectName = element.getAttributeValue("objectName");
			if (null != objectName && objectName.equals(groupName)) {
				List childElementList = element.getChildren("webElement");
				for (int j = 0; j < childElementList.size(); j++) {
					enumerate = new Enumerate();
					Element childElement = (Element) childElementList.get(j);
					enumerate.setEnumerate_value(childElement.getAttributeValue("enu_value"));
					enumerate.setEnumerate_name(childElement.getAttributeValue("enu_name"));
					listOfGroup.add(enumerate);
				}
			}
		}
		return listOfGroup;
	}
	
	/**
	 * Function: 根据objectName获取改组所有键值，并返回json<br>
	 * @author liuzhy@uubee.com
	 * @date 2015年12月22日 下午4:43:06
	 * @param groupName
	 * @return
	 */
	@SuppressWarnings("rawtypes")
    public String getWebElementJson(String groupName) {
		JSONObject json = new JSONObject();
		for (int i = 0; i < groupWebElementList.size(); i++) {
			Element element = (Element) groupWebElementList.get(i);
			String objectName = element.getAttributeValue("objectName");
			if (null != objectName && objectName.equals(groupName)) {
				List childElementList = element.getChildren("webElement");
				for (int j = 0; j < childElementList.size(); j++) {
					Element childElement = (Element) childElementList.get(j);
					json.put(childElement.getAttributeValue("enu_name"), childElement.getAttributeValue("enu_value"));
				}
			}
		}
		return json.toString();
	}


	public InputStream getStream() {
		return stream;
	}

	public void setStream(InputStream stream) {
		this.stream = stream;
	}

	public Element getXmlRoot() {
		return xmlRoot;
	}

	public void setXmlRoot(Element xmlRoot) {
		this.xmlRoot = xmlRoot;
	}

	@SuppressWarnings("rawtypes")
    public List getGroupWebElementList() {
		return groupWebElementList;
	}

	@SuppressWarnings("rawtypes")
    public void setGroupWebElementList(List groupWebElementList) {
		this.groupWebElementList = groupWebElementList;
	}

	@SuppressWarnings("rawtypes")
    public List getWebElementList() {
		return webElementList;
	}

	public void setWebElementList(@SuppressWarnings("rawtypes") List webElementList) {
		this.webElementList = webElementList;
	}
	
	public static void main(String[] args) throws Exception {
		String str = WebElementModel.getInstance().getWebElementJson("bank_chnl");
		System.out.println(str);
		
	}
	
}
