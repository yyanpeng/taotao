package light.mvc.pageModel.informat;

import java.util.Date;

/**
 * 招聘信息
 * @author DongMeng
 * @date 2017-2-11
 */
public class Want {
	
	private Long id;
	private String wantTitle;	//招聘求职信息标题
	private String imgUrl;		//招聘求职图片
	private Long mid;
	private String nickName;
	private Date adTime;		//发布时间
	private String formatTime;	//格式化时间
	private Integer msgClick;	//点击量
	private Integer msgType;	//信息类型：0.招聘；1.求职
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
	public String getWantTitle() {
		return wantTitle;
	}
	public void setWantTitle(String wantTitle) {
		this.wantTitle = wantTitle;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
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
	public Integer getMsgType() {
		return msgType;
	}
	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}
	//招聘
	private Integer gender;		//性别：0.男；1.女
	private String jobDesc;		//职位描述(招聘)
	private String salary;		//月薪(招聘)
	private String companyName;	//公司名称(招聘)
	private String educational;	//学历要求(招聘)
	private String experience;	//经验要求(招聘)
	private Integer wantNum;	//招聘人数(招聘)
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEducational() {
		return educational;
	}
	public void setEducational(String educational) {
		this.educational = educational;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Integer getWantNum() {
		return wantNum;
	}
	public void setWantNum(Integer wantNum) {
		this.wantNum = wantNum;
	}
	private String loginName;	//登录名(手机号)
	private Integer sex;		//性别：0.男；1.女
	private String age;		//年龄
	private String introduct;	//自我介绍(求职)
	private String jobExpert;	//工作经历(求职)
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getIntroduct() {
		return introduct;
	}
	public void setIntroduct(String introduct) {
		this.introduct = introduct;
	}
	public String getJobExpert() {
		return jobExpert;
	}
	public void setJobExpert(String jobExpert) {
		this.jobExpert = jobExpert;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	

}
