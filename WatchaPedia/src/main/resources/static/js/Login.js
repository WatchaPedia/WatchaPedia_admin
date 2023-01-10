function sendit() {
  const Adminid = document.getElementById("Adminid");
  const Adminpw = document.getElementById("Adminpw");
  flag = false;

  if (Adminid.value == "") {
    // 아무것도 입력되지 않는 아이디 칸
    alert("아이디를 입력하세요");
    Adminid.focus();
    return false;
    // 안넘어가게함
  }

  if (Adminpw.value == "") {
    // 아무것도 입력되지 않는 비밀번호 칸
    alert("비밀번호를 입력하세요");
    Adminpw.focus();
    return false;
  }

  //   이 if문은 나중에 데이터를 주면서 지워야하는 부분임!! (틀 만들 때 submit 안되게 하는 실험용 if문)
  if (Adminpw.value == "a" || Adminid.value == "a") {
    alert("아이디 혹은 비밀번호가 틀렸을때의 가정!");
    const warning = document.querySelector(".hidden_warning");
    warning.classList.add("visible");
    console.log(warning);
    return false;
  }

  return true;
}
