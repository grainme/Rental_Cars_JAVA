<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width">
        <title>Registration</title>
        <script src="https://cdn.tailwindcss.com"></script>
        <link rel="preconnect" href="https://fonts.googleapis.com">
	  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	  <link href="https://api.fontshare.com/v2/css?f[]=general-sans@500,300,600,400,700&display=swap" rel="stylesheet">
	  <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;600&family=Open+Sans&display=swap"
	    rel="stylesheet">
         <style>
   	body{
   	  font-family: 'General Sans', sans-serif;
   	 }
   </style>
    </head>
    <body >
        <div class="lg:flex bg-black">
            <div class="w-1/2">
                <div class="py-12 flex justify-center lg:justify-start lg:px-12">
                    <div class="cursor-pointer flex items-center">
                        <div class="w-10 bg-black">
                        </div>
                        <div class="text-2xl text-white ml-2 font-semibold">Tomobile.ma</div>
                    </div>
                </div>
                <div class="mt-6 px-12 sm:px-24 md:px-48 lg:px-12 lg:mt-16 xl:px-24 xl:max-w-2xl">
                    <h2 class="text-center text-4xl text-white font-display font-semibold lg:text-left xl:text-5xl
                    xl:text-bold">Registration Form!</h2>
                    <div class="mt-10">
					<form action="savecar" method="post" class="max-w-md mx-auto">
			        <div class="mb-4">
			            <label class="text-sm font-medium text-gray-200 m-2" for="username">Model</label>
			            <input type="text" name="model" id="username" class="w-full px-3 py-2 border rounded-lg">
			        </div>
			        <div class="mb-4">
			            <label class="text-sm font-medium text-gray-200 m-2" for="email">Available</label>
			            <input type="text" name="available" id="email" class="w-full px-3 py-2 border rounded-lg">
			        </div>
			        <div class="mb-4">
			            <label class="text-sm font-medium text-gray-200 m-2" for="role">Production year</label>
			            <input type="text" name="prod_year" id="role" class="w-full px-3 py-2 border rounded-lg">
			        </div>
			        <div class="mb-4">
			            <label class="text-sm font-medium text-gray-200 m-2" for="password">Rental Rate</label>
			            <input type="text" name="rental" id="password" class="w-full px-3 py-2 border rounded-lg">
			        </div>

					<div class="mt-10">
                        <button type="submit" class="bg-yellow-500 text-gray-100 p-2 w-full rounded-lg 
                        font-semibold focus:outline-none focus:shadow-outline hover:bg-yellow-600
                        shadow-lg">
                            Register
                        </button>
                    </div>

			    </form>

                    </div>
                </div>
            </div>
			<div class="hidden rounded-lg lg:flex items-center justify-center bg-gray-200 flex-1 h-screen">
			    <div class="w-full h-full">
			        <img src="./assets/images/2cars.jpg" alt="Login_Image" loading="lazy" class="w-full h-full object-cover">
			    </div>
			</div>
        </div>
    </body>
</html>
