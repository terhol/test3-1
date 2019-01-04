# Test 3-1
Third test version 1 from subject PB162 on [FI MUNI](https://www.fi.muni.cz/)

## Description (Czech language only)
Rozhraní ani předdefinované třídy neměňte s výjimkou třídy `IceCream`
(viz zadání). Metody NEMUSÍTE dokumentovat pomocí JavaDoc komentářů.
Používejte zásadně privátní atributy.

Úloha simuluje prodej zmrzliny. Prodavač má dané počty porcí různých
druhů zmrzliny. Zmrzlinu je možné prodat zákazníkovi (tj. snížit
dostupné porce) nebo zmrzlinu doplnit (buďto přidat zcela nový druh,
nebo zvýšit počet porcí existující zmrzliny).

**Zadání:**

-   Úpravou třídy `IceCream` definujte přirozené uspořádání produktů
    lexikograficky vzestupně podle českého názvu.
-   Vytvořte třídu `VendorImpl` implementující rozhraní `Vendor`. Metoda
    `save()` bude zapisovat zmrzliny v pořadí daném jejich přirozeným
    uspořádáním! Metoda `save()` vyhodí výjimku `IOException` při
    jakékoliv chybě vstupu/výstupu!

Třída `Demo` by měla v aktuálním adresáři, ze kterého se spouští,
vytvořit soubor *vendor-out.txt* s následujícím obsahem:

        bananova:banana:20
        cokoladova:chocolade:20
        jahodova:strawberry:20
        rumova:de luxe:10
        vanilkova:vanilla:30

## License
MIT