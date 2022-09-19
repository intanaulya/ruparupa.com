import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

"browse web ruparupa.com "
WebUI.navigateToUrl('https://www.ruparupa.com/')

"Step 1 : tap button 'kategori'"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Ruparupa  No.1 Home Living  Furniture _0f4397/div_Kategori'))

"Step 2 : tap button 'rumah tangga'"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Ruparupa  No.1 Home Living  Furniture _0f4397/div_Rumah Tangga'))

"Step 3 : tap checkbox buy 1 get 1 on filter promo"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Jual Peralatan Rumah Tangga - Harga Te_ee196f/label_Buy 1 Get 1'))

"Step 4 : choose 'produk terbaru' filter"
WebUI.selectOptionByValue(findTestObject('Object Repository/Purchase/Page_Jual Peralatan Rumah Tangga - Harga Te_ee196f/select_Paling RelevanHarga TermurahHarga Te_ce4ccc'), 
    'newArrival', true)

"Step 5 : choose first item on list"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Jual Peralatan Rumah Tangga - Harga Te_ee196f/img_Produk Pilihan Untuk Anda_shim lazyload_70f967'))

"tap button ok pop up"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Jual Tatay Alat Pel Bergagang Hitam Kr_287390/button_OK'))

"Step 6 : tap button 'tambah ke keranjang'"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Jual Tatay Alat Pel Bergagang Hitam Kr_287390/button_Tambah ke keranjang'))

"Step 7 : tap button 'lanjut ke keranjang'"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Jual Tatay Alat Pel Bergagang Hitam Kr_287390/button_Lanjut Ke Keranjang'))

"Step 8 : tap button 'lanjut ke pembayaran'"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Ruparupa  No.1 Home Living  Furniture _0f4397/button_Lanjutkan ke Pembayaran'))

"Step 9 : input email"
WebUI.setText(findTestObject('Object Repository/Purchase/Page_Ruparupa.com Payment/input_Daftar_email'), 'test@gmail.com')

"Step 9 : input password"
WebUI.setEncryptedText(findTestObject('Object Repository/Purchase/Page_Ruparupa.com Payment/input_Alamat email atau nomor telepon tidak_577a7d'), 
    '4kScvkzZepAC/SrB8nQUxQ==')

"Step 10 : tap button 'masuk'"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Ruparupa.com Payment/button_Masuk'))

"verify account unregistered"

"Step 11 : close web"
WebUI.click(findTestObject('Object Repository/Purchase/Page_Ruparupa.com Payment/div_Alamat email atau nomor telepon dan pas_c22024'))

