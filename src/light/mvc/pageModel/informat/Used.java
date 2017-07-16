package light.mvc.pageModel.informat;

import java.util.Date;

/**
 * 二手信息
 * @author DongMeng
 * @date 2017-2-11
 */
public class Used {
	
	private Long id;
	private Integer usedType;	//二手信息分类：0.出售；1.求购
	private String usedTitle;	//二手信息标题
	private String imgUrl;		//二手信息图片
	private String usedDesc;	//二手信息详情
	private String linkName;	//联系人
	private String linkPhone;	//联系电话
	private String price;		//价格
	private String linkAddress;	//地址
	private Long mid;
	private String nickName;	//发布人
	private Date adTime;		//发布时间
	private String formatTime;	//格式化时间
	private Integer msgClick;	//点击量
	private Integer istop;	//0置顶  1不置顶
	
	
	
	public Integer getIstop() {
		return istop;
	}
	public void setIstop(Integer istop) {
		this.istop = istop;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getUsedType() {
		return usedType;
	}
	public void setUsedType(Integer usedType) {
		this.usedType = usedType;
	}
	public String getUsedTitle() {
		return usedTitle;
	}
	public void setUsedTitle(String usedTitle) {
		this.usedTitle = usedTitle;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getUsedDesc() {
		return usedDesc;
	}
	public void setUsedDesc(String usedDesc) {
		this.usedDesc = usedDesc;
	}
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getLinkPhone() {
		return linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	public String getLinkAddress() {
		return linkAddress;
	}
	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}
	public Long getMid() {
		return mid;
	}
	public void setMid(Long mid) {
		this.mid = mid;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getAdTime() {
		return adTime;
	}
	public void setAdTime(Date adTime) {
		this.adTime = adTime;
	}
	public String getFormatTime() {
		return formatTime;
	}
	public void setFormatTime(String formatTime) {
		this.formatTime = formatTime;
	}
	public Integer getMsgClick() {
		return msgClick;
	}
	public void setMsgClick(Integer msgClick) {
		this.msgClick = msgClick;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
