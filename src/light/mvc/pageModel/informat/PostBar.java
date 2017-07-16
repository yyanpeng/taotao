package light.mvc.pageModel.informat;

import java.util.Date;

/**
 * 帖子信息
 * @author DongMeng
 * @date 2017-2-11
 */
public class PostBar {
	
	private Long id;
	private String barTitle;	//贴子标题
	private String barContent;	//帖子内容
	private Date barTime;		//发帖时间
	private String formatTime;	//格式化后的时间
	private Long mid;
	private String nickName;	//发帖用户
	private Integer msgClick;	//点击量
	private String barImg;		//贴吧图片(上传的第一张)
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
	public String getBarTitle() {
		return barTitle;
	}
	public void setBarTitle(String barTitle) {
		this.barTitle = barTitle;
	}
	public String getBarContent() {
		return barContent;
	}
	public void setBarContent(String barContent) {
		this.barContent = barContent;
	}
	public Date getBarTime() {
		return barTime;
	}
	public void setBarTime(Date barTime) {
		this.barTime = barTime;
	}
	public String getFormatTime() {
		return formatTime;
	}
	public void setFormatTime(String formatTime) {
		this.formatTime = formatTime;
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
	public Integer getMsgClick() {
		return msgClick;
	}
	public void setMsgClick(Integer msgClick) {
		this.msgClick = msgClick;
	}
	public String getBarImg() {
		return barImg;
	}
	public void setBarImg(String barImg) {
		this.barImg = barImg;
	}
	
	//帖子图片
	private String imgurl1;
	private String imgurl2;
	private String imgurl3;
	private String imgurl4;
	private String imgurl5;
	private String imgurl6;
	private String imgurl7;
	private String imgurl8;
	public String getImgurl1() {
		return imgurl1;
	}
	public void setImgurl1(String imgurl1) {
		this.imgurl1 = imgurl1;
	}
	public String getImgurl2() {
		return imgurl2;
	}
	public void setImgurl2(String imgurl2) {
		this.imgurl2 = imgurl2;
	}
	public String getImgurl3() {
		return imgurl3;
	}
	public void setImgurl3(String imgurl3) {
		this.imgurl3 = imgurl3;
	}
	public String getImgurl4() {
		return imgurl4;
	}
	public void setImgurl4(String imgurl4) {
		this.imgurl4 = imgurl4;
	}
	public String getImgurl5() {
		return imgurl5;
	}
	public void setImgurl5(String imgurl5) {
		this.imgurl5 = imgurl5;
	}
	public String getImgurl6() {
		return imgurl6;
	}
	public void setImgurl6(String imgurl6) {
		this.imgurl6 = imgurl6;
	}
	public String getImgurl7() {
		return imgurl7;
	}
	public void setImgurl7(String imgurl7) {
		this.imgurl7 = imgurl7;
	}
	public String getImgurl8() {
		return imgurl8;
	}
	public void setImgurl8(String imgurl8) {
		this.imgurl8 = imgurl8;
	}
	

}
