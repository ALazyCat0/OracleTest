function timestampToTime(timestamp) {
    var date = new Date(timestamp * 1);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
    var Y = date.getFullYear() + '-';
    var M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    var D = (date.getDate() < 10 ? '0'+date.getDate() : date.getDate()) + ' ';
    var h = (date.getHours() < 10 ? '0'+date.getHours() : date.getHours()) + ':';
    var m = (date.getMinutes() < 10 ? '0'+date.getMinutes() : date.getMinutes()) + ':';
    var s = (date.getSeconds() < 10 ? '0'+date.getSeconds() : date.getSeconds());
    return Y+M+D+h+m+s;
}
			
function MillisecondToDate(msd) {  
    var time = parseFloat(msd) /1000;  
    if (null!= time &&""!= time) {  
        if (time >60&& time <60*60) {  
            time = parseInt(time /60.0) +"分钟"+ parseInt((parseFloat(time /60.0) -  
            parseInt(time /60.0)) *60) +"秒";  
        }else if (time >=60*60&& time <60*60*24) {  
            time = parseInt(time /3600.0) +"小时"+ parseInt((parseFloat(time /3600.0) -  
            parseInt(time /3600.0)) *60) +"分钟"+  
            parseInt((parseFloat((parseFloat(time /3600.0) - parseInt(time /3600.0)) *60) -  
            parseInt((parseFloat(time /3600.0) - parseInt(time /3600.0)) *60)) *60) +"秒";  
        }else {  
            time = parseInt(time) +"秒";  
        }  
    }else{  
        time = "0 时 0 分0 秒";  
    }  
    return time;  
  
}  