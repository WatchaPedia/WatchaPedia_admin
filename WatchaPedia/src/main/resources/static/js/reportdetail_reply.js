const big_container = document.querySelector(".card-body");
console.log(big_container);

function blind_result() {
  const reportIdx = document.getElementById('hiddenIdx').innerText;
  const processAdmin = document.getElementById('hiddenSessionAdmin').innerText;
  const updateStatus = "블라인드";
  fetch('http://localhost:9090/api/report/update', {
    method: 'PUT',
    headers: {'content-Type': 'application/json'},
    body: JSON.stringify({
      "transaction_time":`${new Date()}`,
      "resultCode":"ok",
      "description":"정상",
      "data":{
        "reportIdx":`${reportIdx}`,
        "updateStatus" : `${updateStatus}`,
        "processAdmin" : `${processAdmin}`
      }
    })
  })
      .then(response => response.json())
      .then(data => {
        alert('업데이트 성공!')
        location.href = "/comment/report_page"
      }).catch(() =>{
        alert('업데이트 실패!')
        history.go()
      }

  )
}

function spoiler_result() {
  const reportIdx = document.getElementById('hiddenIdx').innerText;
  const processAdmin = document.getElementById('hiddenSessionAdmin').innerText;
  const updateStatus = "스포일러";
  fetch('http://localhost:9090/api/report/update', {
    method: 'PUT',
    headers: {'content-Type': 'application/json'},
    body: JSON.stringify({
      "transaction_time":`${new Date()}`,
      "resultCode":"ok",
      "description":"정상",
      "data":{
        "reportIdx":`${reportIdx}`,
        "updateStatus" : `${updateStatus}`,
        "processAdmin" : `${processAdmin}`
      }
    })
  })
      .then(response => response.json())
      .then(data => {
        alert('업데이트 성공!')
        location.href = "/comment/report_page"
      }).catch(() =>{
        alert('업데이트 실패!')
        history.go()
      }
  )
}

function noproblem_result() {
  const reportIdx = document.getElementById('hiddenIdx').innerText;
  const processAdmin = document.getElementById('hiddenSessionAdmin').innerText;
  const updateStatus = "문제없음";
  fetch('http://localhost:9090/api/report/update', {
    method: 'PUT',
    headers: {'content-Type': 'application/json'},
    body: JSON.stringify({
      "transaction_time":`${new Date()}`,
      "resultCode":"ok",
      "description":"정상",
      "data":{
        "reportIdx":`${reportIdx}`,
        "updateStatus" : `${updateStatus}`,
        "processAdmin" : `${processAdmin}`
      }
    })
  })
      .then(response => response.json())
      .then(data => {
        alert('업데이트 성공!')
        location.href = "/comment/report_page"
      }).catch(() =>{
        alert('업데이트 실패!')
        history.go()
      }
  )
}
