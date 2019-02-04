
function displayChart(score) {
    var canvas;
    var ctx;
    var lastend = 0;
    var pieColor = ["red", "green"];
    var pieData = [5-score, score];
    var pieTotal = 5;

    canvas = document.getElementById("canvas");
    ctx = canvas.getContext("2d");

    ctx.clearRect(0, 0, canvas.width, canvas.height);

    var hwidth = ctx.canvas.width / 2;
    var hheight = ctx.canvas.height / 2;


    for (var i = 0; i < pieData.length; i++) {
        ctx.fillStyle = pieColor[i];
        ctx.beginPath();
        ctx.moveTo(hwidth, hheight);
        ctx.arc(hwidth, hheight, hheight, lastend, lastend +
            (Math.PI * 2 * (pieData[i] / pieTotal)), false);


        ctx.lineTo(hwidth, hheight);
        ctx.fill();



        var radius = hheight / 1.5;
        var endAngle = lastend + (Math.PI * (pieData[i] / pieTotal));
        var setX = hwidth + Math.cos(endAngle) * radius;
        var setY = hheight + Math.sin(endAngle) * radius;
        ctx.fillStyle = "#ffffff";
        ctx.font = '14px Calibri';
        ctx.fillText(pieData[i], setX, setY);

        lastend += Math.PI * 2 * (pieData[i] / pieTotal);
    }
}