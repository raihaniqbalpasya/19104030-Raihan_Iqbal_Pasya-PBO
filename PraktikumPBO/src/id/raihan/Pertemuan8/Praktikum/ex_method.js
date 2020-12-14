var person = {
    firstName : "Pasya",
    lastName : "Hasibuan",
    year : 2001,
    fullname : function(){
      return(this.firstName + " " + this.lastName)
    },
    age : function(){
      return 2020 - this.year
    }
  }
  
  console.log('Objek dari person\t: ')
  //memanggil method
  console.log(`Name\t: ${person.fullname()}`)
  console.log(`Tahun\t: ${person.year}`)
  console.log(`Umur\t: ${person.age()}`)