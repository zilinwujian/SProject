<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Register Page</title>
        <!-- jQuery AND jQueryUI -->
        <script type="text/javascript" src="/SSHProject/js/libs/jquery/1.6/jquery.min.js"></script>
        <script type="text/javascript" src="/SSHProject/js/libs/jqueryui/1.8.13/jquery-ui.min.js"></script>
        
        <!-- Compressed Version
        <link type="text/css" rel="stylesheet" href="min/b=CoreAdmin&f=css/reset.css,css/style.css,css/jqueryui/jqueryui.css,js/jwysiwyg/jquery.wysiwyg.old-school.css,js/zoombox/zoombox.css" />
        <script type="text/javascript" src="min/b=CoreAdmin/js&f=cookie/jquery.cookie.js,jwysiwyg/jquery.wysiwyg.js,tooltipsy.min.js,iphone-style-checkboxes.js,excanvas.js,zoombox/zoombox.js,visualize.jQuery.js,jquery.uniform.min.js,main.js"></script>
        -->
        <link rel="stylesheet" href="/SSHProject/css/min.css" />
        <script type="text/javascript" src="/SSHProject/js/min.js"></script>
</head>
<body>
 <script type="text/javascript" src="/SSHProject/content/settings/main.js"></script>
<link rel="stylesheet" href="/SSHProject/content/settings/style.css" />


  <div class="settings" id="settings">
        <div class="wrapper">
            <div class="grid3">
                <div class="titre">Backgrounds</div>
                <a href="url(/SSHProject/css/img/bg.html" class="backgroundChanger active" title="White"></a>
                <a href="url(/SSHProject/css/img/dark-bg.html" class="backgroundChanger dark" title="Dark"></a>
                <a href="url(/SSHProject/css/img/wood.html" class="backgroundChanger dark" title="Wood"></a>
                <a href="url(/SSHProject/css/img/altbg/smoothwall.html" class="backgroundChanger" title="Smoothwall"></a>
                <a href="url(/SSHProject/css/img/altbg/black_denim.html" class="backgroundChanger dark" title="black_denim"></a>
                <a href="url(/SSHProject/css/img/altbg/carbon.html" class="backgroundChanger dark" title="Carbon"></a>
                <a href="url(/SSHProject/css/img/altbg/double_lined.html" class="backgroundChanger" title="Double lined"></a>
                <div class="clear"></div>
            </div>
            <div class="grid3">
                <div class="titre">Bloc style</div>
                <a href="black.html" class="blocChanger" title="Black" style="background:url(/SSHProject/css/img/bloctitle.png);"></a>
                <a href="white.html" class="blocChanger active" title="White" style="background:url(/SSHProject/css/img/white-title.png);"></a>
                <a href="wood.html" class="blocChanger" title="Wood" style="background:url(/SSHProject/css/img/wood-title.jpg);"></a>
                <div class="clear"></div>
            </div>
            <div class="grid3">
                <div class="titre">Sidebar style</div>
                <a href="grey.html" class="sidebarChanger active" title="Grey" style="background:#494949"></a>
                <a href="black.html" class="sidebarChanger" title="Black" style="background:#262626"></a>
                <a href="white.html" class="sidebarChanger" title="White" style="background:#EEEEEE"></a>
                <div class="clear"></div>
            </div>
            <div class="clear"></div>
        </div>
        <a class="settingbutton" href="#">

        </a>
    </div>        
        <!--              
                HEAD
                        --> 
        <div id="head">
            <div class="left">
                <a href="#" class="button profile"><img src="/SSHProject/img/icons/top/huser.png" alt="" /></a>
                Hi, 
                <a href="#">${sessionScope.user.username}</a>
                <a href="#">Logout</a>
            </div>
            <div class="right">
                <form action="#" id="search" class="search placeholder">
                    <label>Looking for something ?</label>
                    <input type="text" value="" name="q" class="text"/>
                    <input type="submit" value="rechercher" class="submit"/>
                </form>
            </div>
        </div>
                
                
        <!--            
                SIDEBAR
                         --> 
        <div id="sidebar">
            <ul>
                <li>
                    <a href="Index.jsp">
                        <img src="/SSHProject/img/icons/menu/inbox.png" alt="" />
                        Dashboard
                    </a>
                </li>
                <li><a href="#"><img src="/SSHProject/img/icons/menu/layout.png" alt="" />Waitress</a>
                    <ul>
                         <li  ><a href="Commditys.jsp">Commdity</a></li>
                          <li><a href="Commdityss.jsp">CommdityList</a></li>
                         <li><a href="CPCreate.jsp">CommdityPlanCreate</a></li>
                         <li><a href="record.action">Recordlist</a></li>
                         <li><a href="allorderaction.action">Orderlist</a></li>
                    </ul>
                </li>
                <li  ><a href="#"><img src="/SSHProject/img/icons/menu/brush.png" alt="" /> Member</a>
                    <ul>
                        <li ><a href="Member.jsp">RegisterMember</a></li>
                        <li><a href="MemberUpd.jsp">MemberInformationUpdate</a></li>
                        <li><a href="memberfind.action">MemberInformation</a></li>
                        <li><a href="OrderCreate.jsp">OrderCreate</a></li>
                    </ul>
                </li>
                <li class="current"><a href="#"><img src="/SSHProject/img/icons/menu/brush.png" alt="" /> Manager</a>
                    <ul>
                        <li  ><a href="allcpaction.action">CommodityPlansShow</a></li>
                        <li class="current"><a href="allmemberaction.action">MemberList</a></li>
                        <li ><a href="allbuyaction.action">BuyList</a></li>
                    </ul>
                </li>
                <li ><a href="#"><img src="/SSHProject/img/icons/menu/brush.png" alt="" />System Manager</a>
                    <ul>
                        <li><a href="allstoreaction.action">StoreList</a></li>
                        <li><a href="StoreCreate.jsp">CreateStore</a></li>
                          <li><a href="allclerkaction.action">ClerkList</a></li>
                        <li ><a href="ClerkCreate.jsp">CreateClerk</a></li>
                    </ul>
                </li>
              </ul>


        </div>
               


	<div id="content" class="white">
            <h1><img src="img/icons/posts.png" alt="" /> member List</h1>

<div class="bloc">
    <div class="title">Show Member list</div>
    <div class="content">
         <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Age</th>
                    <th>Sex</th>
                    <th>Location</th>
                    <th>Status</th>
                    <th>Level</th>
                    <th>Bin</th>
                    <th>Money</th>
                </tr>
            </thead>
            <tbody>
            	<s:iterator value="#request.mlist" id="us">  
                    <tr>
                    <td> <s:property value="#us.memberid"/>  </td>
                    
                    <td>
                    	<s:property value="#us.age"/> 
                    </td>
                    
                    <td>
                    	<s:property value="#us.sex"/> 
                    </td>
                    <td>
                    	<s:property value="#us.location"/> 
                    </td>
                    <td>
                    	<s:property value="#us.status"/> 
                    </td>
                    <td>
                    	<s:property value="#us.level"/> 
                    </td>
                    <td>
                    	<s:property value="#us.bin"/> 
                    </td>
                    <td>
                    	<s:property value="#us.money"/> 
                    </td>
                    </tr>
               </s:iterator> 
                            </tbody>
        </table>
    </div>
</div>     


<div class="bloc">
    <div class="title">
        Charts
        <div class="tabs" id="charts">
            <a href="#pie">Pie</a>
        </div>
    </div>
    <div>
        
        
        <div class="content" id="pie">
            <table class="graph type-pie tips">
                    <caption>Sex</caption>
                    <thead>
                            <tr>
                                    <td></td>
                                    <th scope="col">sex</th>
                            </tr>
                    </thead>
                    <tbody> 
                            <tr> 
                                    <th scope="row">Male</th> 
                                    <td><s:property value="#request.male"/> </td> 
                            </tr> 
                            <tr> 
                                    <th scope="row">Female</th> 
                                    <td><s:property value="#request.female"/> </td> 
                            </tr> 
                            <tr> 
                                    <th scope="row">Other</th> 
                                    <td><s:property value="#request.other"/> </td> 
                            </tr> 
                    </tbody> 
            </table>
        </div>
    </div>
</div>



</div>
        
</body>
</html>