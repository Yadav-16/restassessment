
function checkIfEmpty() {
	// read customer typed input in userid text box using javascript code
	//var useridTextbox=document.getElementById("uid").value;
	// read customer typed input in userid text box using jquery code
	var useridTextbox=$("#uid").val();	
	//var passwordTextbox=document.getElementById("psw").value;
	var passwordTextbox=$("#pwd").val();
	if(useridTextbox == "")
	{
		/*$("#uid").val(" PLEASE TYPE USERID ");
		$("#uid").css("background","yellow");
	//	document.getElementById("uid").style="background:red"; */
        alert("userid is mandatory");
		return false; 
	}	
	else if(passwordTextbox == ""){
		alert(" PLEASE TYPE PASSWORD");
	//	$(".psw").css("background","yellow");
	//	document.getElementById("psw").style="background:red";
	//	alert("password is mandatory");
		return false;
	}
	return true;



}



/* for notes

function checkUser() {
	var ajaxJavascriptObject={
        url: '/checkUser',
        type: 'post',
        data: 'userid='+$("#uid").val(),
        context: this,
        success: function (data) {
               if(data=="unavailable")
		       alert("userid already taken");
        },
        error: function (data) {
                  console.log("failure");
        }
    };
    $.ajax(ajaxJavascriptObject);
}
function trackInput()
{
	console.log('clicked input element');
}	
/*
	$("input") = access by html element name
	$("#uid") = access by attribute id
	$(".classuid") = access by attribute class



function readWriteJquery (){
	var cusTypedUserid=$("#uid").val();
	if(cusTypedUserid == "")
	{	
		$("#uid").css("background","red");
		$("#loginButton").fadeOut(10000);
		//$("#loginButton").hide();
	}
	else
		$("#loginButton").slideDown(10000);
		//$("#loginButton").show();
	
		//$("#uid").val("please type userid");
}
function checkUser (){
	
	var serverCommunicationObject={
	        url: '/checkUser',
	        type: 'post',
	        data: {
	                  userid:$("#uid").val()
			},
	        context: this,
	        success: function (data) {
	                  if(data == "unavailable")
				  		alert("userid already taken");
	        },
	        error: function (data) {
	                  console.log("failure");
	        }
	};
	
	$.ajax(serverCommunicationObject);	
	
	
}

function mouseIsOnUserid(){
	$("#uid").css("background","green");
	console.log("customer has placed mouse on userid text box");
}
function mouseIsOffUserid(){
	$("#uid").css("background","white");
	console.log("customer has  mouse from userid text box");
}

function trackUidPwdValue(){
	var u=$("#uid").val();
	var p=$(".psw").val();
	if( u == "" || p=="")
		$("#loginButton").slideUp(5000);   // 5000 milli sec= 5 sec     
	else
		$("#loginButton").slideDown(5000);        
	
}
// monitor, implement the code for 
// event listeners
$(document).ready(function() {

//	HTML webpage section / customer interaction(events) / javascript takes action
	$("#loginButton").        click				  (checkIfEmpty);
//	$("#uid").mouseenter(mouseIsOnUserid);
//	$("#uid").mouseenter(mouseIsOnUserid);
	// blur is opposite of focus/active
//	$("#uid").blur(trackUidPwdValue);
//	$(".psw").blur(trackUidPwdValue);
});

*/ //for notes
