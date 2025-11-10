var range = 10;

function fib(range) {
    let arr = [0, 1];

    for (let i = 2; i <= range; i++) {
        arr[i] = arr[i - 1] + arr[i - 2];
    }

    return arr;
}

console.log(fib(range));