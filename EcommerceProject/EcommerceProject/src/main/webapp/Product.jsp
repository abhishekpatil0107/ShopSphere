<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="styles.css">
<style>

/* General styles */
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    margin: 0;
    padding: 0;
}

/* Container for all boxes */
.box {
    width: 22%;
    background-color: white;
    margin: 1%;
    padding: 15px;
    float: left;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
    border-radius: 8px;
    box-sizing: border-box;
    transition: transform 0.2s;
}

.box:hover {
    transform: scale(1.03);
}

/* Title inside each box */
.box-content h2 {
    font-size: 20px;
    font-weight: bold;
    margin: 10px 0;
    text-align: center;
}

/* Image inside each box */
.box-image {
    width: 100%;
    height: 180px;
    background-size: cover;
    background-position: center;
    border-radius: 6px;
    margin-bottom: 10px;
}

/* Paragraph inside each box */
.box-content p {
    color: #0073e6;
    font-weight: bold;
    text-align: center;
    margin: 0;
}

/* Container fix */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}
</style>
</head>
<body>
<div>Heloo</div>

        <div class="box1 box">
            <div class="box-content">
                <h2>Electronics</h2>
                <div class="box-image" style="background-image: url('images/box1.jpeg');"></div>
                <p>See More</p>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Beauty Products</h2>
                <div class="box-image" style="background-image: url('box2.jpeg');"></div>
                <p>See More</p>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Mobile Accesories</h2>
                <div class="box-image" style="background-image: url('box3.jpeg');"></div>
                <p>See More</p>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Educational</h2>
                <div class="box-image" style="background-image: url('box4.jpeg');"></div>
                <p>See More</p>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Clothes</h2>
                <div class="box-image" style="background-image: url('box5.jpeg');"></div>
                <p>See More</p>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Wathes</h2>
                <div class="box-image" style="background-image: url('box6.jpg');"></div>
                <p>See More</p>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Bags</h2>
                <div class="box-image" style="background-image: url('box7.jpeg');"></div>
                <p>See More</p>
            </div>
        </div>
         <div class="box">
            <div class="box-content">
                <h2>Kitchen Accesories</h2>
                <div class="box-image" style="background-image: url('box8.jpeg');"></div>
                <p>See More</p>
            </div>
       
    </div>

</body>
</html>