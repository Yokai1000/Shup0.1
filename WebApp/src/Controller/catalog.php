<?php
// src/Controller/catalog.php
namespace App\Controller;

use Symfony\Component\HttpFoundation\Response;

class catalog
{
    public function showTitle()
    {
        return new Response(
            '<html><body>Catalog Page</body></html>'
        );
    }
}