<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Dataverse - Car Rental Service</title>
  <link rel="stylesheet" href="./assets/css/style.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://api.fontshare.com/v2/css?f[]=general-sans@500,300,600,400,700&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;600&family=Open+Sans&display=swap"
    rel="stylesheet">
    
   <style>
   	html{
   	  font-family: 'General Sans', sans-serif;
   	  font-size : .6rem;
   	 }
   	 #start{font-size:1.5rem;}
   	 #blog{
   	 font-size: 2rem;}
   </style>
</head>

<body >
  <header class="header " data-header>
    <div class="container">

      <div class="overlay" data-overlay></div>

      <h1 class="text-black">TOMOBILE.ma</h1>

      <div class="header-actions">

        <a href="#featured-car" class="btn" aria-labelledby="aria-label-txt">
          <ion-icon name="car-outline"></ion-icon>

          <span id="aria-label-txt">Explore cars</span>
        </a>

        <a href="loginPage.jsp" class="btn user-btn" aria-label="Profile">
          <ion-icon name="person-outline"></ion-icon>
        </a>

        <button class="nav-toggle-btn" data-nav-toggle-btn aria-label="Toggle Menu">
          <span class="one"></span>
          <span class="two"></span>
          <span class="three"></span>
        </button>

      </div>

    </div>
  </header>





  <main>
    <article>
      <section class="section hero" id="home">
        <div class="container">
        <div class="hero-title">Car Rental Service.</div>
        <div class="hero-text">The biggest virtual car rental store in Morocco</div>
          <div class="hero-banner"></div>

        </div>
      </section>

      <section class="section get-start" id="start">
        <div class="container">

          <h2 class="h2 section-title">Get started with 4 simple steps</h2>

          <ul class="get-start-list">

            <li>
              <div class="get-start-card">

                <div class="card-icon icon-1">
                  <ion-icon name="person-add-outline"></ion-icon>
                </div>

                <h3 class="card-title">Create a profile</h3>

                <p class="card-text">
                  If you are going to use a passage of Lorem Ipsum, you need to be sure.
                </p>

                <a href="#" class="card-link">Get started</a>

              </div>
            </li>

            <li>
              <div class="get-start-card">

                <div class="card-icon icon-2">
                  <ion-icon name="car-outline"></ion-icon>
                </div>

                <h3 class="card-title">Tell us what car you want</h3>

                <p class="card-text">
                  Various versions have evolved over the years, sometimes by accident, sometimes on purpose
                </p>

              </div>
            </li>

            <li>
              <div class="get-start-card">

                <div class="card-icon icon-3">
                  <ion-icon name="person-outline"></ion-icon>
                </div>

                <h3 class="card-title">Match with seller</h3>

                <p class="card-text">
                  It to make a type specimen book. It has survived not only five centuries, but also the leap into
                  electronic
                </p>

              </div>
            </li>

            <li>
              <div class="get-start-card">

                <div class="card-icon icon-4">
                  <ion-icon name="card-outline"></ion-icon>
                </div>

                <h3 class="card-title">Make a deal</h3>

                <p class="card-text">
                  There are many variations of passages of Lorem available, but the majority have suffered alteration
                </p>

              </div>
            </li>

          </ul>

        </div>
      </section>
      <section class="section blog" id="blog">
        <div class="container">

          <h2 class="h2 section-title">Our Blog</h2>

          <ul class="blog-list has-scrollbar">

            <li>
              <div class="blog-card">

                <figure class="card-banner">

                  <a href="#">
                    <img src="./assets/images/blog-1.jpg" alt="Opening of new offices of the company" loading="lazy"
                      class="w-100">
                  </a>

                  <a href="#" class="btn card-badge">Company</a>

                </figure>

                <div class="card-content">

                  <h3 class="h3 card-title">
                    <a href="#">Opening of new offices of the company</a>
                  </h3>

                  <div class="card-meta">

                    <div class="publish-date">
                      <ion-icon name="time-outline"></ion-icon>

                      <time datetime="2022-01-14">January 14, 2022</time>
                    </div>

                    <div class="comments">
                      <ion-icon name="chatbubble-ellipses-outline"></ion-icon>

                      <data value="114">114</data>
                    </div>

                  </div>

                </div>

              </div>
            </li>

            <li>
              <div class="blog-card">

                <figure class="card-banner">

                  <a href="#">
                    <img src="./assets/images/blog-2.jpg" alt="What cars are most vulnerable" loading="lazy"
                      class="w-100">
                  </a>

                  <a href="#" class="btn card-badge">Repair</a>

                </figure>

                <div class="card-content">

                  <h3 class="h3 card-title">
                    <a href="#">What cars are most vulnerable</a>
                  </h3>

                  <div class="card-meta">

                    <div class="publish-date">
                      <ion-icon name="time-outline"></ion-icon>

                      <time datetime="2022-01-14">January 14, 2022</time>
                    </div>

                    <div class="comments">
                      <ion-icon name="chatbubble-ellipses-outline"></ion-icon>

                      <data value="114">114</data>
                    </div>

                  </div>

                </div>

              </div>
            </li>

            <li>
              <div class="blog-card">

                <figure class="card-banner">

                  <a href="#">
                    <img src="./assets/images/blog-3.jpg" alt="Statistics showed which average age" loading="lazy"
                      class="w-100">
                  </a>

                  <a href="#" class="btn card-badge">Cars</a>

                </figure>

                <div class="card-content">

                  <h3 class="h3 card-title">
                    <a href="#">Statistics showed which average age</a>
                  </h3>

                  <div class="card-meta">

                    <div class="publish-date">
                      <ion-icon name="time-outline"></ion-icon>

                      <time datetime="2022-01-14">January 14, 2022</time>
                    </div>

                    <div class="comments">
                      <ion-icon name="chatbubble-ellipses-outline"></ion-icon>

                      <data value="114">114</data>
                    </div>

                  </div>

                </div>

              </div>
            </li>

            <li>
              <div class="blog-card">

                <figure class="card-banner">

                  <a href="#">
                    <img src="./assets/images/blog-4.jpg" alt="WhatÂ´s required when renting a car?" loading="lazy"
                      class="w-100">
                  </a>

                  <a href="#" class="btn card-badge">Cars</a>

                </figure>

                <div class="card-content">

                  <h3 class="h3 card-title">
                    <a href="#">WhatÂ´s required when renting a car?</a>
                  </h3>

                  <div class="card-meta">

                    <div class="publish-date">
                      <ion-icon name="time-outline"></ion-icon>

                      <time datetime="2022-01-14">January 14, 2022</time>
                    </div>

                    <div class="comments">
                      <ion-icon name="chatbubble-ellipses-outline"></ion-icon>

                      <data value="114">114</data>
                    </div>

                  </div>

                </div>

              </div>
            </li>

            <li>
              <div class="blog-card">

                <figure class="card-banner">

                  <a href="#">
                    <img src="./assets/images/blog-5.jpg" alt="New rules for handling our cars" loading="lazy"
                      class="w-100">
                  </a>

                  <a href="#" class="btn card-badge">Company</a>

                </figure>

                <div class="card-content">

                  <h3 class="h3 card-title">
                    <a href="#">New rules for handling our cars</a>
                  </h3>

                  <div class="card-meta">

                    <div class="publish-date">
                      <ion-icon name="time-outline"></ion-icon>

                      <time datetime="2022-01-14">January 14, 2022</time>
                    </div>

                    <div class="comments">
                      <ion-icon name="chatbubble-ellipses-outline"></ion-icon>

                      <data value="114">114</data>
                    </div>

                  </div>

                </div>

              </div>
            </li>

          </ul>

        </div>
      </section>

    </article>
  </main>
  <footer class="footer">
    <div class="container">

      <div class="footer-top">

        <div class="footer-brand">
          <a href="#" class="logo">
            <h2 class="text-black">TOMOBILE.ma</h2>
          </a>

          <p class="footer-text">
            Search for cheap rental cars in Khouribga. With a diverse fleet of 19,000 vehicles, Waydex offers its
            consumers an
            attractive and fun selection.
          </p>
        </div>

        <ul class="footer-list">

          <li>
            <p class="footer-list-title">Company</p>
          </li>

          <li>
            <a href="#" class="footer-link">About us</a>
          </li>

          <li>
            <a href="#" class="footer-link">Pricing plans</a>
          </li>

          <li>
            <a href="#" class="footer-link">Our blog</a>
          </li>

          <li>
            <a href="#" class="footer-link">Contacts</a>
          </li>

        </ul>

        <ul class="footer-list">

          <li>
            <p class="footer-list-title">Support</p>
          </li>

          <li>
            <a href="#" class="footer-link">Help center</a>
          </li>

          <li>
            <a href="#" class="footer-link">Ask a question</a>
          </li>

          <li>
            <a href="#" class="footer-link">Privacy policy</a>
          </li>

          <li>
            <a href="#" class="footer-link">Terms & conditions</a>
          </li>

        </ul>

        <ul class="footer-list">

          <li>
            <p class="footer-list-title">Neighborhoods in New York</p>
          </li>

          <li>
            <a href="#" class="footer-link">Manhattan</a>
          </li>

          <li>
            <a href="#" class="footer-link">Central New York City</a>
          </li>

          <li>
            <a href="#" class="footer-link">Upper East Side</a>
          </li>

          <li>
            <a href="#" class="footer-link">Queens</a>
          </li>

          <li>
            <a href="#" class="footer-link">Theater District</a>
          </li>

          <li>
            <a href="#" class="footer-link">Midtown</a>
          </li>

          <li>
            <a href="#" class="footer-link">SoHo</a>
          </li>

          <li>
            <a href="#" class="footer-link">Chelsea</a>
          </li>

        </ul>

      </div>

      <div class="footer-bottom">

        <ul class="social-list">

          <li>
            <a href="#" class="social-link">
              <ion-icon name="logo-facebook"></ion-icon>
            </a>
          </li>

          <li>
            <a href="#" class="social-link">
              <ion-icon name="logo-instagram"></ion-icon>
            </a>
          </li>

          <li>
            <a href="#" class="social-link">
              <ion-icon name="logo-twitter"></ion-icon>
            </a>
          </li>

          <li>
            <a href="#" class="social-link">
              <ion-icon name="logo-linkedin"></ion-icon>
            </a>
          </li>

          <li>
            <a href="#" class="social-link">
              <ion-icon name="logo-skype"></ion-icon>
            </a>
          </li>

          <li>
            <a href="#" class="social-link">
              <ion-icon name="mail-outline"></ion-icon>
            </a>
          </li>

        </ul>

        <p class="copyright">
          &copy; 2023 <a href="#">code with grainme</a>. All Rights Reserved
        </p>

      </div>

    </div>
  </footer>

  <script src="./assets/js/script.js"></script>

  <!-- 
    - ionicon link
  -->
  <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
  <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

</body>

</html>