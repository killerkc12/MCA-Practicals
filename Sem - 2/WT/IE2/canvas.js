const canvas = document.querySelector('canvas');
const ctx = canvas.getContext('2d');
window.addEventListener('load',draw);
function draw() {
    ctx.clearRect(0,0,800,800);
    for(let i = 0; i < 300; i++) {

    var x = Math.floor(Math.random()*800);
    var y = Math.floor(Math.random()*600);
    var radius = Math.floor(Math.random()*20)+10;

    var r = Math.floor(Math.random()*255);
    var g = Math.floor(Math.random()*255);
    var b = Math.floor(Math.random()*255);

    ctx.beginPath();
    ctx.arc(x,y,radius,Math.PI*2,0,false);
    ctx.fillStyle = "rgba(" + r + "," + g + "," + b + ",1)";
    ctx.fill();
    ctx.closePath();
    }
}