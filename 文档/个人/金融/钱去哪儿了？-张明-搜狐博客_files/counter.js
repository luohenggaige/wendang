function tmp_pv(){
	if(window.top.location==window.location) {
		var n=new Date().getTime();
		var c=escape(n*1000+Math.round(Math.random()*1000));
		if (BlogCookieInfo.cookie.I) {
			document.write('<img src="http://stat.pic.sohu.com/blogcount?t=txt&u='+_blog_domain+'&t='+c+'&rf='+document.referrer+'&v='+BlogCookieInfo.cookie.I+'" style="display:none;" />');
			document.write('<img src="http://stat.i.sohu.com/guest/stat/?xpt='+_upt+'&type=0&t=' + c + '" style="display:none;" />');
		}
		else {
			document.write('<img src="http://stat.pic.sohu.com/blogcount?t=txt&u='+_blog_domain+'&t='+c+'&rf='+document.referrer+'" style="display:none;" />');
			document.write('<img src="http://stat.i.sohu.com/guest/stat/?xpt='+_upt+'&type=0&t=' +  c + '" style="display:none;" style="display:none;"/>');
		}
	}
}
var tmppv;if(!tmppv)tmp_pv();tmppv=1;