        //id가 heading인 요소를 가져옴
        var heading = document.getElementById("heading")
        
        //onlick 익명함수 - 클릭했을떄 실행할 함수 정의의
        heading.onclick = function(){
            if(heading.style.color === "red"){
                heading.style.color = "blue";
            }
            else{
                heading.style.color = "red";
            }
        }