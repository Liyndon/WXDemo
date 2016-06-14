package weixin.guanjia.core.entity.message.resp;

public class TextMessageResp extends BaseMessageResp {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4956088110027867013L;
	// 回复的消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		this.Content = content;
	}

	public TextMessageResp() {
		super();
	}

}
