package light.mvc.pageModel.informat;

import java.util.Date;

/**
 * 房屋信息
 * @author DongMeng
 * @date 2017-2-11
 */
public class House {
	
	private Long id;
	private Long typeId;
	private String typeName;	//房屋信息分类
	private Integer typeState;	//分类类型：0.出售；1.求租
	private String houseTitle;	//房屋信息标题
	private String imgUrl;		//房屋信息图片
	private String houseDesc;	//房屋信息详情
	private String linkName;	//联系人
	private String linkPhone;	//联系电话
	private String linkAddress;	//地址
	private String price;		//价格
	private Long mid;
	private String nickName;	//发布人
	private Date adTime;		//发布时间
	private String formatTime;	//格式化时间
	private Integer msgClick;	//点击量
	private Integer istop;	//点击量
	
	
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
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getTypeState() {
		return typeState;
	}
	public void setTypeState(Integer typeState) {
		this.typeState = typeState;
	}
	public String getHouseTitle() {
		return houseTitle;
	}
	public void setHouseTitle(String houseTitle) {
		this.houseTitle = houseTitle;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getHouseDesc() {
		return houseDesc;
	}
	public void setHouseDesc(String houseDesc) {
		this.houseDesc = houseDesc;
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
