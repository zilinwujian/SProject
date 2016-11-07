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
                <li  class="current"><a href="#"><img src="/SSHProject/img/icons/menu/layout.png" alt="" />Waitress</a>
                    <ul>
                         <li  class="current"><a href="Commditys.jsp">Commdity</a></li>
                         <li><a href="CPCreate.jsp">CommdityPlanCreate</a></li>
                         <li><a href="record.action">Recordlist</a></li>
                         <li><a href="allorderaction.action">Orderlist</a></li>
                    </ul>
                </li>
                <li><a href="#"><img src="/SSHProject/img/icons/menu/brush.png" alt="" /> Member</a>
                    <ul>
                        <li><a href="Member.jsp">RegisterMember</a></li>
                        <li><a href="MemberUpd.jsp">MemberInformationUpdate</a></li>
                        <li><a href="memberfind.action">MemberInformation</a></li>
                        <li><a href="OrderCreate.jsp">OrderCreate</a></li>
                    </ul>
                </li>
                <li><a href="#"><img src="/SSHProject/img/icons/menu/brush.png" alt="" /> Manager</a>
                    <ul>
                        <li><a href="allcpaction.action">CommodityPlansShow</a></li>
                        <li><a href="allmemberaction.action">MemberList</a></li>
                        <li class="current"><a href="allbuyaction.action">BuyList</a></li>
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
            <h1><img src="img/icons/pictures.png" alt="" />Commodities</h1>
<div class="bloc">
    <div class="title">Commodities</div>
    <div class="content">
        <p>Here are the desserts</p>
        <ul class="gallery">
            <li>
                <a href="Buy.jsp?id=1"><img src="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3089839302,1298645281&fm=58" alt=""/></a>
                <span class="info">苏式月饼</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=1" class="over"><span>买买买</span></a>
                <a href="http://www.88063721.com/upfile/20120831/201208310210759.jpg" class="large zoombox" title="full-size">Enlarge</a>
            </li>
                        <li>
                <a href="Buy.jsp?id=2"><img src="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3041853762,576734631&fm=58" alt=""/></a>
                <span class="info">蟹壳黄</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=2" class="over"><span>买买买</span></a>
                <a href="http://upload3.95171.cn/albumpicimages/20130606/2321847e-dc6d-47c8-8ff5-852aad8f85ab.png" class="large zoombox" title="full-size">Enlarge</a>
            </li>
                        <li>
                <a href="Buy.jsp?id=3"><img src="https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=2326488424,4104057722&fm=58" alt=""/></a>
                <span class="info">冰糖燕窝</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=3" class="over"><span>买买买</span></a>
                <a href="http://a3.att.hudong.com/54/59/21300541272233140358592539411.jpg" class="large zoombox" title="full-size">Enlarge</a>
            </li>
                        <li>
                <a href="Buy.jsp?id=4"><img src="https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2161777385,2066570635&fm=58" alt=""/></a>
                <span class="info">青团</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=4" class="over"><span>买买买</span></a>
                <a href="http://img1.imgtn.bdimg.com/it/u=3099137206,1344151447&fm=21&gp=0.jpg" class="large zoombox" title="full-size">Enlarge</a>
            </li>
                        <li>
                <a href="Buy.jsp?id=5"><img src="https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=3218811326,1200232166&fm=58" alt=""/></a>
                <span class="info">马卡龙</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=5" class="over"><span>买买买</span></a>
                <a href="http://img4.duitang.com/uploads/item/201411/14/20141114160054_Lwzxn.jpeg" class="large zoombox" title="full-size">Enlarge</a>
            </li>
                        <li>
                <a href="Buy.jsp?id=6"><img src="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2486811813,2256120277&fm=58" alt=""/></a>
                <span class="info">烤纯牛奶丁</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=6" class="over"><span>Edit this image</span></a>
                <a href="http://img4q.duitang.com/uploads/item/201502/11/20150211124446_aPAZG.jpeg" class="large zoombox" title="full-size">Enlarge</a>
            </li>
                        <li>
                <a href="Buy.jsp?id=7"><img src="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=1509343305,1662975115&fm=58" alt=""/></a>
                <span class="info">酥饼</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=7" class="over"><span>买买买</span></a>
                <a href="http://img0.imgtn.bdimg.com/it/u=1775256661,3022697283&fm=206&gp=0.jpg" class="large zoombox" title="full-size">Enlarge</a>
            </li>
                        <li>
                <a href="Buy.jsp?id=8"><img src="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2456243142,2083904658&fm=58" alt=""/></a>
                <span class="info">锅巴</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=8" class="over"><span>买买买</span></a>
                <a href="http://img1.imgtn.bdimg.com/it/u=4094648502,4170609971&fm=206&gp=0.jpg" class="large zoombox" title="full-size">Enlarge</a>
            </li>
                        <li>
                <a href="Buy.jsp?id=9"><img src="https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=1394560859,2906182718&fm=58" alt=""/></a>
                <span class="info">酸奶水果捞</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=9" class="over"><span>买买买</span></a>
                <a href="http://img2.imgtn.bdimg.com/it/u=3846262487,3067497523&fm=206&gp=0.jpg" class="large zoombox" title="full-size">Enlarge</a>
            </li>
                        <li>
                <a href="Buy.jsp?id=10"><img src="https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2194727021,1905241286&fm=58" alt=""/></a>
                <span class="info">沙琪玛</span>
                <a href="#" title="delete Image" class="del">Delete</a>
                <a href="Buy.jsp?id=10" class="over"><span>买买买</span></a>
                <a href="http://news.wehefei.com/uploadfile/2011/1020/20111020114323576.jpg" class="large zoombox" title="full-size">Enlarge</a>
            </li>
			<li>
			<script type="text/javascript"><!--
google_ad_client = "ca-pub-3413404722490728";
/* 导航栏顶部468+60navigation.html */
google_ad_slot = "9534515323";
google_ad_width = 468;
google_ad_height = 60;
//-->
</script>
<script type="text/javascript"
src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
</script>
			</li>
                    </ul>
        <div class="cb"></div>
    </div>
</div> 

</div>
        
</body>
</html>