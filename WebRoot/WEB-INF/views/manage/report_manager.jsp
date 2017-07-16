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
<c:if test="${fn:contains(sessionInfo.resourceList, '/report/delete')}">
	<script type="text/javascript">
		$.canDelete = true;
	</script>
</c:if>

<title>广告管理</title>
<script type="text/javascript">
	var dataGrid;
	$(function() {
		dataGrid = $('#dataGrid').datagrid({
			url : '${ctx}/report/dataGrid',
			striped : true,
			rownumbers : true,
			pagination : true,
			singleSelect : true,
			idField : 'id',
			sortName : 'reportTime',
			sortOrder : 'asc',
			pageSize : 15,
			pageList : [ 10, 15, 20, 30, 40, 50 ],
			frozenColumns : [ [ {
				width : '80',
				title : 'id',
				field : 'id',
				align : 'center',
				sortable : true
			}] ],
			 columns : [ [{
				width : '150',
				title : '被举报信息',
				field : 'reportedName',
				align : 'center',
				sortable : false
			},{
				width : '150',
				title : '举报人',
				field : 'nickName',
				align : 'center',
				sortable : false
			},{
				width : '100',
				title : '举报类型',
				field : 'reportedType',
				align : 'center',
				sortable : true,
				formatter:function(value,row,index){
					var str = '';
					if(value == '0'){
						str = '房屋信息';
					} else if(value == '1'){
						str = '二手信息';
					} else if(value == '2'){
						str = '招聘信息';
					} else if(value == '3'){
						str = '求职信息';
					}
					return str;
				}
			},{
				width : '150',
				title : '举报时间',
				field : 'formatTime',
				align : 'center',
				sortable : false
			},{
				width : '270',
				title : '举报详情',
				field : 'reportDesc',
				align : 'center',
				sortable : false
			},{
		    	field : 'action',
				align : 'center',
				title : '操作',
				width : '150',
				formatter : function(value, row, index) {
					var str = $.formatString('<a href="javascript:void(0)" onclick="detailFun(\'{0}\',\'{1}\');">查看信息</a>',row.id,row.reportedType);
					if ($.canDelete) {
						str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
						str += $.formatString('<a href="javascript:void(0)" onclick="deleteFun(\'{0}\');" >删除</a>', row.id);
					}
					return str;
				}
			}] ],
			toolbar : '#toolbar'
		});
	})
</script>

<script type="text/javascript">
function nouser(){
	var img=event.srcElement;
	img.src="${ctx}/icon/noima.png";
	img.onerror=null;
}

//信息详情
function detailFun(id, type){
	var title = '';
	var url = '';
	if(type == '0'){
		title = '房屋信息详情';
		url = '${ctx}/house/detailPage?id='+id;
	} else if(type == '1') {
		title = '帖子详情';
		url = '${ctx}/used/detailPage?id='+id;
	} else if(type == '2'){
		title = '招聘信息';
		url = '${ctx}/want/recruitment?id='+id
	} else if(type == '3'){
		title = '求职信息';
		url = '${ctx}/want/appayjob?id='+id
	}
	parent.$.modalDialog({
		title : title, 
		width : 630,
		height : 360,
		resizable : true,
		scrollbar : true,
		href : url
	});
}

//删除
function deleteFun(id) {
	parent.$.messager.confirm('询问', '您是否要删除该数据？', function(b) {
		if (b) {				
			$.post('${ctx}/report/delete', {
				id : id
			}, function(result) {
				if (result.success) {
					parent.$.messager.alert('提示', result.msg, 'info');
					dataGrid.datagrid('reload');
				}
				progressClose();
			}, 'JSON');
		}
	});
}

//根据条件查询
function FindData(){
	var shop_name = $("#shop_name").val();
	var rtype = $("#report_type").val();
	$("#dataGrid").datagrid("load", { 
		shopName:shop_name,
		reportedType:rtype
	});
}; 
//清除查询条件
function ClearQuery() {
	$("#search").find("select").val("");
	$("#search").find("input").val("");
};
</script>
</head>
<body class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'center',fit:true,border:false">
		<table id="dataGrid" data-options="fit:true,border:false"></table>
	</div>
	<div id="toolbar" style="display: none;">
		<div id="search" style="padding:2px" align="left">
			<span class="fl ml20 w80 tr">&nbsp;&nbsp;用户名称:</span>
			<input style="width: 140px;" id="user_name" />
			<span class="fl ml20 w80 tr">&nbsp;&nbsp;举报类型:</span>
			<select style="width: 140px;" id="report_type">
				<option value=""></option>
				<option value="0">房屋信息</option>
				<option value="1">二手信息</option>
				<option value="2">招聘信息</option>
				<option value="3">求职信息</option>
			</select>
		</div>
		<div>
			<a href="javascript:FindData()" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon_search'">查询</a>
			<a href="javascript:ClearQuery()" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon_cancel'">清除</a>
		</div>
	</div>	
</body>
</html>

