$(document).ready(function(){$('h2 a').click(function(){myloadoriginal=this.text;$(this).text('正在给力加载中 ...');var myload=this;setTimeout(function(){$(myload).text(myloadoriginal);},2011);});});$(function(){$('img').hover(function(){$(this).fadeTo("fast",0.5);},function(){$(this).fadeTo("fast",1.1);});});$(function(){$.fn.scrollToTop=function(){$(this).hide().removeAttr("href");if($(window).scrollTop()!="0"){$(this).fadeIn("slow")}
var scrollDiv=$(this);$(window).scroll(function(){if($(window).scrollTop()=="0"){$(scrollDiv).fadeOut("slow")}else{$(scrollDiv).fadeIn("slow")}});$(this).click(function(){$("html, body").animate({scrollTop:0},"slow")})}});$(function(){$("#w2b-StoTop").scrollToTop();});$(function(){$("a").each(function(b){if(this.title){var c=this.title;var a=30;$(this).mouseover(function(d){this.title="";$("body").append('<div id="tooltip">'+c+"</div>");$("#tooltip").css({left:(d.pageX+a)+"px",top:d.pageY+"px",opacity:"0.8"}).show(250)}).mouseout(function(){this.title=c;$("#tooltip").remove()}).mousemove(function(d){$("#tooltip").css({left:(d.pageX+a)+"px",top:d.pageY+"px"})})}})});
//侧栏跟随
(function(){

	var oDiv=document.getElementById("float");
	var H=0,iE6;
	var Y=oDiv;
	while(Y){H+=Y.offsetTop;Y=Y.offsetParent};
	iE6=window.ActiveXObject&&!window.XMLHttpRequest;
	if(!iE6){
		window.onscroll=function()
		{
			var s=document.body.scrollTop||document.documentElement.scrollTop;
			if(s>H){oDiv.className="div1 div2";if(iE6){oDiv.style.top=(s-H)+"px";}}
			else{oDiv.className="div1";}	
		};
	}

})();