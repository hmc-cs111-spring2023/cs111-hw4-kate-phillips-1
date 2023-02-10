def collatz(n: Int) = {
    result = 0
    if (n % 2) then result = n/2
    else result = (3 * n) + 1
    result
}
