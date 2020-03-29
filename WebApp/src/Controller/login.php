<?php
// src/Controller/login.php
namespace App\Controller;

use Symfony\Component\HttpFoundation\Response;

class login
{
    public function showTitle()
    {
        return new Response(
            '<html><body>Login Page</body></html>'
        );
    }
}