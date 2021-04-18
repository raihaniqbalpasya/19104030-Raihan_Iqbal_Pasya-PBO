var fib = new Array()

var n = 11

fib[0] = 0
fib[1] = 1

for(var i = 2; i < n; i++){
        fib[i] = fib[i-1] + fib[i-2]
}

console.log("Fibonacci = ")
for(var i = 0; i < n; i++){
    console.log(fib[i] + ', ')
}