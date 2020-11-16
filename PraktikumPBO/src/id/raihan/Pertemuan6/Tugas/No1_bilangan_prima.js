var n = 50
var m = 1

console.log('Bilangan Prima = ')
for(var i = m; i <= n; i++){
    var bil = 0
    for(var j = 1; j <= i; j++){
        if (i%j==0){
            bil = bil + 1
        }
    }
    if(bil==2){
        console.log(i + ", ")
    }
}