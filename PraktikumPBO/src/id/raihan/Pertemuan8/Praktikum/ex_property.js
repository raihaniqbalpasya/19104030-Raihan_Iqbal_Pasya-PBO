var person1 = {} // Sudah menandakan deklarasi objek, tanpa value
var person1 = {name : 'Raihan'}
var person2 = new Object()

person2.name = 'Iqbal'

person1.age = 19
person2.age = 21

console.log('Object person 1\t: ')
console.log(`name\t: ${ person1.name}`)
console.log('age\t\t: ' + person1.age)

console.log()

console.log('Object person 2\t: ')
console.log(`name\t: ${ person2.name}`)
console.log('age\t\t: ' + person2.age)