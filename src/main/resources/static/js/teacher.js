function upload_question(){
	var formData = new FormData($("#question_excel")[0]);
//	var password = $("#password").val();
//	var data ={
//	    email: email,
//	    password: password
//	}
//	alert(formData);
	$.ajax({
        type: "POST",
        url:"/question",
        data:formData,
        processData: false,
        contentType: false,
        success:function(data){
        	alert(data.fileName);
        	alert(data.filePath);
//        	var path = data.path;
//        	window.location.href =path
        },
        error:function(XMLHttRequest,textStatus, errorThrown){
        	alert(XMLHttRequest.responseText);
//        	alert(XMLHttpRequest.status);
//        	alert(XMLHttpRequest.readyState);
//        	alert(textStatus);
        },
    });
}