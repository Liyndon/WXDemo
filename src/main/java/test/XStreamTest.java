package test;

import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

import weixin.guanjia.core.entity.message.resp.TextMessageResp;
import weixin.guanjia.core.util.MessageUtil;

/**
 * @author SAMSUNG
 * 
 */
public class XStreamTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TextMessageResp messageResp = new TextMessageResp();
		messageResp.setContent("Test");
		messageResp.setCreateTime(System.currentTimeMillis());
		messageResp.setFromUserName("user1");
		messageResp.setToUserName("user2");
		XStream stream = new XStream();
		stream.alias("xml", messageResp.getClass());
		// stream.setMode(0);
//		String xml = stream.toXML(messageResp);
		 String xml = MessageUtil.textMessageToXml(messageResp);
		System.out.println(xml);
	}
}
