//deklarasi input dengan prompt
const prompt = require('prompt-sync')()

//array hewan
var arrayHwn = []

//objek hewan
let hwn = {}

console.log('<<----PET SHOP----->>')
var kondisi = false
do{
  console.log('\n<====Pendataan Hewan====>')
  console.log("1. Tambah Data Hewan")
  console.log("2. Edit Data Hewan")
  console.log("3. Lihat Data Hewan")
  console.log("4. Keluar")
  var pilihan = prompt('\nMasukkan Pilihan : ')

  if (pilihan == 1){
    addHewan()
    kondisi = true
  } else if (pilihan == 2){
    editData()
    kondisi = true
  } else if (pilihan == 3){
    printData()
    kondisi = true
  } else if (pilihan == 4){
    console.log('Sayonara !!!')
    break
  } else {
    console.log('Salah masukkan inputan')
    kondisi = true
  }

}while(kondisi == true)

//objek constructor
function Hewan(nama, jenis, umur, makanan, riwayatp){
  this.nama = nama;
  this.jenis = jenis;
  this.umur = umur;
  this.makanan = makanan;
  this.riwayatp = riwayatp;

  //fungsi untuk menampilkan
  this.tampil = function(){
    console.log('Nama \t\t\t\t: ' + this.nama)
    console.log('Jenis \t\t\t\t: ' + this.jenis)
    console.log('Umur \t\t\t\t: ' + this.umur)
    console.log('Makanan \t\t\t: ' + this.makanan)
    console.log('Riwayat Penyakit \t: ' + this.riwayatp)
  }
}

function addHewan(){
  for(let i=0; i<1; i++){
  console.log('\n<===Tambah Data Hewan===>')

  //membuat objek hwn
  hwn = new Hewan(
    prompt('Masukkan Nama \t\t\t\t: '),
    prompt('Masukkan Jenis \t\t\t\t: '),
    prompt('Masukkan Umur \t\t\t\t: '),
    prompt('Masukkan Makanan \t\t\t: '),
    prompt('Masukkan Riwayat Penyakit \t: ')
  )
  arrayHwn.push(hwn)
  }
}

function printData(){
  console.log('\n<===Data Hewan===>')
  index = 1

  for(let i in arrayHwn){
    console.log(`\nHewan ke-${index}`)
    index++
    arrayHwn[i].tampil()
  }
}

function editData(){
  console.log('\n<===Edit Data Hewan===>')
  var noHwn = prompt('Masukkan nomor urutan hewan : ')

  //tambah fungsi baru ke constructor
  Hewan.prototype.edit = function(){
    nama = prompt(`Masukkan Nama \t\t\t\t: `),
    jenis = prompt(`Masukkan Jenis \t\t\t\t: `),
    umur = prompt(`Masukkan Umur \t\t\t\t: `),
    makanan = prompt(`Masukkan Makanan \t\t\t: `),
    riwayatp = prompt(`Masukkan Riwayat Penyakit \t: `),
    tampil = this.tampil
    return {nama, jenis, umur, makanan, riwayatp, tampil}
  }

  let index = noHwn-1
  arrayHwn[index] = arrayHwn[index].edit()

}