const prompt = require ('prompt-sync')()

var arrayMahasiswa = []
var arrayPredikat = []

var person = (function(){
  var name
  var tgllahir
  var nim
  var prodi
  var age

      for(let i=0; i<1; i++){

        function inputData(){
          console.log('\n<==== Tambah Mahasiswa ====>')
          name = prompt('Input Nama\t\t\t: ')
          tgllahir = prompt('Input Tanggal Lahir\t: ')
          nim = prompt('Input Nim\t\t\t: ')

          var year = tgllahir.slice(tgllahir.length - 4)
          age = 2020 - year

          console.log("\n<= Pilih Prodi")
          console.log("1. S1 SE")
          console.log("2. S1 IF")
          console.log("3. S1 SI")
          var pilihprodi = prompt('Input angka Prodi : ')
          
          if(pilihprodi == 1){
            prodi = "S1 SE"
          } else if(pilihprodi == 2){
            prodi = "S1 IF"
          } else if(pilihprodi == 3){
            prodi = "S1 SI"
          }
        }

  function push(){
    var objMhs = {name, tgllahir, nim, age, prodi}
    arrayMahasiswa.push(objMhs)
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

  function printData(){
    console.log("\n<==== Data Mahasiswa ====>")

      let index = 1

        for (let x in arrayMahasiswa){
          console.log(`\nMahasiswa ${index}`)
          index++

          console.log(`Nama \t\t\t: ${arrayMahasiswa[x].name}`)
          console.log(`Tanggal Lahir \t: ${arrayMahasiswa[x].tgllahir}`)
          console.log(`Umur \t\t\t: ${arrayMahasiswa[x].age}`)
          console.log(`Nim \t\t\t: ${arrayMahasiswa[x].nim}`)
          console.log(`Prodi \t\t\t: ${arrayMahasiswa[x].prodi}`)

          if(arrayPredikat[x] == null){
            arrayPredikat[x] = "null"
            }
          console.log(`Grade\t\t\t: ${arrayPredikat[x]}`)
        }
  }

  return {
    inputData : inputData,
    push : push,
    predikat : predikat,
    printData : printData
    }

}())

var kondisi = false
do{
  console.log("\n<===== Menu Penilaian =====>")
  console.log("1. Tambah Mahasiswa")
  console.log("2. Penilaian")
  console.log("3. Lihat seluruh Mahasiswa")
  console.log("4. Keluar")
  var penilaian = prompt("\nMasukkan Pilihan : ")

  if(penilaian == 1){

    person.inputData()
    person.push()

    kondisi = true

  } else if (penilaian == 2){

    person.predikat()

    kondisi = true

  } else if(penilaian == 3){

    person.printData()

    kondisi = true

  } else if(penilaian == 4){

    console.log("\nBye !!!")
    break

  } else{

  console.log("\nAnda Salah masukkan inputan")
  console.log("Tolong input angka 1-4 !")
  kondisi = true
  }
}while(kondisi == true)