const prompt = require('prompt-sync')()

let total = prompt('Berapa Mahasiswa\t: ')

var arrayMahasiswa = [] //array
var mahasiswa = {} //object

for(let i=0; i<total; i++){
  console.log(`\nMahasiswa ${i}`)
  let name = prompt('Masukkan Nama\t\t\t: ')
  let birth = prompt('Masukkan Tanggal Lahir\t: ')
  let nim = prompt('Masukkan NIM\t\t\t: ')

  mahasiswa = new Mahasiswa(name, birth, nim)

  arrayMahasiswa.push(mahasiswa)
  }

let index = 0

for(let x in arrayMahasiswa){
  console.log(`\nMahasiswa ${index}`)
  index++
  //memanggil value object di array
  console.log(`Name\t\t\t: ${arrayMahasiswa[x].name}`)
  console.log(`Tanggal lahir\t: ${arrayMahasiswa[x].birth}`)
  console.log(`NIM\t\t\t\t: ${arrayMahasiswa[x].nim}`)
  console.log(`Umur\t\t\t: ${arrayMahasiswa[x].age()}`)

}

function Mahasiswa(name, birth, nim) {
  this.name = name
  this.birth = birth
  this.nim = nim
  this.age = function(){
      let year = this.birth.slice(this.birth.length - 4)
      return 2020 - year
    }
}