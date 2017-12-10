function login(){
	var email = $("#email").val();
	var password = $("#password").val();
	var data ={
	    email: email,
	    password: password
	}
	$.ajax({
        type: "POST",
        url:"/",
        data: data,
        traditional:true
    });
}