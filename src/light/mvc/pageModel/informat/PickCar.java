package light.mvc.pageModel.informat;

import java.util.Date;

/**
 * 拼车信息
 * @author DongMeng
 * @date 2017-2-11
 */
public class PickCar {
	
	private Long id;
	private String phone;		//电话
	private Integer pickType;	//类型：0.车找人；1.人找车
	private String origin;		//起点城市
	private String terminal;	//终点城市
	private String carDate;		//乘车日期
	private String timeRange;	//乘车时间区间
	private String remark;		//备注
	private Long mid;
	private String nickName;	//发布人
	private Date adTime;		//发布时间
	private String formatTime;	//格式化时间
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getPickType() {
		return pickType;
	}
	public void setPickType(Integer pickType) {
		this.pickType = pickType;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getCarDate() {
		return carDate;
	}
	public void setCarDate(String carDate) {
		this.carDate = carDate;
	}
	public String getTimeRange() {
		return timeRange;
	}
	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	

}
