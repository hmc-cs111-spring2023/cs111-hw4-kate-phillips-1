def collatz(n: Int) = {
    var result = 0
    if (n % 2) == 0 then result = n/2
    else result = (3 * n) + 1
    result
}


def collatzCount(n: Int) = {
    val result = collatz(n)
    if  result == 1 then 1
    else 1 + collatzCount(result)
}