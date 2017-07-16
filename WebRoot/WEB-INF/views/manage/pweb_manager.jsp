<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../inc.jsp"></jsp:include>
<%@page import="light.mvc.utils.PropertiesLoader" %> 
<%@page import="java.util.Properties" %> 
<%
	PropertiesLoader properties=new PropertiesLoader();
	Properties per=properties.loadVideoProperties();
	String vurl=per.getProperty("intenetURL");//存放URL
 %>
<meta http-equiv="X-UA-Compatible" content="edge" />
<c:if test="${fn:contains(sessionInfo.resourceList, '/pweb/edit')}">
	<script type="text/javascript">
		$.canEdit = true;
	</script>
</c:if>
<title>平台页面管理</title>
<script type="text/javascript">
	var dataGrid;
	$(function() {
		dataGrid = $('#dataGrid').datagrid({
			url : '${ctx}/pweb/dataGrid',
			striped : true,
			rownumbers : true,
			pagination : true,
			singleSelect : true,
			idField : 'id',
			sortName : 'id',
			sortOrder : 'asc',
			pageSize : 15,
			pageList : [ 10, 15, 20, 30, 40, 50 ],
			frozenColumns : [ [ {
				width : '100',
				title : 'id',
				field : 'id',
				align : 'center',
				sortable : true
				
			}] ],
			 columns : [ [{
				width : '150',
				title : '名称',
				field : 'name',
				align : 'center',
				sortable : false
			},{
				width : '300',
				title : '地址',
				field : 'url',
				align : 'center',
				sortable : false
			},{
		    	field : 'action',
				align : 'center',
				title : '操作',
				width : '150',
				formatter : function(value, row, index) {
					var str = '';
					if($.canEdit){
						str += $.formatString('<a href="javascript:void(0)" onclick="editFun(\'{0}\');" >编辑</a>', row.id);
					}
					return str;
				}
			} ] ],
			toolbar : '#toolbar'
		});
	})
</script>

<script type="text/javascript">

//修改
function editFun(id){
	parent.$.modalDialog({
		title : '修改',
		width : 768,
		height : 435,
		resizable : true,
		scrollbar : true,
		href : '${ctx}/pweb/editPage?id=' + id,
		buttons : [ {
			text : '修改',
			handler : function() {
				parent.$.modalDialog.openner_dataGrid = dataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
				var f = parent.$.modalDialog.handler.find('#pwebEditForm');
				f.submit();
			}
		} ]
	});
}

</script>

</head>
<body class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'center',fit:true,border:false">
		<table id="dataGrid" data-options="fit:true,border:false"></table>
	</div>
	<div id="toolbar" style="display: none;"></div>
</body>
</html>

