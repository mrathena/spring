<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

<!-- Icon -->
<link rel="shortcut icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- 全局CSS -->
<link rel="stylesheet" href="assets/hplus/css/bootstrap.min.css" />
<link rel="stylesheet" href="assets/hplus/css/font-awesome.css" />
<link rel="stylesheet" href="assets/hplus/css/animate.css" />
<!-- 自定义CSS -->
<link rel="stylesheet" href="assets/hplus/css/style.css" />
<!-- 第三方CSS -->
<!-- <link rel="stylesheet" href="assets/lib/animate/3.5.2/animate.css" > -->
<link rel="stylesheet" href="assets/hplus/css/plugins/iCheck/custom.css" />
<link rel="stylesheet" href="assets/hplus/css/plugins/toastr/toastr.min.css" />
<link rel="stylesheet" href="assets/lib/layer/3.0.3/skin/default/layer.css" />
<link rel="stylesheet" href="assets/lib/jquery/jquery.datatables/1.10.15/css/dataTables.bootstrap.min.css" />
<link rel="stylesheet" href="assets/lib/jquery/jquery.datatables/FixedHeader-3.1.2/css/fixedHeader.bootstrap.min.css" />
<link rel="stylesheet" href="assets/lib/zTree/3.5.29/css/metroStyle/metroStyle.css" />
<!-- 我的CSS -->
<link rel="stylesheet" href="${path}${URLProvider.getForLookupPath('/assets/mrathena.css')}" />
<link rel="stylesheet" href="${path}${URLProvider.getForLookupPath('/assets/custom.css')}" />