<!doctype html> 
<html lang="en"> 
<head> 
<meta charset="UTF-8">
<title> 期末考试程序 </title>
 <style type="text/css">
 body{
      margin:0;
      cursor:pointer;
     }
 	div{
        background-color:rgba(100,100,100,0.1);
 	    box-sizing:border-box;
 	    border:1px solid rgb(100,100,200);
 	    border-radius:50%;
 	    margin:0;
 	    padding:0;
 	    position:absolute;
        transition:all 0.5s;
      } 
div.bd{ 
    background-color:rgba(0,100,100,0.05);
 	  border:0px solid ;
 	  border-radius: 0% ;
       }
 div p{ 
        margin: auto;
        padding: 10%;
        color:rgb(0,200,0);
        text-align:center;
        text-shadow:1px 1px rgb(0,100,100);
      } 	 
</style> 
</head> 
<body> 
<script type="text/javascript"> 
    const NUMS = 6 ;
    var tsBalls = [] ;
    var sn = 0 ; 
    const S = ['考生的信息，在这里显示。离离原上草，一岁一枯荣。野火烧不尽，春风吹又生。远芳侵古道，晴翠接荒城。又送王孙去，萋萋满别情。' , '艳色天下重，西施宁久微。朝为越溪女，暮作吴宫妃。贱日岂殊众，贵来方悟稀。邀人傅脂粉，不自著罗衣。君宠益娇态，君怜无是非。当时浣纱伴，莫得同车归。持谢邻家子，效颦安可希！' , '绝代有佳人，幽居在空谷。自云良家子，零落依草木。关中昔丧乱，兄弟遭杀戮。官高何足论，不得收骨肉。世情恶衰歇，万事随转烛。夫婿轻薄儿，新人美如玉。合昏尚知时，鸳鸯不独宿。但见新人笑，那闻旧人哭！在山泉水清，出山泉水浊。侍婢卖珠回，牵萝补茅屋。摘花不插发，采柏动盈掬。天寒翠袖薄，日暮倚修竹。'] ;
    document.body.onmousemove = document.body.ontouchmove = function(){ 
    for(let ball of tsBalls){ 
    ball.setPositionDiv() ; 
    } 
};
  document.body.onclick = function(){ 
    for(let ball of tsBalls){ 
    ball.randPositionDiv() ; 
} 
}; 

document.body.ondblclick = function(){ 
console.log('double click');
 for(let ball of tsBalls){ 
    this.removeChild(ball.dom) ;
 } 
tsBalls = [] ;
sn === S.length -1 ? sn = 0 : sn++ ; 
for(var i=0 ;i < S[sn].length ; i++){
var x0 = i % NUMS ;
 var y0 = Math.floor ( i / NUMS ) ;
 var ballObj = new Ball( x0 , y0 ) ; 
 ballObj.createDivDom(S[sn][i]) ;
 ballObj.randPositionDiv() ; 
 tsBalls.push(ballObj) ;
 }
 };
 var bodyWidth = window.innerWidth ;
 var bodyHeight = window.innerHeight ; 
 document.body.style.width = bodyWidth + 'px';
 document.body.style.height = bodyHeight + 'px' ; 
 var r = bodyWidth > bodyHeight ? bodyHeight / (NUMS*3/2) : bodyWidth / (NUMS*3/2) ;
 for(var i=0 ;i < S[sn].length ; i++){
    var x0 = i % NUMS ;
    var y0 = Math.floor ( i / NUMS ) ;
    var ballObj = new Ball( x0 , y0 ) ;
    ballObj.createDivDom(S[sn][i]) ; 
    ballObj.randPositionDiv() ;
    tsBalls.push(ballObj) ; 
} 
function Ball(x0 , y0){ 
 this.x0 = x0 ;
 this.y0 = y0 ;
 this.dom = null ;
 this.createDivDom = function(s){ 
 var divDom = document.createElement('div') ;
 var pDom = document.createElement('p') ;
 pDom.textContent = s ; 
 pDom.style.fontSize = r/2 + 'px' ;
 divDom.style.width = divDom.style.height = r + 'px' ;
 if(this.x0 === 5 || this.x0 === 11 ){ 
 divDom.className = 'bd' ;
 } 
 divDom.appendChild(pDom) ;
 document.body.appendChild(divDom) ;
 this.dom = divDom ;
 }; 
this.randPositionDiv = function(){ 
var x = Math.floor(Math.random() * bodyWidth ) ;
if(x >= bodyWidth - r){ 
x = bodyWidth - r ;
}
var y = Math.floor( Math.random() * bodyHeight ); 
if(y >= bodyHeight - r){
 y = bodyHeight - r ;
 } 
this.dom.style.left = x + 'px' ; 
this.dom.style.top = y + 'px' ; 
} ;
 this.setPositionDiv = function(){ 
var x = parseInt(this.x0) * r * 1.2 ; 
var y = parseInt(this.y0) * r * 1.2 ;
 this.dom.style.left = x + r + 'px' ; 
this.dom.style.top = y + r + 'px' ;
 };
 };
 </script>
 </body>
 </html>
