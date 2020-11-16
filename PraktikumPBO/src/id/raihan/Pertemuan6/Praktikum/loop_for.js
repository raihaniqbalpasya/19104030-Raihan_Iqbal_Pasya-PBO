//for loop
for(var i = 0; i < 5; i++){
    console.log(i + '. Berfikir')
}
console.log('\n')

//for/in
var nama = [{fName : 'Raihan Iqbal', lName : 'Pasya', age : 19}, {fName : 'Rizki', lName : 'Delaga', age : 19}]

for(var x in nama){
    console.log('Mahasiswa\t: ')
    console.log(nama[x].fName)
    console.log(nama[x].lName)
    console.log(nama[x].age)
    console.log('\n')
}

//for/of
var buah = ['apel', 'anggur', 'jeruk']
for(var x of buah){
    console.log('Ini buah ' + x)
}
