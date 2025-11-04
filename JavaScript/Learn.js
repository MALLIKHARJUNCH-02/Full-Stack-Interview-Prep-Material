const points = [1, 1, 4, 3, 2, 1];
function max(arr) {
    return [...new Set(arr)];
}

console.log(max(points))