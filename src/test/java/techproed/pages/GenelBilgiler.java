package techproed.pages;

public class GenelBilgiler {
    /*
***MAVEN******
-JAVA Projelerini olusturma ve yonetme araci(Project built tool)
-pom.xml ile dependencies(eklentiler) kolaylikla projeye eklenebilir.
-Maven bir yemegin tenceresi gibidir. Bu tencerenin icine istedigimiz icerikleri ekleyebiliriz : selenium, testng, java faker, apache,...
-Maven alternatifleri nelerdir?
*gradle, Ant, groovy, kotlin..
-Maven proje olusturmak, calistirmak, run etmek, ve deploy etmek icin de kulanilabilir..
***SELENIUM***
1.Selenium nedir ve ne icin kullanilir?
-Jar dosyasidir.
-Bu dosyada bircok hazir class ve metotlar vardir
-Bu class ve metotlar, web atomasyonu icin kullanilir.
-Open source(ucretsizdir)
-Farkli kodlama dilleriyle calisir(java,c#,js,python,..)
-Farkli isletin sistemleriyle de calisir(macos, windows, linux)
-Selenium ile direk olarak mobile ve desktop otomasyonu yapilamaz, ama third-party araciligiyla mobil(APPIUM) ve desktop atomasyonu selenium(auto it,robot class) ile yapilabilir
-Selenium ile:
    -web elementler bulunmasi
    -iframe, multiple window, alerts,.. gubu web elementlerle etkilesim
    -Klavye-mouse islemlerinin yapilmasi
    -jsexecutor gibi paketlerin kullanilmasi
*****************************************
****JUNIT****
1. JUnit neder ve nasil kullanilir?
-Junit bir test frameworkudur
-Bir tur jar dosyasidir
-Test case olusturmada(@Test), Before/After annotasyonlarinda, Assertion(Assert) larda kullanilir
-Junit eski ve basit bir test framworkudur. Advanced sekli TestNG dir.
-Juniti genelde developerlar unit test ler icin kullanir
*********************************
******TestNG****************
1. TestNG nedir?
-TestNG yeni nesil test frameworkudur
-Bir jar dosyasidir
-Test case olusturmada(@Test), Before/After annotasyonlarinda, Assertion(Assert) larda kullanilir
-TestNG de ek anotasyonlar vardir
    *BeforeSuite, BeforeGroups, BeforeTest,..
    *SoftAssertion
    *DependsOnGroups,DependsOnMethods,...
    *TestNG Listeners(ITestListeners,IRetryAnalyzer,IAnnotationTransformer)
        *Kodlari dinler(PASS, FAIL, SKIP)
        *Ornegin, bir test case FAIL ettikden hemen sonra olmasini istedigimiz islemleri listenerslar yardimiyla yapabiliriz. Benim TestNG frameworkumde test case FAIL eder etmez, ekrar goruntusu alma ozelligi vardir.
        *Bir diger ornek ise, bir testcase FAIL oldugunda birkez daha listenerslar yardimizya calistirabiliriz.
    *TestNG xml dosyalari
        *Testcase leri calistirmak icin
            *Belirli metot, class, paket, ve guruplar icin xml dosyalari olusturup o xml dosyalarina eklemis oldugum test caseleri calistirabiliriz
        *Frameworke ek ozellikler getirmek ve ek ayarlar
            *Test gruplari olusturmak icin
            *parallel test yapmak icin
            *cross browser test
            *smoke testlerin calistirilmasi
            *regression testlerin calistirilmasi
            *listeners larin kolay kullanimi icin
    *Parallel Test
        *TestNG dosyalari yardimiyla parallel test yapilabilir
            *thread-count : browser sayisi
            *parallel     : paralel test icin
    *TestNG Raporlari
        *TestNG nin kendine ozgu raporlari vardir
            *emailable reporter
            *failed reporter
            *test html reporter
            *suite html reporter
    *data provider
        *Data kaynagi olarak kullanilir
        *Data lari test caselere aktarir
        *En onemli ozelliklerinden birisi, datalari atomatik olarak iterate etmesidir
        *data provider ile paralel test yapilabilir.
**********************************************************************************
Interview Sorulari :
1. Release(birakmak,yayinlamak) e katildin mi?
-Evet.
-Yilda 2 onemli (fall, spring) release, 4 minor release olur
Her bir release den once regression testi yapilir.
Relase sirasinda yasanan problemlerin testi icin de tester hazir bulunur.
Release lerde PO lar ve regression testerlar aktifdir.
-






     */
}

