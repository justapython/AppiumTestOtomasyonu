Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

Product
--------
* "1" kadar bekle
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/btnSuccess']" xpath'li elemente tıkla
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" İd'li elemente tıkla
* "2" kadar bekle
* Elementi "//*[@text='Kadın']" bul ve "Kadın" değeri ile karsilastirarak sayfada olundugunu dogrula
* "2" kadar bekle
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/nav_categories']" xpath'li elemente tıkla
* "2" kadar bekle
* Elementi "//*[@text='Seri Sonu']" bul ve "Seri Sonu" değeri ile kategoriler sayfasinda olundugunu dogrula
* "2" kadar bekle
* "//*[@text='Kadın']" xpath'li elemente tıkla
* "2" kadar bekle
* "//*[@text='Pantolon']" xpath'li elemente tıkla
* "2" kadar bekle
* Scroll page
* "2" kadar bekle
* Scroll page
* "2" kadar bekle
* Random urun sec
* "2" kadar bekle
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/imgFav']" Favorilere ekle
* "2" kadar bekle
* Giris elementi "//*[@text='Giriş Yap']" bul ve "Giriş yap" değerini kontrol et
* "2" kadar bekle
* "//*[@text='E - posta Adresi']" yerine "appium.login.control" değerini yaz
* "2" kadar bekle
* "//*[@text='Parola']" yerine "login.passwd" değerini yaz
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/ivBack" İd'li elemente tıkla
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/ivBack" İd'li elemente tıkla
* "2" kadar bekle
* Random urun sec
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/relLayAddCartBtn" ürünü sepete ekle
* "2" kadar bekle

