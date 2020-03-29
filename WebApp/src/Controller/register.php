<?php
// src/Controller/register.php
namespace App\Controller;

use Symfony\Component\HttpFoundation\Response;

class register
{
    public function showTitle()
    {
        return new Response(
            '<html><body>Register Page</body></html>'
        );
    }
}