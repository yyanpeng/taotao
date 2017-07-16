package light.mvc.pageModel.informat;

/**
 * 房屋信息分类
 * @author DongMeng
 * @date 2017-2-4
 */
public class HouseType {
	
	private Long id;
	private String typeName;	//房屋信息分类名称
	private Integer typeState;	//分类类型：0.出售；1.求租
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

}
