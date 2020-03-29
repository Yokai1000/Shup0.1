<?php
// src/Controller/card.php
namespace App\Controller;

use Symfony\Component\HttpFoundation\Response;

class card
{
    public function showTitle()
    {
        return new Response(
            '<html><body>Card Page</body></html>'
        );
    }
}