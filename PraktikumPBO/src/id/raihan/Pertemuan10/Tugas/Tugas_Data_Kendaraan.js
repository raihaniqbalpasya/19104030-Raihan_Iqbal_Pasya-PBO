//constructor kendaraan
function Kendaraan (noPlat, merk, pajak) {
    this.noPlat = noPlat
    this.merk = merk
    this.pajak = pajak
  }
  
  //membuat objek sedan
  var Sedan = {
    Data: function(platSedan, merkSedan, pajakSedan) {
      this.noPlat = platSedan
      this.merk = merkSedan
      this.pajak = pajakSedan
    },
  
    inputData : function(){
      this.platSedan = prompt('Masukkan Nomor Kendaraan : > ')
      this.merkSedan = prompt('Masukkan Merk : > ')
      this.pajakSedan = prompt('Masukkan Pajak Kendaraan : > ')
    },
  
    print: function(){
      console.log('----Info Kendaraan----');
      console.log('Nomor Kendaraan : ', this.platSedan);
      console.log('Merk : ', this.merkSedan);
      this.printFasTambahan();
      console.log('Pajak Kendaraan : ', this.pajakSedan);
      console.log('Total Pembayaran Pajak : ', this.hitungPajak());
    }
  }
  
  //menginherit objek sedan
  var Mobil = Object.create(Sedan)
  
  Mobil.Sedan = function(fasKeamanan, kapCC, fasKenyamanan) {
    this.fasKeamanan = fasKeamanan
    this.kapCC = kapCC
    this.fasKenyamanan = fasKenyamanan
  }
  
  Mobil.fasTambahan = function(){
    this.fasKeamanan = prompt('Masukkan fasilitas keamanan : > ')
    this.kapCC = prompt('Masukkan kapasitas (dalam CC) : > ')
    this.fasKenyamanan = prompt('Masukkan fasilitas kenyamanan : > ')
  }
  
  //meredefinisi method printFasTambahan yang ada di objek Sedan
  Mobil.printFasTambahan = function(){
    console.log('Fasilitas Keamanan : ', this.fasKeamanan)
    console.log('Kapasitas CC : ', this.kapCC)
    console.log('Fasilitas Kenyamanan : ', this.fasKenyamanan)
  }
  
  //meredefinisi method hitungPajak yang ada di objek Sedan
  Mobil.hitungPajak = function(){
    var totalPajak = (parseInt(this.pajakSedan) + (this.pajakSedan * this.kapCC * 0.00005))
    return totalPajak
  }
  
  //mewarisi properti kendaraan
  function Bus (platbus, merkbus, pajakbus, kapPenumpang, kapBagasi) {
    this.noPlat = platbus
    this.merk = merkbus
    this.pajak = pajakbus
    this.kapPenumpang = kapPenumpang
    this.kapBagasi = kapBagasi
  }
  
  Kendaraan.prototype.hitungPajakBus = function() {
    var totalPajakBus = (parseInt(this.pajak) + (this.pajak * this.kapPenumpang * this.kapBagasi * 0.00005))
    return totalPajakBus
  }
  
  Bus.prototype = new Kendaraan()
  Bus.prototype.constructor = Kendaraan
  
  Kendaraan.prototype.print = function() {
    console.log('----Info Kendaraan----')
    console.log('Nomor Kendaraan : ', this.noPlat)
    console.log('Merk : ', this.merk)
    console.log('Pajak Kendaraan : ', this.pajak)
    console.log('Total Pembayaran Pajak : ', this.hitungPajakBus())
  }
  
  const prompt = require ('prompt-sync')()
  
  console.log('Input Data Sedan')
  Mobil.inputData()
  Mobil.fasTambahan()
  
  console.log('\nInput Data Bus')
  var obBus = new Bus(
    prompt('Masukkan Nomor Kendaraan : > '),
    prompt('Masukkan Merk : > '),
    prompt('Masukkan Pajak Kendaraan : > '),
    prompt('Masukkan kapasitas penumpang : > '),
    prompt('Masukkan kapasitas bagasi (kg) : > ')
  )
  
  console.log('\n----Data Seluruh Kendaraan----')
  console.log('1. Sedan')
  Mobil.print()
  
  //memanggil method dari parent constructor
  console.log('\n2. Bus')
  obBus.print()
  