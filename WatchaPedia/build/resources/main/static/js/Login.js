function sendit(){

const Adminid = document.getElementById('Adminid');
const Adminpw = document.getElementById('Adminpw');



if(Adminid.value == ''){
    // 아무것도 입력되지 않는 아이디 칸
    alert('아이디를 입력하세요');
    Adminid.focus();
    return false;
    // 안넘어가게함
}



if(Adminpw.value == ''){
    // 아무것도 입력되지 않는 비밀번호 칸
    alert('비밀번호를 입력하세요');
    Adminpw.focus();
    return false;
}


return true;

}
