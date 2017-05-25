$(function(){
	function isWeiXin(){
	    var ua = window.navigator.userAgent.toLowerCase();
	    if(ua.match(/MicroMessenger/i) == 'micromessenger' || ua.match(/qq/i) == 'qq'){
	    	return true;
	    }else{
	        return false;
	    }
	}
	if(isWeiXin()){
		$("header").hide();
		$(".content").css("top","0");
	}
});