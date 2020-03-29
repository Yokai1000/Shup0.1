<?php
// src/Controller/home.php
namespace App\Controller;

use Symfony\Component\HttpFoundation\Response;

class home
{
    public function showTitle()
    {
        return new Response(
            '<html><body>Home Page</body></html>'
        );
    }
}