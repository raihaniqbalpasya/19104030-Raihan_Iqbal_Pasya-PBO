const prompt = require ('prompt-sync')()

var arrayMahasiswa = [] //array
var mahasiswa = {} //object
let arrayPredikat = [] //array

var kondisi = false
do{
  console.log("\n<===== Menu Penilaian =====>")
  console.log("1. Tambah Mahasiswa")
  console.log("2. Penilaian")
  console.log("3. Lihat seluruh Mahasiswa")
  console.log("4. Keluar")
  var penilaian = prompt("\nMasukkan Pilihan : ")

  if(penilaian == 1){

    addMahasiswa()

    kondisi = true

  } else if (penilaian == 2){

    predikat()

    kondisi = true

  } else if(penilaian == 3){

    dataMahasiswa()

    kondisi = true

  } else if(penilaian == 4){
    console.log("Bye !!!")
    break
  } else{
  console.log("Salah masukkan inputan")
  kondisi = true
}
}while(kondisi == true)

function Mahasiswa(name, birth, nim, prodi, predikat) {
      this.name = name
      this.birth = birth
      this.nim = nim
      this.prodi = prodi
      this.age = function(){
      let year = this.birth.slice(this.birth.length - 4)
      return 2020 - year
    }
    this.predikat = predikat
  }
  
  function addMahasiswa(){
    console.log("\n<==== Tambah Mahasiswa ====>")

    for(let i=0; i<1; i++){
      let name = prompt('Input Nama\t\t\t: ')
      let birth = prompt('Input Tanggal Lahir\t: ')
      let nim = prompt('Input NIM\t\t\t: ')

      console.log("\n<= Pilih Prodi")
      console.log("1. S1 SE")
      console.log("2. S1 IF")
      console.log("3. S1 SI")
      let pilihprodi = prompt('Input angka Prodi : ')
      let prodi

    if(pilihprodi == 1){
        prodi = "S1 SE"
    } else if(pilihprodi == 2){
        prodi = "S1 IF"
    } else if(pilihprodi == 3){
        prodi = "S1 SI"
    }

    mahasiswa = new Mahasiswa(name, birth, nim, prodi)

    arrayMahasiswa.push(mahasiswa)
  }
}

  function predikat (){
      console.log("\n<==== Penilaian ====>")
      var inputNIM = prompt("Masukkan Nim : ")
      var nilaiInput = prompt("Masukkan Nilai : ")

      for(let i=0; i<arrayMahasiswa.length; i++){
        if(inputNIM == arrayMahasiswa[i].nim){

          var nilai = "null"

          if (nilaiInput >= 80 && nilaiInput <= 100 ) {
              nilai = "A"
          }
          else if (nilaiInput >= 60 && nilaiInput <= 80) {
              nilai = "B"
          }
          else if (nilaiInput >= 40 && nilaiInput <= 60) {
              nilai = "C"
          }
          else if (nilaiInput >= 0 && nilaiInput <= 40) {
              nilai = "D"
          }
          else {
              nilai = "Inputan Error"
          }
          arrayPredikat[i] = nilai
      }
    }
  }

function dataMahasiswa(){
  console.log("\n<==== Data Mahasiswa ====>")

    let index = 1

    for(let x in arrayMahasiswa){
      console.log(`\nMahasiswa ${index}`)
      index++
      //memanggil value object di array
      console.log(`Name\t\t\t: ${arrayMahasiswa[x].name}`)
      console.log(`Tanggal lahir\t: ${arrayMahasiswa[x].birth}`)
      console.log(`NIM\t\t\t\t: ${arrayMahasiswa[x].nim}`)
      console.log(`Umur\t\t\t: ${arrayMahasiswa[x].age()}`)
      console.log(`Prodi\t\t\t: ${arrayMahasiswa[x].prodi}`)

      if(arrayPredikat[x] == null){
        arrayPredikat[x] = "null"
      }
      console.log(`Grade\t\t\t: ${arrayPredikat[x]}`)
    }
}

