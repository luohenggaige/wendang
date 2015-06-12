window.wkopts = [];
var wk_ad_begin = function(opt, sid){
	if( /(iPhone|Android)/g.test( navigator.userAgent ) ){
		baidu_wk_ad.init(opt);
	}else{
		window.wkad_sid = sid ? sid : 0;
		window.wkopts.push(opt);
		window.onload = function(){
			for(var i = 0; i < window.wkopts.length; i++){
				baidu_wk_ad.init(window.wkopts[i]);
			}
		}
	}
	
}

var baidu_wk_ad = {

	init : function(opt){
		
		var me = this;
		opt.limit = opt.limit ? opt.limit : 1,
		opt.tid = opt.tid ? opt.tid : 1;
		if( opt.rate ){
			opt.rate = parseInt( opt.rate.replace('/\D*/', '') );
			var random = Math.floor(Math.random() * 100 + 1);
			if(random < opt.rate && opt.rate > 0){
				me.action(opt);
			}
		}else{
			me.action(opt);
		}	

	},
	action : function(opt){

		var me = this,
			clientWidth = document.body.clientWidth;

		if( opt.width ){
			opt.width = opt.width > clientWidth ? clientWidth :opt.width;
		}else{
			
			if( document.getElementById('wkAd' + opt.pid ) ){
				opt.width = document.getElementById('wkAd' + opt.pid ).style.width;
			}else{
				opt.width = clientWidth;
			}
			
		}
		var data = me.serialize(opt);
		var _script = document.createElement('script');
		document.body.appendChild(_script);
		_script.src = 'http://wenku.baidu.com/xpage/interface/ad?' + data;
		
	},
	addEventListener : function(obj, action, func){

		if(obj.addEventListener){
			obj.addEventListener(action, func);
		}else{
			obj.attachEvent('on' + action, func);
		}

	},
	serialize : function(opt){

		var data = [];
		for(var key in opt){
			if( key != 'rate' ){
				data.push( key + '=' + opt[key] ); 
			}
		}
		data = data.join('&');
		return data;
	},
	ajax : function(opt, callback){

		var me = this, data = me.serialize(opt);
		window.wkHttpReq = null;

		url = 'http://ai-iknow-doc00.ai01.baidu.com:8099/xpage/interface/ad?' + data;

		if(window.XMLHttpRequest) {
	        window.wkHttpReq = new XMLHttpRequest();
	    }else if(window.ActiveXObject) { 
	        
	        try{
	        	window.wkHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
	        }catch(e){

		        try{
		            window.wkHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
		        }catch(e){}

	        }

	    }

	    window.wkHttpReq.onreadystatechange = me.processResponse;
	    window.wkHttpReq.open('get', url, true);
	    window.wkHttpReq.send(null);

	},
	getWidth : function(){

		var width = 0;

		if( document.documentElement.clientWidth ){
			width = document.documentElement.clientWidth;
		}else{
			width = document.body.clientWidth;
		}

		return width;

	},
	processResponse : function(){

		if(window.wkHttpReq.readyState == 4){  
	        if( window.wkHttpReq.status == 200 && window.wkHttpReq.responseText ){
	        	console.log(window.wkHttpReq.responseText);
	        }  
	    }

	},
	xsend : function(ad_id, other){

		var pathName = document.location.pathname,
        ppara = null,
        params = ['http://ctj.wenku.baidu.com/ad.gif?pid=1'],
        refer = encodeURIComponent(document.referrer || ''),
        url = encodeURIComponent(document.location.href.replace(/#.*/g, '')),

        bid = 1,
        me = this;

	    var gpara = {
	        bid: bid, 
	        fr: 4, 
	        ad_id: ad_id,
	        action_type : 'display', 
	        url: url, 
	        refer: refer,
	        t: +(new Date())
	    };

	    if( /(iPhone|iPad|Android)/.test(navigator.userAgent) ){
	    	gpara.fr = 7;
	    }

	    if(other){
	      	gpara = me.merge(gpara, other);
	    }

	    for(var key in gpara){
	        params.push(key + '=' + gpara[key]);
	    }

	    me.log(params.join("&"));

	},
	merge : function(fobj, sobj){

		for(var key in sobj){

			if( ( sobj.hasOwnProperty(key) && !fobj.hasOwnProperty(key) ) || key == 'action_type' ){
				fobj[key] = sobj[key];
			}

		}

		return fobj;

	},
	log : function(url){

		var img = new Image(),
      	key = 'tangram_sio_log_' + Math.floor(Math.random() * 2147483648).toString(36);
	  	window[key] = img;

	  	img.onload = img.onerror = img.onabort = function() {
		  
		    img.onload = img.onerror = img.onabort = null;
		    window[key] = null;
		    img = null;
		};

	  	img.src = url;
	}
}

var img_template = ['<a href="__URL__" target="_blank">',
						'<img src="__PIC__" width="__WIDTH__" height="__HEIGHT__" />',
					'</a>'].join('\r\n');

var word_template = ['<div class="item">',
						'<p class="doc-title">',
							'<b class="ic ic-html"></b>',
							'<a href="__URL__" class="rec-items" target="_blank" title="__TEXT__">__TEXT__</a>',
						'</p>',
						'<div class="gd-g tail-info">',
							'<div class="gd-g-u">',
								'À´Ô´£º<a href="__URL__" target="_blank" style="font-size:12px;color:#999;">__FROM__</a>',
							'</div>',
						'</div>',
					'</div>'].join('\r\n');

function callback(data){
	
	if(!data){ 
		if( window.wkad_sid ){
			document.getElementById(window.wkad_sid).style.display = 'block';
		}
		return;
	}

	for(var i = 0; i < data.length; i++){
		if(data[i].pic && data[i].width && data[i].height){
			var template = img_template;
			template = template.replace('__URL__', data[i].url);
			template = template.replace('__PIC__', data[i].pic);
			template = template.replace('__WIDTH__', data[i].width);
			template = template.replace('__HEIGHT__', data[i].height);
		}
		if(data[i].text){
			var text = data[i].text;
			if( getlength(text) >  20){
				text = getsubstr(text, 20);
			}
			template = word_template;
			template = template.replace(/__URL__/g, data[i].url);
			template = template.replace(/__TEXT__/g, text);
			template = template.replace('__FROM__', data[i].from);
		}

		if( document.getElementById('wkad' + data[i].pid) ){
				document.getElementById('wkad' + data[i].pid).innerHTML = template;
		}else{
			var list = getElementsByClass( 'wkad' + data[i].pid );
			if(list.length){
				for(var key in list){
					list[key].innerHTML = template;
				}
			}
		}

		baidu_wk_ad.xsend( data[i].ad_id, {action_type : 'display'} );

		var wkpid = data[i].pid, wkaid = data[i].ad_id;
		if( document.getElementById('wkad' + data[i].pid) ){
			baidu_wk_ad.addEventListener( document.getElementById('wkad' + wkpid), 'click', function(){
				baidu_wk_ad.xsend( wkaid, {action_type : 'click'} );
			});

		}else{

			if( getElementsByClass('wkAd' + data[i].pid) ){
				baidu_wk_ad.addEventListener( getElementsByClass('wkAd' + wkpid), 'click', function(){
					baidu_wk_ad.xsend( wkaid, {action_type : 'click'} );
				});
			}

		}

	}
}

function getElementsByClass(classname){
	var tags = document.getElementsByTagName('*'), list = [];
	for(var key in tags){
		if(tags[key].className == classname){
			list.push(tags[key]);
		}
	}
	return list;
}

 function getlength(s) { 
	var l = 0; 
	var a = s.split(""); 
	for (var i=0; i < a.length; i++) { 
		if ( a[i].charCodeAt(0)<299 ) { 
			l++; 
		} else { 
			l+=2; 
		} 
	} 
	return l; 
}

function getsubstr(s, limit){		
	var l = 0;
	var str = [];
	var a = s.split("");
	for(var i = 0; i < a.length; i++){
		if(a[i].charCodeAt(0)<299){
			l++;
		}else{
			l = l + 2;
		}
		if(l < limit){
			str.push(a[i]);
		}else{
			str = str.join("") + '...';
			return str;
		}
	}

	str = str.join("");

	return str;
}