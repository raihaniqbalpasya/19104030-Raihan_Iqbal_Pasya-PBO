function Mahasiswa(nim, nama, prodi){
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
  
    //fungsi untuk menampilkan
    this.tampil = function(){
      console.log('NIM : ' + this.nim)
      console.log('Nama : ' + this.nama)
      console.log('Prodi : ' + this.prodi)
    }
  }
  
  //deklarasi input dengan prompt
  const prompt = require('prompt-sync')()
  
  let jmlMhs = prompt('Masukkan jumlah mahasiswa : ')
  
  //array mahasiswa
  var arrayMhs = []
  
  //objek mahasiswa
  let mhs = {}
  
  for(let i=1; i<=jmlMhs; i++){
    console.log(`\n Mahasiswa ke-${i}`)
  
    //membuat objek mhs
    mhs = new Mahasiswa(
      prompt('Masukkan NIM : '),
      prompt('Masukkan Nama : '),
      prompt('Masukkan Prodi : ')
    )
    arrayMhs.push(mhs)
  }
  
  console.log('Data berhasil tersimpan\n')
  
  var editData = prompt("Ingin mengubah data? [ya/tidak] : ")
  
  if(editData == 'ya'){
    var noMhs = prompt('Masukkan nomor urut mahasiswa : ')
  
    //tambah fungsi baru ke constructor
    Mahasiswa.prototype.edit = function(){
      nim = prompt(`Masukkan NIM : `),
      nama = prompt(`Masukkan Nama : `),
      prodi = prompt(`Masukkan Prodi : `),
      tampil = this.tampil
      return {nim, nama, prodi, tampil}
    }
  
    let index = noMhs-1
    arrayMhs[index] = arrayMhs[index].edit()
  
    console.log('\n Data setelah diubah')
    index = 1
  
    for(let i in arrayMhs){
      console.log(`\n Mahasiswa ke-${index}`)
      index++
      arrayMhs[i].tampil()
    }
  } else if(editData == 'tidak') {
    console.log('\n Data setelah diubah')
    let index = 1
  
    for(let i in arrayMhs){
      console.log(`\n Mahasiswa ke-${index}`)
      index++
      arrayMhs[i].tampil()
    }
  } else {
    console.log('Pilihan tidak sesuai')
  }