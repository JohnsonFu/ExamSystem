function login(){
	var email = $("#email").val();
	var password = $("#password").val();
	var data ={
	    email: email,
	    password: password
	}
	$.ajax({
        type: "POST",
        url:"/login",
//        data: $.param({"email":$("#email").val(),"password":$("#password").val()}),
//        dataType:json,
        data:data,
        success:function(data){
        	var path = data.path;
        	window.location.href =path
        },
        error:function(XMLHttRequest,textStatus, errorThrown){
        	alert(XMLHttRequest.responseText);
//        	alert(XMLHttpRequest.status);
//        	alert(XMLHttpRequest.readyState);
//        	alert(textStatus);
        },
    });
}